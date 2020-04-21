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
 * EnergyVo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public class EnergyVo   {
  @JsonProperty("water")
  private Integer water = null;

  @JsonProperty("electric")
  private Integer electric = null;

  @JsonProperty("gas")
  private Integer gas = null;

  public EnergyVo water(Integer water) {
    this.water = water;
    return this;
  }

  /**
   * Get water
   * @return water
  **/
  @ApiModelProperty(value = "")


  public Integer getWater() {
    return water;
  }

  public void setWater(Integer water) {
    this.water = water;
  }

  public EnergyVo electric(Integer electric) {
    this.electric = electric;
    return this;
  }

  /**
   * Get electric
   * @return electric
  **/
  @ApiModelProperty(value = "")


  public Integer getElectric() {
    return electric;
  }

  public void setElectric(Integer electric) {
    this.electric = electric;
  }

  public EnergyVo gas(Integer gas) {
    this.gas = gas;
    return this;
  }

  /**
   * Get gas
   * @return gas
  **/
  @ApiModelProperty(value = "")


  public Integer getGas() {
    return gas;
  }

  public void setGas(Integer gas) {
    this.gas = gas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnergyVo energyVo = (EnergyVo) o;
    return Objects.equals(this.water, energyVo.water) &&
        Objects.equals(this.electric, energyVo.electric) &&
        Objects.equals(this.gas, energyVo.gas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(water, electric, gas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnergyVo {\n");
    
    sb.append("    water: ").append(toIndentedString(water)).append("\n");
    sb.append("    electric: ").append(toIndentedString(electric)).append("\n");
    sb.append("    gas: ").append(toIndentedString(gas)).append("\n");
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

