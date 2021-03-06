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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * StoreLeaseTimeVo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-04-20T10:14:08.259+08:00")
public class StoreLeaseTimeVo   {
  @JsonProperty("expire")
  private List<Integer> expire = null;

  @JsonProperty("unexpire")
  private List<Integer> unexpire = null;

  public StoreLeaseTimeVo expire(List<Integer> expire) {
    this.expire = expire;
    return this;
  }

  public StoreLeaseTimeVo addExpireItem(Integer expireItem) {
    if (this.expire == null) {
      this.expire = new ArrayList<Integer>();
    }
    this.expire.add(expireItem);
    return this;
  }

  /**
   * Get expire
   * @return expire
   **/
  @JsonProperty("expire")
  @ApiModelProperty(value = "")
  public List<Integer> getExpire() {
    return expire;
  }

  public void setExpire(List<Integer> expire) {
    this.expire = expire;
  }

  public StoreLeaseTimeVo unexpire(List<Integer> unexpire) {
    this.unexpire = unexpire;
    return this;
  }

  public StoreLeaseTimeVo addUnexpireItem(Integer unexpireItem) {
    if (this.unexpire == null) {
      this.unexpire = new ArrayList<Integer>();
    }
    this.unexpire.add(unexpireItem);
    return this;
  }

  /**
   * Get unexpire
   * @return unexpire
   **/
  @JsonProperty("unexpire")
  @ApiModelProperty(value = "")
  public List<Integer> getUnexpire() {
    return unexpire;
  }

  public void setUnexpire(List<Integer> unexpire) {
    this.unexpire = unexpire;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreLeaseTimeVo storeLeaseTimeVo = (StoreLeaseTimeVo) o;
    return Objects.equals(this.expire, storeLeaseTimeVo.expire) &&
        Objects.equals(this.unexpire, storeLeaseTimeVo.unexpire);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expire, unexpire);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreLeaseTimeVo {\n");
    
    sb.append("    expire: ").append(toIndentedString(expire)).append("\n");
    sb.append("    unexpire: ").append(toIndentedString(unexpire)).append("\n");
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

