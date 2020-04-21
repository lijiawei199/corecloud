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
import io.swagger.model.MsgVO;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * 实时消息（今日总结）
 */
@ApiModel(description = "实时消息（今日总结）")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-04-20T10:14:08.259+08:00")
public class TodayMsgVO   {
  @JsonProperty("totalflow")
  private Integer totalflow = null;

  @JsonProperty("totalsales")
  private Integer totalsales = null;

  @JsonProperty("longMSg")
  private String longMSg = null;

  @JsonProperty("shortMsg")
  private List<MsgVO> shortMsg = null;

  public TodayMsgVO totalflow(Integer totalflow) {
    this.totalflow = totalflow;
    return this;
  }

  /**
   * 总客流
   * @return totalflow
   **/
  @JsonProperty("totalflow")
  @ApiModelProperty(value = "总客流")
  public Integer getTotalflow() {
    return totalflow;
  }

  public void setTotalflow(Integer totalflow) {
    this.totalflow = totalflow;
  }

  public TodayMsgVO totalsales(Integer totalsales) {
    this.totalsales = totalsales;
    return this;
  }

  /**
   * 总销售额
   * @return totalsales
   **/
  @JsonProperty("totalsales")
  @ApiModelProperty(value = "总销售额")
  public Integer getTotalsales() {
    return totalsales;
  }

  public void setTotalsales(Integer totalsales) {
    this.totalsales = totalsales;
  }

  public TodayMsgVO longMSg(String longMSg) {
    this.longMSg = longMSg;
    return this;
  }

  /**
   * 长消息
   * @return longMSg
   **/
  @JsonProperty("longMSg")
  @ApiModelProperty(value = "长消息")
  public String getLongMSg() {
    return longMSg;
  }

  public void setLongMSg(String longMSg) {
    this.longMSg = longMSg;
  }

  public TodayMsgVO shortMsg(List<MsgVO> shortMsg) {
    this.shortMsg = shortMsg;
    return this;
  }

  public TodayMsgVO addShortMsgItem(MsgVO shortMsgItem) {
    if (this.shortMsg == null) {
      this.shortMsg = new ArrayList<MsgVO>();
    }
    this.shortMsg.add(shortMsgItem);
    return this;
  }

  /**
   * 0(到期提醒) 1(客流消息) 2(销售消息) 3(客流销售额) 4(保安) 5(保洁)
   * @return shortMsg
   **/
  @JsonProperty("shortMsg")
  @ApiModelProperty(value = "0(到期提醒) 1(客流消息) 2(销售消息) 3(客流销售额) 4(保安) 5(保洁)")
  public List<MsgVO> getShortMsg() {
    return shortMsg;
  }

  public void setShortMsg(List<MsgVO> shortMsg) {
    this.shortMsg = shortMsg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TodayMsgVO todayMsgVO = (TodayMsgVO) o;
    return Objects.equals(this.totalflow, todayMsgVO.totalflow) &&
        Objects.equals(this.totalsales, todayMsgVO.totalsales) &&
        Objects.equals(this.longMSg, todayMsgVO.longMSg) &&
        Objects.equals(this.shortMsg, todayMsgVO.shortMsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalflow, totalsales, longMSg, shortMsg);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TodayMsgVO {\n");
    
    sb.append("    totalflow: ").append(toIndentedString(totalflow)).append("\n");
    sb.append("    totalsales: ").append(toIndentedString(totalsales)).append("\n");
    sb.append("    longMSg: ").append(toIndentedString(longMSg)).append("\n");
    sb.append("    shortMsg: ").append(toIndentedString(shortMsg)).append("\n");
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

