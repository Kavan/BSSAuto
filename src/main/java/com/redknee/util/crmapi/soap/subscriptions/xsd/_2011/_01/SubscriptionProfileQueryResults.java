
/**
 * SubscriptionProfileQueryResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.redknee.util.crmapi.soap.subscriptions.xsd._2011._01;
            

            /**
            *  SubscriptionProfileQueryResults bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SubscriptionProfileQueryResults
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = SubscriptionProfileQueryResults
                Namespace URI = http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01
                Namespace Prefix = ns15
                */
            

                        /**
                        * field for Billing
                        */

                        
                                    protected com.redknee.util.crmapi.soap.subscriptions.xsd._2009._04.ReadOnlySubscriptionBilling localBilling ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBillingTracker = false ;

                           public boolean isBillingSpecified(){
                               return localBillingTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.redknee.util.crmapi.soap.subscriptions.xsd._2009._04.ReadOnlySubscriptionBilling
                           */
                           public  com.redknee.util.crmapi.soap.subscriptions.xsd._2009._04.ReadOnlySubscriptionBilling getBilling(){
                               return localBilling;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Billing
                               */
                               public void setBilling(com.redknee.util.crmapi.soap.subscriptions.xsd._2009._04.ReadOnlySubscriptionBilling param){
                            localBillingTracker = true;
                                   
                                            this.localBilling=param;
                                    

                               }
                            

                        /**
                        * field for Profile
                        */

                        
                                    protected com.redknee.util.crmapi.soap.subscriptions.xsd._2010._06.ReadOnlySubscriptionProfile localProfile ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProfileTracker = false ;

                           public boolean isProfileSpecified(){
                               return localProfileTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.redknee.util.crmapi.soap.subscriptions.xsd._2010._06.ReadOnlySubscriptionProfile
                           */
                           public  com.redknee.util.crmapi.soap.subscriptions.xsd._2010._06.ReadOnlySubscriptionProfile getProfile(){
                               return localProfile;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Profile
                               */
                               public void setProfile(com.redknee.util.crmapi.soap.subscriptions.xsd._2010._06.ReadOnlySubscriptionProfile param){
                            localProfileTracker = true;
                                   
                                            this.localProfile=param;
                                    

                               }
                            

                        /**
                        * field for Rating
                        */

                        
                                    protected com.redknee.util.crmapi.soap.subscriptions.xsd._2011._01.ReadOnlySubscriptionRating localRating ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRatingTracker = false ;

                           public boolean isRatingSpecified(){
                               return localRatingTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.redknee.util.crmapi.soap.subscriptions.xsd._2011._01.ReadOnlySubscriptionRating
                           */
                           public  com.redknee.util.crmapi.soap.subscriptions.xsd._2011._01.ReadOnlySubscriptionRating getRating(){
                               return localRating;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Rating
                               */
                               public void setRating(com.redknee.util.crmapi.soap.subscriptions.xsd._2011._01.ReadOnlySubscriptionRating param){
                            localRatingTracker = true;
                                   
                                            this.localRating=param;
                                    

                               }
                            

                        /**
                        * field for Status
                        */

                        
                                    protected com.redknee.util.crmapi.soap.subscriptions.xsd._2009._04.ReadOnlySubscriptionStatus localStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStatusTracker = false ;

                           public boolean isStatusSpecified(){
                               return localStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.redknee.util.crmapi.soap.subscriptions.xsd._2009._04.ReadOnlySubscriptionStatus
                           */
                           public  com.redknee.util.crmapi.soap.subscriptions.xsd._2009._04.ReadOnlySubscriptionStatus getStatus(){
                               return localStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Status
                               */
                               public void setStatus(com.redknee.util.crmapi.soap.subscriptions.xsd._2009._04.ReadOnlySubscriptionStatus param){
                            localStatusTracker = true;
                                   
                                            this.localStatus=param;
                                    

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
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":SubscriptionProfileQueryResults",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "SubscriptionProfileQueryResults",
                           xmlWriter);
                   }

               
                   }
                if (localBillingTracker){
                                    if (localBilling==null){

                                        writeStartElement(null, "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01", "billing", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBilling.serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","billing"),
                                        xmlWriter);
                                    }
                                } if (localProfileTracker){
                                    if (localProfile==null){

                                        writeStartElement(null, "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01", "profile", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localProfile.serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","profile"),
                                        xmlWriter);
                                    }
                                } if (localRatingTracker){
                                    if (localRating==null){

                                        writeStartElement(null, "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01", "rating", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRating.serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","rating"),
                                        xmlWriter);
                                    }
                                } if (localStatusTracker){
                                    if (localStatus==null){

                                        writeStartElement(null, "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01", "status", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localStatus.serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","status"),
                                        xmlWriter);
                                    }
                                }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01")){
                return "ns15";
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

                 if (localBillingTracker){
                            elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                      "billing"));
                            
                            
                                    elementList.add(localBilling==null?null:
                                    localBilling);
                                } if (localProfileTracker){
                            elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                      "profile"));
                            
                            
                                    elementList.add(localProfile==null?null:
                                    localProfile);
                                } if (localRatingTracker){
                            elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                      "rating"));
                            
                            
                                    elementList.add(localRating==null?null:
                                    localRating);
                                } if (localStatusTracker){
                            elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                      "status"));
                            
                            
                                    elementList.add(localStatus==null?null:
                                    localStatus);
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
        public static SubscriptionProfileQueryResults parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SubscriptionProfileQueryResults object =
                new SubscriptionProfileQueryResults();

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
                    
                            if (!"SubscriptionProfileQueryResults".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SubscriptionProfileQueryResults)com.redknee.util.crmapi.soap.common.xsd.common_v2_0.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","billing").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBilling(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBilling(com.redknee.util.crmapi.soap.subscriptions.xsd._2009._04.ReadOnlySubscriptionBilling.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","profile").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setProfile(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setProfile(com.redknee.util.crmapi.soap.subscriptions.xsd._2010._06.ReadOnlySubscriptionProfile.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","rating").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRating(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRating(com.redknee.util.crmapi.soap.subscriptions.xsd._2011._01.ReadOnlySubscriptionRating.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","status").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setStatus(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setStatus(com.redknee.util.crmapi.soap.subscriptions.xsd._2009._04.ReadOnlySubscriptionStatus.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
           
    