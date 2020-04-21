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
 * 流量趋势
 */
@ApiModel(description = "流量趋势")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public class FlowTrendVO   {
  @JsonProperty("time")
  private String time = null;

  @JsonProperty("value")
  private Integer value = null;

  public FlowTrendVO time(String time) {
    this.time = time;
    return this;
  }

  /**
   * 时间
   * @return time
  **/
  @ApiModelProperty(value = "时间")


  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public FlowTrendVO value(Integer value) {
    this.value = value;
    return this;
  }

  /**
   * 值
   * @return value
  **/
  @ApiModelProperty(value = "值")


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
    FlowTrendVO flowTrendVO = (FlowTrendVO) o;
    return Objects.equals(this.time, flowTrendVO.time) &&
        Objects.equals(this.value, flowTrendVO.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowTrendVO {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

