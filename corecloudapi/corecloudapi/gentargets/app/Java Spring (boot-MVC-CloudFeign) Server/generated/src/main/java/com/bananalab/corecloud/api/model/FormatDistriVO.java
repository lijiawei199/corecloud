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
 * FormatDistriVO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public class FormatDistriVO   {
  @JsonProperty("brands")
  private String brands = null;

  @JsonProperty("amount")
  private Integer amount = null;

  @JsonProperty("picUrl")
  private String picUrl = null;

  public FormatDistriVO brands(String brands) {
    this.brands = brands;
    return this;
  }

  /**
   * 品牌
   * @return brands
  **/
  @ApiModelProperty(value = "品牌")


  public String getBrands() {
    return brands;
  }

  public void setBrands(String brands) {
    this.brands = brands;
  }

  public FormatDistriVO amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * 数量
   * @return amount
  **/
  @ApiModelProperty(value = "数量")


  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public FormatDistriVO picUrl(String picUrl) {
    this.picUrl = picUrl;
    return this;
  }

  /**
   * Get picUrl
   * @return picUrl
  **/
  @ApiModelProperty(value = "")


  public String getPicUrl() {
    return picUrl;
  }

  public void setPicUrl(String picUrl) {
    this.picUrl = picUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormatDistriVO formatDistriVO = (FormatDistriVO) o;
    return Objects.equals(this.brands, formatDistriVO.brands) &&
        Objects.equals(this.amount, formatDistriVO.amount) &&
        Objects.equals(this.picUrl, formatDistriVO.picUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brands, amount, picUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormatDistriVO {\n");
    
    sb.append("    brands: ").append(toIndentedString(brands)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    picUrl: ").append(toIndentedString(picUrl)).append("\n");
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

