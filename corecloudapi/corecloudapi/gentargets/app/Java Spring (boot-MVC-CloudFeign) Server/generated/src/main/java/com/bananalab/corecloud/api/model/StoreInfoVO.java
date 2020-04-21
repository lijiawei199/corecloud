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
 * StoreInfoVO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public class StoreInfoVO   {
  @JsonProperty("status")
  private String status = null;

  @JsonProperty("marketNum")
  private String marketNum = null;

  @JsonProperty("fid")
  private String fid = null;

  @JsonProperty("tenantName")
  private String tenantName = null;

  @JsonProperty("tenantTel")
  private String tenantTel = null;

  @JsonProperty("busyCat")
  private String busyCat = null;

  @JsonProperty("brand")
  private String brand = null;

  @JsonProperty("monthRent")
  private Integer monthRent = null;

  @JsonProperty("frontMoney")
  private Integer frontMoney = null;

  @JsonProperty("contractNum")
  private String contractNum = null;

  @JsonProperty("usableArea")
  private String usableArea = null;

  @JsonProperty("spec")
  private String spec = null;

  @JsonProperty("totalArea")
  private String totalArea = null;

  @JsonProperty("picName")
  private String picName = null;

  @JsonProperty("picTel")
  private String picTel = null;

  @JsonProperty("leaseTime")
  private String leaseTime = null;

  @JsonProperty("picUrl")
  private String picUrl = null;

  @JsonProperty("buildUrl")
  private String buildUrl = null;

  @JsonProperty("length")
  private String length = null;

  @JsonProperty("width")
  private String width = null;

  @JsonProperty("height")
  private String height = null;

  @JsonProperty("deadline")
  private String deadline = null;

  public StoreInfoVO status(String status) {
    this.status = status;
    return this;
  }

  /**
   * 店铺状态
   * @return status
  **/
  @ApiModelProperty(value = "店铺状态")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public StoreInfoVO marketNum(String marketNum) {
    this.marketNum = marketNum;
    return this;
  }

  /**
   * 商场编号
   * @return marketNum
  **/
  @ApiModelProperty(value = "商场编号")


  public String getMarketNum() {
    return marketNum;
  }

  public void setMarketNum(String marketNum) {
    this.marketNum = marketNum;
  }

  public StoreInfoVO fid(String fid) {
    this.fid = fid;
    return this;
  }

  /**
   * 地图编号
   * @return fid
  **/
  @ApiModelProperty(value = "地图编号")


  public String getFid() {
    return fid;
  }

  public void setFid(String fid) {
    this.fid = fid;
  }

  public StoreInfoVO tenantName(String tenantName) {
    this.tenantName = tenantName;
    return this;
  }

  /**
   * 租户名字
   * @return tenantName
  **/
  @ApiModelProperty(value = "租户名字")


  public String getTenantName() {
    return tenantName;
  }

  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  public StoreInfoVO tenantTel(String tenantTel) {
    this.tenantTel = tenantTel;
    return this;
  }

  /**
   * 租户电话
   * @return tenantTel
  **/
  @ApiModelProperty(value = "租户电话")


  public String getTenantTel() {
    return tenantTel;
  }

  public void setTenantTel(String tenantTel) {
    this.tenantTel = tenantTel;
  }

  public StoreInfoVO busyCat(String busyCat) {
    this.busyCat = busyCat;
    return this;
  }

  /**
   * 经营类目
   * @return busyCat
  **/
  @ApiModelProperty(value = "经营类目")


  public String getBusyCat() {
    return busyCat;
  }

  public void setBusyCat(String busyCat) {
    this.busyCat = busyCat;
  }

  public StoreInfoVO brand(String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * 品牌
   * @return brand
  **/
  @ApiModelProperty(value = "品牌")


  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public StoreInfoVO monthRent(Integer monthRent) {
    this.monthRent = monthRent;
    return this;
  }

  /**
   * 月租
   * @return monthRent
  **/
  @ApiModelProperty(value = "月租")


  public Integer getMonthRent() {
    return monthRent;
  }

  public void setMonthRent(Integer monthRent) {
    this.monthRent = monthRent;
  }

  public StoreInfoVO frontMoney(Integer frontMoney) {
    this.frontMoney = frontMoney;
    return this;
  }

  /**
   * 定金
   * @return frontMoney
  **/
  @ApiModelProperty(value = "定金")


  public Integer getFrontMoney() {
    return frontMoney;
  }

  public void setFrontMoney(Integer frontMoney) {
    this.frontMoney = frontMoney;
  }

  public StoreInfoVO contractNum(String contractNum) {
    this.contractNum = contractNum;
    return this;
  }

  /**
   * 合同编号
   * @return contractNum
  **/
  @ApiModelProperty(value = "合同编号")


  public String getContractNum() {
    return contractNum;
  }

  public void setContractNum(String contractNum) {
    this.contractNum = contractNum;
  }

  public StoreInfoVO usableArea(String usableArea) {
    this.usableArea = usableArea;
    return this;
  }

  /**
   * 可用面积
   * @return usableArea
  **/
  @ApiModelProperty(value = "可用面积")


  public String getUsableArea() {
    return usableArea;
  }

  public void setUsableArea(String usableArea) {
    this.usableArea = usableArea;
  }

  public StoreInfoVO spec(String spec) {
    this.spec = spec;
    return this;
  }

  /**
   * 规格（长X宽X高）
   * @return spec
  **/
  @ApiModelProperty(value = "规格（长X宽X高）")


  public String getSpec() {
    return spec;
  }

  public void setSpec(String spec) {
    this.spec = spec;
  }

  public StoreInfoVO totalArea(String totalArea) {
    this.totalArea = totalArea;
    return this;
  }

  /**
   * 总面积
   * @return totalArea
  **/
  @ApiModelProperty(value = "总面积")


  public String getTotalArea() {
    return totalArea;
  }

  public void setTotalArea(String totalArea) {
    this.totalArea = totalArea;
  }

  public StoreInfoVO picName(String picName) {
    this.picName = picName;
    return this;
  }

  /**
   * 负责人
   * @return picName
  **/
  @ApiModelProperty(value = "负责人")


  public String getPicName() {
    return picName;
  }

  public void setPicName(String picName) {
    this.picName = picName;
  }

  public StoreInfoVO picTel(String picTel) {
    this.picTel = picTel;
    return this;
  }

  /**
   * 负责人电话
   * @return picTel
  **/
  @ApiModelProperty(value = "负责人电话")


  public String getPicTel() {
    return picTel;
  }

  public void setPicTel(String picTel) {
    this.picTel = picTel;
  }

  public StoreInfoVO leaseTime(String leaseTime) {
    this.leaseTime = leaseTime;
    return this;
  }

  /**
   * 日期
   * @return leaseTime
  **/
  @ApiModelProperty(value = "日期")


  public String getLeaseTime() {
    return leaseTime;
  }

  public void setLeaseTime(String leaseTime) {
    this.leaseTime = leaseTime;
  }

  public StoreInfoVO picUrl(String picUrl) {
    this.picUrl = picUrl;
    return this;
  }

  /**
   * 店铺图片
   * @return picUrl
  **/
  @ApiModelProperty(value = "店铺图片")


  public String getPicUrl() {
    return picUrl;
  }

  public void setPicUrl(String picUrl) {
    this.picUrl = picUrl;
  }

  public StoreInfoVO buildUrl(String buildUrl) {
    this.buildUrl = buildUrl;
    return this;
  }

  /**
   * 三维图片
   * @return buildUrl
  **/
  @ApiModelProperty(value = "三维图片")


  public String getBuildUrl() {
    return buildUrl;
  }

  public void setBuildUrl(String buildUrl) {
    this.buildUrl = buildUrl;
  }

  public StoreInfoVO length(String length) {
    this.length = length;
    return this;
  }

  /**
   * 长
   * @return length
  **/
  @ApiModelProperty(value = "长")


  public String getLength() {
    return length;
  }

  public void setLength(String length) {
    this.length = length;
  }

  public StoreInfoVO width(String width) {
    this.width = width;
    return this;
  }

  /**
   * 宽
   * @return width
  **/
  @ApiModelProperty(value = "宽")


  public String getWidth() {
    return width;
  }

  public void setWidth(String width) {
    this.width = width;
  }

  public StoreInfoVO height(String height) {
    this.height = height;
    return this;
  }

  /**
   * 高
   * @return height
  **/
  @ApiModelProperty(value = "高")


  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public StoreInfoVO deadline(String deadline) {
    this.deadline = deadline;
    return this;
  }

  /**
   * 是否到期 1即将到期
   * @return deadline
  **/
  @ApiModelProperty(value = "是否到期 1即将到期")


  public String getDeadline() {
    return deadline;
  }

  public void setDeadline(String deadline) {
    this.deadline = deadline;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreInfoVO storeInfoVO = (StoreInfoVO) o;
    return Objects.equals(this.status, storeInfoVO.status) &&
        Objects.equals(this.marketNum, storeInfoVO.marketNum) &&
        Objects.equals(this.fid, storeInfoVO.fid) &&
        Objects.equals(this.tenantName, storeInfoVO.tenantName) &&
        Objects.equals(this.tenantTel, storeInfoVO.tenantTel) &&
        Objects.equals(this.busyCat, storeInfoVO.busyCat) &&
        Objects.equals(this.brand, storeInfoVO.brand) &&
        Objects.equals(this.monthRent, storeInfoVO.monthRent) &&
        Objects.equals(this.frontMoney, storeInfoVO.frontMoney) &&
        Objects.equals(this.contractNum, storeInfoVO.contractNum) &&
        Objects.equals(this.usableArea, storeInfoVO.usableArea) &&
        Objects.equals(this.spec, storeInfoVO.spec) &&
        Objects.equals(this.totalArea, storeInfoVO.totalArea) &&
        Objects.equals(this.picName, storeInfoVO.picName) &&
        Objects.equals(this.picTel, storeInfoVO.picTel) &&
        Objects.equals(this.leaseTime, storeInfoVO.leaseTime) &&
        Objects.equals(this.picUrl, storeInfoVO.picUrl) &&
        Objects.equals(this.buildUrl, storeInfoVO.buildUrl) &&
        Objects.equals(this.length, storeInfoVO.length) &&
        Objects.equals(this.width, storeInfoVO.width) &&
        Objects.equals(this.height, storeInfoVO.height) &&
        Objects.equals(this.deadline, storeInfoVO.deadline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, marketNum, fid, tenantName, tenantTel, busyCat, brand, monthRent, frontMoney, contractNum, usableArea, spec, totalArea, picName, picTel, leaseTime, picUrl, buildUrl, length, width, height, deadline);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreInfoVO {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    marketNum: ").append(toIndentedString(marketNum)).append("\n");
    sb.append("    fid: ").append(toIndentedString(fid)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
    sb.append("    tenantTel: ").append(toIndentedString(tenantTel)).append("\n");
    sb.append("    busyCat: ").append(toIndentedString(busyCat)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    monthRent: ").append(toIndentedString(monthRent)).append("\n");
    sb.append("    frontMoney: ").append(toIndentedString(frontMoney)).append("\n");
    sb.append("    contractNum: ").append(toIndentedString(contractNum)).append("\n");
    sb.append("    usableArea: ").append(toIndentedString(usableArea)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    totalArea: ").append(toIndentedString(totalArea)).append("\n");
    sb.append("    picName: ").append(toIndentedString(picName)).append("\n");
    sb.append("    picTel: ").append(toIndentedString(picTel)).append("\n");
    sb.append("    leaseTime: ").append(toIndentedString(leaseTime)).append("\n");
    sb.append("    picUrl: ").append(toIndentedString(picUrl)).append("\n");
    sb.append("    buildUrl: ").append(toIndentedString(buildUrl)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    deadline: ").append(toIndentedString(deadline)).append("\n");
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

