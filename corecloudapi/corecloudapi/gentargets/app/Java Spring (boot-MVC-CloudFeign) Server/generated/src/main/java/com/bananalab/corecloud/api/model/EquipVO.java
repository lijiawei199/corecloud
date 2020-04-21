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
 * EquipVO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public class EquipVO   {
  @JsonProperty("equipNum")
  private String equipNum = null;

  @JsonProperty("plot_time")
  private String plotTime = null;

  @JsonProperty("fid")
  private String fid = null;

  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("videoUrl")
  private String videoUrl = null;

  @JsonProperty("mtcTime")
  private String mtcTime = null;

  @JsonProperty("repair")
  private String repair = null;

  @JsonProperty("floor")
  private String floor = null;

  @JsonProperty("region")
  private String region = null;

  public EquipVO equipNum(String equipNum) {
    this.equipNum = equipNum;
    return this;
  }

  /**
   * Get equipNum
   * @return equipNum
  **/
  @ApiModelProperty(value = "")


  public String getEquipNum() {
    return equipNum;
  }

  public void setEquipNum(String equipNum) {
    this.equipNum = equipNum;
  }

  public EquipVO plotTime(String plotTime) {
    this.plotTime = plotTime;
    return this;
  }

  /**
   * Get plotTime
   * @return plotTime
  **/
  @ApiModelProperty(value = "")


  public String getPlotTime() {
    return plotTime;
  }

  public void setPlotTime(String plotTime) {
    this.plotTime = plotTime;
  }

  public EquipVO fid(String fid) {
    this.fid = fid;
    return this;
  }

  /**
   * Get fid
   * @return fid
  **/
  @ApiModelProperty(value = "")


  public String getFid() {
    return fid;
  }

  public void setFid(String fid) {
    this.fid = fid;
  }

  public EquipVO status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public EquipVO videoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

  /**
   * Get videoUrl
   * @return videoUrl
  **/
  @ApiModelProperty(value = "")


  public String getVideoUrl() {
    return videoUrl;
  }

  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

  public EquipVO mtcTime(String mtcTime) {
    this.mtcTime = mtcTime;
    return this;
  }

  /**
   * Get mtcTime
   * @return mtcTime
  **/
  @ApiModelProperty(value = "")


  public String getMtcTime() {
    return mtcTime;
  }

  public void setMtcTime(String mtcTime) {
    this.mtcTime = mtcTime;
  }

  public EquipVO repair(String repair) {
    this.repair = repair;
    return this;
  }

  /**
   * Get repair
   * @return repair
  **/
  @ApiModelProperty(value = "")


  public String getRepair() {
    return repair;
  }

  public void setRepair(String repair) {
    this.repair = repair;
  }

  public EquipVO floor(String floor) {
    this.floor = floor;
    return this;
  }

  /**
   * Get floor
   * @return floor
  **/
  @ApiModelProperty(value = "")


  public String getFloor() {
    return floor;
  }

  public void setFloor(String floor) {
    this.floor = floor;
  }

  public EquipVO region(String region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
  **/
  @ApiModelProperty(value = "")


  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EquipVO equipVO = (EquipVO) o;
    return Objects.equals(this.equipNum, equipVO.equipNum) &&
        Objects.equals(this.plotTime, equipVO.plotTime) &&
        Objects.equals(this.fid, equipVO.fid) &&
        Objects.equals(this.status, equipVO.status) &&
        Objects.equals(this.videoUrl, equipVO.videoUrl) &&
        Objects.equals(this.mtcTime, equipVO.mtcTime) &&
        Objects.equals(this.repair, equipVO.repair) &&
        Objects.equals(this.floor, equipVO.floor) &&
        Objects.equals(this.region, equipVO.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(equipNum, plotTime, fid, status, videoUrl, mtcTime, repair, floor, region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EquipVO {\n");
    
    sb.append("    equipNum: ").append(toIndentedString(equipNum)).append("\n");
    sb.append("    plotTime: ").append(toIndentedString(plotTime)).append("\n");
    sb.append("    fid: ").append(toIndentedString(fid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
    sb.append("    mtcTime: ").append(toIndentedString(mtcTime)).append("\n");
    sb.append("    repair: ").append(toIndentedString(repair)).append("\n");
    sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

