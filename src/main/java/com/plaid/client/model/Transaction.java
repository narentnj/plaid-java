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
import com.plaid.client.model.Location;
import com.plaid.client.model.PaymentMeta;
import com.plaid.client.model.PersonalFinanceCategory;
import com.plaid.client.model.TransactionAllOf;
import com.plaid.client.model.TransactionBase;
import com.plaid.client.model.TransactionCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * A representation of a transaction
 */
@ApiModel(description = "A representation of a transaction")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-07T17:40:04.817Z[GMT]")
public class Transaction {
  /**
   * Please use the &#x60;payment_channel&#x60; field, &#x60;transaction_type&#x60; will be deprecated in the future.  &#x60;digital:&#x60; transactions that took place online.  &#x60;place:&#x60; transactions that were made at a physical location.  &#x60;special:&#x60; transactions that relate to banks, e.g. fees or deposits.  &#x60;unresolved:&#x60; transactions that do not fit into the other three types. 
   */
  @JsonAdapter(TransactionTypeEnum.Adapter.class)
  public enum TransactionTypeEnum {
    DIGITAL("digital"),
    
    PLACE("place"),
    
    SPECIAL("special"),
    
    UNRESOLVED("unresolved");

    private String value;

    TransactionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransactionTypeEnum fromValue(String value) {
      for (TransactionTypeEnum b : TransactionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TransactionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransactionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransactionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TransactionTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transaction_type";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private TransactionTypeEnum transactionType;

  public static final String SERIALIZED_NAME_PENDING_TRANSACTION_ID = "pending_transaction_id";
  @SerializedName(SERIALIZED_NAME_PENDING_TRANSACTION_ID)
  private String pendingTransactionId;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private List<String> category = new ArrayList<>();

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private Location location;

  public static final String SERIALIZED_NAME_PAYMENT_META = "payment_meta";
  @SerializedName(SERIALIZED_NAME_PAYMENT_META)
  private PaymentMeta paymentMeta;

  public static final String SERIALIZED_NAME_ACCOUNT_OWNER = "account_owner";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_OWNER)
  private String accountOwner;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORIGINAL_DESCRIPTION = "original_description";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_DESCRIPTION)
  private String originalDescription;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE = "unofficial_currency_code";
  @SerializedName(SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE)
  private String unofficialCurrencyCode;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_PENDING = "pending";
  @SerializedName(SERIALIZED_NAME_PENDING)
  private Boolean pending;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transaction_id";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  /**
   * The channel used to make a payment. &#x60;online:&#x60; transactions that took place online.  &#x60;in store:&#x60; transactions that were made at a physical location.  &#x60;other:&#x60; transactions that relate to banks, e.g. fees or deposits.  This field replaces the &#x60;transaction_type&#x60; field. 
   */
  @JsonAdapter(PaymentChannelEnum.Adapter.class)
  public enum PaymentChannelEnum {
    ONLINE("online"),
    
    IN_STORE("in store"),
    
    OTHER("other");

    private String value;

    PaymentChannelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentChannelEnum fromValue(String value) {
      for (PaymentChannelEnum b : PaymentChannelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PaymentChannelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentChannelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentChannelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PaymentChannelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYMENT_CHANNEL = "payment_channel";
  @SerializedName(SERIALIZED_NAME_PAYMENT_CHANNEL)
  private PaymentChannelEnum paymentChannel;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchant_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_AUTHORIZED_DATE = "authorized_date";
  @SerializedName(SERIALIZED_NAME_AUTHORIZED_DATE)
  private LocalDate authorizedDate;

  public static final String SERIALIZED_NAME_AUTHORIZED_DATETIME = "authorized_datetime";
  @SerializedName(SERIALIZED_NAME_AUTHORIZED_DATETIME)
  private OffsetDateTime authorizedDatetime;

  public static final String SERIALIZED_NAME_DATETIME = "datetime";
  @SerializedName(SERIALIZED_NAME_DATETIME)
  private OffsetDateTime datetime;

  public static final String SERIALIZED_NAME_CHECK_NUMBER = "check_number";
  @SerializedName(SERIALIZED_NAME_CHECK_NUMBER)
  private String checkNumber;

  public static final String SERIALIZED_NAME_TRANSACTION_CODE = "transaction_code";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_CODE)
  private TransactionCode transactionCode;

  public static final String SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY = "personal_finance_category";
  @SerializedName(SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY)
  private PersonalFinanceCategory personalFinanceCategory = null;


  public Transaction transactionType(TransactionTypeEnum transactionType) {
    
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Please use the &#x60;payment_channel&#x60; field, &#x60;transaction_type&#x60; will be deprecated in the future.  &#x60;digital:&#x60; transactions that took place online.  &#x60;place:&#x60; transactions that were made at a physical location.  &#x60;special:&#x60; transactions that relate to banks, e.g. fees or deposits.  &#x60;unresolved:&#x60; transactions that do not fit into the other three types. 
   * @return transactionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Please use the `payment_channel` field, `transaction_type` will be deprecated in the future.  `digital:` transactions that took place online.  `place:` transactions that were made at a physical location.  `special:` transactions that relate to banks, e.g. fees or deposits.  `unresolved:` transactions that do not fit into the other three types. ")

  public TransactionTypeEnum getTransactionType() {
    return transactionType;
  }


  public void setTransactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
  }


  public Transaction pendingTransactionId(String pendingTransactionId) {
    
    this.pendingTransactionId = pendingTransactionId;
    return this;
  }

   /**
   * The ID of a posted transaction&#39;s associated pending transaction, where applicable.
   * @return pendingTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The ID of a posted transaction's associated pending transaction, where applicable.")

  public String getPendingTransactionId() {
    return pendingTransactionId;
  }


  public void setPendingTransactionId(String pendingTransactionId) {
    this.pendingTransactionId = pendingTransactionId;
  }


  public Transaction categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * The ID of the category to which this transaction belongs. See [Categories](https://plaid.com/docs/#category-overview).  If the &#x60;transactions&#x60; object was returned by an Assets endpoint such as &#x60;/asset_report/get/&#x60; or &#x60;/asset_report/pdf/get&#x60;, this field will only appear in an Asset Report with Insights.
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The ID of the category to which this transaction belongs. See [Categories](https://plaid.com/docs/#category-overview).  If the `transactions` object was returned by an Assets endpoint such as `/asset_report/get/` or `/asset_report/pdf/get`, this field will only appear in an Asset Report with Insights.")

  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public Transaction category(List<String> category) {
    
    this.category = category;
    return this;
  }

  public Transaction addCategoryItem(String categoryItem) {
    this.category.add(categoryItem);
    return this;
  }

   /**
   * A hierarchical array of the categories to which this transaction belongs. See [Categories](https://plaid.com/docs/#category-overview).  If the &#x60;transactions&#x60; object was returned by an Assets endpoint such as &#x60;/asset_report/get/&#x60; or &#x60;/asset_report/pdf/get&#x60;, this field will only appear in an Asset Report with Insights.
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A hierarchical array of the categories to which this transaction belongs. See [Categories](https://plaid.com/docs/#category-overview).  If the `transactions` object was returned by an Assets endpoint such as `/asset_report/get/` or `/asset_report/pdf/get`, this field will only appear in an Asset Report with Insights.")

  public List<String> getCategory() {
    return category;
  }


  public void setCategory(List<String> category) {
    this.category = category;
  }


  public Transaction location(Location location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(required = true, value = "")

  public Location getLocation() {
    return location;
  }


  public void setLocation(Location location) {
    this.location = location;
  }


  public Transaction paymentMeta(PaymentMeta paymentMeta) {
    
    this.paymentMeta = paymentMeta;
    return this;
  }

   /**
   * Get paymentMeta
   * @return paymentMeta
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentMeta getPaymentMeta() {
    return paymentMeta;
  }


  public void setPaymentMeta(PaymentMeta paymentMeta) {
    this.paymentMeta = paymentMeta;
  }


  public Transaction accountOwner(String accountOwner) {
    
    this.accountOwner = accountOwner;
    return this;
  }

   /**
   * The name of the account owner. This field is not typically populated and only relevant when dealing with sub-accounts.
   * @return accountOwner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The name of the account owner. This field is not typically populated and only relevant when dealing with sub-accounts.")

  public String getAccountOwner() {
    return accountOwner;
  }


  public void setAccountOwner(String accountOwner) {
    this.accountOwner = accountOwner;
  }


  public Transaction name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The merchant name or transaction description.  If the &#x60;transactions&#x60; object was returned by a Transactions endpoint such as &#x60;/transactions/get&#x60;, this field will always appear. If the &#x60;transactions&#x60; object was returned by an Assets endpoint such as &#x60;/asset_report/get/&#x60; or &#x60;/asset_report/pdf/get&#x60;, this field will only appear in an Asset Report with Insights.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The merchant name or transaction description.  If the `transactions` object was returned by a Transactions endpoint such as `/transactions/get`, this field will always appear. If the `transactions` object was returned by an Assets endpoint such as `/asset_report/get/` or `/asset_report/pdf/get`, this field will only appear in an Asset Report with Insights.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Transaction originalDescription(String originalDescription) {
    
    this.originalDescription = originalDescription;
    return this;
  }

   /**
   * The string returned by the financial institution to describe the transaction. For transactions returned by &#x60;/transactions/get&#x60;, this field is in beta and will be omitted unless the client is both enrolled in the closed beta program and has set &#x60;options.include_original_description&#x60; to &#x60;true&#x60;.
   * @return originalDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The string returned by the financial institution to describe the transaction. For transactions returned by `/transactions/get`, this field is in beta and will be omitted unless the client is both enrolled in the closed beta program and has set `options.include_original_description` to `true`.")

  public String getOriginalDescription() {
    return originalDescription;
  }


  public void setOriginalDescription(String originalDescription) {
    this.originalDescription = originalDescription;
  }


  public Transaction accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account in which this transaction occurred.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The ID of the account in which this transaction occurred.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public Transaction amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The settled value of the transaction, denominated in the account&#39;s currency, as stated in &#x60;iso_currency_code&#x60; or &#x60;unofficial_currency_code&#x60;. Positive values when money moves out of the account; negative values when money moves in. For example, debit card purchases are positive; credit card payments, direct deposits, and refunds are negative.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The settled value of the transaction, denominated in the account's currency, as stated in `iso_currency_code` or `unofficial_currency_code`. Positive values when money moves out of the account; negative values when money moves in. For example, debit card purchases are positive; credit card payments, direct deposits, and refunds are negative.")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public Transaction isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The ISO-4217 currency code of the transaction. Always &#x60;null&#x60; if &#x60;unofficial_currency_code&#x60; is non-null.
   * @return isoCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The ISO-4217 currency code of the transaction. Always `null` if `unofficial_currency_code` is non-null.")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public Transaction unofficialCurrencyCode(String unofficialCurrencyCode) {
    
    this.unofficialCurrencyCode = unofficialCurrencyCode;
    return this;
  }

   /**
   * The unofficial currency code associated with the transaction. Always &#x60;null&#x60; if &#x60;iso_currency_code&#x60; is non-&#x60;null&#x60;. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported &#x60;iso_currency_code&#x60;s.
   * @return unofficialCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The unofficial currency code associated with the transaction. Always `null` if `iso_currency_code` is non-`null`. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported `iso_currency_code`s.")

  public String getUnofficialCurrencyCode() {
    return unofficialCurrencyCode;
  }


  public void setUnofficialCurrencyCode(String unofficialCurrencyCode) {
    this.unofficialCurrencyCode = unofficialCurrencyCode;
  }


  public Transaction date(LocalDate date) {
    
    this.date = date;
    return this;
  }

   /**
   * For pending transactions, the date that the transaction occurred; for posted transactions, the date that the transaction posted. Both dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( &#x60;YYYY-MM-DD&#x60; ).
   * @return date
  **/
  @ApiModelProperty(required = true, value = "For pending transactions, the date that the transaction occurred; for posted transactions, the date that the transaction posted. Both dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( `YYYY-MM-DD` ).")

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    this.date = date;
  }


  public Transaction pending(Boolean pending) {
    
    this.pending = pending;
    return this;
  }

   /**
   * When &#x60;true&#x60;, identifies the transaction as pending or unsettled. Pending transaction details (name, type, amount, category ID) may change before they are settled.
   * @return pending
  **/
  @ApiModelProperty(required = true, value = "When `true`, identifies the transaction as pending or unsettled. Pending transaction details (name, type, amount, category ID) may change before they are settled.")

  public Boolean getPending() {
    return pending;
  }


  public void setPending(Boolean pending) {
    this.pending = pending;
  }


  public Transaction transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The unique ID of the transaction. Like all Plaid identifiers, the &#x60;transaction_id&#x60; is case sensitive.
   * @return transactionId
  **/
  @ApiModelProperty(required = true, value = "The unique ID of the transaction. Like all Plaid identifiers, the `transaction_id` is case sensitive.")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public Transaction paymentChannel(PaymentChannelEnum paymentChannel) {
    
    this.paymentChannel = paymentChannel;
    return this;
  }

   /**
   * The channel used to make a payment. &#x60;online:&#x60; transactions that took place online.  &#x60;in store:&#x60; transactions that were made at a physical location.  &#x60;other:&#x60; transactions that relate to banks, e.g. fees or deposits.  This field replaces the &#x60;transaction_type&#x60; field. 
   * @return paymentChannel
  **/
  @ApiModelProperty(required = true, value = "The channel used to make a payment. `online:` transactions that took place online.  `in store:` transactions that were made at a physical location.  `other:` transactions that relate to banks, e.g. fees or deposits.  This field replaces the `transaction_type` field. ")

  public PaymentChannelEnum getPaymentChannel() {
    return paymentChannel;
  }


  public void setPaymentChannel(PaymentChannelEnum paymentChannel) {
    this.paymentChannel = paymentChannel;
  }


  public Transaction merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * The merchant name, as extracted by Plaid from the &#x60;name&#x60; field.
   * @return merchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The merchant name, as extracted by Plaid from the `name` field.")

  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public Transaction authorizedDate(LocalDate authorizedDate) {
    
    this.authorizedDate = authorizedDate;
    return this;
  }

   /**
   * The date that the transaction was authorized. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( &#x60;YYYY-MM-DD&#x60; ).
   * @return authorizedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The date that the transaction was authorized. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( `YYYY-MM-DD` ).")

  public LocalDate getAuthorizedDate() {
    return authorizedDate;
  }


  public void setAuthorizedDate(LocalDate authorizedDate) {
    this.authorizedDate = authorizedDate;
  }


  public Transaction authorizedDatetime(OffsetDateTime authorizedDatetime) {
    
    this.authorizedDatetime = authorizedDatetime;
    return this;
  }

   /**
   * Date and time when a transaction was authorized in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( &#x60;YYYY-MM-DDTHH:mm:ssZ&#x60; ).  This field is only populated for UK institutions. For institutions in other countries, will be &#x60;null&#x60;.
   * @return authorizedDatetime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Date and time when a transaction was authorized in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( `YYYY-MM-DDTHH:mm:ssZ` ).  This field is only populated for UK institutions. For institutions in other countries, will be `null`.")

  public OffsetDateTime getAuthorizedDatetime() {
    return authorizedDatetime;
  }


  public void setAuthorizedDatetime(OffsetDateTime authorizedDatetime) {
    this.authorizedDatetime = authorizedDatetime;
  }


  public Transaction datetime(OffsetDateTime datetime) {
    
    this.datetime = datetime;
    return this;
  }

   /**
   * Date and time when a transaction was posted in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( &#x60;YYYY-MM-DDTHH:mm:ssZ&#x60; ).  This field is only populated for UK institutions. For institutions in other countries, will be &#x60;null&#x60;.
   * @return datetime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Date and time when a transaction was posted in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( `YYYY-MM-DDTHH:mm:ssZ` ).  This field is only populated for UK institutions. For institutions in other countries, will be `null`.")

  public OffsetDateTime getDatetime() {
    return datetime;
  }


  public void setDatetime(OffsetDateTime datetime) {
    this.datetime = datetime;
  }


  public Transaction checkNumber(String checkNumber) {
    
    this.checkNumber = checkNumber;
    return this;
  }

   /**
   * The check number of the transaction. This field is only populated for check transactions.
   * @return checkNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The check number of the transaction. This field is only populated for check transactions.")

  public String getCheckNumber() {
    return checkNumber;
  }


  public void setCheckNumber(String checkNumber) {
    this.checkNumber = checkNumber;
  }


  public Transaction transactionCode(TransactionCode transactionCode) {
    
    this.transactionCode = transactionCode;
    return this;
  }

   /**
   * Get transactionCode
   * @return transactionCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TransactionCode getTransactionCode() {
    return transactionCode;
  }


  public void setTransactionCode(TransactionCode transactionCode) {
    this.transactionCode = transactionCode;
  }


  public Transaction personalFinanceCategory(PersonalFinanceCategory personalFinanceCategory) {
    
    this.personalFinanceCategory = personalFinanceCategory;
    return this;
  }

   /**
   * Get personalFinanceCategory
   * @return personalFinanceCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PersonalFinanceCategory getPersonalFinanceCategory() {
    return personalFinanceCategory;
  }


  public void setPersonalFinanceCategory(PersonalFinanceCategory personalFinanceCategory) {
    this.personalFinanceCategory = personalFinanceCategory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.transactionType, transaction.transactionType) &&
        Objects.equals(this.pendingTransactionId, transaction.pendingTransactionId) &&
        Objects.equals(this.categoryId, transaction.categoryId) &&
        Objects.equals(this.category, transaction.category) &&
        Objects.equals(this.location, transaction.location) &&
        Objects.equals(this.paymentMeta, transaction.paymentMeta) &&
        Objects.equals(this.accountOwner, transaction.accountOwner) &&
        Objects.equals(this.name, transaction.name) &&
        Objects.equals(this.originalDescription, transaction.originalDescription) &&
        Objects.equals(this.accountId, transaction.accountId) &&
        Objects.equals(this.amount, transaction.amount) &&
        Objects.equals(this.isoCurrencyCode, transaction.isoCurrencyCode) &&
        Objects.equals(this.unofficialCurrencyCode, transaction.unofficialCurrencyCode) &&
        Objects.equals(this.date, transaction.date) &&
        Objects.equals(this.pending, transaction.pending) &&
        Objects.equals(this.transactionId, transaction.transactionId) &&
        Objects.equals(this.paymentChannel, transaction.paymentChannel) &&
        Objects.equals(this.merchantName, transaction.merchantName) &&
        Objects.equals(this.authorizedDate, transaction.authorizedDate) &&
        Objects.equals(this.authorizedDatetime, transaction.authorizedDatetime) &&
        Objects.equals(this.datetime, transaction.datetime) &&
        Objects.equals(this.checkNumber, transaction.checkNumber) &&
        Objects.equals(this.transactionCode, transaction.transactionCode) &&
        Objects.equals(this.personalFinanceCategory, transaction.personalFinanceCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionType, pendingTransactionId, categoryId, category, location, paymentMeta, accountOwner, name, originalDescription, accountId, amount, isoCurrencyCode, unofficialCurrencyCode, date, pending, transactionId, paymentChannel, merchantName, authorizedDate, authorizedDatetime, datetime, checkNumber, transactionCode, personalFinanceCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    pendingTransactionId: ").append(toIndentedString(pendingTransactionId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    paymentMeta: ").append(toIndentedString(paymentMeta)).append("\n");
    sb.append("    accountOwner: ").append(toIndentedString(accountOwner)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originalDescription: ").append(toIndentedString(originalDescription)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    unofficialCurrencyCode: ").append(toIndentedString(unofficialCurrencyCode)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    paymentChannel: ").append(toIndentedString(paymentChannel)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    authorizedDate: ").append(toIndentedString(authorizedDate)).append("\n");
    sb.append("    authorizedDatetime: ").append(toIndentedString(authorizedDatetime)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
    sb.append("    transactionCode: ").append(toIndentedString(transactionCode)).append("\n");
    sb.append("    personalFinanceCategory: ").append(toIndentedString(personalFinanceCategory)).append("\n");
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

