package com.bananalab.corecloud.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HotchartData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public class HotchartData   {
  @JsonProperty("x")
  private Integer x = null;

  @JsonProperty("y")
  private Integer y = null;

  @JsonProperty("value")
  private Integer value = null;

  public HotchartData x(Integer x) {
    this.x = x;
    return this;
  }

  /**
   * Get x
   * @return x
  **/
  @ApiModelProperty(value = "")


  public Integer getX() {
    return x;
  }

  public void setX(Integer x) {
    this.x = x;
  }

  public HotchartData y(Integer y) {
    this.y = y;
    return this;
  }

  /**
   * Get y
   * @return y
  **/
  @ApiModelProperty(value = "")


  public Integer getY() {
    return y;
  }

  public void setY(Integer y) {
    this.y = y;
  }

  public HotchartData value(Integer value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")


  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotchartData hotchartData = (HotchartData) o;
    return Objects.equals(this.x, hotchartData.x) &&
        Objects.equals(this.y, hotchartData.y) &&
        Objects.equals(this.value, hotchartData.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotchartData {\n");
    
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

