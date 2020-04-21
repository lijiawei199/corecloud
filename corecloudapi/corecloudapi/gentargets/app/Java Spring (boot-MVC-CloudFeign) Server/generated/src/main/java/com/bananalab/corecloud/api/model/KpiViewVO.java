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
 * 经营kpi概览
 */
@ApiModel(description = "经营kpi概览")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public class KpiViewVO   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("this")
  private String _this = null;

  @JsonProperty("last")
  private String last = null;

  @JsonProperty("thanlast")
  private Integer thanlast = null;

  public KpiViewVO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public KpiViewVO _this(String _this) {
    this._this = _this;
    return this;
  }

  /**
   * 当前时间段kpi
   * @return _this
  **/
  @ApiModelProperty(value = "当前时间段kpi")


  public String getThis() {
    return _this;
  }

  public void setThis(String _this) {
    this._this = _this;
  }

  public KpiViewVO last(String last) {
    this.last = last;
    return this;
  }

  /**
   * 上次时间段kpi
   * @return last
  **/
  @ApiModelProperty(value = "上次时间段kpi")


  public String getLast() {
    return last;
  }

  public void setLast(String last) {
    this.last = last;
  }

  public KpiViewVO thanlast(Integer thanlast) {
    this.thanlast = thanlast;
    return this;
  }

  /**
   * 较上次变化
   * @return thanlast
  **/
  @ApiModelProperty(value = "较上次变化")


  public Integer getThanlast() {
    return thanlast;
  }

  public void setThanlast(Integer thanlast) {
    this.thanlast = thanlast;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KpiViewVO kpiViewVO = (KpiViewVO) o;
    return Objects.equals(this.name, kpiViewVO.name) &&
        Objects.equals(this._this, kpiViewVO._this) &&
        Objects.equals(this.last, kpiViewVO.last) &&
        Objects.equals(this.thanlast, kpiViewVO.thanlast);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, _this, last, thanlast);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KpiViewVO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _this: ").append(toIndentedString(_this)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    thanlast: ").append(toIndentedString(thanlast)).append("\n");
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

