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
 * DataObjectSingle
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public class DataObjectSingle   {
  @JsonProperty("fid")
  private String fid = null;

  @JsonProperty("amount")
  private Integer amount = null;

  @JsonProperty("xpos")
  private String xpos = null;

  @JsonProperty("ypos")
  private String ypos = null;

  public DataObjectSingle fid(String fid) {
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

  public DataObjectSingle amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")


  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public DataObjectSingle xpos(String xpos) {
    this.xpos = xpos;
    return this;
  }

  /**
   * Get xpos
   * @return xpos
  **/
  @ApiModelProperty(value = "")


  public String getXpos() {
    return xpos;
  }

  public void setXpos(String xpos) {
    this.xpos = xpos;
  }

  public DataObjectSingle ypos(String ypos) {
    this.ypos = ypos;
    return this;
  }

  /**
   * Get ypos
   * @return ypos
  **/
  @ApiModelProperty(value = "")


  public String getYpos() {
    return ypos;
  }

  public void setYpos(String ypos) {
    this.ypos = ypos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataObjectSingle dataObjectSingle = (DataObjectSingle) o;
    return Objects.equals(this.fid, dataObjectSingle.fid) &&
        Objects.equals(this.amount, dataObjectSingle.amount) &&
        Objects.equals(this.xpos, dataObjectSingle.xpos) &&
        Objects.equals(this.ypos, dataObjectSingle.ypos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fid, amount, xpos, ypos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataObjectSingle {\n");
    
    sb.append("    fid: ").append(toIndentedString(fid)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    xpos: ").append(toIndentedString(xpos)).append("\n");
    sb.append("    ypos: ").append(toIndentedString(ypos)).append("\n");
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

