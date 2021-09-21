/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.34.1
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
import com.plaid.client.model.PaymentInitiationAddress;
import com.plaid.client.model.RecipientBACSNullable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentInitiationRecipient defines a payment initiation recipient
 */
@ApiModel(description = "PaymentInitiationRecipient defines a payment initiation recipient")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-21T23:01:39.210Z[GMT]")
public class PaymentInitiationRecipient {
  public static final String SERIALIZED_NAME_RECIPIENT_ID = "recipient_id";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_ID)
  private String recipientId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private PaymentInitiationAddress address;

  public static final String SERIALIZED_NAME_IBAN = "iban";
  @SerializedName(SERIALIZED_NAME_IBAN)
  private String iban;

  public static final String SERIALIZED_NAME_BACS = "bacs";
  @SerializedName(SERIALIZED_NAME_BACS)
  private RecipientBACSNullable bacs = null;

  public static final String SERIALIZED_NAME_EMI_RECIPIENT_ID = "emi_recipient_id";
  @SerializedName(SERIALIZED_NAME_EMI_RECIPIENT_ID)
  private String emiRecipientId;


  public PaymentInitiationRecipient recipientId(String recipientId) {
    
    this.recipientId = recipientId;
    return this;
  }

   /**
   * The ID of the recipient.
   * @return recipientId
  **/
  @ApiModelProperty(required = true, value = "The ID of the recipient.")

  public String getRecipientId() {
    return recipientId;
  }


  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }


  public PaymentInitiationRecipient name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the recipient.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the recipient.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PaymentInitiationRecipient address(PaymentInitiationAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentInitiationAddress getAddress() {
    return address;
  }


  public void setAddress(PaymentInitiationAddress address) {
    this.address = address;
  }


  public PaymentInitiationRecipient iban(String iban) {
    
    this.iban = iban;
    return this;
  }

   /**
   * The International Bank Account Number (IBAN) for the recipient.
   * @return iban
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The International Bank Account Number (IBAN) for the recipient.")

  public String getIban() {
    return iban;
  }


  public void setIban(String iban) {
    this.iban = iban;
  }


  public PaymentInitiationRecipient bacs(RecipientBACSNullable bacs) {
    
    this.bacs = bacs;
    return this;
  }

   /**
   * Get bacs
   * @return bacs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RecipientBACSNullable getBacs() {
    return bacs;
  }


  public void setBacs(RecipientBACSNullable bacs) {
    this.bacs = bacs;
  }


  public PaymentInitiationRecipient emiRecipientId(String emiRecipientId) {
    
    this.emiRecipientId = emiRecipientId;
    return this;
  }

   /**
   * The EMI (E-Money Institution) recipient that this recipient is associated with, if any. This EMI recipient is used as an intermediary account to enable Plaid to reconcile the settlement of funds for Payment Initiation requests.
   * @return emiRecipientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The EMI (E-Money Institution) recipient that this recipient is associated with, if any. This EMI recipient is used as an intermediary account to enable Plaid to reconcile the settlement of funds for Payment Initiation requests.")

  public String getEmiRecipientId() {
    return emiRecipientId;
  }


  public void setEmiRecipientId(String emiRecipientId) {
    this.emiRecipientId = emiRecipientId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInitiationRecipient paymentInitiationRecipient = (PaymentInitiationRecipient) o;
    return Objects.equals(this.recipientId, paymentInitiationRecipient.recipientId) &&
        Objects.equals(this.name, paymentInitiationRecipient.name) &&
        Objects.equals(this.address, paymentInitiationRecipient.address) &&
        Objects.equals(this.iban, paymentInitiationRecipient.iban) &&
        Objects.equals(this.bacs, paymentInitiationRecipient.bacs) &&
        Objects.equals(this.emiRecipientId, paymentInitiationRecipient.emiRecipientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipientId, name, address, iban, bacs, emiRecipientId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationRecipient {\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bacs: ").append(toIndentedString(bacs)).append("\n");
    sb.append("    emiRecipientId: ").append(toIndentedString(emiRecipientId)).append("\n");
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

