package com.bananalab.corecloud.api.model;

import java.util.Objects;
import com.bananalab.corecloud.api.model.Flowtop5Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Flowtop5
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public class Flowtop5   {
  @JsonProperty("code")
  private Integer code = null;

  @JsonProperty("msg")
  private String msg = null;

  @JsonProperty("data")
  @Valid
  private List<Flowtop5Data> data = null;

  public Flowtop5 code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")


  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Flowtop5 msg(String msg) {
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

  public Flowtop5 data(List<Flowtop5Data> data) {
    this.data = data;
    return this;
  }

  public Flowtop5 addDataItem(Flowtop5Data dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<Flowtop5Data>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Flowtop5Data> getData() {
    return data;
  }

  public void setData(List<Flowtop5Data> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Flowtop5 flowtop5 = (Flowtop5) o;
    return Objects.equals(this.code, flowtop5.code) &&
        Objects.equals(this.msg, flowtop5.msg) &&
        Objects.equals(this.data, flowtop5.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, msg, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Flowtop5 {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

