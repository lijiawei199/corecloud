package com.bananalab.corecloud.api.model;

import java.util.Objects;
import com.bananalab.corecloud.api.model.KpiTrendVOInnerTrendlist;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * KpiTrendVOInner
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public class KpiTrendVOInner   {
  @JsonProperty("name")
  private Integer name = null;

  @JsonProperty("trendlist")
  private KpiTrendVOInnerTrendlist trendlist = null;

  public KpiTrendVOInner name(Integer name) {
    this.name = name;
    return this;
  }

  /**
   * 0 1 2 3 (客流量|平均集客力|销售额|平均坪效)
   * @return name
  **/
  @ApiModelProperty(value = "0 1 2 3 (客流量|平均集客力|销售额|平均坪效)")


  public Integer getName() {
    return name;
  }

  public void setName(Integer name) {
    this.name = name;
  }

  public KpiTrendVOInner trendlist(KpiTrendVOInnerTrendlist trendlist) {
    this.trendlist = trendlist;
    return this;
  }

  /**
   * Get trendlist
   * @return trendlist
  **/
  @ApiModelProperty(value = "")

  @Valid

  public KpiTrendVOInnerTrendlist getTrendlist() {
    return trendlist;
  }

  public void setTrendlist(KpiTrendVOInnerTrendlist trendlist) {
    this.trendlist = trendlist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KpiTrendVOInner kpiTrendVOInner = (KpiTrendVOInner) o;
    return Objects.equals(this.name, kpiTrendVOInner.name) &&
        Objects.equals(this.trendlist, kpiTrendVOInner.trendlist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, trendlist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KpiTrendVOInner {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    trendlist: ").append(toIndentedString(trendlist)).append("\n");
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

