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
 * MonitordetailData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public class MonitordetailData   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("plotTime")
  private String plotTime = null;

  @JsonProperty("postition")
  private String postition = null;

  @JsonProperty("frameurl")
  private String frameurl = null;

  @JsonProperty("num")
  private Integer num = null;

  public MonitordetailData name(String name) {
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

  public MonitordetailData status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public MonitordetailData plotTime(String plotTime) {
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

  public MonitordetailData postition(String postition) {
    this.postition = postition;
    return this;
  }

  /**
   * Get postition
   * @return postition
  **/
  @ApiModelProperty(value = "")


  public String getPostition() {
    return postition;
  }

  public void setPostition(String postition) {
    this.postition = postition;
  }

  public MonitordetailData frameurl(String frameurl) {
    this.frameurl = frameurl;
    return this;
  }

  /**
   * Get frameurl
   * @return frameurl
  **/
  @ApiModelProperty(value = "")


  public String getFrameurl() {
    return frameurl;
  }

  public void setFrameurl(String frameurl) {
    this.frameurl = frameurl;
  }

  public MonitordetailData num(Integer num) {
    this.num = num;
    return this;
  }

  /**
   * Get num
   * @return num
  **/
  @ApiModelProperty(value = "")


  public Integer getNum() {
    return num;
  }

  public void setNum(Integer num) {
    this.num = num;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitordetailData monitordetailData = (MonitordetailData) o;
    return Objects.equals(this.name, monitordetailData.name) &&
        Objects.equals(this.status, monitordetailData.status) &&
        Objects.equals(this.plotTime, monitordetailData.plotTime) &&
        Objects.equals(this.postition, monitordetailData.postition) &&
        Objects.equals(this.frameurl, monitordetailData.frameurl) &&
        Objects.equals(this.num, monitordetailData.num);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, plotTime, postition, frameurl, num);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitordetailData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    plotTime: ").append(toIndentedString(plotTime)).append("\n");
    sb.append("    postition: ").append(toIndentedString(postition)).append("\n");
    sb.append("    frameurl: ").append(toIndentedString(frameurl)).append("\n");
    sb.append("    num: ").append(toIndentedString(num)).append("\n");
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

