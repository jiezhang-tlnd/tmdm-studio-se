// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.2_01, construire R40)
// Generated source version: 1.1.2

package com.amalto.workbench.webservices;


public class WSPutDocumentInAString {
    protected com.amalto.workbench.webservices.WSDocument wsDocument;
    protected boolean isDelete;
    protected java.lang.String documentString;
    
    public WSPutDocumentInAString() {
    }
    
    public WSPutDocumentInAString(com.amalto.workbench.webservices.WSDocument wsDocument, boolean isDelete, java.lang.String documentString) {
        this.wsDocument = wsDocument;
        this.isDelete = isDelete;
        this.documentString = documentString;
    }
    
    public com.amalto.workbench.webservices.WSDocument getWsDocument() {
        return wsDocument;
    }
    
    public void setWsDocument(com.amalto.workbench.webservices.WSDocument wsDocument) {
        this.wsDocument = wsDocument;
    }
    
    public boolean isIsDelete() {
        return isDelete;
    }
    
    public void setIsDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }
    
    public java.lang.String getDocumentString() {
        return documentString;
    }
    
    public void setDocumentString(java.lang.String documentString) {
        this.documentString = documentString;
    }
}
