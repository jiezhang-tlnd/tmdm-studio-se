// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.2_01, construire R40)
// Generated source version: 1.1.2

package com.amalto.workbench.webservices;


public class WSSynchronizationPlan {
    protected java.lang.String name;
    protected java.lang.String description;
    protected java.lang.String remoteSystemName;
    protected java.lang.String remoteSystemURL;
    protected java.lang.String remoteSystemUsername;
    protected java.lang.String remoteSystemPassword;
    protected java.lang.String tisURL;
    protected java.lang.String tisUsername;
    protected java.lang.String tisPassword;
    protected java.lang.String tisParameters;
    protected com.amalto.workbench.webservices.WSSynchronizationPlanXtentisObjectsSynchronizations[] xtentisObjectsSynchronizations;
    protected com.amalto.workbench.webservices.WSSynchronizationPlanItemsSynchronizations[] itemsSynchronizations;
    protected java.util.Calendar lastRunStarted;
    protected java.util.Calendar lastRunStopped;
    protected com.amalto.workbench.webservices.WSSynchronizationPlanStatusCode wsCurrentStatusCode;
    protected java.lang.String currentStatusMessage;
    
    public WSSynchronizationPlan() {
    }
    
    public WSSynchronizationPlan(java.lang.String name, java.lang.String description, java.lang.String remoteSystemName, java.lang.String remoteSystemURL, java.lang.String remoteSystemUsername, java.lang.String remoteSystemPassword, java.lang.String tisURL, java.lang.String tisUsername, java.lang.String tisPassword, java.lang.String tisParameters, com.amalto.workbench.webservices.WSSynchronizationPlanXtentisObjectsSynchronizations[] xtentisObjectsSynchronizations, com.amalto.workbench.webservices.WSSynchronizationPlanItemsSynchronizations[] itemsSynchronizations, java.util.Calendar lastRunStarted, java.util.Calendar lastRunStopped, com.amalto.workbench.webservices.WSSynchronizationPlanStatusCode wsCurrentStatusCode, java.lang.String currentStatusMessage) {
        this.name = name;
        this.description = description;
        this.remoteSystemName = remoteSystemName;
        this.remoteSystemURL = remoteSystemURL;
        this.remoteSystemUsername = remoteSystemUsername;
        this.remoteSystemPassword = remoteSystemPassword;
        this.tisURL = tisURL;
        this.tisUsername = tisUsername;
        this.tisPassword = tisPassword;
        this.tisParameters = tisParameters;
        this.xtentisObjectsSynchronizations = xtentisObjectsSynchronizations;
        this.itemsSynchronizations = itemsSynchronizations;
        this.lastRunStarted = lastRunStarted;
        this.lastRunStopped = lastRunStopped;
        this.wsCurrentStatusCode = wsCurrentStatusCode;
        this.currentStatusMessage = currentStatusMessage;
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
    
    public java.lang.String getRemoteSystemName() {
        return remoteSystemName;
    }
    
    public void setRemoteSystemName(java.lang.String remoteSystemName) {
        this.remoteSystemName = remoteSystemName;
    }
    
    public java.lang.String getRemoteSystemURL() {
        return remoteSystemURL;
    }
    
    public void setRemoteSystemURL(java.lang.String remoteSystemURL) {
        this.remoteSystemURL = remoteSystemURL;
    }
    
    public java.lang.String getRemoteSystemUsername() {
        return remoteSystemUsername;
    }
    
    public void setRemoteSystemUsername(java.lang.String remoteSystemUsername) {
        this.remoteSystemUsername = remoteSystemUsername;
    }
    
    public java.lang.String getRemoteSystemPassword() {
        return remoteSystemPassword;
    }
    
    public void setRemoteSystemPassword(java.lang.String remoteSystemPassword) {
        this.remoteSystemPassword = remoteSystemPassword;
    }
    
    public java.lang.String getTisURL() {
        return tisURL;
    }
    
    public void setTisURL(java.lang.String tisURL) {
        this.tisURL = tisURL;
    }
    
    public java.lang.String getTisUsername() {
        return tisUsername;
    }
    
    public void setTisUsername(java.lang.String tisUsername) {
        this.tisUsername = tisUsername;
    }
    
    public java.lang.String getTisPassword() {
        return tisPassword;
    }
    
    public void setTisPassword(java.lang.String tisPassword) {
        this.tisPassword = tisPassword;
    }
    
    public java.lang.String getTisParameters() {
        return tisParameters;
    }
    
    public void setTisParameters(java.lang.String tisParameters) {
        this.tisParameters = tisParameters;
    }
    
    public com.amalto.workbench.webservices.WSSynchronizationPlanXtentisObjectsSynchronizations[] getXtentisObjectsSynchronizations() {
        return xtentisObjectsSynchronizations;
    }
    
    public void setXtentisObjectsSynchronizations(com.amalto.workbench.webservices.WSSynchronizationPlanXtentisObjectsSynchronizations[] xtentisObjectsSynchronizations) {
        this.xtentisObjectsSynchronizations = xtentisObjectsSynchronizations;
    }
    
    public com.amalto.workbench.webservices.WSSynchronizationPlanItemsSynchronizations[] getItemsSynchronizations() {
        return itemsSynchronizations;
    }
    
    public void setItemsSynchronizations(com.amalto.workbench.webservices.WSSynchronizationPlanItemsSynchronizations[] itemsSynchronizations) {
        this.itemsSynchronizations = itemsSynchronizations;
    }
    
    public java.util.Calendar getLastRunStarted() {
        return lastRunStarted;
    }
    
    public void setLastRunStarted(java.util.Calendar lastRunStarted) {
        this.lastRunStarted = lastRunStarted;
    }
    
    public java.util.Calendar getLastRunStopped() {
        return lastRunStopped;
    }
    
    public void setLastRunStopped(java.util.Calendar lastRunStopped) {
        this.lastRunStopped = lastRunStopped;
    }
    
    public com.amalto.workbench.webservices.WSSynchronizationPlanStatusCode getWsCurrentStatusCode() {
        return wsCurrentStatusCode;
    }
    
    public void setWsCurrentStatusCode(com.amalto.workbench.webservices.WSSynchronizationPlanStatusCode wsCurrentStatusCode) {
        this.wsCurrentStatusCode = wsCurrentStatusCode;
    }
    
    public java.lang.String getCurrentStatusMessage() {
        return currentStatusMessage;
    }
    
    public void setCurrentStatusMessage(java.lang.String currentStatusMessage) {
        this.currentStatusMessage = currentStatusMessage;
    }
}
