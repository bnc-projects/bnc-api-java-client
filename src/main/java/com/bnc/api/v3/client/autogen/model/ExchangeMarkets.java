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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;

/**
 * ExchangeMarkets
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-17T11:47:51.512+12:00[Pacific/Auckland]")
public class ExchangeMarkets {

  
  @JsonProperty("marketId")
  private UUID marketId = null;
  
  /**
   * The status of the market on the exchange
   */
  public enum MarketStatusEnum {
    
    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE");

    private String value;

    MarketStatusEnum(String value) {
      this.value = value;
    }
    
    @JsonValue
    
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    @JsonCreator
    
    public static MarketStatusEnum fromValue(String text) {
      for (MarketStatusEnum b : MarketStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    
  }
  
  
  @JsonProperty("marketStatus")
  private MarketStatusEnum marketStatus = null;
  
  public ExchangeMarkets marketId(UUID marketId) {
    this.marketId = marketId;
    return this;
  }

  
  /**
  * The market id
  * @return marketId
  **/
  
  
  @Schema(description = "The market id")
  public UUID getMarketId() {
    return marketId;
  }
  public void setMarketId(UUID marketId) {
    this.marketId = marketId;
  }
  
  public ExchangeMarkets marketStatus(MarketStatusEnum marketStatus) {
    this.marketStatus = marketStatus;
    return this;
  }

  
  /**
  * The status of the market on the exchange
  * @return marketStatus
  **/
  
  
  @Schema(description = "The status of the market on the exchange")
  public MarketStatusEnum getMarketStatus() {
    return marketStatus;
  }
  public void setMarketStatus(MarketStatusEnum marketStatus) {
    this.marketStatus = marketStatus;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeMarkets exchangeMarkets = (ExchangeMarkets) o;
    return Objects.equals(this.marketId, exchangeMarkets.marketId) &&
        Objects.equals(this.marketStatus, exchangeMarkets.marketStatus);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(marketId, marketStatus);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeMarkets {\n");
    
    sb.append("    marketId: ").append(toIndentedString(marketId)).append("\n");
    sb.append("    marketStatus: ").append(toIndentedString(marketStatus)).append("\n");
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



