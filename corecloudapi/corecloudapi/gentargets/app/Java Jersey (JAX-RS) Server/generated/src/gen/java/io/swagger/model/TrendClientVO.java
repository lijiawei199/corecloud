/*
 * corecloud API?
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * 店铺意向客户
 */
@ApiModel(description = "店铺意向客户")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-04-20T10:14:08.259+08:00")
public class TrendClientVO   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tel")
  private String tel = null;

  @JsonProperty("picname")
  private String picname = null;

  @JsonProperty("offer")
  private Integer offer = null;

  public TrendClientVO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @JsonProperty("name")
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TrendClientVO tel(String tel) {
    this.tel = tel;
    return this;
  }

  /**
   * Get tel
   * @return tel
   **/
  @JsonProperty("tel")
  @ApiModelProperty(value = "")
  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public TrendClientVO picname(String picname) {
    this.picname = picname;
    return this;
  }

  /**
   * 负责人姓名
   * @return picname
   **/
  @JsonProperty("picname")
  @ApiModelProperty(value = "负责人姓名")
  public String getPicname() {
    return picname;
  }

  public void setPicname(String picname) {
    this.picname = picname;
  }

  public TrendClientVO offer(Integer offer) {
    this.offer = offer;
    return this;
  }

  /**
   * 客户报价
   * @return offer
   **/
  @JsonProperty("offer")
  @ApiModelProperty(value = "客户报价")
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
    TrendClientVO trendClientVO = (TrendClientVO) o;
    return Objects.equals(this.name, trendClientVO.name) &&
        Objects.equals(this.tel, trendClientVO.tel) &&
        Objects.equals(this.picname, trendClientVO.picname) &&
        Objects.equals(this.offer, trendClientVO.offer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, tel, picname, offer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendClientVO {\n");
    
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

