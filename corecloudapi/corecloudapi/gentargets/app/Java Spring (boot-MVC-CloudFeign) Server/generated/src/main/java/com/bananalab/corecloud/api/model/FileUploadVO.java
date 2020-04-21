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
 * FileUploadVO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public class FileUploadVO   {
  @JsonProperty("frontUrl")
  private String frontUrl = null;

  @JsonProperty("afterUrl")
  private String afterUrl = null;

  @JsonProperty("fullUrl")
  private String fullUrl = null;

  public FileUploadVO frontUrl(String frontUrl) {
    this.frontUrl = frontUrl;
    return this;
  }

  /**
   * 文件上传
   * @return frontUrl
  **/
  @ApiModelProperty(value = "文件上传")


  public String getFrontUrl() {
    return frontUrl;
  }

  public void setFrontUrl(String frontUrl) {
    this.frontUrl = frontUrl;
  }

  public FileUploadVO afterUrl(String afterUrl) {
    this.afterUrl = afterUrl;
    return this;
  }

  /**
   * afterUrl
   * @return afterUrl
  **/
  @ApiModelProperty(value = "afterUrl")


  public String getAfterUrl() {
    return afterUrl;
  }

  public void setAfterUrl(String afterUrl) {
    this.afterUrl = afterUrl;
  }

  public FileUploadVO fullUrl(String fullUrl) {
    this.fullUrl = fullUrl;
    return this;
  }

  /**
   * fullUrl
   * @return fullUrl
  **/
  @ApiModelProperty(value = "fullUrl")


  public String getFullUrl() {
    return fullUrl;
  }

  public void setFullUrl(String fullUrl) {
    this.fullUrl = fullUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileUploadVO fileUploadVO = (FileUploadVO) o;
    return Objects.equals(this.frontUrl, fileUploadVO.frontUrl) &&
        Objects.equals(this.afterUrl, fileUploadVO.afterUrl) &&
        Objects.equals(this.fullUrl, fileUploadVO.fullUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frontUrl, afterUrl, fullUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileUploadVO {\n");
    
    sb.append("    frontUrl: ").append(toIndentedString(frontUrl)).append("\n");
    sb.append("    afterUrl: ").append(toIndentedString(afterUrl)).append("\n");
    sb.append("    fullUrl: ").append(toIndentedString(fullUrl)).append("\n");
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

