package com.bananalab.corecloud.mybatis.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 李佳伟
 * @since 2020-04-16
 */
public class Subscriber extends Model<Subscriber> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 预订人姓名
     */
    private String name;

    /**
     * 联系方式
     */
    private String tel;

    /**
     * 渠道来源
     */
    private String origin;

    /**
     * 租约时间
     */
    private String leaseTime;

    private Integer monthRent;

    private Integer frontMoney;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getLeaseTime() {
        return leaseTime;
    }

    public void setLeaseTime(String leaseTime) {
        this.leaseTime = leaseTime;
    }

    public Integer getMonthRent() {
        return monthRent;
    }

    public void setMonthRent(Integer monthRent) {
        this.monthRent = monthRent;
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
        return "Subscriber{" +
        "id=" + id +
        ", name=" + name +
        ", tel=" + tel +
        ", origin=" + origin +
        ", leaseTime=" + leaseTime +
        ", monthRent=" + monthRent +
        ", frontMoney=" + frontMoney +
        "}";
    }
}
