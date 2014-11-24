package org.talend.mdm.repository.ui.actions.trigger;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.junit.Rule;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.rule.PowerMockRule;
import org.powermock.reflect.Whitebox;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.ItemState;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.runtime.CoreRuntimePlugin;
import org.talend.mdm.repository.extension.RepositoryNodeConfigurationManager;
import org.talend.mdm.repository.model.mdmproperties.ContainerItem;
import org.talend.mdm.repository.model.mdmproperties.MdmpropertiesFactory;
import org.talend.mdm.repository.model.mdmproperties.WSRoutingRuleItem;
import org.talend.mdm.repository.model.mdmproperties.impl.MdmpropertiesFactoryImpl;
import org.talend.mdm.repository.model.mdmproperties.impl.WSRoutingRuleItemImpl;
import org.talend.mdm.repository.ui.actions.AbstractSimpleAddActionTest;
import org.talend.mdm.repository.utils.RepositoryResourceUtil;
import org.talend.repository.ProjectManager;

import com.amalto.workbench.exadapter.ExAdapterManager;
import com.amalto.workbench.image.ImageCache;

@PrepareForTest({ ImageDescriptor.class, JFaceResources.class, ImageCache.class, ItemState.class, CoreRuntimePlugin.class,
        ProjectManager.class, RepositoryNodeConfigurationManager.class, ProxyRepositoryFactory.class,
        RepositoryResourceUtil.class, ExAdapterManager.class, MdmpropertiesFactoryImpl.class })
public class NewTriggerActionTest extends AbstractSimpleAddActionTest {

    @Rule
    public PowerMockRule powerMockRule = new PowerMockRule();

    @Test
    public void testCreateServerObject() throws Exception {
        //
        ContainerItem newItem = MdmpropertiesFactory.eINSTANCE.createContainerItem();
        ContainerItem mockContainerItem = spy(newItem);

        NewTriggerAction action = new NewTriggerAction();
        NewTriggerAction spyAction = spy(action);

        Whitebox.setInternalState(spyAction, "parentItem", mockContainerItem); //$NON-NLS-1$
        ItemState itemState = mock(ItemState.class);
        when(mockContainerItem.getState()).thenReturn(itemState);
        when(mockContainerItem.getState().getPath()).thenReturn(""); //$NON-NLS-1$

        WSRoutingRuleItem item = MdmpropertiesFactory.eINSTANCE.createWSRoutingRuleItem();
        WSRoutingRuleItem spyRoutingRuleItem = spy(item);
        Resource mockResource = mock(Resource.class);
        ResourceSet mockResourceSet = mock(ResourceSet.class);
        when(mockResource.getResourceSet()).thenReturn(mockResourceSet);
        when(spyRoutingRuleItem.eResource()).thenReturn(mockResource);
        PowerMockito.whenNew(WSRoutingRuleItemImpl.class).withNoArguments()
                .thenReturn((WSRoutingRuleItemImpl) spyRoutingRuleItem);

        // run
        Item addedItem = spyAction.createServerObject("abc"); //$NON-NLS-1$
        assertThat(addedItem, notNullValue());

    }

}
