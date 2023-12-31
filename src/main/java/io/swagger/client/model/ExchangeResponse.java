/*
 * kabuステーションAPI
 * # 定義情報   REST APIのコード一覧、エンドポイントは下記リンク参照     - [REST APIコード一覧](../ptal/error.html)
 *
 * OpenAPI spec version: 1.5
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ExchangeResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-30T15:08:23.587764301Z[GMT]")

public class ExchangeResponse {
  @SerializedName("Symbol")
  private String symbol = null;

  @SerializedName("BidPrice")
  private Double bidPrice = null;

  @SerializedName("Spread")
  private Double spread = null;

  @SerializedName("AskPrice")
  private Double askPrice = null;

  @SerializedName("Change")
  private Double change = null;

  @SerializedName("Time")
  private String time = null;

  public ExchangeResponse symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * 通貨
   * @return symbol
  **/
  @Schema(description = "通貨")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public ExchangeResponse bidPrice(Double bidPrice) {
    this.bidPrice = bidPrice;
    return this;
  }

   /**
   * BID
   * @return bidPrice
  **/
  @Schema(description = "BID")
  public Double getBidPrice() {
    return bidPrice;
  }

  public void setBidPrice(Double bidPrice) {
    this.bidPrice = bidPrice;
  }

  public ExchangeResponse spread(Double spread) {
    this.spread = spread;
    return this;
  }

   /**
   * SP
   * @return spread
  **/
  @Schema(description = "SP")
  public Double getSpread() {
    return spread;
  }

  public void setSpread(Double spread) {
    this.spread = spread;
  }

  public ExchangeResponse askPrice(Double askPrice) {
    this.askPrice = askPrice;
    return this;
  }

   /**
   * ASK
   * @return askPrice
  **/
  @Schema(description = "ASK")
  public Double getAskPrice() {
    return askPrice;
  }

  public void setAskPrice(Double askPrice) {
    this.askPrice = askPrice;
  }

  public ExchangeResponse change(Double change) {
    this.change = change;
    return this;
  }

   /**
   * 前日比
   * @return change
  **/
  @Schema(description = "前日比")
  public Double getChange() {
    return change;
  }

  public void setChange(Double change) {
    this.change = change;
  }

  public ExchangeResponse time(String time) {
    this.time = time;
    return this;
  }

   /**
   * 時刻 &lt;br&gt;※HH:mm:ss形式
   * @return time
  **/
  @Schema(description = "時刻 <br>※HH:mm:ss形式")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeResponse exchangeResponse = (ExchangeResponse) o;
    return Objects.equals(this.symbol, exchangeResponse.symbol) &&
        Objects.equals(this.bidPrice, exchangeResponse.bidPrice) &&
        Objects.equals(this.spread, exchangeResponse.spread) &&
        Objects.equals(this.askPrice, exchangeResponse.askPrice) &&
        Objects.equals(this.change, exchangeResponse.change) &&
        Objects.equals(this.time, exchangeResponse.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, bidPrice, spread, askPrice, change, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeResponse {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    bidPrice: ").append(toIndentedString(bidPrice)).append("\n");
    sb.append("    spread: ").append(toIndentedString(spread)).append("\n");
    sb.append("    askPrice: ").append(toIndentedString(askPrice)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
