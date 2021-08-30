/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.26.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.Institution;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InstitutionsSearchResponse defines the response schema for &#x60;/institutions/search&#x60;
 */
@ApiModel(description = "InstitutionsSearchResponse defines the response schema for `/institutions/search`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-30T20:56:28.111Z[GMT]")
public class InstitutionsSearchResponse {
  public static final String SERIALIZED_NAME_INSTITUTIONS = "institutions";
  @SerializedName(SERIALIZED_NAME_INSTITUTIONS)
  private List<Institution> institutions = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public InstitutionsSearchResponse institutions(List<Institution> institutions) {
    
    this.institutions = institutions;
    return this;
  }

  public InstitutionsSearchResponse addInstitutionsItem(Institution institutionsItem) {
    this.institutions.add(institutionsItem);
    return this;
  }

   /**
   * An array of institutions matching the search criteria
   * @return institutions
  **/
  @ApiModelProperty(required = true, value = "An array of institutions matching the search criteria")

  public List<Institution> getInstitutions() {
    return institutions;
  }


  public void setInstitutions(List<Institution> institutions) {
    this.institutions = institutions;
  }


  public InstitutionsSearchResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionsSearchResponse institutionsSearchResponse = (InstitutionsSearchResponse) o;
    return Objects.equals(this.institutions, institutionsSearchResponse.institutions) &&
        Objects.equals(this.requestId, institutionsSearchResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(institutions, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionsSearchResponse {\n");
    sb.append("    institutions: ").append(toIndentedString(institutions)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

