package org.talend.mdm.repository.ui.navigator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.actions.BaseSelectionListenerAction;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.CommonViewer;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.mdm.repository.core.AbstractRepositoryAction;
import org.talend.mdm.repository.core.IRepositoryNodeConfiguration;
import org.talend.mdm.repository.extension.RepositoryNodeConfigurationManager;

public class MDMRepositoryActionProvider extends CommonActionProvider {

    private CommonViewer commonViewer;

    public MDMRepositoryActionProvider() {

    }

    @Override
    public void init(ICommonActionExtensionSite aSite) {
        commonViewer = (CommonViewer) aSite.getStructuredViewer();
        for(IRepositoryNodeConfiguration conf:RepositoryNodeConfigurationManager.getConfigurations()){
            if(conf.getActionProvider()!=null){
                conf.getActionProvider().initCommonViewer(commonViewer);
            }
        }
    }

    @Override
    public void fillContextMenu(IMenuManager menu) {
        IStructuredSelection selection = (IStructuredSelection) getContext().getSelection();
        List<AbstractRepositoryAction> finalActions = null;
        for (Iterator il = selection.iterator(); il.hasNext();) {
            Object obj = il.next();
            if (obj instanceof IRepositoryViewObject) {
                IRepositoryViewObject viewObj = (IRepositoryViewObject) obj;
                IRepositoryNodeConfiguration conf = RepositoryNodeConfigurationManager.getConfiguration(viewObj);
                if (conf != null && conf.getActionProvider() != null) {
                    List<AbstractRepositoryAction> actions = conf.getActionProvider().getActions(viewObj);
                    if (actions != null) {
                        if (finalActions == null) {
                            finalActions = actions;
                        }
                        finalActions = combineActions(finalActions, actions);
                        if (finalActions.size() == 0) {
                            return;
                        }
                    }
                }
            }
        }
        // hook action to menu
        for (IAction action : finalActions) {
            if (action instanceof AbstractRepositoryAction) {
                AbstractRepositoryAction groupAction = (AbstractRepositoryAction) action;
                if (groupAction.getGroupName() != null) {
                    menu.appendToGroup(groupAction.getGroupName(), action);
                } else {
                    menu.add(action);
                }
            }
        }
    }

    private List<AbstractRepositoryAction> combineActions(List<AbstractRepositoryAction> actionsA,
            List<AbstractRepositoryAction> actionsB) {
        List<AbstractRepositoryAction> result = new LinkedList<AbstractRepositoryAction>();
        for (Iterator<AbstractRepositoryAction> il = actionsA.iterator(); il.hasNext();) {
            AbstractRepositoryAction action = il.next();
            if (actionsB.contains(action)) {
                result.add(action);
            }
        }
        return result;
    }

}
