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
 * IndexVOSpace
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public class IndexVOSpace   {
  @JsonProperty("useAmount")
  private Integer useAmount = null;

  @JsonProperty("userArea")
  private Integer userArea = null;

  @JsonProperty("reaminArea")
  private Integer reaminArea = null;

  @JsonProperty("remainAmount")
  private Integer remainAmount = null;

  public IndexVOSpace useAmount(Integer useAmount) {
    this.useAmount = useAmount;
    return this;
  }

  /**
   * Get useAmount
   * @return useAmount
  **/
  @ApiModelProperty(value = "")


  public Integer getUseAmount() {
    return useAmount;
  }

  public void setUseAmount(Integer useAmount) {
    this.useAmount = useAmount;
  }

  public IndexVOSpace userArea(Integer userArea) {
    this.userArea = userArea;
    return this;
  }

  /**
   * Get userArea
   * @return userArea
  **/
  @ApiModelProperty(value = "")


  public Integer getUserArea() {
    return userArea;
  }

  public void setUserArea(Integer userArea) {
    this.userArea = userArea;
  }

  public IndexVOSpace reaminArea(Integer reaminArea) {
    this.reaminArea = reaminArea;
    return this;
  }

  /**
   * Get reaminArea
   * @return reaminArea
  **/
  @ApiModelProperty(value = "")


  public Integer getReaminArea() {
    return reaminArea;
  }

  public void setReaminArea(Integer reaminArea) {
    this.reaminArea = reaminArea;
  }

  public IndexVOSpace remainAmount(Integer remainAmount) {
    this.remainAmount = remainAmount;
    return this;
  }

  /**
   * Get remainAmount
   * @return remainAmount
  **/
  @ApiModelProperty(value = "")


  public Integer getRemainAmount() {
    return remainAmount;
  }

  public void setRemainAmount(Integer remainAmount) {
    this.remainAmount = remainAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexVOSpace indexVOSpace = (IndexVOSpace) o;
    return Objects.equals(this.useAmount, indexVOSpace.useAmount) &&
        Objects.equals(this.userArea, indexVOSpace.userArea) &&
        Objects.equals(this.reaminArea, indexVOSpace.reaminArea) &&
        Objects.equals(this.remainAmount, indexVOSpace.remainAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useAmount, userArea, reaminArea, remainAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexVOSpace {\n");
    
    sb.append("    useAmount: ").append(toIndentedString(useAmount)).append("\n");
    sb.append("    userArea: ").append(toIndentedString(userArea)).append("\n");
    sb.append("    reaminArea: ").append(toIndentedString(reaminArea)).append("\n");
    sb.append("    remainAmount: ").append(toIndentedString(remainAmount)).append("\n");
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

