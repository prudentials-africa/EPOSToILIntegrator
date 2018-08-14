package com.af.prud.model.middleware;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CoverageDetails {
     private String coverageId;
     private String coverageParent;
     private String mortalityClass;
     private BigInteger riskCessationDate;
     private BigInteger premiumCessationDate;
     private BigInteger premiumCessationAge;
     private BigInteger premiumCessationTerm;
     private BigInteger riskCessationAge;
     private BigInteger riskCessationTerm;
     private BigInteger sumInsured;
     private BigDecimal coverageOrRiderInstalmentAmount;
     private String coverageOrRiderTable;
     private BigDecimal lumpSumContribution;
     private String ReserveUnitsIndicator;
     private BigInteger ReserveUnitsAllocationDate;
}
