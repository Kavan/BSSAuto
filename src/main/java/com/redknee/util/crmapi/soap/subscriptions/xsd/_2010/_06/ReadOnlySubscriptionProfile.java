
/**
 * ReadOnlySubscriptionProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.redknee.util.crmapi.soap.subscriptions.xsd._2010._06;
            

            /**
            *  ReadOnlySubscriptionProfile bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ReadOnlySubscriptionProfile extends com.redknee.util.crmapi.soap.subscriptions.xsd._2010._06.SubscriptionProfile
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ReadOnlySubscriptionProfile
                Namespace URI = http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06
                Namespace Prefix = ns11
                */
            

                        /**
                        * field for AdditionalMobileNumbers
                        * This was an Array!
                        */

                        
                                    protected com.redknee.util.crmapi.soap.servicesandbundles.xsd._2009._04.AdditionalMobileNumber[] localAdditionalMobileNumbers ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAdditionalMobileNumbersTracker = false ;

                           public boolean isAdditionalMobileNumbersSpecified(){
                               return localAdditionalMobileNumbersTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.redknee.util.crmapi.soap.servicesandbundles.xsd._2009._04.AdditionalMobileNumber[]
                           */
                           public  com.redknee.util.crmapi.soap.servicesandbundles.xsd._2009._04.AdditionalMobileNumber[] getAdditionalMobileNumbers(){
                               return localAdditionalMobileNumbers;
                           }

                           
                        


                               
                              /**
                               * validate the array for AdditionalMobileNumbers
                               */
                              protected void validateAdditionalMobileNumbers(com.redknee.util.crmapi.soap.servicesandbundles.xsd._2009._04.AdditionalMobileNumber[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param AdditionalMobileNumbers
                              */
                              public void setAdditionalMobileNumbers(com.redknee.util.crmapi.soap.servicesandbundles.xsd._2009._04.AdditionalMobileNumber[] param){
                              
                                   validateAdditionalMobileNumbers(param);

                               localAdditionalMobileNumbersTracker = true;
                                      
                                      this.localAdditionalMobileNumbers=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.redknee.util.crmapi.soap.servicesandbundles.xsd._2009._04.AdditionalMobileNumber
                             */
                             public void addAdditionalMobileNumbers(com.redknee.util.crmapi.soap.servicesandbundles.xsd._2009._04.AdditionalMobileNumber param){
                                   if (localAdditionalMobileNumbers == null){
                                   localAdditionalMobileNumbers = new com.redknee.util.crmapi.soap.servicesandbundles.xsd._2009._04.AdditionalMobileNumber[]{};
                                   }

                            
                                 //update the setting tracker
                                localAdditionalMobileNumbersTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localAdditionalMobileNumbers);
                               list.add(param);
                               this.localAdditionalMobileNumbers =
                             (com.redknee.util.crmapi.soap.servicesandbundles.xsd._2009._04.AdditionalMobileNumber[])list.toArray(
                            new com.redknee.util.crmapi.soap.servicesandbundles.xsd._2009._04.AdditionalMobileNumber[list.size()]);

                             }
                             

                        /**
                        * field for Created
                        */

                        
                                    protected java.util.Calendar localCreated ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreatedTracker = false ;

                           public boolean isCreatedSpecified(){
                               return localCreatedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getCreated(){
                               return localCreated;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Created
                               */
                               public void setCreated(java.util.Calendar param){
                            localCreatedTracker = true;
                                   
                                            this.localCreated=param;
                                    

                               }
                            

                        /**
                        * field for LastModified
                        */

                        
                                    protected java.util.Calendar localLastModified ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastModifiedTracker = false ;

                           public boolean isLastModifiedSpecified(){
                               return localLastModifiedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getLastModified(){
                               return localLastModified;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastModified
                               */
                               public void setLastModified(java.util.Calendar param){
                            localLastModifiedTracker = true;
                                   
                                            this.localLastModified=param;
                                    

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
                

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":ReadOnlySubscriptionProfile",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ReadOnlySubscriptionProfile",
                           xmlWriter);
                   }

                if (localPoolLimitTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06";
                                    writeStartElement(null, namespace, "poolLimit", xmlWriter);
                             
                                               if (localPoolLimit==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPoolLimit));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPoolLimitStrategyTracker){
                                    if (localPoolLimitStrategy==null){

                                        writeStartElement(null, "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06", "poolLimitStrategy", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPoolLimitStrategy.serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","poolLimitStrategy"),
                                        xmlWriter);
                                    }
                                } if (localNotificationPreferenceTracker){
                                            if (localNotificationPreference==null){
                                                 throw new org.apache.axis2.databinding.ADBException("notificationPreference cannot be null!!");
                                            }
                                           localNotificationPreference.serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","notificationPreference"),
                                               xmlWriter);
                                        } if (localAccountIDTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06";
                                    writeStartElement(null, namespace, "accountID", xmlWriter);
                             

                                          if (localAccountID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("accountID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAccountID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCardPackageIDTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06";
                                    writeStartElement(null, namespace, "cardPackageID", xmlWriter);
                             

                                          if (localCardPackageID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("cardPackageID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCardPackageID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localHlrIDTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06";
                                    writeStartElement(null, namespace, "hlrID", xmlWriter);
                             
                                               if (localHlrID==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHlrID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIdentifierTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06";
                                    writeStartElement(null, namespace, "identifier", xmlWriter);
                             

                                          if (localIdentifier==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("identifier cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localIdentifier);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06";
                                    writeStartElement(null, namespace, "mobileNumber", xmlWriter);
                             

                                          if (localMobileNumber==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("mobileNumber cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMobileNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localPaidTypeTracker){
                                            if (localPaidType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("paidType cannot be null!!");
                                            }
                                           localPaidType.serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","paidType"),
                                               xmlWriter);
                                        } if (localSpidTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06";
                                    writeStartElement(null, namespace, "spid", xmlWriter);
                             
                                               if (localSpid==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("spid cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpid));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06";
                                    writeStartElement(null, namespace, "subscriptionClass", xmlWriter);
                             
                                               if (localSubscriptionClass==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("subscriptionClass cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSubscriptionClass));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06";
                                    writeStartElement(null, namespace, "subscriptionType", xmlWriter);
                             
                                               if (localSubscriptionType==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("subscriptionType cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSubscriptionType));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localTechnologyType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("technologyType cannot be null!!");
                                            }
                                           localTechnologyType.serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","technologyType"),
                                               xmlWriter);
                                         if (localAdditionalMobileNumbersTracker){
                                       if (localAdditionalMobileNumbers!=null){
                                            for (int i = 0;i < localAdditionalMobileNumbers.length;i++){
                                                if (localAdditionalMobileNumbers[i] != null){
                                                 localAdditionalMobileNumbers[i].serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","additionalMobileNumbers"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06", "additionalMobileNumbers", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06", "additionalMobileNumbers", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localCreatedTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06";
                                    writeStartElement(null, namespace, "created", xmlWriter);
                             

                                          if (localCreated==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreated));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLastModifiedTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06";
                                    writeStartElement(null, namespace, "lastModified", xmlWriter);
                             

                                          if (localLastModified==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastModified));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06")){
                return "ns11";
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
                    attribList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","ReadOnlySubscriptionProfile"));
                 if (localPoolLimitTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                      "poolLimit"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPoolLimit));
                            } if (localPoolLimitStrategyTracker){
                            elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                      "poolLimitStrategy"));
                            
                            
                                    elementList.add(localPoolLimitStrategy==null?null:
                                    localPoolLimitStrategy);
                                } if (localNotificationPreferenceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                      "notificationPreference"));
                            
                            
                                    if (localNotificationPreference==null){
                                         throw new org.apache.axis2.databinding.ADBException("notificationPreference cannot be null!!");
                                    }
                                    elementList.add(localNotificationPreference);
                                } if (localAccountIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                      "accountID"));
                                 
                                        if (localAccountID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAccountID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("accountID cannot be null!!");
                                        }
                                    } if (localCardPackageIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                      "cardPackageID"));
                                 
                                        if (localCardPackageID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCardPackageID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("cardPackageID cannot be null!!");
                                        }
                                    } if (localHlrIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                      "hlrID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHlrID));
                            } if (localIdentifierTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                      "identifier"));
                                 
                                        if (localIdentifier != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdentifier));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("identifier cannot be null!!");
                                        }
                                    }
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                      "mobileNumber"));
                                 
                                        if (localMobileNumber != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMobileNumber));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("mobileNumber cannot be null!!");
                                        }
                                     if (localPaidTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                      "paidType"));
                            
                            
                                    if (localPaidType==null){
                                         throw new org.apache.axis2.databinding.ADBException("paidType cannot be null!!");
                                    }
                                    elementList.add(localPaidType);
                                } if (localSpidTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                      "spid"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpid));
                            }
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                      "subscriptionClass"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSubscriptionClass));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                      "subscriptionType"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSubscriptionType));
                            
                            elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                      "technologyType"));
                            
                            
                                    if (localTechnologyType==null){
                                         throw new org.apache.axis2.databinding.ADBException("technologyType cannot be null!!");
                                    }
                                    elementList.add(localTechnologyType);
                                 if (localAdditionalMobileNumbersTracker){
                             if (localAdditionalMobileNumbers!=null) {
                                 for (int i = 0;i < localAdditionalMobileNumbers.length;i++){

                                    if (localAdditionalMobileNumbers[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                          "additionalMobileNumbers"));
                                         elementList.add(localAdditionalMobileNumbers[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                          "additionalMobileNumbers"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                          "additionalMobileNumbers"));
                                        elementList.add(localAdditionalMobileNumbers);
                                    
                             }

                        } if (localCreatedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                      "created"));
                                 
                                         elementList.add(localCreated==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreated));
                                    } if (localLastModifiedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                      "lastModified"));
                                 
                                         elementList.add(localLastModified==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastModified));
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
        public static ReadOnlySubscriptionProfile parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ReadOnlySubscriptionProfile object =
                new ReadOnlySubscriptionProfile();

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
                    
                            if (!"ReadOnlySubscriptionProfile".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ReadOnlySubscriptionProfile)com.redknee.util.crmapi.soap.common.xsd.common_v2_0.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list14 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","poolLimit").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPoolLimit(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setPoolLimit(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPoolLimit(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","poolLimitStrategy").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPoolLimitStrategy(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPoolLimitStrategy(com.redknee.util.crmapi.soap.common.xsd._2008._08.PoolLimitStrategy.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","notificationPreference").equals(reader.getName())){
                                
                                                object.setNotificationPreference(com.redknee.util.crmapi.soap.common.xsd._2008._08.NotificationPreferenceType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","accountID").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"accountID" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAccountID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","cardPackageID").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"cardPackageID" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCardPackageID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","hlrID").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setHlrID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setHlrID(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setHlrID(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","identifier").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"identifier" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIdentifier(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","mobileNumber").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"mobileNumber" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMobileNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","paidType").equals(reader.getName())){
                                
                                                object.setPaidType(com.redknee.util.crmapi.soap.common.xsd._2008._08.PaidType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","spid").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"spid" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSpid(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setSpid(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","subscriptionClass").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"subscriptionClass" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSubscriptionClass(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","subscriptionType").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"subscriptionType" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSubscriptionType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","technologyType").equals(reader.getName())){
                                
                                                object.setTechnologyType(com.redknee.util.crmapi.soap.common.xsd._2008._08.TechnologyType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","additionalMobileNumbers").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list14.add(null);
                                                              reader.next();
                                                          } else {
                                                        list14.add(com.redknee.util.crmapi.soap.servicesandbundles.xsd._2009._04.AdditionalMobileNumber.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone14 = false;
                                                        while(!loopDone14){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone14 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","additionalMobileNumbers").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list14.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list14.add(com.redknee.util.crmapi.soap.servicesandbundles.xsd._2009._04.AdditionalMobileNumber.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone14 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setAdditionalMobileNumbers((com.redknee.util.crmapi.soap.servicesandbundles.xsd._2009._04.AdditionalMobileNumber[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.redknee.util.crmapi.soap.servicesandbundles.xsd._2009._04.AdditionalMobileNumber.class,
                                                                list14));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","created").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCreated(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","lastModified").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLastModified(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
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
           
    