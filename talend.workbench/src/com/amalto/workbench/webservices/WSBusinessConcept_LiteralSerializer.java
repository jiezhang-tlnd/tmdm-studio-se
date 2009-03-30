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

public class WSBusinessConcept_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable  {
    private static final QName ns1_name_QNAME = new QName("", "name");
    private static final QName ns3_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer ns3_myns3_string__java_lang_String_String_Serializer;
    private static final QName ns1_businessTemplate_QNAME = new QName("", "businessTemplate");
    private static final QName ns1_wsUniqueKey_QNAME = new QName("", "wsUniqueKey");
    private static final QName ns2_WSKey_TYPE_QNAME = new QName("urn-com-amalto-xtentis-webservice", "WSKey");
    private CombinedSerializer ns2_myWSKey_LiteralSerializer;
    private static final QName ns1_wsLabel_QNAME = new QName("", "wsLabel");
    private static final QName ns2_WSI18nString_TYPE_QNAME = new QName("urn-com-amalto-xtentis-webservice", "WSI18nString");
    private CombinedSerializer ns2_myWSI18NString_LiteralSerializer;
    private static final QName ns1_wsDescription_QNAME = new QName("", "wsDescription");
    
    public WSBusinessConcept_LiteralSerializer(QName type, String encodingStyle) {
        this(type, encodingStyle, false);
    }
    
    public WSBusinessConcept_LiteralSerializer(QName type, String encodingStyle, boolean encodeType) {
        super(type, true, encodingStyle, encodeType);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns3_myns3_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.String.class, ns3_string_TYPE_QNAME);
        ns2_myWSKey_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.amalto.workbench.webservices.WSKey.class, ns2_WSKey_TYPE_QNAME);
        ns2_myWSI18NString_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.amalto.workbench.webservices.WSI18NString.class, ns2_WSI18nString_TYPE_QNAME);
    }
    
    public Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSBusinessConcept instance = new com.amalto.workbench.webservices.WSBusinessConcept();
        Object member=null;
        QName elementName;
        List values;
        Object value;
        
        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_name_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_name_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setName((java.lang.String)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_name_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_businessTemplate_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_businessTemplate_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setBusinessTemplate((java.lang.String)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_businessTemplate_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_wsUniqueKey_QNAME)) {
                member = ns2_myWSKey_LiteralSerializer.deserialize(ns1_wsUniqueKey_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setWsUniqueKey((com.amalto.workbench.webservices.WSKey)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_wsUniqueKey_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if ((reader.getState() == XMLReader.START) && (elementName.equals(ns1_wsLabel_QNAME))) {
            values = new ArrayList();
            for(;;) {
                elementName = reader.getName();
                if ((reader.getState() == XMLReader.START) && (elementName.equals(ns1_wsLabel_QNAME))) {
                    value = ns2_myWSI18NString_LiteralSerializer.deserialize(ns1_wsLabel_QNAME, reader, context);
                    if (value == null) {
                        throw new DeserializationException("literal.unexpectedNull");
                    }
                    values.add(value);
                    reader.nextElementContent();
                } else {
                    break;
                }
            }
            member = new com.amalto.workbench.webservices.WSI18NString[values.size()];
            member = values.toArray((Object[]) member);
            instance.setWsLabel((com.amalto.workbench.webservices.WSI18NString[])member);
        }
        else {
            instance.setWsLabel(new com.amalto.workbench.webservices.WSI18NString[0]);
        }
        elementName = reader.getName();
        if ((reader.getState() == XMLReader.START) && (elementName.equals(ns1_wsDescription_QNAME))) {
            values = new ArrayList();
            for(;;) {
                elementName = reader.getName();
                if ((reader.getState() == XMLReader.START) && (elementName.equals(ns1_wsDescription_QNAME))) {
                    value = ns2_myWSI18NString_LiteralSerializer.deserialize(ns1_wsDescription_QNAME, reader, context);
                    if (value == null) {
                        throw new DeserializationException("literal.unexpectedNull");
                    }
                    values.add(value);
                    reader.nextElementContent();
                } else {
                    break;
                }
            }
            member = new com.amalto.workbench.webservices.WSI18NString[values.size()];
            member = values.toArray((Object[]) member);
            instance.setWsDescription((com.amalto.workbench.webservices.WSI18NString[])member);
        }
        else {
            instance.setWsDescription(new com.amalto.workbench.webservices.WSI18NString[0]);
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (Object)instance;
    }
    
    public void doSerializeAttributes(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSBusinessConcept instance = (com.amalto.workbench.webservices.WSBusinessConcept)obj;
        
    }
    public void doSerialize(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSBusinessConcept instance = (com.amalto.workbench.webservices.WSBusinessConcept)obj;
        
        if (instance.getName() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getName(), ns1_name_QNAME, null, writer, context);
        if (instance.getBusinessTemplate() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getBusinessTemplate(), ns1_businessTemplate_QNAME, null, writer, context);
        if (instance.getWsUniqueKey() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns2_myWSKey_LiteralSerializer.serialize(instance.getWsUniqueKey(), ns1_wsUniqueKey_QNAME, null, writer, context);
        if (instance.getWsLabel() != null) {
            for (int i = 0; i < instance.getWsLabel().length; ++i) {
                ns2_myWSI18NString_LiteralSerializer.serialize(instance.getWsLabel()[i], ns1_wsLabel_QNAME, null, writer, context);
            }
        }
        if (instance.getWsDescription() != null) {
            for (int i = 0; i < instance.getWsDescription().length; ++i) {
                ns2_myWSI18NString_LiteralSerializer.serialize(instance.getWsDescription()[i], ns1_wsDescription_QNAME, null, writer, context);
            }
        }
    }
}
