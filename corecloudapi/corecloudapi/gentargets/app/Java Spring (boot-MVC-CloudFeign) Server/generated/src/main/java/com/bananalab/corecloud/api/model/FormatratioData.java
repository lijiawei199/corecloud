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
 * FormatratioData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public class FormatratioData   {
  @JsonProperty("catname")
  private String catname = null;

  @JsonProperty("tatio")
  private Integer tatio = null;

  public FormatratioData catname(String catname) {
    this.catname = catname;
    return this;
  }

  /**
   * Get catname
   * @return catname
  **/
  @ApiModelProperty(value = "")


  public String getCatname() {
    return catname;
  }

  public void setCatname(String catname) {
    this.catname = catname;
  }

  public FormatratioData tatio(Integer tatio) {
    this.tatio = tatio;
    return this;
  }

  /**
   * Get tatio
   * @return tatio
  **/
  @ApiModelProperty(value = "")


  public Integer getTatio() {
    return tatio;
  }

  public void setTatio(Integer tatio) {
    this.tatio = tatio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormatratioData formatratioData = (FormatratioData) o;
    return Objects.equals(this.catname, formatratioData.catname) &&
        Objects.equals(this.tatio, formatratioData.tatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catname, tatio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormatratioData {\n");
    
    sb.append("    catname: ").append(toIndentedString(catname)).append("\n");
    sb.append("    tatio: ").append(toIndentedString(tatio)).append("\n");
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

