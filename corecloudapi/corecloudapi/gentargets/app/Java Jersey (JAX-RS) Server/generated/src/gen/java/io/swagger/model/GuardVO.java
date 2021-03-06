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
import javax.validation.constraints.*;

/**
 * 保安
 */
@ApiModel(description = "保安")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-04-20T10:14:08.259+08:00")
public class GuardVO   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("route")
  private String route = null;

  @JsonProperty("shiftTime")
  private String shiftTime = null;

  @JsonProperty("routeName")
  private String routeName = null;

  public GuardVO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @JsonProperty("name")
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GuardVO route(String route) {
    this.route = route;
    return this;
  }

  /**
   * Get route
   * @return route
   **/
  @JsonProperty("route")
  @ApiModelProperty(value = "")
  public String getRoute() {
    return route;
  }

  public void setRoute(String route) {
    this.route = route;
  }

  public GuardVO shiftTime(String shiftTime) {
    this.shiftTime = shiftTime;
    return this;
  }

  /**
   * 换班时间
   * @return shiftTime
   **/
  @JsonProperty("shiftTime")
  @ApiModelProperty(value = "换班时间")
  public String getShiftTime() {
    return shiftTime;
  }

  public void setShiftTime(String shiftTime) {
    this.shiftTime = shiftTime;
  }

  public GuardVO routeName(String routeName) {
    this.routeName = routeName;
    return this;
  }

  /**
   * Get routeName
   * @return routeName
   **/
  @JsonProperty("routeName")
  @ApiModelProperty(value = "")
  public String getRouteName() {
    return routeName;
  }

  public void setRouteName(String routeName) {
    this.routeName = routeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuardVO guardVO = (GuardVO) o;
    return Objects.equals(this.name, guardVO.name) &&
        Objects.equals(this.route, guardVO.route) &&
        Objects.equals(this.shiftTime, guardVO.shiftTime) &&
        Objects.equals(this.routeName, guardVO.routeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, route, shiftTime, routeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuardVO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    shiftTime: ").append(toIndentedString(shiftTime)).append("\n");
    sb.append("    routeName: ").append(toIndentedString(routeName)).append("\n");
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

