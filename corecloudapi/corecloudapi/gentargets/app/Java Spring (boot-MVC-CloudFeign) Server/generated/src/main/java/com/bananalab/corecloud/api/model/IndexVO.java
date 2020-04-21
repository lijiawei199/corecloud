package com.bananalab.corecloud.api.model;

import java.util.Objects;
import com.bananalab.corecloud.api.model.IndexVOFlow;
import com.bananalab.corecloud.api.model.IndexVOSpace;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 首页信息
 */
@ApiModel(description = "首页信息")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public class IndexVO   {
  @JsonProperty("flow")
  private IndexVOFlow flow = null;

  @JsonProperty("sale")
  private IndexVOFlow sale = null;

  @JsonProperty("space")
  private IndexVOSpace space = null;

  public IndexVO flow(IndexVOFlow flow) {
    this.flow = flow;
    return this;
  }

  /**
   * Get flow
   * @return flow
  **/
  @ApiModelProperty(value = "")

  @Valid

  public IndexVOFlow getFlow() {
    return flow;
  }

  public void setFlow(IndexVOFlow flow) {
    this.flow = flow;
  }

  public IndexVO sale(IndexVOFlow sale) {
    this.sale = sale;
    return this;
  }

  /**
   * Get sale
   * @return sale
  **/
  @ApiModelProperty(value = "")

  @Valid

  public IndexVOFlow getSale() {
    return sale;
  }

  public void setSale(IndexVOFlow sale) {
    this.sale = sale;
  }

  public IndexVO space(IndexVOSpace space) {
    this.space = space;
    return this;
  }

  /**
   * Get space
   * @return space
  **/
  @ApiModelProperty(value = "")

  @Valid

  public IndexVOSpace getSpace() {
    return space;
  }

  public void setSpace(IndexVOSpace space) {
    this.space = space;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexVO indexVO = (IndexVO) o;
    return Objects.equals(this.flow, indexVO.flow) &&
        Objects.equals(this.sale, indexVO.sale) &&
        Objects.equals(this.space, indexVO.space);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flow, sale, space);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexVO {\n");
    
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    sale: ").append(toIndentedString(sale)).append("\n");
    sb.append("    space: ").append(toIndentedString(space)).append("\n");
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

