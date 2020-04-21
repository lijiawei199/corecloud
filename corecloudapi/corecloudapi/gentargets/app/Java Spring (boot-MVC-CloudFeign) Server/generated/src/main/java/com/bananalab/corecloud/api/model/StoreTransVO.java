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
 * 店铺转化率VO
 */
@ApiModel(description = "店铺转化率VO")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public class StoreTransVO   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("flow")
  private Integer flow = null;

  @JsonProperty("salevolume")
  private Integer salevolume = null;

  @JsonProperty("rate")
  private Integer rate = null;

  @JsonProperty("fid")
  private String fid = null;

  @JsonProperty("floor")
  private Integer floor = null;

  @JsonProperty("pic_url")
  private String picUrl = null;

  public StoreTransVO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 店铺名
   * @return name
  **/
  @ApiModelProperty(value = "店铺名")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StoreTransVO flow(Integer flow) {
    this.flow = flow;
    return this;
  }

  /**
   * 流量
   * @return flow
  **/
  @ApiModelProperty(value = "流量")


  public Integer getFlow() {
    return flow;
  }

  public void setFlow(Integer flow) {
    this.flow = flow;
  }

  public StoreTransVO salevolume(Integer salevolume) {
    this.salevolume = salevolume;
    return this;
  }

  /**
   * 销售额
   * @return salevolume
  **/
  @ApiModelProperty(value = "销售额")


  public Integer getSalevolume() {
    return salevolume;
  }

  public void setSalevolume(Integer salevolume) {
    this.salevolume = salevolume;
  }

  public StoreTransVO rate(Integer rate) {
    this.rate = rate;
    return this;
  }

  /**
   * 转化率
   * @return rate
  **/
  @ApiModelProperty(value = "转化率")


  public Integer getRate() {
    return rate;
  }

  public void setRate(Integer rate) {
    this.rate = rate;
  }

  public StoreTransVO fid(String fid) {
    this.fid = fid;
    return this;
  }

  /**
   * fid
   * @return fid
  **/
  @ApiModelProperty(value = "fid")


  public String getFid() {
    return fid;
  }

  public void setFid(String fid) {
    this.fid = fid;
  }

  public StoreTransVO floor(Integer floor) {
    this.floor = floor;
    return this;
  }

  /**
   * 楼层
   * @return floor
  **/
  @ApiModelProperty(value = "楼层")


  public Integer getFloor() {
    return floor;
  }

  public void setFloor(Integer floor) {
    this.floor = floor;
  }

  public StoreTransVO picUrl(String picUrl) {
    this.picUrl = picUrl;
    return this;
  }

  /**
   * 图片地址
   * @return picUrl
  **/
  @ApiModelProperty(value = "图片地址")


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
    StoreTransVO storeTransVO = (StoreTransVO) o;
    return Objects.equals(this.name, storeTransVO.name) &&
        Objects.equals(this.flow, storeTransVO.flow) &&
        Objects.equals(this.salevolume, storeTransVO.salevolume) &&
        Objects.equals(this.rate, storeTransVO.rate) &&
        Objects.equals(this.fid, storeTransVO.fid) &&
        Objects.equals(this.floor, storeTransVO.floor) &&
        Objects.equals(this.picUrl, storeTransVO.picUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, flow, salevolume, rate, fid, floor, picUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreTransVO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    salevolume: ").append(toIndentedString(salevolume)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    fid: ").append(toIndentedString(fid)).append("\n");
    sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
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

