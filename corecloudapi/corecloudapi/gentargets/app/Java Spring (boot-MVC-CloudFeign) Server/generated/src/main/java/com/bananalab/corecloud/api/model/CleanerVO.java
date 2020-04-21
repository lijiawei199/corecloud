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
 * 保洁
 */
@ApiModel(description = "保洁")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public class CleanerVO   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("region")
  private String region = null;

  @JsonProperty("workTime")
  private String workTime = null;

  @JsonProperty("regionList")
  private String regionList = null;

  public CleanerVO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CleanerVO region(String region) {
    this.region = region;
    return this;
  }

  /**
   * 负责区域
   * @return region
  **/
  @ApiModelProperty(value = "负责区域")


  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public CleanerVO workTime(String workTime) {
    this.workTime = workTime;
    return this;
  }

  /**
   * 工作时间
   * @return workTime
  **/
  @ApiModelProperty(value = "工作时间")


  public String getWorkTime() {
    return workTime;
  }

  public void setWorkTime(String workTime) {
    this.workTime = workTime;
  }

  public CleanerVO regionList(String regionList) {
    this.regionList = regionList;
    return this;
  }

  /**
   * fid集合
   * @return regionList
  **/
  @ApiModelProperty(value = "fid集合")


  public String getRegionList() {
    return regionList;
  }

  public void setRegionList(String regionList) {
    this.regionList = regionList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CleanerVO cleanerVO = (CleanerVO) o;
    return Objects.equals(this.name, cleanerVO.name) &&
        Objects.equals(this.region, cleanerVO.region) &&
        Objects.equals(this.workTime, cleanerVO.workTime) &&
        Objects.equals(this.regionList, cleanerVO.regionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, region, workTime, regionList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CleanerVO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    workTime: ").append(toIndentedString(workTime)).append("\n");
    sb.append("    regionList: ").append(toIndentedString(regionList)).append("\n");
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

