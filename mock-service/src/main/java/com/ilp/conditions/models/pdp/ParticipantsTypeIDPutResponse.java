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
 * PUT /participants/{Type}/{ID}/{SubId}, /participants/{Type}/{ID} object
 */
public class ParticipantsTypeIDPutResponse {

  private String fspId = null;

  public ParticipantsTypeIDPutResponse fspId(String fspId) {
    this.fspId = fspId;
    return this;
  }

   /**
   * FSP Identifier that the Party belongs to.
   * @return fspId
  **/
  public String getFspId() {
    return fspId;
  }

  public void setFspId(String fspId) {
    this.fspId = fspId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParticipantsTypeIDPutResponse participantsTypeIDPutResponse = (ParticipantsTypeIDPutResponse) o;
    return Objects.equals(this.fspId, participantsTypeIDPutResponse.fspId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fspId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParticipantsTypeIDPutResponse {\n");
    
    sb.append("    fspId: ").append(toIndentedString(fspId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
