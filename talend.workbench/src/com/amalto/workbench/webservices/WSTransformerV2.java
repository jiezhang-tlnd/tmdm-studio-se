// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.2_01, construire R40)
// Generated source version: 1.1.2

package com.amalto.workbench.webservices;


public class WSTransformerV2 {
    protected java.lang.String name;
    protected java.lang.String description;
    protected com.amalto.workbench.webservices.WSTransformerProcessStep[] processSteps;
    
    public WSTransformerV2() {
    }
    
    public WSTransformerV2(java.lang.String name, java.lang.String description, com.amalto.workbench.webservices.WSTransformerProcessStep[] processSteps) {
        this.name = name;
        this.description = description;
        this.processSteps = processSteps;
    }
    
    public java.lang.String getName() {
        return name;
    }
    
    public void setName(java.lang.String name) {
        this.name = name;
    }
    
    public java.lang.String getDescription() {
        return description;
    }
    
    public void setDescription(java.lang.String description) {
        this.description = description;
    }
    
    public com.amalto.workbench.webservices.WSTransformerProcessStep[] getProcessSteps() {
        return processSteps;
    }
    
    public void setProcessSteps(com.amalto.workbench.webservices.WSTransformerProcessStep[] processSteps) {
        this.processSteps = processSteps;
    }
}
