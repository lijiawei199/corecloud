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
 * UserVO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public class UserVO   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("token")
  private String token = null;

  @JsonProperty("img")
  private String img = null;

  @JsonProperty("name")
  private String name = null;

  public UserVO id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserVO token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(value = "")


  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public UserVO img(String img) {
    this.img = img;
    return this;
  }

  /**
   * 图片
   * @return img
  **/
  @ApiModelProperty(value = "图片")


  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }

  public UserVO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 用户名
   * @return name
  **/
  @ApiModelProperty(value = "用户名")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserVO userVO = (UserVO) o;
    return Objects.equals(this.id, userVO.id) &&
        Objects.equals(this.token, userVO.token) &&
        Objects.equals(this.img, userVO.img) &&
        Objects.equals(this.name, userVO.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, token, img, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserVO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    img: ").append(toIndentedString(img)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

