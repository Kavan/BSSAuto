
/**
 * PPSMSupporterSubscriptionExtensionReference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.redknee.util.crmapi.soap.subscriptions.extensions.xsd._2011._04;
            

            /**
            *  PPSMSupporterSubscriptionExtensionReference bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class PPSMSupporterSubscriptionExtensionReference extends com.redknee.util.crmapi.soap.subscriptions.xsd._2011._01.BaseSubscriptionExtensionReference
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = PPSMSupporterSubscriptionExtensionReference
                Namespace URI = http://soap.crmapi.util.redknee.com/subscriptions/extensions/xsd/2011/04
                Namespace Prefix = ns18
                */
            

                        /**
                        * field for ScreeningTemplates
                        * This was an Array!
                        */

                        
                                    protected long[] localScreeningTemplates ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localScreeningTemplatesTracker = false ;

                           public boolean isScreeningTemplatesSpecified(){
                               return localScreeningTemplatesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long[]
                           */
                           public  long[] getScreeningTemplates(){
                               return localScreeningTemplates;
                           }

                           
                        


                               
                              /**
                               * validate the array for ScreeningTemplates
                               */
                              protected void validateScreeningTemplates(long[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ScreeningTemplates
                              */
                              public void setScreeningTemplates(long[] param){
                              
                                   validateScreeningTemplates(param);

                               localScreeningTemplatesTracker = true;
                                      
                                      this.localScreeningTemplates=param;
                              }

                               
                             

                        /**
                        * field for ChargingTemplates
                        * This was an Array!
                        */

                        
                                    protected long[] localChargingTemplates ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChargingTemplatesTracker = false ;

                           public boolean isChargingTemplatesSpecified(){
                               return localChargingTemplatesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long[]
                           */
                           public  long[] getChargingTemplates(){
                               return localChargingTemplates;
                           }

                           
                        


                               
                              /**
                               * validate the array for ChargingTemplates
                               */
                              protected void validateChargingTemplates(long[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ChargingTemplates
                              */
                              public void setChargingTemplates(long[] param){
                              
                                   validateChargingTemplates(param);

                               localChargingTemplatesTracker = true;
                                      
                                      this.localChargingTemplates=param;
                              }

                               
                             

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://soap.crmapi.util.redknee.com/subscriptions/extensions/xsd/2011/04");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":PPSMSupporterSubscriptionExtensionReference",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "PPSMSupporterSubscriptionExtensionReference",
                           xmlWriter);
                   }

                if (localSubscriptionRefTracker){
                                    if (localSubscriptionRef==null){

                                        writeStartElement(null, "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01", "subscriptionRef", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSubscriptionRef.serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","subscriptionRef"),
                                        xmlWriter);
                                    }
                                } if (localScreeningTemplatesTracker){
                             if (localScreeningTemplates!=null) {
                                   namespace = "http://soap.crmapi.util.redknee.com/subscriptions/extensions/xsd/2011/04";
                                   for (int i = 0;i < localScreeningTemplates.length;i++){
                                        
                                                   if (localScreeningTemplates[i]!=java.lang.Long.MIN_VALUE) {
                                               
                                                writeStartElement(null, namespace, "screeningTemplates", xmlWriter);

                                            
                                                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localScreeningTemplates[i]));
                                                xmlWriter.writeEndElement();
                                            
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://soap.crmapi.util.redknee.com/subscriptions/extensions/xsd/2011/04";
                                                            writeStartElement(null, namespace, "screeningTemplates", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://soap.crmapi.util.redknee.com/subscriptions/extensions/xsd/2011/04", "screeningTemplates", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localChargingTemplatesTracker){
                             if (localChargingTemplates!=null) {
                                   namespace = "http://soap.crmapi.util.redknee.com/subscriptions/extensions/xsd/2011/04";
                                   for (int i = 0;i < localChargingTemplates.length;i++){
                                        
                                                   if (localChargingTemplates[i]!=java.lang.Long.MIN_VALUE) {
                                               
                                                writeStartElement(null, namespace, "chargingTemplates", xmlWriter);

                                            
                                                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChargingTemplates[i]));
                                                xmlWriter.writeEndElement();
                                            
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://soap.crmapi.util.redknee.com/subscriptions/extensions/xsd/2011/04";
                                                            writeStartElement(null, namespace, "chargingTemplates", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://soap.crmapi.util.redknee.com/subscriptions/extensions/xsd/2011/04", "chargingTemplates", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://soap.crmapi.util.redknee.com/subscriptions/extensions/xsd/2011/04")){
                return "ns18";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                    attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance","type"));
                    attribList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/extensions/xsd/2011/04","PPSMSupporterSubscriptionExtensionReference"));
                 if (localSubscriptionRefTracker){
                            elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                      "subscriptionRef"));
                            
                            
                                    elementList.add(localSubscriptionRef==null?null:
                                    localSubscriptionRef);
                                } if (localScreeningTemplatesTracker){
                            if (localScreeningTemplates!=null){
                                  for (int i = 0;i < localScreeningTemplates.length;i++){
                                      
                                          elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/extensions/xsd/2011/04",
                                                                                                                       "screeningTemplates"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localScreeningTemplates[i]));

                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/extensions/xsd/2011/04",
                                                                              "screeningTemplates"));
                                    elementList.add(null);
                                
                            }

                        } if (localChargingTemplatesTracker){
                            if (localChargingTemplates!=null){
                                  for (int i = 0;i < localChargingTemplates.length;i++){
                                      
                                          elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/extensions/xsd/2011/04",
                                                                                                                       "chargingTemplates"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChargingTemplates[i]));

                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/extensions/xsd/2011/04",
                                                                              "chargingTemplates"));
                                    elementList.add(null);
                                
                            }

                        }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static PPSMSupporterSubscriptionExtensionReference parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            PPSMSupporterSubscriptionExtensionReference object =
                new PPSMSupporterSubscriptionExtensionReference();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"PPSMSupporterSubscriptionExtensionReference".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (PPSMSupporterSubscriptionExtensionReference)com.redknee.util.crmapi.soap.common.xsd.common_v2_0.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","subscriptionRef").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSubscriptionRef(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSubscriptionRef(com.redknee.util.crmapi.soap.subscriptions.xsd._2011._01.SubscriptionReference.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/extensions/xsd/2011/04","screeningTemplates").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list2.add(String.valueOf(java.lang.Long.MIN_VALUE));
                                                       
                                                  reader.next();
                                              } else {
                                            list2.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone2 = false;
                                            while(!loopDone2){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone2 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/extensions/xsd/2011/04","screeningTemplates").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list2.add(String.valueOf(java.lang.Long.MIN_VALUE));
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list2.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone2 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                            object.setScreeningTemplates((long[])
                                                org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                            long.class,list2));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/extensions/xsd/2011/04","chargingTemplates").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list3.add(String.valueOf(java.lang.Long.MIN_VALUE));
                                                       
                                                  reader.next();
                                              } else {
                                            list3.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone3 = false;
                                            while(!loopDone3){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone3 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/extensions/xsd/2011/04","chargingTemplates").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list3.add(String.valueOf(java.lang.Long.MIN_VALUE));
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list3.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone3 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                            object.setChargingTemplates((long[])
                                                org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                            long.class,list3));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    