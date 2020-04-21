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
public class PotentialCust extends Model<PotentialCust> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 客户姓名
     */
    private String name;

    /**
     * 联系方式
     */
    private String tel;

    /**
     * 客户来源
     */
    private String origin;

    /**
     * 经营类目
     */
    private String busyCat;

    /**
     * 经营品牌
     */
    private String brand;

    /**
     * 报价
     */
    private Integer offer;

    private String fid;


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

    public Integer getOffer() {
        return offer;
    }

    public void setOffer(Integer offer) {
        this.offer = offer;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "PotentialCust{" +
        "id=" + id +
        ", name=" + name +
        ", tel=" + tel +
        ", origin=" + origin +
        ", busyCat=" + busyCat +
        ", brand=" + brand +
        ", offer=" + offer +
        ", fid=" + fid +
        "}";
    }
}
