
/**
 * Bundle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01;
            

            /**
            *  Bundle bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Bundle extends com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.BundleReference
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Bundle
                Namespace URI = http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01
                Namespace Prefix = ns12
                */
            

                        /**
                        * field for GroupIdentifier
                        */

                        
                                    protected long localGroupIdentifier ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGroupIdentifierTracker = false ;

                           public boolean isGroupIdentifierSpecified(){
                               return localGroupIdentifierTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getGroupIdentifier(){
                               return localGroupIdentifier;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GroupIdentifier
                               */
                               public void setGroupIdentifier(long param){
                            localGroupIdentifierTracker = true;
                                   
                                            this.localGroupIdentifier=param;
                                    

                               }
                            

                        /**
                        * field for AuxiliaryServiceCharge
                        */

                        
                                    protected long localAuxiliaryServiceCharge ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAuxiliaryServiceChargeTracker = false ;

                           public boolean isAuxiliaryServiceChargeSpecified(){
                               return localAuxiliaryServiceChargeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getAuxiliaryServiceCharge(){
                               return localAuxiliaryServiceCharge;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AuxiliaryServiceCharge
                               */
                               public void setAuxiliaryServiceCharge(long param){
                            localAuxiliaryServiceChargeTracker = true;
                                   
                                            this.localAuxiliaryServiceCharge=param;
                                    

                               }
                            

                        /**
                        * field for SmartSuspension
                        */

                        
                                    protected boolean localSmartSuspension ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSmartSuspensionTracker = false ;

                           public boolean isSmartSuspensionSpecified(){
                               return localSmartSuspensionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getSmartSuspension(){
                               return localSmartSuspension;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SmartSuspension
                               */
                               public void setSmartSuspension(boolean param){
                            localSmartSuspensionTracker = true;
                                   
                                            this.localSmartSuspension=param;
                                    

                               }
                            

                        /**
                        * field for BundleCategoryIDs
                        * This was an Array!
                        */

                        
                                    protected long[] localBundleCategoryIDs ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBundleCategoryIDsTracker = false ;

                           public boolean isBundleCategoryIDsSpecified(){
                               return localBundleCategoryIDsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long[]
                           */
                           public  long[] getBundleCategoryIDs(){
                               return localBundleCategoryIDs;
                           }

                           
                        


                               
                              /**
                               * validate the array for BundleCategoryIDs
                               */
                              protected void validateBundleCategoryIDs(long[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param BundleCategoryIDs
                              */
                              public void setBundleCategoryIDs(long[] param){
                              
                                   validateBundleCategoryIDs(param);

                               localBundleCategoryIDsTracker = true;
                                      
                                      this.localBundleCategoryIDs=param;
                              }

                               
                             

                        /**
                        * field for Currency
                        */

                        
                                    protected boolean localCurrency ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCurrencyTracker = false ;

                           public boolean isCurrencySpecified(){
                               return localCurrencyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getCurrency(){
                               return localCurrency;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Currency
                               */
                               public void setCurrency(boolean param){
                            localCurrencyTracker = true;
                                   
                                            this.localCurrency=param;
                                    

                               }
                            

                        /**
                        * field for QuotaScheme
                        */

                        
                                    protected com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.QuotaSchemeType localQuotaScheme ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQuotaSchemeTracker = false ;

                           public boolean isQuotaSchemeSpecified(){
                               return localQuotaSchemeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.QuotaSchemeType
                           */
                           public  com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.QuotaSchemeType getQuotaScheme(){
                               return localQuotaScheme;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QuotaScheme
                               */
                               public void setQuotaScheme(com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.QuotaSchemeType param){
                            localQuotaSchemeTracker = true;
                                   
                                            this.localQuotaScheme=param;
                                    

                               }
                            

                        /**
                        * field for EnablePromotionProvision
                        */

                        
                                    protected boolean localEnablePromotionProvision ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEnablePromotionProvisionTracker = false ;

                           public boolean isEnablePromotionProvisionSpecified(){
                               return localEnablePromotionProvisionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getEnablePromotionProvision(){
                               return localEnablePromotionProvision;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EnablePromotionProvision
                               */
                               public void setEnablePromotionProvision(boolean param){
                            localEnablePromotionProvisionTracker = true;
                                   
                                            this.localEnablePromotionProvision=param;
                                    

                               }
                            

                        /**
                        * field for ReprovisionOnActive
                        */

                        
                                    protected boolean localReprovisionOnActive ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReprovisionOnActiveTracker = false ;

                           public boolean isReprovisionOnActiveSpecified(){
                               return localReprovisionOnActiveTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getReprovisionOnActive(){
                               return localReprovisionOnActive;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReprovisionOnActive
                               */
                               public void setReprovisionOnActive(boolean param){
                            localReprovisionOnActiveTracker = true;
                                   
                                            this.localReprovisionOnActive=param;
                                    

                               }
                            

                        /**
                        * field for ActivationFeeType
                        */

                        
                                    protected com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ActivationFeeType localActivationFeeType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localActivationFeeTypeTracker = false ;

                           public boolean isActivationFeeTypeSpecified(){
                               return localActivationFeeTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ActivationFeeType
                           */
                           public  com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ActivationFeeType getActivationFeeType(){
                               return localActivationFeeType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ActivationFeeType
                               */
                               public void setActivationFeeType(com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ActivationFeeType param){
                            localActivationFeeTypeTracker = true;
                                   
                                            this.localActivationFeeType=param;
                                    

                               }
                            

                        /**
                        * field for InitialBalanceLimit
                        */

                        
                                    protected long localInitialBalanceLimit ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInitialBalanceLimitTracker = false ;

                           public boolean isInitialBalanceLimitSpecified(){
                               return localInitialBalanceLimitTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getInitialBalanceLimit(){
                               return localInitialBalanceLimit;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InitialBalanceLimit
                               */
                               public void setInitialBalanceLimit(long param){
                            localInitialBalanceLimitTracker = true;
                                   
                                            this.localInitialBalanceLimit=param;
                                    

                               }
                            

                        /**
                        * field for ChargingPriority
                        */

                        
                                    protected int localChargingPriority ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChargingPriorityTracker = false ;

                           public boolean isChargingPrioritySpecified(){
                               return localChargingPriorityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getChargingPriority(){
                               return localChargingPriority;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChargingPriority
                               */
                               public void setChargingPriority(int param){
                            localChargingPriorityTracker = true;
                                   
                                            this.localChargingPriority=param;
                                    

                               }
                            

                        /**
                        * field for GroupChargingScheme
                        */

                        
                                    protected com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.GroupChargingSchemeType localGroupChargingScheme ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGroupChargingSchemeTracker = false ;

                           public boolean isGroupChargingSchemeSpecified(){
                               return localGroupChargingSchemeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.GroupChargingSchemeType
                           */
                           public  com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.GroupChargingSchemeType getGroupChargingScheme(){
                               return localGroupChargingScheme;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GroupChargingScheme
                               */
                               public void setGroupChargingScheme(com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.GroupChargingSchemeType param){
                            localGroupChargingSchemeTracker = true;
                                   
                                            this.localGroupChargingScheme=param;
                                    

                               }
                            

                        /**
                        * field for RolloverPercent
                        */

                        
                                    protected int localRolloverPercent ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRolloverPercentTracker = false ;

                           public boolean isRolloverPercentSpecified(){
                               return localRolloverPercentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getRolloverPercent(){
                               return localRolloverPercent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RolloverPercent
                               */
                               public void setRolloverPercent(int param){
                            localRolloverPercentTracker = true;
                                   
                                            this.localRolloverPercent=param;
                                    

                               }
                            

                        /**
                        * field for RolloverMax
                        */

                        
                                    protected long localRolloverMax ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRolloverMaxTracker = false ;

                           public boolean isRolloverMaxSpecified(){
                               return localRolloverMaxTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getRolloverMax(){
                               return localRolloverMax;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RolloverMax
                               */
                               public void setRolloverMax(long param){
                            localRolloverMaxTracker = true;
                                   
                                            this.localRolloverMax=param;
                                    

                               }
                            

                        /**
                        * field for ExpiryPercent
                        */

                        
                                    protected int localExpiryPercent ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExpiryPercentTracker = false ;

                           public boolean isExpiryPercentSpecified(){
                               return localExpiryPercentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getExpiryPercent(){
                               return localExpiryPercent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExpiryPercent
                               */
                               public void setExpiryPercent(int param){
                            localExpiryPercentTracker = true;
                                   
                                            this.localExpiryPercent=param;
                                    

                               }
                            

                        /**
                        * field for ActivationScheme
                        */

                        
                                    protected com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ActivationSchemeType localActivationScheme ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localActivationSchemeTracker = false ;

                           public boolean isActivationSchemeSpecified(){
                               return localActivationSchemeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ActivationSchemeType
                           */
                           public  com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ActivationSchemeType getActivationScheme(){
                               return localActivationScheme;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ActivationScheme
                               */
                               public void setActivationScheme(com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ActivationSchemeType param){
                            localActivationSchemeTracker = true;
                                   
                                            this.localActivationScheme=param;
                                    

                               }
                            

                        /**
                        * field for ExpiryScheme
                        */

                        
                                    protected com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ExpirySchemeType localExpiryScheme ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExpirySchemeTracker = false ;

                           public boolean isExpirySchemeSpecified(){
                               return localExpirySchemeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ExpirySchemeType
                           */
                           public  com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ExpirySchemeType getExpiryScheme(){
                               return localExpiryScheme;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExpiryScheme
                               */
                               public void setExpiryScheme(com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ExpirySchemeType param){
                            localExpirySchemeTracker = true;
                                   
                                            this.localExpiryScheme=param;
                                    

                               }
                            

                        /**
                        * field for RolloverMaxPercentage
                        */

                        
                                    protected int localRolloverMaxPercentage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRolloverMaxPercentageTracker = false ;

                           public boolean isRolloverMaxPercentageSpecified(){
                               return localRolloverMaxPercentageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getRolloverMaxPercentage(){
                               return localRolloverMaxPercentage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RolloverMaxPercentage
                               */
                               public void setRolloverMaxPercentage(int param){
                            localRolloverMaxPercentageTracker = true;
                                   
                                            this.localRolloverMaxPercentage=param;
                                    

                               }
                            

                        /**
                        * field for ServiceInitialLimits
                        * This was an Array!
                        */

                        
                                    protected com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ServiceBalanceLimit[] localServiceInitialLimits ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceInitialLimitsTracker = false ;

                           public boolean isServiceInitialLimitsSpecified(){
                               return localServiceInitialLimitsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ServiceBalanceLimit[]
                           */
                           public  com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ServiceBalanceLimit[] getServiceInitialLimits(){
                               return localServiceInitialLimits;
                           }

                           
                        


                               
                              /**
                               * validate the array for ServiceInitialLimits
                               */
                              protected void validateServiceInitialLimits(com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ServiceBalanceLimit[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ServiceInitialLimits
                              */
                              public void setServiceInitialLimits(com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ServiceBalanceLimit[] param){
                              
                                   validateServiceInitialLimits(param);

                               localServiceInitialLimitsTracker = true;
                                      
                                      this.localServiceInitialLimits=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ServiceBalanceLimit
                             */
                             public void addServiceInitialLimits(com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ServiceBalanceLimit param){
                                   if (localServiceInitialLimits == null){
                                   localServiceInitialLimits = new com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ServiceBalanceLimit[]{};
                                   }

                            
                                 //update the setting tracker
                                localServiceInitialLimitsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localServiceInitialLimits);
                               list.add(param);
                               this.localServiceInitialLimits =
                             (com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ServiceBalanceLimit[])list.toArray(
                            new com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ServiceBalanceLimit[list.size()]);

                             }
                             

                        /**
                        * field for AdjustmentTypeID
                        */

                        
                                    protected long localAdjustmentTypeID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAdjustmentTypeIDTracker = false ;

                           public boolean isAdjustmentTypeIDSpecified(){
                               return localAdjustmentTypeIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getAdjustmentTypeID(){
                               return localAdjustmentTypeID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdjustmentTypeID
                               */
                               public void setAdjustmentTypeID(long param){
                            localAdjustmentTypeIDTracker = true;
                                   
                                            this.localAdjustmentTypeID=param;
                                    

                               }
                            

                        /**
                        * field for AuxiliaryAdjustmentTypeID
                        */

                        
                                    protected long localAuxiliaryAdjustmentTypeID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAuxiliaryAdjustmentTypeIDTracker = false ;

                           public boolean isAuxiliaryAdjustmentTypeIDSpecified(){
                               return localAuxiliaryAdjustmentTypeIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getAuxiliaryAdjustmentTypeID(){
                               return localAuxiliaryAdjustmentTypeID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AuxiliaryAdjustmentTypeID
                               */
                               public void setAuxiliaryAdjustmentTypeID(long param){
                            localAuxiliaryAdjustmentTypeIDTracker = true;
                                   
                                            this.localAuxiliaryAdjustmentTypeID=param;
                                    

                               }
                            

                        /**
                        * field for Enabled
                        */

                        
                                    protected boolean localEnabled ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEnabledTracker = false ;

                           public boolean isEnabledSpecified(){
                               return localEnabledTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getEnabled(){
                               return localEnabled;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Enabled
                               */
                               public void setEnabled(boolean param){
                            localEnabledTracker = true;
                                   
                                            this.localEnabled=param;
                                    

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
                        * field for BundleCategories
                        * This was an Array!
                        */

                        
                                    protected com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.BundleCategoryAssociation[] localBundleCategories ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBundleCategoriesTracker = false ;

                           public boolean isBundleCategoriesSpecified(){
                               return localBundleCategoriesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.BundleCategoryAssociation[]
                           */
                           public  com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.BundleCategoryAssociation[] getBundleCategories(){
                               return localBundleCategories;
                           }

                           
                        


                               
                              /**
                               * validate the array for BundleCategories
                               */
                              protected void validateBundleCategories(com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.BundleCategoryAssociation[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param BundleCategories
                              */
                              public void setBundleCategories(com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.BundleCategoryAssociation[] param){
                              
                                   validateBundleCategories(param);

                               localBundleCategoriesTracker = true;
                                      
                                      this.localBundleCategories=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.BundleCategoryAssociation
                             */
                             public void addBundleCategories(com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.BundleCategoryAssociation param){
                                   if (localBundleCategories == null){
                                   localBundleCategories = new com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.BundleCategoryAssociation[]{};
                                   }

                            
                                 //update the setting tracker
                                localBundleCategoriesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localBundleCategories);
                               list.add(param);
                               this.localBundleCategories =
                             (com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.BundleCategoryAssociation[])list.toArray(
                            new com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.BundleCategoryAssociation[list.size()]);

                             }
                             

                        /**
                        * field for ChargeRolloverFirst
                        */

                        
                                    protected boolean localChargeRolloverFirst ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChargeRolloverFirstTracker = false ;

                           public boolean isChargeRolloverFirstSpecified(){
                               return localChargeRolloverFirstTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getChargeRolloverFirst(){
                               return localChargeRolloverFirst;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChargeRolloverFirst
                               */
                               public void setChargeRolloverFirst(boolean param){
                            localChargeRolloverFirstTracker = true;
                                   
                                            this.localChargeRolloverFirst=param;
                                    

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
                

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":Bundle",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Bundle",
                           xmlWriter);
                   }

                if (localIdentifierTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01";
                                    writeStartElement(null, namespace, "identifier", xmlWriter);
                             
                                               if (localIdentifier==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdentifier));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSpidTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01";
                                    writeStartElement(null, namespace, "spid", xmlWriter);
                             
                                               if (localSpid==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpid));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNameTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01";
                                    writeStartElement(null, namespace, "name", xmlWriter);
                             

                                          if (localName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAuxiliaryTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01";
                                    writeStartElement(null, namespace, "auxiliary", xmlWriter);
                             
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuxiliary));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPaidTypeTracker){
                                    if (localPaidType==null){

                                        writeStartElement(null, "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01", "paidType", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPaidType.serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","paidType"),
                                        xmlWriter);
                                    }
                                } if (localRecurrenceTracker){
                                    if (localRecurrence==null){

                                        writeStartElement(null, "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01", "recurrence", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRecurrence.serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","recurrence"),
                                        xmlWriter);
                                    }
                                } if (localBundleTypeTracker){
                                    if (localBundleType==null){

                                        writeStartElement(null, "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01", "bundleType", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBundleType.serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","bundleType"),
                                        xmlWriter);
                                    }
                                } if (localGroupIdentifierTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01";
                                    writeStartElement(null, namespace, "groupIdentifier", xmlWriter);
                             
                                               if (localGroupIdentifier==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGroupIdentifier));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAuxiliaryServiceChargeTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01";
                                    writeStartElement(null, namespace, "auxiliaryServiceCharge", xmlWriter);
                             
                                               if (localAuxiliaryServiceCharge==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuxiliaryServiceCharge));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSmartSuspensionTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01";
                                    writeStartElement(null, namespace, "smartSuspension", xmlWriter);
                             
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSmartSuspension));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBundleCategoryIDsTracker){
                             if (localBundleCategoryIDs!=null) {
                                   namespace = "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01";
                                   for (int i = 0;i < localBundleCategoryIDs.length;i++){
                                        
                                                   if (localBundleCategoryIDs[i]!=java.lang.Long.MIN_VALUE) {
                                               
                                                writeStartElement(null, namespace, "bundleCategoryIDs", xmlWriter);

                                            
                                                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBundleCategoryIDs[i]));
                                                xmlWriter.writeEndElement();
                                            
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01";
                                                            writeStartElement(null, namespace, "bundleCategoryIDs", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01", "bundleCategoryIDs", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localCurrencyTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01";
                                    writeStartElement(null, namespace, "currency", xmlWriter);
                             
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCurrency));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localQuotaSchemeTracker){
                                    if (localQuotaScheme==null){

                                        writeStartElement(null, "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01", "quotaScheme", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localQuotaScheme.serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","quotaScheme"),
                                        xmlWriter);
                                    }
                                } if (localEnablePromotionProvisionTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01";
                                    writeStartElement(null, namespace, "enablePromotionProvision", xmlWriter);
                             
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnablePromotionProvision));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReprovisionOnActiveTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01";
                                    writeStartElement(null, namespace, "reprovisionOnActive", xmlWriter);
                             
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReprovisionOnActive));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localActivationFeeTypeTracker){
                                    if (localActivationFeeType==null){

                                        writeStartElement(null, "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01", "activationFeeType", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localActivationFeeType.serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","activationFeeType"),
                                        xmlWriter);
                                    }
                                } if (localInitialBalanceLimitTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01";
                                    writeStartElement(null, namespace, "initialBalanceLimit", xmlWriter);
                             
                                               if (localInitialBalanceLimit==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInitialBalanceLimit));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localChargingPriorityTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01";
                                    writeStartElement(null, namespace, "chargingPriority", xmlWriter);
                             
                                               if (localChargingPriority==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChargingPriority));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGroupChargingSchemeTracker){
                                    if (localGroupChargingScheme==null){

                                        writeStartElement(null, "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01", "groupChargingScheme", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localGroupChargingScheme.serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","groupChargingScheme"),
                                        xmlWriter);
                                    }
                                } if (localRolloverPercentTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01";
                                    writeStartElement(null, namespace, "rolloverPercent", xmlWriter);
                             
                                               if (localRolloverPercent==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRolloverPercent));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRolloverMaxTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01";
                                    writeStartElement(null, namespace, "rolloverMax", xmlWriter);
                             
                                               if (localRolloverMax==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRolloverMax));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localExpiryPercentTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01";
                                    writeStartElement(null, namespace, "expiryPercent", xmlWriter);
                             
                                               if (localExpiryPercent==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpiryPercent));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localActivationSchemeTracker){
                                    if (localActivationScheme==null){

                                        writeStartElement(null, "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01", "activationScheme", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localActivationScheme.serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","activationScheme"),
                                        xmlWriter);
                                    }
                                } if (localExpirySchemeTracker){
                                    if (localExpiryScheme==null){

                                        writeStartElement(null, "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01", "expiryScheme", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localExpiryScheme.serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","expiryScheme"),
                                        xmlWriter);
                                    }
                                } if (localRolloverMaxPercentageTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01";
                                    writeStartElement(null, namespace, "rolloverMaxPercentage", xmlWriter);
                             
                                               if (localRolloverMaxPercentage==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRolloverMaxPercentage));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localServiceInitialLimitsTracker){
                                       if (localServiceInitialLimits!=null){
                                            for (int i = 0;i < localServiceInitialLimits.length;i++){
                                                if (localServiceInitialLimits[i] != null){
                                                 localServiceInitialLimits[i].serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","serviceInitialLimits"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01", "serviceInitialLimits", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01", "serviceInitialLimits", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localAdjustmentTypeIDTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01";
                                    writeStartElement(null, namespace, "adjustmentTypeID", xmlWriter);
                             
                                               if (localAdjustmentTypeID==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdjustmentTypeID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAuxiliaryAdjustmentTypeIDTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01";
                                    writeStartElement(null, namespace, "auxiliaryAdjustmentTypeID", xmlWriter);
                             
                                               if (localAuxiliaryAdjustmentTypeID==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuxiliaryAdjustmentTypeID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEnabledTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01";
                                    writeStartElement(null, namespace, "enabled", xmlWriter);
                             
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnabled));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localParametersTracker){
                                       if (localParameters!=null){
                                            for (int i = 0;i < localParameters.length;i++){
                                                if (localParameters[i] != null){
                                                 localParameters[i].serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","parameters"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01", "parameters", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01", "parameters", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localBundleCategoriesTracker){
                                       if (localBundleCategories!=null){
                                            for (int i = 0;i < localBundleCategories.length;i++){
                                                if (localBundleCategories[i] != null){
                                                 localBundleCategories[i].serialize(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","bundleCategories"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01", "bundleCategories", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01", "bundleCategories", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localChargeRolloverFirstTracker){
                                    namespace = "http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01";
                                    writeStartElement(null, namespace, "chargeRolloverFirst", xmlWriter);
                             
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChargeRolloverFirst));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01")){
                return "ns12";
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
                    attribList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","Bundle"));
                 if (localIdentifierTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "identifier"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdentifier));
                            } if (localSpidTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "spid"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpid));
                            } if (localNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "name"));
                                 
                                         elementList.add(localName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                                    } if (localAuxiliaryTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "auxiliary"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuxiliary));
                            } if (localPaidTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "paidType"));
                            
                            
                                    elementList.add(localPaidType==null?null:
                                    localPaidType);
                                } if (localRecurrenceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "recurrence"));
                            
                            
                                    elementList.add(localRecurrence==null?null:
                                    localRecurrence);
                                } if (localBundleTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "bundleType"));
                            
                            
                                    elementList.add(localBundleType==null?null:
                                    localBundleType);
                                } if (localGroupIdentifierTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "groupIdentifier"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGroupIdentifier));
                            } if (localAuxiliaryServiceChargeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "auxiliaryServiceCharge"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuxiliaryServiceCharge));
                            } if (localSmartSuspensionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "smartSuspension"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSmartSuspension));
                            } if (localBundleCategoryIDsTracker){
                            if (localBundleCategoryIDs!=null){
                                  for (int i = 0;i < localBundleCategoryIDs.length;i++){
                                      
                                          elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                                                                       "bundleCategoryIDs"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBundleCategoryIDs[i]));

                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                              "bundleCategoryIDs"));
                                    elementList.add(null);
                                
                            }

                        } if (localCurrencyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "currency"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCurrency));
                            } if (localQuotaSchemeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "quotaScheme"));
                            
                            
                                    elementList.add(localQuotaScheme==null?null:
                                    localQuotaScheme);
                                } if (localEnablePromotionProvisionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "enablePromotionProvision"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnablePromotionProvision));
                            } if (localReprovisionOnActiveTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "reprovisionOnActive"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReprovisionOnActive));
                            } if (localActivationFeeTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "activationFeeType"));
                            
                            
                                    elementList.add(localActivationFeeType==null?null:
                                    localActivationFeeType);
                                } if (localInitialBalanceLimitTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "initialBalanceLimit"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInitialBalanceLimit));
                            } if (localChargingPriorityTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "chargingPriority"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChargingPriority));
                            } if (localGroupChargingSchemeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "groupChargingScheme"));
                            
                            
                                    elementList.add(localGroupChargingScheme==null?null:
                                    localGroupChargingScheme);
                                } if (localRolloverPercentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "rolloverPercent"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRolloverPercent));
                            } if (localRolloverMaxTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "rolloverMax"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRolloverMax));
                            } if (localExpiryPercentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "expiryPercent"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpiryPercent));
                            } if (localActivationSchemeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "activationScheme"));
                            
                            
                                    elementList.add(localActivationScheme==null?null:
                                    localActivationScheme);
                                } if (localExpirySchemeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "expiryScheme"));
                            
                            
                                    elementList.add(localExpiryScheme==null?null:
                                    localExpiryScheme);
                                } if (localRolloverMaxPercentageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "rolloverMaxPercentage"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRolloverMaxPercentage));
                            } if (localServiceInitialLimitsTracker){
                             if (localServiceInitialLimits!=null) {
                                 for (int i = 0;i < localServiceInitialLimits.length;i++){

                                    if (localServiceInitialLimits[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                          "serviceInitialLimits"));
                                         elementList.add(localServiceInitialLimits[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                          "serviceInitialLimits"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                          "serviceInitialLimits"));
                                        elementList.add(localServiceInitialLimits);
                                    
                             }

                        } if (localAdjustmentTypeIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "adjustmentTypeID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdjustmentTypeID));
                            } if (localAuxiliaryAdjustmentTypeIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "auxiliaryAdjustmentTypeID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuxiliaryAdjustmentTypeID));
                            } if (localEnabledTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "enabled"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnabled));
                            } if (localParametersTracker){
                             if (localParameters!=null) {
                                 for (int i = 0;i < localParameters.length;i++){

                                    if (localParameters[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                          "parameters"));
                                         elementList.add(localParameters[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                          "parameters"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                          "parameters"));
                                        elementList.add(localParameters);
                                    
                             }

                        } if (localBundleCategoriesTracker){
                             if (localBundleCategories!=null) {
                                 for (int i = 0;i < localBundleCategories.length;i++){

                                    if (localBundleCategories[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                          "bundleCategories"));
                                         elementList.add(localBundleCategories[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                          "bundleCategories"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                          "bundleCategories"));
                                        elementList.add(localBundleCategories);
                                    
                             }

                        } if (localChargeRolloverFirstTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01",
                                                                      "chargeRolloverFirst"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChargeRolloverFirst));
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
        public static Bundle parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Bundle object =
                new Bundle();

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
                    
                            if (!"Bundle".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Bundle)com.redknee.util.crmapi.soap.common.xsd.common_v2_0.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list11 = new java.util.ArrayList();
                    
                        java.util.ArrayList list26 = new java.util.ArrayList();
                    
                        java.util.ArrayList list30 = new java.util.ArrayList();
                    
                        java.util.ArrayList list31 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","identifier").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","spid").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","name").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","auxiliary").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAuxiliary(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","paidType").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPaidType(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPaidType(com.redknee.util.crmapi.soap.common.xsd._2008._08.PaidType.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","recurrence").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRecurrence(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRecurrence(com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.RecurrenceScheme.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","bundleType").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBundleType(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBundleType(com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.BundleType.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","groupIdentifier").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGroupIdentifier(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setGroupIdentifier(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setGroupIdentifier(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","auxiliaryServiceCharge").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAuxiliaryServiceCharge(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setAuxiliaryServiceCharge(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setAuxiliaryServiceCharge(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","smartSuspension").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSmartSuspension(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","bundleCategoryIDs").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list11.add(String.valueOf(java.lang.Long.MIN_VALUE));
                                                       
                                                  reader.next();
                                              } else {
                                            list11.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone11 = false;
                                            while(!loopDone11){
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
                                                    loopDone11 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","bundleCategoryIDs").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list11.add(String.valueOf(java.lang.Long.MIN_VALUE));
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list11.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone11 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                            object.setBundleCategoryIDs((long[])
                                                org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                            long.class,list11));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","currency").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCurrency(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","quotaScheme").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setQuotaScheme(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setQuotaScheme(com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.QuotaSchemeType.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","enablePromotionProvision").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEnablePromotionProvision(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","reprovisionOnActive").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReprovisionOnActive(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","activationFeeType").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setActivationFeeType(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setActivationFeeType(com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ActivationFeeType.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","initialBalanceLimit").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setInitialBalanceLimit(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setInitialBalanceLimit(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setInitialBalanceLimit(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","chargingPriority").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setChargingPriority(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setChargingPriority(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setChargingPriority(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","groupChargingScheme").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setGroupChargingScheme(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setGroupChargingScheme(com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.GroupChargingSchemeType.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","rolloverPercent").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRolloverPercent(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setRolloverPercent(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRolloverPercent(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","rolloverMax").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRolloverMax(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setRolloverMax(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRolloverMax(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","expiryPercent").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setExpiryPercent(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setExpiryPercent(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setExpiryPercent(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","activationScheme").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setActivationScheme(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setActivationScheme(com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ActivationSchemeType.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","expiryScheme").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setExpiryScheme(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setExpiryScheme(com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ExpirySchemeType.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","rolloverMaxPercentage").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRolloverMaxPercentage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setRolloverMaxPercentage(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRolloverMaxPercentage(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","serviceInitialLimits").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list26.add(null);
                                                              reader.next();
                                                          } else {
                                                        list26.add(com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ServiceBalanceLimit.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone26 = false;
                                                        while(!loopDone26){
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
                                                                loopDone26 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","serviceInitialLimits").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list26.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list26.add(com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ServiceBalanceLimit.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone26 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setServiceInitialLimits((com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ServiceBalanceLimit[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.ServiceBalanceLimit.class,
                                                                list26));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","adjustmentTypeID").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAdjustmentTypeID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setAdjustmentTypeID(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setAdjustmentTypeID(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","auxiliaryAdjustmentTypeID").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAuxiliaryAdjustmentTypeID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setAuxiliaryAdjustmentTypeID(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setAuxiliaryAdjustmentTypeID(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","enabled").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEnabled(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","parameters").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list30.add(null);
                                                              reader.next();
                                                          } else {
                                                        list30.add(com.redknee.util.crmapi.soap.common.xsd._2008._08.GenericParameter.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone30 = false;
                                                        while(!loopDone30){
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
                                                                loopDone30 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","parameters").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list30.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list30.add(com.redknee.util.crmapi.soap.common.xsd._2008._08.GenericParameter.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone30 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setParameters((com.redknee.util.crmapi.soap.common.xsd._2008._08.GenericParameter[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.redknee.util.crmapi.soap.common.xsd._2008._08.GenericParameter.class,
                                                                list30));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","bundleCategories").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list31.add(null);
                                                              reader.next();
                                                          } else {
                                                        list31.add(com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.BundleCategoryAssociation.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone31 = false;
                                                        while(!loopDone31){
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
                                                                loopDone31 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","bundleCategories").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list31.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list31.add(com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.BundleCategoryAssociation.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone31 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setBundleCategories((com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.BundleCategoryAssociation[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.redknee.util.crmapi.soap.servicesandbundles.xsd._2011._01.BundleCategoryAssociation.class,
                                                                list31));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/servicesandbundles/xsd/2011/01","chargeRolloverFirst").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setChargeRolloverFirst(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
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
           
    