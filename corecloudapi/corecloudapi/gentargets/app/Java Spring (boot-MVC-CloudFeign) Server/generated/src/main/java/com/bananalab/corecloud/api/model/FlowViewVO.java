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
 * 流量总览上半区
 */
@ApiModel(description = "流量总览上半区")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public class FlowViewVO   {
  @JsonProperty("totalflow")
  private Integer totalflow = null;

  @JsonProperty("yestflow")
  private Integer yestflow = null;

  @JsonProperty("usedstore")
  private Integer usedstore = null;

  @JsonProperty("totalstore")
  private Integer totalstore = null;

  @JsonProperty("totalarea")
  private Integer totalarea = null;

  @JsonProperty("usedarea")
  private Integer usedarea = null;

  @JsonProperty("power")
  private Integer power = null;

  @JsonProperty("yestpower")
  private Integer yestpower = null;

  public FlowViewVO totalflow(Integer totalflow) {
    this.totalflow = totalflow;
    return this;
  }

  /**
   * 今日总客流量
   * @return totalflow
  **/
  @ApiModelProperty(value = "今日总客流量")


  public Integer getTotalflow() {
    return totalflow;
  }

  public void setTotalflow(Integer totalflow) {
    this.totalflow = totalflow;
  }

  public FlowViewVO yestflow(Integer yestflow) {
    this.yestflow = yestflow;
    return this;
  }

  /**
   * 昨日总客流量
   * @return yestflow
  **/
  @ApiModelProperty(value = "昨日总客流量")


  public Integer getYestflow() {
    return yestflow;
  }

  public void setYestflow(Integer yestflow) {
    this.yestflow = yestflow;
  }

  public FlowViewVO usedstore(Integer usedstore) {
    this.usedstore = usedstore;
    return this;
  }

  /**
   * 已入驻商户数量
   * @return usedstore
  **/
  @ApiModelProperty(value = "已入驻商户数量")


  public Integer getUsedstore() {
    return usedstore;
  }

  public void setUsedstore(Integer usedstore) {
    this.usedstore = usedstore;
  }

  public FlowViewVO totalstore(Integer totalstore) {
    this.totalstore = totalstore;
    return this;
  }

  /**
   * 总商户数量
   * @return totalstore
  **/
  @ApiModelProperty(value = "总商户数量")


  public Integer getTotalstore() {
    return totalstore;
  }

  public void setTotalstore(Integer totalstore) {
    this.totalstore = totalstore;
  }

  public FlowViewVO totalarea(Integer totalarea) {
    this.totalarea = totalarea;
    return this;
  }

  /**
   * 使用面积
   * @return totalarea
  **/
  @ApiModelProperty(value = "使用面积")


  public Integer getTotalarea() {
    return totalarea;
  }

  public void setTotalarea(Integer totalarea) {
    this.totalarea = totalarea;
  }

  public FlowViewVO usedarea(Integer usedarea) {
    this.usedarea = usedarea;
    return this;
  }

  /**
   * 总面积
   * @return usedarea
  **/
  @ApiModelProperty(value = "总面积")


  public Integer getUsedarea() {
    return usedarea;
  }

  public void setUsedarea(Integer usedarea) {
    this.usedarea = usedarea;
  }

  public FlowViewVO power(Integer power) {
    this.power = power;
    return this;
  }

  /**
   * 今日集客力
   * @return power
  **/
  @ApiModelProperty(value = "今日集客力")


  public Integer getPower() {
    return power;
  }

  public void setPower(Integer power) {
    this.power = power;
  }

  public FlowViewVO yestpower(Integer yestpower) {
    this.yestpower = yestpower;
    return this;
  }

  /**
   * 昨日集客力
   * @return yestpower
  **/
  @ApiModelProperty(value = "昨日集客力")


  public Integer getYestpower() {
    return yestpower;
  }

  public void setYestpower(Integer yestpower) {
    this.yestpower = yestpower;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowViewVO flowViewVO = (FlowViewVO) o;
    return Objects.equals(this.totalflow, flowViewVO.totalflow) &&
        Objects.equals(this.yestflow, flowViewVO.yestflow) &&
        Objects.equals(this.usedstore, flowViewVO.usedstore) &&
        Objects.equals(this.totalstore, flowViewVO.totalstore) &&
        Objects.equals(this.totalarea, flowViewVO.totalarea) &&
        Objects.equals(this.usedarea, flowViewVO.usedarea) &&
        Objects.equals(this.power, flowViewVO.power) &&
        Objects.equals(this.yestpower, flowViewVO.yestpower);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalflow, yestflow, usedstore, totalstore, totalarea, usedarea, power, yestpower);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowViewVO {\n");
    
    sb.append("    totalflow: ").append(toIndentedString(totalflow)).append("\n");
    sb.append("    yestflow: ").append(toIndentedString(yestflow)).append("\n");
    sb.append("    usedstore: ").append(toIndentedString(usedstore)).append("\n");
    sb.append("    totalstore: ").append(toIndentedString(totalstore)).append("\n");
    sb.append("    totalarea: ").append(toIndentedString(totalarea)).append("\n");
    sb.append("    usedarea: ").append(toIndentedString(usedarea)).append("\n");
    sb.append("    power: ").append(toIndentedString(power)).append("\n");
    sb.append("    yestpower: ").append(toIndentedString(yestpower)).append("\n");
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

