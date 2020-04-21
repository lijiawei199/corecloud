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
 * PotCustVO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public class PotCustVO   {
  @JsonProperty("brand")
  private String brand = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tel")
  private String tel = null;

  @JsonProperty("picname")
  private String picname = null;

  @JsonProperty("offer")
  private Integer offer = null;

  public PotCustVO brand(String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * 品牌名
   * @return brand
  **/
  @ApiModelProperty(value = "品牌名")


  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public PotCustVO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 客户姓名
   * @return name
  **/
  @ApiModelProperty(value = "客户姓名")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PotCustVO tel(String tel) {
    this.tel = tel;
    return this;
  }

  /**
   * 客户电话
   * @return tel
  **/
  @ApiModelProperty(value = "客户电话")


  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public PotCustVO picname(String picname) {
    this.picname = picname;
    return this;
  }

  /**
   * 负责人
   * @return picname
  **/
  @ApiModelProperty(value = "负责人")


  public String getPicname() {
    return picname;
  }

  public void setPicname(String picname) {
    this.picname = picname;
  }

  public PotCustVO offer(Integer offer) {
    this.offer = offer;
    return this;
  }

  /**
   * 报价
   * @return offer
  **/
  @ApiModelProperty(value = "报价")


  public Integer getOffer() {
    return offer;
  }

  public void setOffer(Integer offer) {
    this.offer = offer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PotCustVO potCustVO = (PotCustVO) o;
    return Objects.equals(this.brand, potCustVO.brand) &&
        Objects.equals(this.name, potCustVO.name) &&
        Objects.equals(this.tel, potCustVO.tel) &&
        Objects.equals(this.picname, potCustVO.picname) &&
        Objects.equals(this.offer, potCustVO.offer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, name, tel, picname, offer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PotCustVO {\n");
    
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tel: ").append(toIndentedString(tel)).append("\n");
    sb.append("    picname: ").append(toIndentedString(picname)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
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

