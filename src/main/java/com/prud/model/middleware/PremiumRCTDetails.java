package com.prud.model.middleware;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class PremiumRCTDetails {
    private String premiumRCTId;
    private String bankedFlag;
    private String bankCode;
    private String bankDesc01;
    private String bankDesc02;
    private String bankDesc03;
    private String bankKey;
    private String cheqNumber;
    private BigDecimal documentAmount;
    private String originalCurrency;
    private String paymentType;
    private String recievedFromCode;
    private String recievedFromNumber;
    private BigDecimal currencyRate;
    private BigInteger tranDate;
    private List<SFLDetails> sflDetails;
    private String protectIndicator;
    private BigInteger dissectionNumber;
}
