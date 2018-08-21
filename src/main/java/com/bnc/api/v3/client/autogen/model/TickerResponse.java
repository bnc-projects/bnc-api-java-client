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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * TickerResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-17T11:47:51.512+12:00[Pacific/Auckland]")
public class TickerResponse {

  
  @JsonProperty("content")
  private List<Tick> content = null;
  
  
  @JsonProperty("nextId")
  private UUID nextId = null;
  
  public TickerResponse content(List<Tick> content) {
    this.content = content;
    return this;
  }

  public TickerResponse addContentItem(Tick contentItem) {
    
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    
    this.content.add(contentItem);
    return this;
  }
  
  /**
  * Get content
  * @return content
  **/
  
  
  @Schema(description = "")
  public List<Tick> getContent() {
    return content;
  }
  public void setContent(List<Tick> content) {
    this.content = content;
  }
  
  public TickerResponse nextId(UUID nextId) {
    this.nextId = nextId;
    return this;
  }

  
  /**
  * The next id which can be used for pagination
  * @return nextId
  **/
  
  
  @Schema(description = "The next id which can be used for pagination")
  public UUID getNextId() {
    return nextId;
  }
  public void setNextId(UUID nextId) {
    this.nextId = nextId;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TickerResponse tickerResponse = (TickerResponse) o;
    return Objects.equals(this.content, tickerResponse.content) &&
        Objects.equals(this.nextId, tickerResponse.nextId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(content, nextId);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TickerResponse {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    nextId: ").append(toIndentedString(nextId)).append("\n");
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



