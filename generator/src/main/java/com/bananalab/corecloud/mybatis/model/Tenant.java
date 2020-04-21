package com.bananalab.corecloud.mybatis.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 李佳伟
 * @since 2020-04-16
 */
public class Tenant extends Model<Tenant> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 经营类目
     */
    private String busyCat;

    /**
     * 品牌名
     */
    private String brand;

    /**
     * 租户联系人
     */
    private String name;

    /**
     * 联系电话
     */
    private String tel;

    /**
     * 租约开始时间
     */
    private LocalDate leaseStart;

    /**
     * 租约到期时间
     */
    private LocalDate leaseEnd;

    /**
     * 客户渠道来源
     */
    private String origin;

    /**
     * 月租
     */
    private Integer monthRent;

    /**
     * 店铺图片地址
     */
    private String picUrl;

    /**
     * 合同编号
     */
    private String contractNum;

    /**
     * 定金
     */
    private Integer frontMoney;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBusyCat() {
        return busyCat;
    }

    public void setBusyCat(String busyCat) {
        this.busyCat = busyCat;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public LocalDate getLeaseStart() {
        return leaseStart;
    }

    public void setLeaseStart(LocalDate leaseStart) {
        this.leaseStart = leaseStart;
    }

    public LocalDate getLeaseEnd() {
        return leaseEnd;
    }

    public void setLeaseEnd(LocalDate leaseEnd) {
        this.leaseEnd = leaseEnd;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Integer getMonthRent() {
        return monthRent;
    }

    public void setMonthRent(Integer monthRent) {
        this.monthRent = monthRent;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getContractNum() {
        return contractNum;
    }

    public void setContractNum(String contractNum) {
        this.contractNum = contractNum;
    }

    public Integer getFrontMoney() {
        return frontMoney;
    }

    public void setFrontMoney(Integer frontMoney) {
        this.frontMoney = frontMoney;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Tenant{" +
        "id=" + id +
        ", busyCat=" + busyCat +
        ", brand=" + brand +
        ", name=" + name +
        ", tel=" + tel +
        ", leaseStart=" + leaseStart +
        ", leaseEnd=" + leaseEnd +
        ", origin=" + origin +
        ", monthRent=" + monthRent +
        ", picUrl=" + picUrl +
        ", contractNum=" + contractNum +
        ", frontMoney=" + frontMoney +
        "}";
    }
}
