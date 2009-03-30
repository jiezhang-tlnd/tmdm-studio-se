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

public class WSSingleExtract_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable  {
    private static final QName ns1_wsOutboundAdaptorPK_QNAME = new QName("", "wsOutboundAdaptorPK");
    private static final QName ns2_WSOutboundAdaptorPK_TYPE_QNAME = new QName("urn-com-amalto-xtentis-webservice", "WSOutboundAdaptorPK");
    private CombinedSerializer ns2_myWSOutboundAdaptorPK_LiteralSerializer;
    private static final QName ns1_wsSingleSearch_QNAME = new QName("", "wsSingleSearch");
    private static final QName ns2_WSSingleSearch_TYPE_QNAME = new QName("urn-com-amalto-xtentis-webservice", "WSSingleSearch");
    private CombinedSerializer ns2_myWSSingleSearch_LiteralSerializer;
    
    public WSSingleExtract_LiteralSerializer(QName type, String encodingStyle) {
        this(type, encodingStyle, false);
    }
    
    public WSSingleExtract_LiteralSerializer(QName type, String encodingStyle, boolean encodeType) {
        super(type, true, encodingStyle, encodeType);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns2_myWSOutboundAdaptorPK_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.amalto.workbench.webservices.WSOutboundAdaptorPK.class, ns2_WSOutboundAdaptorPK_TYPE_QNAME);
        ns2_myWSSingleSearch_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.amalto.workbench.webservices.WSSingleSearch.class, ns2_WSSingleSearch_TYPE_QNAME);
    }
    
    public Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSSingleExtract instance = new com.amalto.workbench.webservices.WSSingleExtract();
        Object member=null;
        QName elementName;
        List values;
        Object value;
        
        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_wsOutboundAdaptorPK_QNAME)) {
                member = ns2_myWSOutboundAdaptorPK_LiteralSerializer.deserialize(ns1_wsOutboundAdaptorPK_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setWsOutboundAdaptorPK((com.amalto.workbench.webservices.WSOutboundAdaptorPK)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_wsOutboundAdaptorPK_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_wsSingleSearch_QNAME)) {
                member = ns2_myWSSingleSearch_LiteralSerializer.deserialize(ns1_wsSingleSearch_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setWsSingleSearch((com.amalto.workbench.webservices.WSSingleSearch)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_wsSingleSearch_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (Object)instance;
    }
    
    public void doSerializeAttributes(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSSingleExtract instance = (com.amalto.workbench.webservices.WSSingleExtract)obj;
        
    }
    public void doSerialize(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSSingleExtract instance = (com.amalto.workbench.webservices.WSSingleExtract)obj;
        
        if (instance.getWsOutboundAdaptorPK() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns2_myWSOutboundAdaptorPK_LiteralSerializer.serialize(instance.getWsOutboundAdaptorPK(), ns1_wsOutboundAdaptorPK_QNAME, null, writer, context);
        if (instance.getWsSingleSearch() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns2_myWSSingleSearch_LiteralSerializer.serialize(instance.getWsSingleSearch(), ns1_wsSingleSearch_QNAME, null, writer, context);
    }
}
