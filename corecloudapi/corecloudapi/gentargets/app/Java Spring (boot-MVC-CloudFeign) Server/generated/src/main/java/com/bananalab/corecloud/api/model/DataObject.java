package com.bananalab.corecloud.api.model;

import java.util.Objects;
import com.bananalab.corecloud.api.model.DataObjectSingle;
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
 * DataObject
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public class DataObject   {
  @JsonProperty("total")
  private Integer total = null;

  @JsonProperty("single")
  @Valid
  private List<DataObjectSingle> single = null;

  public DataObject total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")


  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public DataObject single(List<DataObjectSingle> single) {
    this.single = single;
    return this;
  }

  public DataObject addSingleItem(DataObjectSingle singleItem) {
    if (this.single == null) {
      this.single = new ArrayList<DataObjectSingle>();
    }
    this.single.add(singleItem);
    return this;
  }

  /**
   * Get single
   * @return single
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<DataObjectSingle> getSingle() {
    return single;
  }

  public void setSingle(List<DataObjectSingle> single) {
    this.single = single;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataObject dataObject = (DataObject) o;
    return Objects.equals(this.total, dataObject.total) &&
        Objects.equals(this.single, dataObject.single);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, single);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataObject {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    single: ").append(toIndentedString(single)).append("\n");
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

