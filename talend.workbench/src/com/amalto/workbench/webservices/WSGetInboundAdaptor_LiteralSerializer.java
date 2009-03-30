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

public class WSGetInboundAdaptor_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable  {
    private static final QName ns1_wsInboundAdaptorPK_QNAME = new QName("", "wsInboundAdaptorPK");
    private static final QName ns2_WSInboundAdaptorPK_TYPE_QNAME = new QName("urn-com-amalto-xtentis-webservice", "WSInboundAdaptorPK");
    private CombinedSerializer ns2_myWSInboundAdaptorPK_LiteralSerializer;
    
    public WSGetInboundAdaptor_LiteralSerializer(QName type, String encodingStyle) {
        this(type, encodingStyle, false);
    }
    
    public WSGetInboundAdaptor_LiteralSerializer(QName type, String encodingStyle, boolean encodeType) {
        super(type, true, encodingStyle, encodeType);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns2_myWSInboundAdaptorPK_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.amalto.workbench.webservices.WSInboundAdaptorPK.class, ns2_WSInboundAdaptorPK_TYPE_QNAME);
    }
    
    public Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSGetInboundAdaptor instance = new com.amalto.workbench.webservices.WSGetInboundAdaptor();
        Object member=null;
        QName elementName;
        List values;
        Object value;
        
        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_wsInboundAdaptorPK_QNAME)) {
                member = ns2_myWSInboundAdaptorPK_LiteralSerializer.deserialize(ns1_wsInboundAdaptorPK_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setWsInboundAdaptorPK((com.amalto.workbench.webservices.WSInboundAdaptorPK)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_wsInboundAdaptorPK_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (Object)instance;
    }
    
    public void doSerializeAttributes(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSGetInboundAdaptor instance = (com.amalto.workbench.webservices.WSGetInboundAdaptor)obj;
        
    }
    public void doSerialize(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSGetInboundAdaptor instance = (com.amalto.workbench.webservices.WSGetInboundAdaptor)obj;
        
        if (instance.getWsInboundAdaptorPK() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns2_myWSInboundAdaptorPK_LiteralSerializer.serialize(instance.getWsInboundAdaptorPK(), ns1_wsInboundAdaptorPK_QNAME, null, writer, context);
    }
}
