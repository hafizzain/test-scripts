/*
 * PDP FSP API (Implementation Friendly Version)
 * DRAFT FOR INTERNAL REVIEW ONLY - Based on API Definition.docx updated on 2017-07-06 - Implementation friendly version. [Changes from pervious version (2.7) - maxLength changed to 48 from 32 for IlpCondition and IlpFulfilment Types.]
 *
 * OpenAPI spec version: 2.8
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ilp.conditions.models.pdp;

import java.util.Objects;

/**
 * Below are the allowed values for the enumeration - ENTERED Consumer entered the authentication value. - REJECTED Consumer rejected the transaction. - RESEND Consumer requested to resend the authentication value.
 */
public enum AuthorizationResponse {
  
  ENTERED("ENTERED"),
  
  REJECTED("REJECTED"),
  
  RESEND("RESEND");

  private String value;

  AuthorizationResponse(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AuthorizationResponse fromValue(String text) {
    for (AuthorizationResponse b : AuthorizationResponse.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

}