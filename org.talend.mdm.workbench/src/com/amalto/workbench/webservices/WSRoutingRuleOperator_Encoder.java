// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation （1.1.2_01，编译版 R40）
// Generated source version: 1.1.2

package com.amalto.workbench.webservices;


import com.sun.xml.rpc.encoding.simpletype.*;
import javax.xml.namespace.QName;
import com.sun.xml.rpc.streaming.*;

public class WSRoutingRuleOperator_Encoder extends SimpleTypeEncoderBase {
    
    private static final SimpleTypeEncoder encoder = XSDStringEncoder.getInstance();
    private static final WSRoutingRuleOperator_Encoder instance = new WSRoutingRuleOperator_Encoder();
    
    private WSRoutingRuleOperator_Encoder() {
    }
    
    public static SimpleTypeEncoder getInstance() {
        return instance;
    }
    
    public String objectToString(Object obj, XMLWriter writer) throws Exception {
        java.lang.String value = ((WSRoutingRuleOperator)obj).getValue();
        return encoder.objectToString(value, writer);
    }
    
    public Object stringToObject(String str, XMLReader reader) throws Exception {
        return WSRoutingRuleOperator.fromValue((java.lang.String)encoder.stringToObject(str, reader));
    }
    
}
