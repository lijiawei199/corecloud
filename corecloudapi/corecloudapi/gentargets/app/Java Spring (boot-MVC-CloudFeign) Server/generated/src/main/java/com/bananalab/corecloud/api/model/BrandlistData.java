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
 * BrandlistData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public class BrandlistData   {
  @JsonProperty("brand")
  private String brand = null;

  @JsonProperty("picurl")
  private String picurl = null;

  public BrandlistData brand(String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Get brand
   * @return brand
  **/
  @ApiModelProperty(value = "")


  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public BrandlistData picurl(String picurl) {
    this.picurl = picurl;
    return this;
  }

  /**
   * Get picurl
   * @return picurl
  **/
  @ApiModelProperty(value = "")


  public String getPicurl() {
    return picurl;
  }

  public void setPicurl(String picurl) {
    this.picurl = picurl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandlistData brandlistData = (BrandlistData) o;
    return Objects.equals(this.brand, brandlistData.brand) &&
        Objects.equals(this.picurl, brandlistData.picurl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, picurl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandlistData {\n");
    
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    picurl: ").append(toIndentedString(picurl)).append("\n");
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

