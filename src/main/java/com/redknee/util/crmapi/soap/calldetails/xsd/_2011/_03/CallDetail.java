
/**
 * CallDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.redknee.util.crmapi.soap.calldetails.xsd._2011._03;
            

            /**
            *  CallDetail bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class CallDetail extends com.redknee.util.crmapi.soap.calldetails.xsd._2011._03.CallDetailReference
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = CallDetail
                Namespace URI = http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03
                Namespace Prefix = ns14
                */
            

                        /**
                        * field for BillingCategoryID
                        */

                        
                                    protected long localBillingCategoryID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBillingCategoryIDTracker = false ;

                           public boolean isBillingCategoryIDSpecified(){
                               return localBillingCategoryIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getBillingCategoryID(){
                               return localBillingCategoryID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BillingCategoryID
                               */
                               public void setBillingCategoryID(long param){
                            localBillingCategoryIDTracker = true;
                                   
                                            this.localBillingCategoryID=param;
                                    

                               }
                            

                        /**
                        * field for BucketRateID
                        */

                        
                                    protected long localBucketRateID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBucketRateIDTracker = false ;

                           public boolean isBucketRateIDSpecified(){
                               return localBucketRateIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getBucketRateID(){
                               return localBucketRateID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BucketRateID
                               */
                               public void setBucketRateID(long param){
                            localBucketRateIDTracker = true;
                                   
                                            this.localBucketRateID=param;
                                    

                               }
                            

                        /**
                        * field for FlatRate
                        */

                        
                                    protected long localFlatRate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFlatRateTracker = false ;

                           public boolean isFlatRateSpecified(){
                               return localFlatRateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getFlatRate(){
                               return localFlatRate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FlatRate
                               */
                               public void setFlatRate(long param){
                            localFlatRateTracker = true;
                                   
                                            this.localFlatRate=param;
                                    

                               }
                            

                        /**
                        * field for GlCode
                        */

                        
                                    protected java.lang.String localGlCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGlCodeTracker = false ;

                           public boolean isGlCodeSpecified(){
                               return localGlCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGlCode(){
                               return localGlCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GlCode
                               */
                               public void setGlCode(java.lang.String param){
                            localGlCodeTracker = true;
                                   
                                            this.localGlCode=param;
                                    

                               }
                            

                        /**
                        * field for PostedDate
                        */

                        
                                    protected java.util.Calendar localPostedDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPostedDateTracker = false ;

                           public boolean isPostedDateSpecified(){
                               return localPostedDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getPostedDate(){
                               return localPostedDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PostedDate
                               */
                               public void setPostedDate(java.util.Calendar param){
                            localPostedDateTracker = true;
                                   
                                            this.localPostedDate=param;
                                    

                               }
                            

                        /**
                        * field for PrimaryTaxAuthorityID
                        */

                        
                                    protected long localPrimaryTaxAuthorityID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrimaryTaxAuthorityIDTracker = false ;

                           public boolean isPrimaryTaxAuthorityIDSpecified(){
                               return localPrimaryTaxAuthorityIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getPrimaryTaxAuthorityID(){
                               return localPrimaryTaxAuthorityID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrimaryTaxAuthorityID
                               */
                               public void setPrimaryTaxAuthorityID(long param){
                            localPrimaryTaxAuthorityIDTracker = true;
                                   
                                            this.localPrimaryTaxAuthorityID=param;
                                    

                               }
                            

                        /**
                        * field for RatePlan
                        */

                        
                                    protected java.lang.String localRatePlan ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRatePlanTracker = false ;

                           public boolean isRatePlanSpecified(){
                               return localRatePlanTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRatePlan(){
                               return localRatePlan;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RatePlan
                               */
                               public void setRatePlan(java.lang.String param){
                            localRatePlanTracker = true;
                                   
                                            this.localRatePlan=param;
                                    

                               }
                            

                        /**
                        * field for RatingRule
                        */

                        
                                    protected long localRatingRule ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRatingRuleTracker = false ;

                           public boolean isRatingRuleSpecified(){
                               return localRatingRuleTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getRatingRule(){
                               return localRatingRule;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RatingRule
                               */
                               public void setRatingRule(long param){
                            localRatingRuleTracker = true;
                                   
                                            this.localRatingRule=param;
                                    

                               }
                            

                        /**
                        * field for SecondaryTaxAuthorityID
                        */

                        
                                    protected long localSecondaryTaxAuthorityID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSecondaryTaxAuthorityIDTracker = false ;

                           public boolean isSecondaryTaxAuthorityIDSpecified(){
                               return localSecondaryTaxAuthorityIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getSecondaryTaxAuthorityID(){
                               return localSecondaryTaxAuthorityID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SecondaryTaxAuthorityID
                               */
                               public void setSecondaryTaxAuthorityID(long param){
                            localSecondaryTaxAuthorityIDTracker = true;
                                   
                                            this.localSecondaryTaxAuthorityID=param;
                                    

                               }
                            

                        /**
                        * field for SubscriberType
                        */

                        
                                    protected com.redknee.util.crmapi.soap.common.xsd._2008._08.PaidType localSubscriberType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSubscriberTypeTracker = false ;

                           public boolean isSubscriberTypeSpecified(){
                               return localSubscriberTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.redknee.util.crmapi.soap.common.xsd._2008._08.PaidType
                           */
                           public  com.redknee.util.crmapi.soap.common.xsd._2008._08.PaidType getSubscriberType(){
                               return localSubscriberType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SubscriberType
                               */
                               public void setSubscriberType(com.redknee.util.crmapi.soap.common.xsd._2008._08.PaidType param){
                            localSubscriberTypeTracker = true;
                                   
                                            this.localSubscriberType=param;
                                    

                               }
                            

                        /**
                        * field for UsedBucketMinutes
                        */

                        
                                    protected long localUsedBucketMinutes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUsedBucketMinutesTracker = false ;

                           public boolean isUsedBucketMinutesSpecified(){
                               return localUsedBucketMinutesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getUsedBucketMinutes(){
                               return localUsedBucketMinutes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UsedBucketMinutes
                               */
                               public void setUsedBucketMinutes(long param){
                            localUsedBucketMinutesTracker = true;
                                   
                                            this.localUsedBucketMinutes=param;
                                    

                               }
                            

                        /**
                        * field for VariableRate
                        */

                        
                                    protected long localVariableRate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVariableRateTracker = false ;

                           public boolean isVariableRateSpecified(){
                               return localVariableRateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getVariableRate(){
                               return localVariableRate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param VariableRate
                               */
                               public void setVariableRate(long param){
                            localVariableRateTracker = true;
                                   
                                            this.localVariableRate=param;
                                    

                               }
                            

                        /**
                        * field for VariableRateUnits
                        */

                        
                                    protected com.redknee.util.crmapi.soap.calldetails.xsd._2009._04.VariableRateUnitType localVariableRateUnits ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVariableRateUnitsTracker = false ;

                           public boolean isVariableRateUnitsSpecified(){
                               return localVariableRateUnitsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.redknee.util.crmapi.soap.calldetails.xsd._2009._04.VariableRateUnitType
                           */
                           public  com.redknee.util.crmapi.soap.calldetails.xsd._2009._04.VariableRateUnitType getVariableRateUnits(){
                               return localVariableRateUnits;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param VariableRateUnits
                               */
                               public void setVariableRateUnits(com.redknee.util.crmapi.soap.calldetails.xsd._2009._04.VariableRateUnitType param){
                            localVariableRateUnitsTracker = true;
                                   
                                            this.localVariableRateUnits=param;
                                    

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
                

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":CallDetail",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "CallDetail",
                           xmlWriter);
                   }

                if (localAccountIDTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03";
                                    writeStartElement(null, namespace, "accountID", xmlWriter);
                             

                                          if (localAccountID==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAccountID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBalanceTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03";
                                    writeStartElement(null, namespace, "balance", xmlWriter);
                             
                                               if (localBalance==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBalance));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCallTypeTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03";
                                    writeStartElement(null, namespace, "callType", xmlWriter);
                             
                                               if (localCallType==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCallType));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localChargeTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03";
                                    writeStartElement(null, namespace, "charge", xmlWriter);
                             
                                               if (localCharge==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCharge));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDataUsageTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03";
                                    writeStartElement(null, namespace, "dataUsage", xmlWriter);
                             
                                               if (localDataUsage==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDataUsage));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDestinationLocationTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03";
                                    writeStartElement(null, namespace, "destinationLocation", xmlWriter);
                             

                                          if (localDestinationLocation==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDestinationLocation);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDestinationNumberTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03";
                                    writeStartElement(null, namespace, "destinationNumber", xmlWriter);
                             

                                          if (localDestinationNumber==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDestinationNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDurationTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03";
                                    writeStartElement(null, namespace, "duration", xmlWriter);
                             
                                               if (localDuration==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDuration));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIdentifierTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03";
                                    writeStartElement(null, namespace, "identifier", xmlWriter);
                             
                                               if (localIdentifier==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdentifier));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMobileNumberTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03";
                                    writeStartElement(null, namespace, "mobileNumber", xmlWriter);
                             

                                          if (localMobileNumber==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMobileNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOriginatingLocationTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03";
                                    writeStartElement(null, namespace, "originatingLocation", xmlWriter);
                             

                                          if (localOriginatingLocation==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOriginatingLocation);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOriginatingNumberTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03";
                                    writeStartElement(null, namespace, "originatingNumber", xmlWriter);
                             

                                          if (localOriginatingNumber==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOriginatingNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransactionDateTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03";
                                    writeStartElement(null, namespace, "transactionDate", xmlWriter);
                             

                                          if (localTransactionDate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUsageTypeTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03";
                                    writeStartElement(null, namespace, "usageType", xmlWriter);
                             
                                               if (localUsageType==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsageType));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localParametersTracker){
                                       if (localParameters!=null){
                                            for (int i = 0;i < localParameters.length;i++){
                                                if (localParameters[i] != null){
                                                 localParameters[i].serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","parameters"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03", "parameters", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03", "parameters", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localBillingCategoryIDTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03";
                                    writeStartElement(null, namespace, "billingCategoryID", xmlWriter);
                             
                                               if (localBillingCategoryID==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBillingCategoryID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBucketRateIDTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03";
                                    writeStartElement(null, namespace, "bucketRateID", xmlWriter);
                             
                                               if (localBucketRateID==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBucketRateID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFlatRateTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03";
                                    writeStartElement(null, namespace, "flatRate", xmlWriter);
                             
                                               if (localFlatRate==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFlatRate));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGlCodeTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03";
                                    writeStartElement(null, namespace, "glCode", xmlWriter);
                             

                                          if (localGlCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGlCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPostedDateTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03";
                                    writeStartElement(null, namespace, "postedDate", xmlWriter);
                             

                                          if (localPostedDate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPostedDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPrimaryTaxAuthorityIDTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03";
                                    writeStartElement(null, namespace, "primaryTaxAuthorityID", xmlWriter);
                             
                                               if (localPrimaryTaxAuthorityID==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrimaryTaxAuthorityID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRatePlanTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03";
                                    writeStartElement(null, namespace, "ratePlan", xmlWriter);
                             

                                          if (localRatePlan==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRatePlan);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRatingRuleTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03";
                                    writeStartElement(null, namespace, "ratingRule", xmlWriter);
                             
                                               if (localRatingRule==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRatingRule));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSecondaryTaxAuthorityIDTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03";
                                    writeStartElement(null, namespace, "secondaryTaxAuthorityID", xmlWriter);
                             
                                               if (localSecondaryTaxAuthorityID==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSecondaryTaxAuthorityID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSubscriberTypeTracker){
                                    if (localSubscriberType==null){

                                        writeStartElement(null, "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03", "subscriberType", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSubscriberType.serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","subscriberType"),
                                        xmlWriter);
                                    }
                                } if (localUsedBucketMinutesTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03";
                                    writeStartElement(null, namespace, "usedBucketMinutes", xmlWriter);
                             
                                               if (localUsedBucketMinutes==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsedBucketMinutes));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localVariableRateTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03";
                                    writeStartElement(null, namespace, "variableRate", xmlWriter);
                             
                                               if (localVariableRate==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVariableRate));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localVariableRateUnitsTracker){
                                    if (localVariableRateUnits==null){

                                        writeStartElement(null, "http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03", "variableRateUnits", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localVariableRateUnits.serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","variableRateUnits"),
                                        xmlWriter);
                                    }
                                }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03")){
                return "ns14";
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
                    attribList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","CallDetail"));
                 if (localAccountIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                      "accountID"));
                                 
                                         elementList.add(localAccountID==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAccountID));
                                    } if (localBalanceTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                      "balance"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBalance));
                            } if (localCallTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                      "callType"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCallType));
                            } if (localChargeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                      "charge"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCharge));
                            } if (localDataUsageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                      "dataUsage"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDataUsage));
                            } if (localDestinationLocationTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                      "destinationLocation"));
                                 
                                         elementList.add(localDestinationLocation==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDestinationLocation));
                                    } if (localDestinationNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                      "destinationNumber"));
                                 
                                         elementList.add(localDestinationNumber==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDestinationNumber));
                                    } if (localDurationTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                      "duration"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDuration));
                            } if (localIdentifierTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                      "identifier"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdentifier));
                            } if (localMobileNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                      "mobileNumber"));
                                 
                                         elementList.add(localMobileNumber==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMobileNumber));
                                    } if (localOriginatingLocationTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                      "originatingLocation"));
                                 
                                         elementList.add(localOriginatingLocation==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOriginatingLocation));
                                    } if (localOriginatingNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                      "originatingNumber"));
                                 
                                         elementList.add(localOriginatingNumber==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOriginatingNumber));
                                    } if (localTransactionDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                      "transactionDate"));
                                 
                                         elementList.add(localTransactionDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionDate));
                                    } if (localUsageTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                      "usageType"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsageType));
                            } if (localParametersTracker){
                             if (localParameters!=null) {
                                 for (int i = 0;i < localParameters.length;i++){

                                    if (localParameters[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                          "parameters"));
                                         elementList.add(localParameters[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                          "parameters"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                          "parameters"));
                                        elementList.add(localParameters);
                                    
                             }

                        } if (localBillingCategoryIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                      "billingCategoryID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBillingCategoryID));
                            } if (localBucketRateIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                      "bucketRateID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBucketRateID));
                            } if (localFlatRateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                      "flatRate"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFlatRate));
                            } if (localGlCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                      "glCode"));
                                 
                                         elementList.add(localGlCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGlCode));
                                    } if (localPostedDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                      "postedDate"));
                                 
                                         elementList.add(localPostedDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPostedDate));
                                    } if (localPrimaryTaxAuthorityIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                      "primaryTaxAuthorityID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrimaryTaxAuthorityID));
                            } if (localRatePlanTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                      "ratePlan"));
                                 
                                         elementList.add(localRatePlan==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRatePlan));
                                    } if (localRatingRuleTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                      "ratingRule"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRatingRule));
                            } if (localSecondaryTaxAuthorityIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                      "secondaryTaxAuthorityID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSecondaryTaxAuthorityID));
                            } if (localSubscriberTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                      "subscriberType"));
                            
                            
                                    elementList.add(localSubscriberType==null?null:
                                    localSubscriberType);
                                } if (localUsedBucketMinutesTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                      "usedBucketMinutes"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsedBucketMinutes));
                            } if (localVariableRateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                      "variableRate"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVariableRate));
                            } if (localVariableRateUnitsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03",
                                                                      "variableRateUnits"));
                            
                            
                                    elementList.add(localVariableRateUnits==null?null:
                                    localVariableRateUnits);
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
        public static CallDetail parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            CallDetail object =
                new CallDetail();

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
                    
                            if (!"CallDetail".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CallDetail)com.redknee.util.crmapi.soap.common.xsd.common_v2_0.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list15 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","accountID").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAccountID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","balance").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBalance(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setBalance(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setBalance(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","callType").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCallType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setCallType(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCallType(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","charge").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCharge(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setCharge(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCharge(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","dataUsage").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDataUsage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setDataUsage(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setDataUsage(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","destinationLocation").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDestinationLocation(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","destinationNumber").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDestinationNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","duration").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDuration(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setDuration(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setDuration(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","identifier").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIdentifier(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setIdentifier(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setIdentifier(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","mobileNumber").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMobileNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","originatingLocation").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOriginatingLocation(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","originatingNumber").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOriginatingNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","transactionDate").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransactionDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","usageType").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUsageType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setUsageType(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setUsageType(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","parameters").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list15.add(null);
                                                              reader.next();
                                                          } else {
                                                        list15.add(com.redknee.util.crmapi.soap.common.xsd._2008._08.GenericParameter.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone15 = false;
                                                        while(!loopDone15){
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
                                                                loopDone15 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","parameters").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list15.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list15.add(com.redknee.util.crmapi.soap.common.xsd._2008._08.GenericParameter.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone15 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setParameters((com.redknee.util.crmapi.soap.common.xsd._2008._08.GenericParameter[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.redknee.util.crmapi.soap.common.xsd._2008._08.GenericParameter.class,
                                                                list15));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","billingCategoryID").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBillingCategoryID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setBillingCategoryID(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setBillingCategoryID(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","bucketRateID").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBucketRateID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setBucketRateID(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setBucketRateID(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","flatRate").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFlatRate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setFlatRate(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setFlatRate(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","glCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGlCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","postedDate").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPostedDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","primaryTaxAuthorityID").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPrimaryTaxAuthorityID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setPrimaryTaxAuthorityID(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPrimaryTaxAuthorityID(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","ratePlan").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRatePlan(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","ratingRule").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRatingRule(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setRatingRule(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRatingRule(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","secondaryTaxAuthorityID").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSecondaryTaxAuthorityID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setSecondaryTaxAuthorityID(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setSecondaryTaxAuthorityID(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","subscriberType").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSubscriberType(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSubscriberType(com.redknee.util.crmapi.soap.common.xsd._2008._08.PaidType.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","usedBucketMinutes").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUsedBucketMinutes(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setUsedBucketMinutes(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setUsedBucketMinutes(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","variableRate").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setVariableRate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setVariableRate(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setVariableRate(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/calldetails/xsd/2011/03","variableRateUnits").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setVariableRateUnits(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setVariableRateUnits(com.redknee.util.crmapi.soap.calldetails.xsd._2009._04.VariableRateUnitType.Factory.parse(reader));
                                              
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
           
    