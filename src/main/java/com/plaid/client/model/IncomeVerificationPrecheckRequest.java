/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.31.1
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
import com.plaid.client.model.IncomeVerificationPrecheckEmployer;
import com.plaid.client.model.IncomeVerificationPrecheckMilitaryInfo;
import com.plaid.client.model.IncomeVerificationPrecheckUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IncomeVerificationPrecheckRequest defines the request schema for &#x60;/income/verification/precheck&#x60;
 */
@ApiModel(description = "IncomeVerificationPrecheckRequest defines the request schema for `/income/verification/precheck`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-07T17:40:04.817Z[GMT]")
public class IncomeVerificationPrecheckRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private IncomeVerificationPrecheckUser user;

  public static final String SERIALIZED_NAME_EMPLOYER = "employer";
  @SerializedName(SERIALIZED_NAME_EMPLOYER)
  private IncomeVerificationPrecheckEmployer employer;

  public static final String SERIALIZED_NAME_TRANSACTIONS_ACCESS_TOKEN = "transactions_access_token";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS_ACCESS_TOKEN)
  private String transactionsAccessToken;

  public static final String SERIALIZED_NAME_US_MILITARY_INFO = "us_military_info";
  @SerializedName(SERIALIZED_NAME_US_MILITARY_INFO)
  private IncomeVerificationPrecheckMilitaryInfo usMilitaryInfo;


  public IncomeVerificationPrecheckRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public IncomeVerificationPrecheckRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public IncomeVerificationPrecheckRequest user(IncomeVerificationPrecheckUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IncomeVerificationPrecheckUser getUser() {
    return user;
  }


  public void setUser(IncomeVerificationPrecheckUser user) {
    this.user = user;
  }


  public IncomeVerificationPrecheckRequest employer(IncomeVerificationPrecheckEmployer employer) {
    
    this.employer = employer;
    return this;
  }

   /**
   * Get employer
   * @return employer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IncomeVerificationPrecheckEmployer getEmployer() {
    return employer;
  }


  public void setEmployer(IncomeVerificationPrecheckEmployer employer) {
    this.employer = employer;
  }


  public IncomeVerificationPrecheckRequest transactionsAccessToken(String transactionsAccessToken) {
    
    this.transactionsAccessToken = transactionsAccessToken;
    return this;
  }

   /**
   * The access token associated with the Item data is being requested for.
   * @return transactionsAccessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The access token associated with the Item data is being requested for.")

  public String getTransactionsAccessToken() {
    return transactionsAccessToken;
  }


  public void setTransactionsAccessToken(String transactionsAccessToken) {
    this.transactionsAccessToken = transactionsAccessToken;
  }


  public IncomeVerificationPrecheckRequest usMilitaryInfo(IncomeVerificationPrecheckMilitaryInfo usMilitaryInfo) {
    
    this.usMilitaryInfo = usMilitaryInfo;
    return this;
  }

   /**
   * Get usMilitaryInfo
   * @return usMilitaryInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IncomeVerificationPrecheckMilitaryInfo getUsMilitaryInfo() {
    return usMilitaryInfo;
  }


  public void setUsMilitaryInfo(IncomeVerificationPrecheckMilitaryInfo usMilitaryInfo) {
    this.usMilitaryInfo = usMilitaryInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeVerificationPrecheckRequest incomeVerificationPrecheckRequest = (IncomeVerificationPrecheckRequest) o;
    return Objects.equals(this.clientId, incomeVerificationPrecheckRequest.clientId) &&
        Objects.equals(this.secret, incomeVerificationPrecheckRequest.secret) &&
        Objects.equals(this.user, incomeVerificationPrecheckRequest.user) &&
        Objects.equals(this.employer, incomeVerificationPrecheckRequest.employer) &&
        Objects.equals(this.transactionsAccessToken, incomeVerificationPrecheckRequest.transactionsAccessToken) &&
        Objects.equals(this.usMilitaryInfo, incomeVerificationPrecheckRequest.usMilitaryInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, user, employer, transactionsAccessToken, usMilitaryInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeVerificationPrecheckRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    transactionsAccessToken: ").append(toIndentedString(transactionsAccessToken)).append("\n");
    sb.append("    usMilitaryInfo: ").append(toIndentedString(usMilitaryInfo)).append("\n");
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

