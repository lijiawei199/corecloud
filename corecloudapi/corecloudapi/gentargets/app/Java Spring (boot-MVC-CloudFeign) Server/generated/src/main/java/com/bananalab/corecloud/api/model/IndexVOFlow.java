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
 * IndexVOFlow
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public class IndexVOFlow   {
  @JsonProperty("sameMonth")
  private Integer sameMonth = null;

  @JsonProperty("lastMonth")
  private Integer lastMonth = null;

  @JsonProperty("lastyear")
  private Integer lastyear = null;

  @JsonProperty("monthCompare")
  private String monthCompare = null;

  @JsonProperty("yearCompare")
  private String yearCompare = null;

  public IndexVOFlow sameMonth(Integer sameMonth) {
    this.sameMonth = sameMonth;
    return this;
  }

  /**
   * Get sameMonth
   * @return sameMonth
  **/
  @ApiModelProperty(value = "")


  public Integer getSameMonth() {
    return sameMonth;
  }

  public void setSameMonth(Integer sameMonth) {
    this.sameMonth = sameMonth;
  }

  public IndexVOFlow lastMonth(Integer lastMonth) {
    this.lastMonth = lastMonth;
    return this;
  }

  /**
   * Get lastMonth
   * @return lastMonth
  **/
  @ApiModelProperty(value = "")


  public Integer getLastMonth() {
    return lastMonth;
  }

  public void setLastMonth(Integer lastMonth) {
    this.lastMonth = lastMonth;
  }

  public IndexVOFlow lastyear(Integer lastyear) {
    this.lastyear = lastyear;
    return this;
  }

  /**
   * Get lastyear
   * @return lastyear
  **/
  @ApiModelProperty(value = "")


  public Integer getLastyear() {
    return lastyear;
  }

  public void setLastyear(Integer lastyear) {
    this.lastyear = lastyear;
  }

  public IndexVOFlow monthCompare(String monthCompare) {
    this.monthCompare = monthCompare;
    return this;
  }

  /**
   * Get monthCompare
   * @return monthCompare
  **/
  @ApiModelProperty(value = "")


  public String getMonthCompare() {
    return monthCompare;
  }

  public void setMonthCompare(String monthCompare) {
    this.monthCompare = monthCompare;
  }

  public IndexVOFlow yearCompare(String yearCompare) {
    this.yearCompare = yearCompare;
    return this;
  }

  /**
   * Get yearCompare
   * @return yearCompare
  **/
  @ApiModelProperty(value = "")


  public String getYearCompare() {
    return yearCompare;
  }

  public void setYearCompare(String yearCompare) {
    this.yearCompare = yearCompare;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexVOFlow indexVOFlow = (IndexVOFlow) o;
    return Objects.equals(this.sameMonth, indexVOFlow.sameMonth) &&
        Objects.equals(this.lastMonth, indexVOFlow.lastMonth) &&
        Objects.equals(this.lastyear, indexVOFlow.lastyear) &&
        Objects.equals(this.monthCompare, indexVOFlow.monthCompare) &&
        Objects.equals(this.yearCompare, indexVOFlow.yearCompare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sameMonth, lastMonth, lastyear, monthCompare, yearCompare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexVOFlow {\n");
    
    sb.append("    sameMonth: ").append(toIndentedString(sameMonth)).append("\n");
    sb.append("    lastMonth: ").append(toIndentedString(lastMonth)).append("\n");
    sb.append("    lastyear: ").append(toIndentedString(lastyear)).append("\n");
    sb.append("    monthCompare: ").append(toIndentedString(monthCompare)).append("\n");
    sb.append("    yearCompare: ").append(toIndentedString(yearCompare)).append("\n");
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

