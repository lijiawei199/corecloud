package com.bananalab.corecloud.api.model;

import java.util.Objects;
import com.bananalab.corecloud.api.model.CapitalVODaily;
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
 * CapitalVO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public class CapitalVO   {
  @JsonProperty("income")
  private Integer income = null;

  @JsonProperty("payed")
  private Integer payed = null;

  @JsonProperty("daily")
  @Valid
  private List<CapitalVODaily> daily = null;

  @JsonProperty("classify")
  @Valid
  private List<CapitalVODaily> classify = null;

  public CapitalVO income(Integer income) {
    this.income = income;
    return this;
  }

  /**
   * Get income
   * @return income
  **/
  @ApiModelProperty(value = "")


  public Integer getIncome() {
    return income;
  }

  public void setIncome(Integer income) {
    this.income = income;
  }

  public CapitalVO payed(Integer payed) {
    this.payed = payed;
    return this;
  }

  /**
   * Get payed
   * @return payed
  **/
  @ApiModelProperty(value = "")


  public Integer getPayed() {
    return payed;
  }

  public void setPayed(Integer payed) {
    this.payed = payed;
  }

  public CapitalVO daily(List<CapitalVODaily> daily) {
    this.daily = daily;
    return this;
  }

  public CapitalVO addDailyItem(CapitalVODaily dailyItem) {
    if (this.daily == null) {
      this.daily = new ArrayList<CapitalVODaily>();
    }
    this.daily.add(dailyItem);
    return this;
  }

  /**
   * Get daily
   * @return daily
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CapitalVODaily> getDaily() {
    return daily;
  }

  public void setDaily(List<CapitalVODaily> daily) {
    this.daily = daily;
  }

  public CapitalVO classify(List<CapitalVODaily> classify) {
    this.classify = classify;
    return this;
  }

  public CapitalVO addClassifyItem(CapitalVODaily classifyItem) {
    if (this.classify == null) {
      this.classify = new ArrayList<CapitalVODaily>();
    }
    this.classify.add(classifyItem);
    return this;
  }

  /**
   * Get classify
   * @return classify
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CapitalVODaily> getClassify() {
    return classify;
  }

  public void setClassify(List<CapitalVODaily> classify) {
    this.classify = classify;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapitalVO capitalVO = (CapitalVO) o;
    return Objects.equals(this.income, capitalVO.income) &&
        Objects.equals(this.payed, capitalVO.payed) &&
        Objects.equals(this.daily, capitalVO.daily) &&
        Objects.equals(this.classify, capitalVO.classify);
  }

  @Override
  public int hashCode() {
    return Objects.hash(income, payed, daily, classify);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapitalVO {\n");
    
    sb.append("    income: ").append(toIndentedString(income)).append("\n");
    sb.append("    payed: ").append(toIndentedString(payed)).append("\n");
    sb.append("    daily: ").append(toIndentedString(daily)).append("\n");
    sb.append("    classify: ").append(toIndentedString(classify)).append("\n");
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

