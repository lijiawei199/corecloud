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
 * MsgVO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public class MsgVO   {
  @JsonProperty("type")
  private Integer type = null;

  @JsonProperty("msg")
  private String msg = null;

  @JsonProperty("time")
  private String time = null;

  @JsonProperty("pos")
  private String pos = null;

  @JsonProperty("fid")
  private String fid = null;

  @JsonProperty("workTime")
  private String workTime = null;

  @JsonProperty("region")
  private String region = null;

  public MsgVO type(Integer type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public MsgVO msg(String msg) {
    this.msg = msg;
    return this;
  }

  /**
   * Get msg
   * @return msg
  **/
  @ApiModelProperty(value = "")


  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public MsgVO time(String time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(value = "")


  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public MsgVO pos(String pos) {
    this.pos = pos;
    return this;
  }

  /**
   * Get pos
   * @return pos
  **/
  @ApiModelProperty(value = "")


  public String getPos() {
    return pos;
  }

  public void setPos(String pos) {
    this.pos = pos;
  }

  public MsgVO fid(String fid) {
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

  public MsgVO workTime(String workTime) {
    this.workTime = workTime;
    return this;
  }

  /**
   * Get workTime
   * @return workTime
  **/
  @ApiModelProperty(value = "")


  public String getWorkTime() {
    return workTime;
  }

  public void setWorkTime(String workTime) {
    this.workTime = workTime;
  }

  public MsgVO region(String region) {
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
    MsgVO msgVO = (MsgVO) o;
    return Objects.equals(this.type, msgVO.type) &&
        Objects.equals(this.msg, msgVO.msg) &&
        Objects.equals(this.time, msgVO.time) &&
        Objects.equals(this.pos, msgVO.pos) &&
        Objects.equals(this.fid, msgVO.fid) &&
        Objects.equals(this.workTime, msgVO.workTime) &&
        Objects.equals(this.region, msgVO.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, msg, time, pos, fid, workTime, region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MsgVO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    fid: ").append(toIndentedString(fid)).append("\n");
    sb.append("    workTime: ").append(toIndentedString(workTime)).append("\n");
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

