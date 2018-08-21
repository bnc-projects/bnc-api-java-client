/*
 * Market Data API
 * The BraveNewCoin API is an HTTP API. The BraveNewCoin APIs provide market data information about crypto assets. 
 *
 * OpenAPI spec version: v3
 * Contact: support@bravenewcoin.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.bnc.api.v3.client.autogen.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Error
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-17T11:47:51.512+12:00[Pacific/Auckland]")
public class Error {

  
  @JsonProperty("status")
  private String status = null;
  
  
  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;
  
  
  @JsonProperty("message")
  private String message = null;
  
  
  @JsonProperty("errors")
  private List<ErrorErrors> errors = null;
  
  public Error status(String status) {
    this.status = status;
    return this;
  }

  
  /**
  * The status of the error.
  * @return status
  **/
  
  
  @Schema(description = "The status of the error.")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }
  
  public Error timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  
  /**
  * The timestamp of the error.
  * @return timestamp
  **/
  
  
  @Schema(description = "The timestamp of the error.")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }
  
  public Error message(String message) {
    this.message = message;
    return this;
  }

  
  /**
  * description of error.
  * @return message
  **/
  
  
  @Schema(description = "description of error.")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  
  public Error errors(List<ErrorErrors> errors) {
    this.errors = errors;
    return this;
  }

  public Error addErrorsItem(ErrorErrors errorsItem) {
    
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    
    this.errors.add(errorsItem);
    return this;
  }
  
  /**
  * A list of errors.
  * @return errors
  **/
  
  
  @Schema(description = "A list of errors.")
  public List<ErrorErrors> getErrors() {
    return errors;
  }
  public void setErrors(List<ErrorErrors> errors) {
    this.errors = errors;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.status, error.status) &&
        Objects.equals(this.timestamp, error.timestamp) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.errors, error.errors);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(status, timestamp, message, errors);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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



