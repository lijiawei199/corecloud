/*
 * corecloud API?
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * StroeDateVo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-04-20T10:14:08.259+08:00")
public class StroeDateVo   {
  @JsonProperty("low")
  private List<String> low = null;

  @JsonProperty("middle")
  private List<String> middle = null;

  @JsonProperty("high")
  private List<String> high = null;

  public StroeDateVo low(List<String> low) {
    this.low = low;
    return this;
  }

  public StroeDateVo addLowItem(String lowItem) {
    if (this.low == null) {
      this.low = new ArrayList<String>();
    }
    this.low.add(lowItem);
    return this;
  }

  /**
   * Get low
   * @return low
   **/
  @JsonProperty("low")
  @ApiModelProperty(value = "")
  public List<String> getLow() {
    return low;
  }

  public void setLow(List<String> low) {
    this.low = low;
  }

  public StroeDateVo middle(List<String> middle) {
    this.middle = middle;
    return this;
  }

  public StroeDateVo addMiddleItem(String middleItem) {
    if (this.middle == null) {
      this.middle = new ArrayList<String>();
    }
    this.middle.add(middleItem);
    return this;
  }

  /**
   * Get middle
   * @return middle
   **/
  @JsonProperty("middle")
  @ApiModelProperty(value = "")
  public List<String> getMiddle() {
    return middle;
  }

  public void setMiddle(List<String> middle) {
    this.middle = middle;
  }

  public StroeDateVo high(List<String> high) {
    this.high = high;
    return this;
  }

  public StroeDateVo addHighItem(String highItem) {
    if (this.high == null) {
      this.high = new ArrayList<String>();
    }
    this.high.add(highItem);
    return this;
  }

  /**
   * Get high
   * @return high
   **/
  @JsonProperty("high")
  @ApiModelProperty(value = "")
  public List<String> getHigh() {
    return high;
  }

  public void setHigh(List<String> high) {
    this.high = high;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StroeDateVo stroeDateVo = (StroeDateVo) o;
    return Objects.equals(this.low, stroeDateVo.low) &&
        Objects.equals(this.middle, stroeDateVo.middle) &&
        Objects.equals(this.high, stroeDateVo.high);
  }

  @Override
  public int hashCode() {
    return Objects.hash(low, middle, high);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StroeDateVo {\n");
    
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    middle: ").append(toIndentedString(middle)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
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

