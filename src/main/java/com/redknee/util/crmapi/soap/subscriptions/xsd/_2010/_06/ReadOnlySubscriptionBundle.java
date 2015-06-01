
/**
 * ReadOnlySubscriptionBundle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.redknee.util.crmapi.soap.subscriptions.xsd._2010._06;
            

            /**
            *  ReadOnlySubscriptionBundle bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ReadOnlySubscriptionBundle
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ReadOnlySubscriptionBundle
                Namespace URI = http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06
                Namespace Prefix = ns11
                */
            

                        /**
                        * field for Msisdn
                        */

                        
                                    protected java.lang.String localMsisdn ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMsisdnTracker = false ;

                           public boolean isMsisdnSpecified(){
                               return localMsisdnTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMsisdn(){
                               return localMsisdn;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Msisdn
                               */
                               public void setMsisdn(java.lang.String param){
                            localMsisdnTracker = true;
                                   
                                            this.localMsisdn=param;
                                    

                               }
                            

                        /**
                        * field for BundleID
                        */

                        
                                    protected long localBundleID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBundleIDTracker = false ;

                           public boolean isBundleIDSpecified(){
                               return localBundleIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getBundleID(){
                               return localBundleID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BundleID
                               */
                               public void setBundleID(long param){
                            localBundleIDTracker = true;
                                   
                                            this.localBundleID=param;
                                    

                               }
                            

                        /**
                        * field for Spid
                        */

                        
                                    protected int localSpid ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSpidTracker = false ;

                           public boolean isSpidSpecified(){
                               return localSpidTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getSpid(){
                               return localSpid;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Spid
                               */
                               public void setSpid(int param){
                            localSpidTracker = true;
                                   
                                            this.localSpid=param;
                                    

                               }
                            

                        /**
                        * field for BucketID
                        */

                        
                                    protected long localBucketID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBucketIDTracker = false ;

                           public boolean isBucketIDSpecified(){
                               return localBucketIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getBucketID(){
                               return localBucketID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BucketID
                               */
                               public void setBucketID(long param){
                            localBucketIDTracker = true;
                                   
                                            this.localBucketID=param;
                                    

                               }
                            

                        /**
                        * field for Balances
                        * This was an Array!
                        */

                        
                                    protected com.redknee.util.crmapi.soap.subscriptions.xsd._2009._04.SubscriptionBundleBalance[] localBalances ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBalancesTracker = false ;

                           public boolean isBalancesSpecified(){
                               return localBalancesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.redknee.util.crmapi.soap.subscriptions.xsd._2009._04.SubscriptionBundleBalance[]
                           */
                           public  com.redknee.util.crmapi.soap.subscriptions.xsd._2009._04.SubscriptionBundleBalance[] getBalances(){
                               return localBalances;
                           }

                           
                        


                               
                              /**
                               * validate the array for Balances
                               */
                              protected void validateBalances(com.redknee.util.crmapi.soap.subscriptions.xsd._2009._04.SubscriptionBundleBalance[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Balances
                              */
                              public void setBalances(com.redknee.util.crmapi.soap.subscriptions.xsd._2009._04.SubscriptionBundleBalance[] param){
                              
                                   validateBalances(param);

                               localBalancesTracker = true;
                                      
                                      this.localBalances=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.redknee.util.crmapi.soap.subscriptions.xsd._2009._04.SubscriptionBundleBalance
                             */
                             public void addBalances(com.redknee.util.crmapi.soap.subscriptions.xsd._2009._04.SubscriptionBundleBalance param){
                                   if (localBalances == null){
                                   localBalances = new com.redknee.util.crmapi.soap.subscriptions.xsd._2009._04.SubscriptionBundleBalance[]{};
                                   }

                            
                                 //update the setting tracker
                                localBalancesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localBalances);
                               list.add(param);
                               this.localBalances =
                             (com.redknee.util.crmapi.soap.subscriptions.xsd._2009._04.SubscriptionBundleBalance[])list.toArray(
                            new com.redknee.util.crmapi.soap.subscriptions.xsd._2009._04.SubscriptionBundleBalance[list.size()]);

                             }
                             

                        /**
                        * field for UnitType
                        */

                        
                                    protected com.redknee.util.crmapi.soap.subscriptions.xsd._2010._06.SubscriptionBundleUnitType localUnitType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUnitTypeTracker = false ;

                           public boolean isUnitTypeSpecified(){
                               return localUnitTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.redknee.util.crmapi.soap.subscriptions.xsd._2010._06.SubscriptionBundleUnitType
                           */
                           public  com.redknee.util.crmapi.soap.subscriptions.xsd._2010._06.SubscriptionBundleUnitType getUnitType(){
                               return localUnitType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UnitType
                               */
                               public void setUnitType(com.redknee.util.crmapi.soap.subscriptions.xsd._2010._06.SubscriptionBundleUnitType param){
                            localUnitTypeTracker = true;
                                   
                                            this.localUnitType=param;
                                    

                               }
                            

                        /**
                        * field for ExpiryTime
                        */

                        
                                    protected java.util.Calendar localExpiryTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExpiryTimeTracker = false ;

                           public boolean isExpiryTimeSpecified(){
                               return localExpiryTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getExpiryTime(){
                               return localExpiryTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExpiryTime
                               */
                               public void setExpiryTime(java.util.Calendar param){
                            localExpiryTimeTracker = true;
                                   
                                            this.localExpiryTime=param;
                                    

                               }
                            

                        /**
                        * field for ActivationTime
                        */

                        
                                    protected java.util.Calendar localActivationTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localActivationTimeTracker = false ;

                           public boolean isActivationTimeSpecified(){
                               return localActivationTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getActivationTime(){
                               return localActivationTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ActivationTime
                               */
                               public void setActivationTime(java.util.Calendar param){
                            localActivationTimeTracker = true;
                                   
                                            this.localActivationTime=param;
                                    

                               }
                            

                        /**
                        * field for ProvisionTime
                        */

                        
                                    protected java.util.Calendar localProvisionTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProvisionTimeTracker = false ;

                           public boolean isProvisionTimeSpecified(){
                               return localProvisionTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getProvisionTime(){
                               return localProvisionTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProvisionTime
                               */
                               public void setProvisionTime(java.util.Calendar param){
                            localProvisionTimeTracker = true;
                                   
                                            this.localProvisionTime=param;
                                    

                               }
                            

                        /**
                        * field for Status
                        */

                        
                                    protected com.redknee.util.crmapi.soap.subscriptions.xsd._2010._06.BundleStatus localStatus ;
                                
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
                           * @return com.redknee.util.crmapi.soap.subscriptions.xsd._2010._06.BundleStatus
                           */
                           public  com.redknee.util.crmapi.soap.subscriptions.xsd._2010._06.BundleStatus getStatus(){
                               return localStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Status
                               */
                               public void setStatus(com.redknee.util.crmapi.soap.subscriptions.xsd._2010._06.BundleStatus param){
                            localStatusTracker = true;
                                   
                                            this.localStatus=param;
                                    

                               }
                            

                        /**
                        * field for BundleName
                        */

                        
                                    protected java.lang.String localBundleName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBundleNameTracker = false ;

                           public boolean isBundleNameSpecified(){
                               return localBundleNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getBundleName(){
                               return localBundleName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BundleName
                               */
                               public void setBundleName(java.lang.String param){
                            localBundleNameTracker = true;
                                   
                                            this.localBundleName=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":ReadOnlySubscriptionBundle",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ReadOnlySubscriptionBundle",
                           xmlWriter);
                   }

               
                   }
                if (localMsisdnTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06";
                                    writeStartElement(null, namespace, "msisdn", xmlWriter);
                             

                                          if (localMsisdn==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMsisdn);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBundleIDTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06";
                                    writeStartElement(null, namespace, "bundleID", xmlWriter);
                             
                                               if (localBundleID==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBundleID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSpidTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06";
                                    writeStartElement(null, namespace, "spid", xmlWriter);
                             
                                               if (localSpid==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpid));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBucketIDTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06";
                                    writeStartElement(null, namespace, "bucketID", xmlWriter);
                             
                                               if (localBucketID==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBucketID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBalancesTracker){
                                       if (localBalances!=null){
                                            for (int i = 0;i < localBalances.length;i++){
                                                if (localBalances[i] != null){
                                                 localBalances[i].serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","balances"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06", "balances", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06", "balances", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localUnitTypeTracker){
                                    if (localUnitType==null){

                                        writeStartElement(null, "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06", "unitType", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localUnitType.serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","unitType"),
                                        xmlWriter);
                                    }
                                } if (localExpiryTimeTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06";
                                    writeStartElement(null, namespace, "expiryTime", xmlWriter);
                             

                                          if (localExpiryTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpiryTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localActivationTimeTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06";
                                    writeStartElement(null, namespace, "activationTime", xmlWriter);
                             

                                          if (localActivationTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localActivationTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localProvisionTimeTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06";
                                    writeStartElement(null, namespace, "provisionTime", xmlWriter);
                             

                                          if (localProvisionTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProvisionTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStatusTracker){
                                    if (localStatus==null){

                                        writeStartElement(null, "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06", "status", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localStatus.serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","status"),
                                        xmlWriter);
                                    }
                                } if (localBundleNameTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06";
                                    writeStartElement(null, namespace, "bundleName", xmlWriter);
                             

                                          if (localBundleName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localBundleName);
                                            
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

                 if (localMsisdnTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                      "msisdn"));
                                 
                                         elementList.add(localMsisdn==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMsisdn));
                                    } if (localBundleIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                      "bundleID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBundleID));
                            } if (localSpidTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                      "spid"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpid));
                            } if (localBucketIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                      "bucketID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBucketID));
                            } if (localBalancesTracker){
                             if (localBalances!=null) {
                                 for (int i = 0;i < localBalances.length;i++){

                                    if (localBalances[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                          "balances"));
                                         elementList.add(localBalances[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                          "balances"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                          "balances"));
                                        elementList.add(localBalances);
                                    
                             }

                        } if (localUnitTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                      "unitType"));
                            
                            
                                    elementList.add(localUnitType==null?null:
                                    localUnitType);
                                } if (localExpiryTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                      "expiryTime"));
                                 
                                         elementList.add(localExpiryTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpiryTime));
                                    } if (localActivationTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                      "activationTime"));
                                 
                                         elementList.add(localActivationTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localActivationTime));
                                    } if (localProvisionTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                      "provisionTime"));
                                 
                                         elementList.add(localProvisionTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProvisionTime));
                                    } if (localStatusTracker){
                            elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                      "status"));
                            
                            
                                    elementList.add(localStatus==null?null:
                                    localStatus);
                                } if (localBundleNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06",
                                                                      "bundleName"));
                                 
                                         elementList.add(localBundleName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBundleName));
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
        public static ReadOnlySubscriptionBundle parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ReadOnlySubscriptionBundle object =
                new ReadOnlySubscriptionBundle();

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
                    
                            if (!"ReadOnlySubscriptionBundle".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ReadOnlySubscriptionBundle)com.redknee.util.crmapi.soap.common.xsd.common_v2_0.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list5 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","msisdn").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMsisdn(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","bundleID").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBundleID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setBundleID(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setBundleID(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","spid").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSpid(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setSpid(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setSpid(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","bucketID").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBucketID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setBucketID(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setBucketID(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","balances").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list5.add(null);
                                                              reader.next();
                                                          } else {
                                                        list5.add(com.redknee.util.crmapi.soap.subscriptions.xsd._2009._04.SubscriptionBundleBalance.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone5 = false;
                                                        while(!loopDone5){
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
                                                                loopDone5 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","balances").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list5.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list5.add(com.redknee.util.crmapi.soap.subscriptions.xsd._2009._04.SubscriptionBundleBalance.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone5 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setBalances((com.redknee.util.crmapi.soap.subscriptions.xsd._2009._04.SubscriptionBundleBalance[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.redknee.util.crmapi.soap.subscriptions.xsd._2009._04.SubscriptionBundleBalance.class,
                                                                list5));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","unitType").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setUnitType(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setUnitType(com.redknee.util.crmapi.soap.subscriptions.xsd._2010._06.SubscriptionBundleUnitType.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","expiryTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setExpiryTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","activationTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setActivationTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","provisionTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setProvisionTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","status").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setStatus(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setStatus(com.redknee.util.crmapi.soap.subscriptions.xsd._2010._06.BundleStatus.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2010/06","bundleName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBundleName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
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
           
    