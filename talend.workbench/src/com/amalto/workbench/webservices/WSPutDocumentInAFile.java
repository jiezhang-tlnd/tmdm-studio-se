// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.2_01, construire R40)
// Generated source version: 1.1.2

package com.amalto.workbench.webservices;


public class WSPutDocumentInAFile {
    protected com.amalto.workbench.webservices.WSDocument wsDocument;
    protected boolean isDelete;
    protected java.lang.String filename;
    protected java.lang.String fileCharset;
    
    public WSPutDocumentInAFile() {
    }
    
    public WSPutDocumentInAFile(com.amalto.workbench.webservices.WSDocument wsDocument, boolean isDelete, java.lang.String filename, java.lang.String fileCharset) {
        this.wsDocument = wsDocument;
        this.isDelete = isDelete;
        this.filename = filename;
        this.fileCharset = fileCharset;
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
    
    public java.lang.String getFilename() {
        return filename;
    }
    
    public void setFilename(java.lang.String filename) {
        this.filename = filename;
    }
    
    public java.lang.String getFileCharset() {
        return fileCharset;
    }
    
    public void setFileCharset(java.lang.String fileCharset) {
        this.fileCharset = fileCharset;
    }
}
