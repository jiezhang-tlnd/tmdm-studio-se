package com.amalto.workbench.image;

import java.util.HashMap;
import java.util.Map;
/**
 * Using enum to list all image resources in workbench 
 * @author liyanmei
 *
 */
public enum EImage {
	DEFAULT("icons/appli_16x16.gif"),
	
	ACTIVITY_CATEGORY("icons/activity_category.gif"),
	ACTIVITY("icons/activity.gif"),
	ADD_NEWXPATH("icons/add_newXPath.png"),
	SELECT_NEWXPATH("icons/select_newXPath.png"),
	ADD_OBJ("icons/add_obj.gif"),
	ADDMULTI_OBJ("icons/add.gif"),
	ADDTSK_TSK("icons/addtsk_tsk.gif"),
	ANNOTATION("icons/annotation.png"),
	APPINFO("icons/appinfo.gif"),
	APPLET("icons/applet.gif"),
	ATTRIBUTE_GROUP("icons/attribute_group.gif"),
	ATTRIBUTE_MANDATORY("icons/attribute_mandatory.gif"),
	ATTRIBUTE("icons/attribute.gif"),
	BACKWARD_NAV("icons/backward_nav.gif"),
	BKMRK_NAV("icons/bkmrk_nav.gif"),
	BKMRK_TSK("icons/bkmrk_tsk.gif"),
	BLANK("icons/blank.gif"),
	SYNCH("icons/synch.gif"),
	CATCHUP_RLS("icons/catchup_rls.gif"),
	CATCHUPRELEASE_RLS("icons/catchuprelease_rls.gif"),
	CHANGE_OBJ("icons/change_obj.gif"),
	CHANGE_TO_COMPLEX("icons/change_to_complex.gif"),
	CHANGE_TO_SIMPLE("icons/change_to_simple.gif"),
	CHANGESET_OBJ("icons/changeset_obj.gif"),
	CHECKEDOUT_OV("icons/checkedout_ov.gif"),
	CHECKIN_ACTION("icons/checkin_action.gif"),
	CHECKOUT_ACTION("icons/checkout_action.gif"),
	CLEAR_CO("icons/clear_co.gif"),
	CLOSE_VIEW("icons/close_view.gif"),
	CLOSELOGFILEACTION("icons/closelogfileaction.gif"),
	COlLAPSEALL("icons/collapseall.gif"),
	COMPLETE_TSK("icons/complete_tsk.gif"),
	COMPLEX_ALL("icons/complex_all.gif"),
	COMPLEX_CHOICE("icons/complex_choice.gif"),
	COMPLEX_SEQUENCE("icons/complex_sequence.gif"),
	COMPRESSED_FOLDER_OBJ("icons/compressed_folder_obj.gif"),
	CONCEPT("icons/concept.png"),
	CONFCHG_OV("icons/confchg_ov.gif"),
	CONFIGURATIONACTION("icons/configurationaction.gif"),
	CONFLICT_SYNCH("icons/conflict_synch.gif"),
	CONSOLE_VIEW("icons/console_view.gif"),
	COPY_EDIT("icons/copy_edit.gif"),
	COPY("icons/copy.gif"),
	CUT_EDIT("icons/cut_edit.gif"),
	DATA_CLUSTER("icons/datacluster.png"),
	DATA_MODEL("icons/datamodel.png"),
	DEFAULT_PERSP("icons/default_persp.gif"),
	DEFAULTS_PS("icons/defaults_ps.gif"),
	DEFAULTVIEW_MISC("icons/defaultview_misc.gif"),
	DELETE_EDIT("icons/delete_edit.gif"),
	DELETE_OBJ("icons/delete_obj.gif"),
	DIRTY_OV("icons/dirty_ov.gif"),
	DOCUMENTATION("icons/documentation.gif"),
	DOCUMENTS("icons/documents.gif"),
	EDIT_OBJ("icons/edit_obj.gif"),
	EDIT("icons/edit.gif"),
	ELEMENT_ONLY("icons/element_only.gif"),
	ELEMENTS_ONLE_ADD("icons/elements_obj_+.gif"),
	ELEMENTS_OBJ_CHOICE("icons/elements_obj_choice.gif"),
	ELEMENTS_OBJ_SEQUENCE("icons/elements_obj_sequence.gif"),
	ELEMENTS_OBJ("icons/elements_obj.gif"),
	ERROR_CO("icons/error_co.gif"),
	ERROR_TSK("icons/error_tsk.gif"),
	ERROR("icons/error.gif"),
	ERRORSTATE("icons/errorstate.gif"),
	EXECUTE("icons/execute.gif"),
	EXPORT("icons/export.gif"),
	EXPORT_PROJECTSET("icons/export_projectset.gif"),
	EXPORT_WIZ("icons/export_wiz.gif"),
	EXPORTDIR_WIZ("icons/exportdir_wiz.gif"),
	EXPORTPREF_WIZ("icons/exportpref_wiz.gif"),
	EXPORTZIP_WIZ("icons/exportzip_wiz.gif"),
	FACET("icons/facet.gif"),
	FIELD("icons/field.gif"),
	FILE_OBJ("icons/file_obj.gif"),
	FILENAV_NAV("icons/filenav_nav.gif"),
	FILTER_CHANGE("icons/filter_change.gif"),
	FILTER_HISTORY("icons/filter_history.gif"),
	FILTER_PS("icons/filter_ps.gif"),
	FLATLAYOUT("icons/flatLayout.gif"),
	FLDR_OBJ("icons/fldr_obj.gif"),
	FONT("icons/font.gif"),
	FORWARD_NAV("icons/forward_nav.gif"),
	FORDER("icons/folder.gif"),
	FORDER_OPEN("icons/folder_open.gif"),
	GOTOOBJ_TSK("icons/gotoobj_tsk.gif"),
	HEADER_COMPLETE("icons/header_complete.gif"),
	HEADER_PRIORITY("icons/header_priority.gif"),
	HELP_CONTENTS("icons/help_contents.gif"),
	HIDEABLE("icons/hideable.gif"),
	HIERARCHICALLayout("icons/hierarchicalLayout.gif"),
	HOME_NAV("icons/home_nav.gif"),
	HPRIO_TSK("icons/hprio_tsk.gif"),
	IGNOREFILES("icons/ignorefiles.gif"),
	IGNOREWS_EDIT("icons/ignorews_edit.gif"),
	IMPORT("icons/import.gif"),
	IMPORT_PROJECTSET("icons/import_projectset.gif"),
	IMPORT_WIZ("icons/import_wiz.gif"),
	IMPORTDIR_WIZ("icons/importdir_wiz.gif"),
	IMPORTPREF_WIZ("icons/importpref_wiz.gif"),
	IMPORTZIP_WIZ("icons/importzip_wiz.gif"),
	INCOM_SYNCH("icons/incom_synch.gif"),
	INCOMPLETE_TSK("icons/incomplete_tsk.gif"),
	INFO_TSK("icons/info_tsk.gif"),
	INFO("icons/info.gif"),
	JBOSSHOMETAB("icons/jbosshometab.gif"),
	KEY("icons/key.gif"),
	KEYS("icons/keys.png"),
	LABEL("icons/label.png"),
	LAYOUT_CO("icons/layout_co.gif"),
	LINKTO_HELP("icons/linkto_help.gif"),
	LOCK_OVR("icons/lock_ovr.gif"),
	LOCKEDSTATE("icons/lockedstate.gif"),
	LOGFILE("icons/logfile.gif"),
	LOGFILETAB("icons/logfiletab.gif"),
	LOGFILEVIEWER("icons/logfileviewer.gif"),
	LOGOUT("icons/logout.gif"),
	LPRIO_TSK("icons/lprio_tsk.gif"),
	MENU("icons/menu.gif"),
	MIN_VIEW("icons/min_view.gif"),
	NEW_PERSP("icons/new_persp.gif"),
	NEW_WIZ("icons/new_wiz.gif"),
	NEWFILE_WIZ("icons/newfile_wiz.gif"),
	NEWFOLDER_WIZ("icons/newfolder_wiz.gif"),
	NEWPRJ_WIZ("icons/newprj_wiz.gif"),
	NEWSTREAM_WIZ("icons/newstream_wiz.gif"),
	NEXT_NAV("icons/next_nav.gif"),
	O_LOGO_16("icons/o-logo-16.gif"),
	O_LOGO_32("icons/o-logo-32.gif"),
	OPENLOGFILEACTION("icons/openlogfileaction.gif"),
	OUTGO_SYNCH("icons/outgo_synch.gif"),
	OUTLINE_CO("icons/outline_co.gif"),
	PARTICIPANT_REM("icons/participant_rem.gif"),
	PARTICIPANT_REMALL("icons/participant_remall.gif"),
	PASTE_EDIT("icons/paste_edit.gif"),
	PASTE("icons/paste.gif"),
	PHASED_OUT("icons/phased_out.gif"),
	PIN_EDITOR("icons/pin_editor.gif"),
	PIN_VIEW("icons/pin_view.gif"),
	PIN("icons/pin.gif"),
	PINNED_OVR("icons/pinned_ovr.gif"),
	PREV_NAV("icons/prev_nav.gif"),
	PRINT_EDIT("icons/print_edit.gif"),
	PROBLEMS_VIEW("icons/problems_view.gif"),
	PROGRESS_ERROR("icons/progress_error.gif"),
	PROGRESS_NONE("icons/progress_none.gif"),
	PROGRESS_OK("icons/progress_ok.gif"),
	PROGRESS_REM("icons/progress_rem.gif"),
	PROGRESS_REMALL("icons/progress_remall.gif"),
	PROGRESS_STOP("icons/progress_stop.gif"),
	PROGRESS_TASK("icons/progress_task.gif"),
	PROP_PS("icons/prop_ps.gif"),
	PVIEW("icons/pview.gif"),
	REDO_EDIT("icons/redo_edit.gif"),
	REFRESH_NAV("icons/refresh_nav.gif"),
	REFRESH_REMOTE("icons/refresh_remote.gif"),
	REFRESH("icons/refresh.gif"),
	REFRESHLOGFILEACTION("icons/refreshlogfileaction.gif"),
	RELEASE_RLS("icons/release_rls.gif"),
	REM_CO("icons/rem_co.gif"),
	ROLE("icons/role.gif"),
	ROUTING_RULE("icons/routing_rule.png"),
	SAMPLE("icons/sample.gif"),
	SAVE_EDIT("icons/save_edit.gif"),
	SAVEALL_EDIT("icons/saveall_edit.gif"),
	SAVEAS_EDIT("icons/saveas_edit.gif"),
	SEARCH("icons/search.gif"),
	BROWSE("icons/browse.png"),
	SELECTED_MODE("icons/selected_mode.gif"),
	SELECTOR("icons/selector.gif"),
	SERVER("icons/server.gif"),
	SERVERNAVIGATOR("icons/servernavigator.gif"),
	SERVERNOTRUNNING("icons/servernotrunning.gif"),
	SERVERRUNNING("icons/serverrunning.gif"),
	SHARE_PROJECT("icons/share_project.gif"),
	SHOWCHILD_MODE("icons/showchild_mode.gif"),
	SHOWCOMPLETE_TSK("icons/showcomplete_tsk.gif"),
	SHOWERR_TSK("icons/showerr_tsk.gif"),
	SHOWTSK_TSK("icons/showtsk_tsk.gif"),
	SHOWWARN_TSK("icons/showwarn_tsk.gif"),
	SHUTDOWNSERVERACTION("icons/shutdownserveraction.gif"),
	SITE_ELEMENT("icons/site_element.gif"),
	SLEEPING("icons/sleeping.gif"),
	SMALL_WARN("icons/small_warn.gif"),
	SOURCESYSTEM("icons/sourcesystem.gif"),
	STARTSERVERACTION("icons/startserveraction.gif"),
	STEP_CURRENT("icons/step_current.gif"),
	STEP_DONE("icons/step_done.gif"),
	STORED_PROCEDURE("icons/stored_procedure.gif"),
	SUBMENU("icons/submenu.gif"),
	SUBSCRIPTION_ENGINE("icons/sub_engine.png"),
	SYNCED("icons/synced.gif"),
	SYNCH_PARTICIPANTS("icons/synch_participants.gif"),
	TALEND_PICTO_SMALL("icons/appli_16x16.gif"),
	TALEND_PICTO("icons/appli_16x16.gif"),
	TARGETSYSTEM("icons/targetsystem.gif"),
	TASKMRK_TSK("icons/taskmrk_tsk.gif"),
	TASKS_TSK("icons/tasks_tsk.gif"),
	TERMINATESERVERACTION("icons/terminateserveraction.gif"),
	THEME_CATEGORY("icons/theme_category.gif"),
	THIN_CLOSE_VIEW("icons/thin_close_view.gif"),
	THIN_HIDE_TOOLBAR("icons/thin_hide_toolbar.GIF"),
	THIN_MAX_VIEW("icons/thin_max_view.gif"),
	THIN_MIN_VIEW("icons/thin_min_view.gif"),
	THIN_RESTORE_VIEW("icons/thin_restore_view.GIF"),
	THIN_SHOW_TOOLBAR("icons/thin_show_toolbar.GIF"),
	THIN_VIEW_MENU("icons/thin_view_menu.GIF"),
	TOOLBAR("icons/toolbar.gif"),
	TRANSFORMER("icons/transformer.png"),
//	TRASH("icons/trash.gif"),
	TREE_MODE("icons/tree_mode.gif"),
	TREE_OBJECT("icons/tree_object.gif"),
	TYPE_DEFINITION("icons/type_definition.gif"),
	UNDO_EDIT("icons/undo_edit.gif"),
	UNIQUE("icons/unique.gif"),
	UNPROPERTY_OBJ_AUTRE_COPIE("icons/unproperty_obj (autre copie).gif"),
	UNPROPERTY_OBJ("icons/unproperty_obj.gif"),
	UP_NAV("icons/up_nav.gif"),
	VERSION_CONTROLLED("icons/version_controlled.gif"),
	VERSIONING("icons/versioning.gif"),
	VIEW_MENU("icons/view_menu.gif"),
	VIEW("icons/view.png"),
	WAITING_OVR("icons/waiting_ovr.gif"),
	WAITING("icons/waiting.gif"),
	WARN_TSK("icons/warn_tsk.gif"),
	WARNING_CO("icons/warning_co.gif"),
	WILDCARD("icons/wildcard.gif"),
	WORKSET_WIZ("icons/workset_wiz.gif"),
	WRITABLE("icons/writable.gif"),
	XPATH("icons/xpath.gif"),
	XTENTIS_SERVER("icons/xtentis_server.gif"),
	RUN_EXC("icons/run_exc.gif"),
	RUNLAST_CO("icons/runlast_co.gif"),
	STOP("icons/stop.gif"),
	SUSPEND("icons/suspend_co.gif"),
	DOTS_BUTTON("icons/dots_button.gif"),
	ZAP("icons/zap.gif"),
	ROUTINE("icons/routine.gif"),
	PROCESS("icons/process.png"),
	JOB("icons/process_icon.gif"),	
	SYNCHRONIZATIONPLAN( "icons/catchuprelease_rls.gif"),
	SERVICE_CONFIGURATION("icons/service_config.png"),
	WORKFLOW_PROCESS("icons/workflow_process.png"),
	UNIVERSE("icons/universe.png"),
	RENAME("icons/rename.png"),
	RESOURCES("icons/resources.png"),
	PRIMARYKEY("icons/primarykey.png"),
	SECURITYANNOTATION("icons/securityannotation.png"),
	SIMPLETYPE("icons/simple_type.png"),
	COMPLEXTYPE("icons/complex_type.png"), 
	KEYINFO("icons/info.gif"),
	SCHEMAELEMENT("icons/schema_element.png"),
	EXPAND("icons/expand.png"),
	COLLAPSE("icons/collapse.png"),
	REGISTER_WIZ("icons/register_wiz.png"), //$NON-NLS-1$
	BROWSE_MENU("icons/browse_menu.png"),
	CROSSREF("icons/crossref.png"),
	HIER_VIEW("icons/hier_view.gif"),
	MANAGE_USERS("icons/manage_users.png"),
	REPORTING("icons/reporting.png"),
	SYNCHRO_ITEM("icons/synchro_item.png"),
	SYNCHRONIZE("icons/synchronize.png"),
	TRASH("icons/trash.png"),
	UPDATEREPORT("icons/updatereport.png"),
	WORKFLOWTASKS("icons/workflowtasks.png");
	EImage(String path){
		this.path=path;
		
	}
	EImage(){
		
	}
	
	String path;
	
	
	public String getPath() {
		return path;
	}

	public static Map<String, EImage> getAlllEimages(){
		Map<String,EImage> map=new HashMap<String, EImage>();
		for(int i=0;i<values().length;i++){
			map.put(values()[i].getPath(), values()[i]);
		}
		return map;
	}
}
