// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation （1.1.2_01，编译版 R40）
// Generated source version: 1.1.2

package com.amalto.workbench.webservices;


public class WSStartProcessInstance {
    protected com.amalto.workbench.webservices.WSWorkflowProcessDefinitionUUID processUUID;
    protected com.amalto.workbench.webservices.WSHashMap variable;
    
    public WSStartProcessInstance() {
    }
    
    public WSStartProcessInstance(com.amalto.workbench.webservices.WSWorkflowProcessDefinitionUUID processUUID, com.amalto.workbench.webservices.WSHashMap variable) {
        this.processUUID = processUUID;
        this.variable = variable;
    }
    
    public com.amalto.workbench.webservices.WSWorkflowProcessDefinitionUUID getProcessUUID() {
        return processUUID;
    }
    
    public void setProcessUUID(com.amalto.workbench.webservices.WSWorkflowProcessDefinitionUUID processUUID) {
        this.processUUID = processUUID;
    }
    
    public com.amalto.workbench.webservices.WSHashMap getVariable() {
        return variable;
    }
    
    public void setVariable(com.amalto.workbench.webservices.WSHashMap variable) {
        this.variable = variable;
    }
}
