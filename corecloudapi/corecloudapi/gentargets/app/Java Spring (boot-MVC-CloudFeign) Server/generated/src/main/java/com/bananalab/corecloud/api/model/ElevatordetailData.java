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
 * ElevatordetailData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public class ElevatordetailData   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("plotTime")
  private String plotTime = null;

  @JsonProperty("lastRepair")
  private String lastRepair = null;

  @JsonProperty("repairTime")
  private String repairTime = null;

  public ElevatordetailData name(String name) {
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

  public ElevatordetailData status(String status) {
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

  public ElevatordetailData plotTime(String plotTime) {
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

  public ElevatordetailData lastRepair(String lastRepair) {
    this.lastRepair = lastRepair;
    return this;
  }

  /**
   * Get lastRepair
   * @return lastRepair
  **/
  @ApiModelProperty(value = "")


  public String getLastRepair() {
    return lastRepair;
  }

  public void setLastRepair(String lastRepair) {
    this.lastRepair = lastRepair;
  }

  public ElevatordetailData repairTime(String repairTime) {
    this.repairTime = repairTime;
    return this;
  }

  /**
   * Get repairTime
   * @return repairTime
  **/
  @ApiModelProperty(value = "")


  public String getRepairTime() {
    return repairTime;
  }

  public void setRepairTime(String repairTime) {
    this.repairTime = repairTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElevatordetailData elevatordetailData = (ElevatordetailData) o;
    return Objects.equals(this.name, elevatordetailData.name) &&
        Objects.equals(this.status, elevatordetailData.status) &&
        Objects.equals(this.plotTime, elevatordetailData.plotTime) &&
        Objects.equals(this.lastRepair, elevatordetailData.lastRepair) &&
        Objects.equals(this.repairTime, elevatordetailData.repairTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, plotTime, lastRepair, repairTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElevatordetailData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    plotTime: ").append(toIndentedString(plotTime)).append("\n");
    sb.append("    lastRepair: ").append(toIndentedString(lastRepair)).append("\n");
    sb.append("    repairTime: ").append(toIndentedString(repairTime)).append("\n");
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

