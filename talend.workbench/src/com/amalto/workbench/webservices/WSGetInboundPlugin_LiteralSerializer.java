// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.2_01, construire R40)
// Generated source version: 1.1.2

package com.amalto.workbench.webservices;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.xsd.XSDConstants;
import com.sun.xml.rpc.encoding.literal.*;
import com.sun.xml.rpc.encoding.literal.DetailFragmentDeserializer;
import com.sun.xml.rpc.encoding.simpletype.*;
import com.sun.xml.rpc.encoding.soap.SOAPConstants;
import com.sun.xml.rpc.encoding.soap.SOAP12Constants;
import com.sun.xml.rpc.streaming.*;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;
import javax.xml.namespace.QName;
import java.util.List;
import java.util.ArrayList;

public class WSGetInboundPlugin_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable  {
    private static final QName ns1_wsInboundPluginPK_QNAME = new QName("", "wsInboundPluginPK");
    private static final QName ns2_WSInboundPluginPK_TYPE_QNAME = new QName("urn-com-amalto-xtentis-webservice", "WSInboundPluginPK");
    private CombinedSerializer ns2_myWSInboundPluginPK_LiteralSerializer;
    
    public WSGetInboundPlugin_LiteralSerializer(QName type, String encodingStyle) {
        this(type, encodingStyle, false);
    }
    
    public WSGetInboundPlugin_LiteralSerializer(QName type, String encodingStyle, boolean encodeType) {
        super(type, true, encodingStyle, encodeType);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns2_myWSInboundPluginPK_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.amalto.workbench.webservices.WSInboundPluginPK.class, ns2_WSInboundPluginPK_TYPE_QNAME);
    }
    
    public Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSGetInboundPlugin instance = new com.amalto.workbench.webservices.WSGetInboundPlugin();
        Object member=null;
        QName elementName;
        List values;
        Object value;
        
        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_wsInboundPluginPK_QNAME)) {
                member = ns2_myWSInboundPluginPK_LiteralSerializer.deserialize(ns1_wsInboundPluginPK_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setWsInboundPluginPK((com.amalto.workbench.webservices.WSInboundPluginPK)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_wsInboundPluginPK_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (Object)instance;
    }
    
    public void doSerializeAttributes(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSGetInboundPlugin instance = (com.amalto.workbench.webservices.WSGetInboundPlugin)obj;
        
    }
    public void doSerialize(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSGetInboundPlugin instance = (com.amalto.workbench.webservices.WSGetInboundPlugin)obj;
        
        if (instance.getWsInboundPluginPK() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns2_myWSInboundPluginPK_LiteralSerializer.serialize(instance.getWsInboundPluginPK(), ns1_wsInboundPluginPK_QNAME, null, writer, context);
    }
}
