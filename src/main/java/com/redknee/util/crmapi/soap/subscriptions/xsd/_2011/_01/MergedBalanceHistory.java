
/**
 * MergedBalanceHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.redknee.util.crmapi.soap.subscriptions.xsd._2011._01;
            

            /**
            *  MergedBalanceHistory bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class MergedBalanceHistory
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = MergedBalanceHistory
                Namespace URI = http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01
                Namespace Prefix = ns15
                */
            

                        /**
                        * field for Identifier
                        */

                        
                                    protected long localIdentifier ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIdentifierTracker = false ;

                           public boolean isIdentifierSpecified(){
                               return localIdentifierTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getIdentifier(){
                               return localIdentifier;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Identifier
                               */
                               public void setIdentifier(long param){
                            localIdentifierTracker = true;
                                   
                                            this.localIdentifier=param;
                                    

                               }
                            

                        /**
                        * field for RecordType
                        */

                        
                                    protected long localRecordType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRecordTypeTracker = false ;

                           public boolean isRecordTypeSpecified(){
                               return localRecordTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getRecordType(){
                               return localRecordType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RecordType
                               */
                               public void setRecordType(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localRecordTypeTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localRecordType=param;
                                    

                               }
                            

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
                        * field for ReceivedDate
                        */

                        
                                    protected java.util.Calendar localReceivedDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReceivedDateTracker = false ;

                           public boolean isReceivedDateSpecified(){
                               return localReceivedDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getReceivedDate(){
                               return localReceivedDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReceivedDate
                               */
                               public void setReceivedDate(java.util.Calendar param){
                            localReceivedDateTracker = true;
                                   
                                            this.localReceivedDate=param;
                                    

                               }
                            

                        /**
                        * field for TransactionDate
                        */

                        
                                    protected java.util.Calendar localTransactionDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransactionDateTracker = false ;

                           public boolean isTransactionDateSpecified(){
                               return localTransactionDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getTransactionDate(){
                               return localTransactionDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransactionDate
                               */
                               public void setTransactionDate(java.util.Calendar param){
                            localTransactionDateTracker = true;
                                   
                                            this.localTransactionDate=param;
                                    

                               }
                            

                        /**
                        * field for Debit
                        */

                        
                                    protected long localDebit ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDebitTracker = false ;

                           public boolean isDebitSpecified(){
                               return localDebitTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getDebit(){
                               return localDebit;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Debit
                               */
                               public void setDebit(long param){
                            localDebitTracker = true;
                                   
                                            this.localDebit=param;
                                    

                               }
                            

                        /**
                        * field for Credit
                        */

                        
                                    protected long localCredit ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreditTracker = false ;

                           public boolean isCreditSpecified(){
                               return localCreditTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getCredit(){
                               return localCredit;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Credit
                               */
                               public void setCredit(long param){
                            localCreditTracker = true;
                                   
                                            this.localCredit=param;
                                    

                               }
                            

                        /**
                        * field for Balance
                        */

                        
                                    protected long localBalance ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBalanceTracker = false ;

                           public boolean isBalanceSpecified(){
                               return localBalanceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getBalance(){
                               return localBalance;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Balance
                               */
                               public void setBalance(long param){
                            localBalanceTracker = true;
                                   
                                            this.localBalance=param;
                                    

                               }
                            

                        /**
                        * field for CallAdjustmentType
                        */

                        
                                    protected long localCallAdjustmentType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCallAdjustmentTypeTracker = false ;

                           public boolean isCallAdjustmentTypeSpecified(){
                               return localCallAdjustmentTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getCallAdjustmentType(){
                               return localCallAdjustmentType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CallAdjustmentType
                               */
                               public void setCallAdjustmentType(long param){
                            localCallAdjustmentTypeTracker = true;
                                   
                                            this.localCallAdjustmentType=param;
                                    

                               }
                            

                        /**
                        * field for CallAdjustmentTypeDescription
                        */

                        
                                    protected java.lang.String localCallAdjustmentTypeDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCallAdjustmentTypeDescriptionTracker = false ;

                           public boolean isCallAdjustmentTypeDescriptionSpecified(){
                               return localCallAdjustmentTypeDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCallAdjustmentTypeDescription(){
                               return localCallAdjustmentTypeDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CallAdjustmentTypeDescription
                               */
                               public void setCallAdjustmentTypeDescription(java.lang.String param){
                            localCallAdjustmentTypeDescriptionTracker = true;
                                   
                                            this.localCallAdjustmentTypeDescription=param;
                                    

                               }
                            

                        /**
                        * field for Usage
                        */

                        
                                    protected long localUsage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUsageTracker = false ;

                           public boolean isUsageSpecified(){
                               return localUsageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getUsage(){
                               return localUsage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Usage
                               */
                               public void setUsage(long param){
                            localUsageTracker = true;
                                   
                                            this.localUsage=param;
                                    

                               }
                            

                        /**
                        * field for BillingCatagory
                        */

                        
                                    protected java.lang.String localBillingCatagory ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBillingCatagoryTracker = false ;

                           public boolean isBillingCatagorySpecified(){
                               return localBillingCatagoryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getBillingCatagory(){
                               return localBillingCatagory;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BillingCatagory
                               */
                               public void setBillingCatagory(java.lang.String param){
                            localBillingCatagoryTracker = true;
                                   
                                            this.localBillingCatagory=param;
                                    

                               }
                            

                        /**
                        * field for UsageType
                        */

                        
                                    protected java.lang.String localUsageType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUsageTypeTracker = false ;

                           public boolean isUsageTypeSpecified(){
                               return localUsageTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUsageType(){
                               return localUsageType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UsageType
                               */
                               public void setUsageType(java.lang.String param){
                            localUsageTypeTracker = true;
                                   
                                            this.localUsageType=param;
                                    

                               }
                            

                        /**
                        * field for OrigMSISDN
                        */

                        
                                    protected java.lang.String localOrigMSISDN ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrigMSISDNTracker = false ;

                           public boolean isOrigMSISDNSpecified(){
                               return localOrigMSISDNTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOrigMSISDN(){
                               return localOrigMSISDN;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OrigMSISDN
                               */
                               public void setOrigMSISDN(java.lang.String param){
                            localOrigMSISDNTracker = true;
                                   
                                            this.localOrigMSISDN=param;
                                    

                               }
                            

                        /**
                        * field for DestMSISDN
                        */

                        
                                    protected java.lang.String localDestMSISDN ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDestMSISDNTracker = false ;

                           public boolean isDestMSISDNSpecified(){
                               return localDestMSISDNTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDestMSISDN(){
                               return localDestMSISDN;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DestMSISDN
                               */
                               public void setDestMSISDN(java.lang.String param){
                            localDestMSISDNTracker = true;
                                   
                                            this.localDestMSISDN=param;
                                    

                               }
                            

                        /**
                        * field for OrigPartyLocation
                        */

                        
                                    protected java.lang.String localOrigPartyLocation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrigPartyLocationTracker = false ;

                           public boolean isOrigPartyLocationSpecified(){
                               return localOrigPartyLocationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOrigPartyLocation(){
                               return localOrigPartyLocation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OrigPartyLocation
                               */
                               public void setOrigPartyLocation(java.lang.String param){
                            localOrigPartyLocationTracker = true;
                                   
                                            this.localOrigPartyLocation=param;
                                    

                               }
                            

                        /**
                        * field for DestPartyLocation
                        */

                        
                                    protected java.lang.String localDestPartyLocation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDestPartyLocationTracker = false ;

                           public boolean isDestPartyLocationSpecified(){
                               return localDestPartyLocationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDestPartyLocation(){
                               return localDestPartyLocation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DestPartyLocation
                               */
                               public void setDestPartyLocation(java.lang.String param){
                            localDestPartyLocationTracker = true;
                                   
                                            this.localDestPartyLocation=param;
                                    

                               }
                            

                        /**
                        * field for DataUsage
                        */

                        
                                    protected long localDataUsage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDataUsageTracker = false ;

                           public boolean isDataUsageSpecified(){
                               return localDataUsageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getDataUsage(){
                               return localDataUsage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DataUsage
                               */
                               public void setDataUsage(long param){
                            localDataUsageTracker = true;
                                   
                                            this.localDataUsage=param;
                                    

                               }
                            

                        /**
                        * field for BundleUsage
                        */

                        
                                    protected long localBundleUsage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBundleUsageTracker = false ;

                           public boolean isBundleUsageSpecified(){
                               return localBundleUsageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getBundleUsage(){
                               return localBundleUsage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BundleUsage
                               */
                               public void setBundleUsage(long param){
                            localBundleUsageTracker = true;
                                   
                                            this.localBundleUsage=param;
                                    

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
                        * field for BundleInfo
                        * This was an Array!
                        */

                        
                                    protected com.redknee.util.crmapi.soap.calldetails.xsd._2011._03.ChargedBundleInfo[] localBundleInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBundleInfoTracker = false ;

                           public boolean isBundleInfoSpecified(){
                               return localBundleInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.redknee.util.crmapi.soap.calldetails.xsd._2011._03.ChargedBundleInfo[]
                           */
                           public  com.redknee.util.crmapi.soap.calldetails.xsd._2011._03.ChargedBundleInfo[] getBundleInfo(){
                               return localBundleInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for BundleInfo
                               */
                              protected void validateBundleInfo(com.redknee.util.crmapi.soap.calldetails.xsd._2011._03.ChargedBundleInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param BundleInfo
                              */
                              public void setBundleInfo(com.redknee.util.crmapi.soap.calldetails.xsd._2011._03.ChargedBundleInfo[] param){
                              
                                   validateBundleInfo(param);

                               localBundleInfoTracker = true;
                                      
                                      this.localBundleInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.redknee.util.crmapi.soap.calldetails.xsd._2011._03.ChargedBundleInfo
                             */
                             public void addBundleInfo(com.redknee.util.crmapi.soap.calldetails.xsd._2011._03.ChargedBundleInfo param){
                                   if (localBundleInfo == null){
                                   localBundleInfo = new com.redknee.util.crmapi.soap.calldetails.xsd._2011._03.ChargedBundleInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localBundleInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localBundleInfo);
                               list.add(param);
                               this.localBundleInfo =
                             (com.redknee.util.crmapi.soap.calldetails.xsd._2011._03.ChargedBundleInfo[])list.toArray(
                            new com.redknee.util.crmapi.soap.calldetails.xsd._2011._03.ChargedBundleInfo[list.size()]);

                             }
                             

                        /**
                        * field for Parameters
                        * This was an Array!
                        */

                        
                                    protected com.redknee.util.crmapi.soap.common.xsd._2008._08.GenericParameter[] localParameters ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localParametersTracker = false ;

                           public boolean isParametersSpecified(){
                               return localParametersTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.redknee.util.crmapi.soap.common.xsd._2008._08.GenericParameter[]
                           */
                           public  com.redknee.util.crmapi.soap.common.xsd._2008._08.GenericParameter[] getParameters(){
                               return localParameters;
                           }

                           
                        


                               
                              /**
                               * validate the array for Parameters
                               */
                              protected void validateParameters(com.redknee.util.crmapi.soap.common.xsd._2008._08.GenericParameter[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Parameters
                              */
                              public void setParameters(com.redknee.util.crmapi.soap.common.xsd._2008._08.GenericParameter[] param){
                              
                                   validateParameters(param);

                               localParametersTracker = true;
                                      
                                      this.localParameters=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.redknee.util.crmapi.soap.common.xsd._2008._08.GenericParameter
                             */
                             public void addParameters(com.redknee.util.crmapi.soap.common.xsd._2008._08.GenericParameter param){
                                   if (localParameters == null){
                                   localParameters = new com.redknee.util.crmapi.soap.common.xsd._2008._08.GenericParameter[]{};
                                   }

                            
                                 //update the setting tracker
                                localParametersTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localParameters);
                               list.add(param);
                               this.localParameters =
                             (com.redknee.util.crmapi.soap.common.xsd._2008._08.GenericParameter[])list.toArray(
                            new com.redknee.util.crmapi.soap.common.xsd._2008._08.GenericParameter[list.size()]);

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
                           namespacePrefix+":MergedBalanceHistory",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "MergedBalanceHistory",
                           xmlWriter);
                   }

               
                   }
                if (localIdentifierTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01";
                                    writeStartElement(null, namespace, "identifier", xmlWriter);
                             
                                               if (localIdentifier==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdentifier));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRecordTypeTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01";
                                    writeStartElement(null, namespace, "recordType", xmlWriter);
                             
                                               if (localRecordType==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("recordType cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRecordType));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMsisdnTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01";
                                    writeStartElement(null, namespace, "msisdn", xmlWriter);
                             

                                          if (localMsisdn==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMsisdn);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReceivedDateTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01";
                                    writeStartElement(null, namespace, "receivedDate", xmlWriter);
                             

                                          if (localReceivedDate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReceivedDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransactionDateTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01";
                                    writeStartElement(null, namespace, "transactionDate", xmlWriter);
                             

                                          if (localTransactionDate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDebitTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01";
                                    writeStartElement(null, namespace, "debit", xmlWriter);
                             
                                               if (localDebit==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDebit));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCreditTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01";
                                    writeStartElement(null, namespace, "credit", xmlWriter);
                             
                                               if (localCredit==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCredit));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBalanceTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01";
                                    writeStartElement(null, namespace, "balance", xmlWriter);
                             
                                               if (localBalance==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBalance));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCallAdjustmentTypeTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01";
                                    writeStartElement(null, namespace, "callAdjustmentType", xmlWriter);
                             
                                               if (localCallAdjustmentType==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCallAdjustmentType));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCallAdjustmentTypeDescriptionTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01";
                                    writeStartElement(null, namespace, "callAdjustmentTypeDescription", xmlWriter);
                             

                                          if (localCallAdjustmentTypeDescription==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCallAdjustmentTypeDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUsageTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01";
                                    writeStartElement(null, namespace, "usage", xmlWriter);
                             
                                               if (localUsage==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsage));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBillingCatagoryTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01";
                                    writeStartElement(null, namespace, "billingCatagory", xmlWriter);
                             

                                          if (localBillingCatagory==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localBillingCatagory);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUsageTypeTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01";
                                    writeStartElement(null, namespace, "usageType", xmlWriter);
                             

                                          if (localUsageType==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUsageType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOrigMSISDNTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01";
                                    writeStartElement(null, namespace, "origMSISDN", xmlWriter);
                             

                                          if (localOrigMSISDN==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOrigMSISDN);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDestMSISDNTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01";
                                    writeStartElement(null, namespace, "destMSISDN", xmlWriter);
                             

                                          if (localDestMSISDN==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDestMSISDN);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOrigPartyLocationTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01";
                                    writeStartElement(null, namespace, "origPartyLocation", xmlWriter);
                             

                                          if (localOrigPartyLocation==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOrigPartyLocation);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDestPartyLocationTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01";
                                    writeStartElement(null, namespace, "destPartyLocation", xmlWriter);
                             

                                          if (localDestPartyLocation==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDestPartyLocation);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDataUsageTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01";
                                    writeStartElement(null, namespace, "dataUsage", xmlWriter);
                             
                                               if (localDataUsage==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDataUsage));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBundleUsageTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01";
                                    writeStartElement(null, namespace, "bundleUsage", xmlWriter);
                             
                                               if (localBundleUsage==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBundleUsage));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localVariableRateUnitsTracker){
                                    if (localVariableRateUnits==null){

                                        writeStartElement(null, "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01", "variableRateUnits", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localVariableRateUnits.serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","variableRateUnits"),
                                        xmlWriter);
                                    }
                                } if (localBundleInfoTracker){
                                       if (localBundleInfo!=null){
                                            for (int i = 0;i < localBundleInfo.length;i++){
                                                if (localBundleInfo[i] != null){
                                                 localBundleInfo[i].serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","bundleInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01", "bundleInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01", "bundleInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localParametersTracker){
                                       if (localParameters!=null){
                                            for (int i = 0;i < localParameters.length;i++){
                                                if (localParameters[i] != null){
                                                 localParameters[i].serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","parameters"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01", "parameters", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01", "parameters", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
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

                 if (localIdentifierTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                      "identifier"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdentifier));
                            } if (localRecordTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                      "recordType"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRecordType));
                            } if (localMsisdnTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                      "msisdn"));
                                 
                                         elementList.add(localMsisdn==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMsisdn));
                                    } if (localReceivedDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                      "receivedDate"));
                                 
                                         elementList.add(localReceivedDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReceivedDate));
                                    } if (localTransactionDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                      "transactionDate"));
                                 
                                         elementList.add(localTransactionDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionDate));
                                    } if (localDebitTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                      "debit"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDebit));
                            } if (localCreditTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                      "credit"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCredit));
                            } if (localBalanceTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                      "balance"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBalance));
                            } if (localCallAdjustmentTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                      "callAdjustmentType"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCallAdjustmentType));
                            } if (localCallAdjustmentTypeDescriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                      "callAdjustmentTypeDescription"));
                                 
                                         elementList.add(localCallAdjustmentTypeDescription==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCallAdjustmentTypeDescription));
                                    } if (localUsageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                      "usage"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsage));
                            } if (localBillingCatagoryTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                      "billingCatagory"));
                                 
                                         elementList.add(localBillingCatagory==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBillingCatagory));
                                    } if (localUsageTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                      "usageType"));
                                 
                                         elementList.add(localUsageType==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsageType));
                                    } if (localOrigMSISDNTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                      "origMSISDN"));
                                 
                                         elementList.add(localOrigMSISDN==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrigMSISDN));
                                    } if (localDestMSISDNTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                      "destMSISDN"));
                                 
                                         elementList.add(localDestMSISDN==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDestMSISDN));
                                    } if (localOrigPartyLocationTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                      "origPartyLocation"));
                                 
                                         elementList.add(localOrigPartyLocation==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrigPartyLocation));
                                    } if (localDestPartyLocationTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                      "destPartyLocation"));
                                 
                                         elementList.add(localDestPartyLocation==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDestPartyLocation));
                                    } if (localDataUsageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                      "dataUsage"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDataUsage));
                            } if (localBundleUsageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                      "bundleUsage"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBundleUsage));
                            } if (localVariableRateUnitsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                      "variableRateUnits"));
                            
                            
                                    elementList.add(localVariableRateUnits==null?null:
                                    localVariableRateUnits);
                                } if (localBundleInfoTracker){
                             if (localBundleInfo!=null) {
                                 for (int i = 0;i < localBundleInfo.length;i++){

                                    if (localBundleInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                          "bundleInfo"));
                                         elementList.add(localBundleInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                          "bundleInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                          "bundleInfo"));
                                        elementList.add(localBundleInfo);
                                    
                             }

                        } if (localParametersTracker){
                             if (localParameters!=null) {
                                 for (int i = 0;i < localParameters.length;i++){

                                    if (localParameters[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                          "parameters"));
                                         elementList.add(localParameters[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                          "parameters"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01",
                                                                          "parameters"));
                                        elementList.add(localParameters);
                                    
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
        public static MergedBalanceHistory parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            MergedBalanceHistory object =
                new MergedBalanceHistory();

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
                    
                            if (!"MergedBalanceHistory".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (MergedBalanceHistory)com.redknee.util.crmapi.soap.common.xsd.common_v2_0.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list21 = new java.util.ArrayList();
                    
                        java.util.ArrayList list22 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","identifier").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","recordType").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"recordType" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRecordType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRecordType(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","msisdn").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","receivedDate").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReceivedDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","transactionDate").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","debit").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDebit(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setDebit(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setDebit(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","credit").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCredit(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setCredit(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCredit(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","balance").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","callAdjustmentType").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCallAdjustmentType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setCallAdjustmentType(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCallAdjustmentType(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","callAdjustmentTypeDescription").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCallAdjustmentTypeDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","usage").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUsage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setUsage(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setUsage(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","billingCatagory").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBillingCatagory(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","usageType").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUsageType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","origMSISDN").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOrigMSISDN(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","destMSISDN").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDestMSISDN(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","origPartyLocation").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOrigPartyLocation(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","destPartyLocation").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDestPartyLocation(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","dataUsage").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","bundleUsage").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBundleUsage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setBundleUsage(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setBundleUsage(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","variableRateUnits").equals(reader.getName())){
                                
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
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","bundleInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list21.add(null);
                                                              reader.next();
                                                          } else {
                                                        list21.add(com.redknee.util.crmapi.soap.calldetails.xsd._2011._03.ChargedBundleInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone21 = false;
                                                        while(!loopDone21){
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
                                                                loopDone21 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","bundleInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list21.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list21.add(com.redknee.util.crmapi.soap.calldetails.xsd._2011._03.ChargedBundleInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone21 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setBundleInfo((com.redknee.util.crmapi.soap.calldetails.xsd._2011._03.ChargedBundleInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.redknee.util.crmapi.soap.calldetails.xsd._2011._03.ChargedBundleInfo.class,
                                                                list21));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","parameters").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list22.add(null);
                                                              reader.next();
                                                          } else {
                                                        list22.add(com.redknee.util.crmapi.soap.common.xsd._2008._08.GenericParameter.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone22 = false;
                                                        while(!loopDone22){
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
                                                                loopDone22 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/subscriptions/xsd/2011/01","parameters").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list22.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list22.add(com.redknee.util.crmapi.soap.common.xsd._2008._08.GenericParameter.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone22 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setParameters((com.redknee.util.crmapi.soap.common.xsd._2008._08.GenericParameter[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.redknee.util.crmapi.soap.common.xsd._2008._08.GenericParameter.class,
                                                                list22));
                                                            
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
           
    