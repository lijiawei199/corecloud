package com.bananalab.corecloud.mybatis.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
public class Store extends Model<Store> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 地图编号
     */
    private String fid;

    /**
     * 商场编号
     */
    private String marketNum;

    private String name;

    /**
     * 租户id
     */
    private Integer tenantId;

    /**
     * 总面积
     */
    private String totalArea;

    /**
     * 可用面积
     */
    private String usableArea;

    /**
     * 规格 （长x宽x高）
     */
    private String spec;

    /**
     * 商铺状态 0出租 1已预订 2可招商
     */
    private String status;

    /**
     * 图片地址
     */
    private String picUrl;

    /**
     * 地图坐标
     */
    private String xpos;

    private String ypos;

    /**
     * 负责人ID
     */
    private Integer picId;

    /**
     * 类型ID
     */
    private String typeId;

    /**
     * 意向客户id
     */
    private Integer poteId;

    /**
     * 预订客户id
     */
    private Integer subId;

    /**
     * 预期租金
     */
    private Integer expectRent;

    private String floor;

    private String region;

    private String buildUrl;

    private Double length;

    private Double width;

    private Double height;

    /**
     * 1 即将到期
     */
    private Integer deadline;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getMarketNum() {
        return marketNum;
    }

    public void setMarketNum(String marketNum) {
        this.marketNum = marketNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public String getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(String totalArea) {
        this.totalArea = totalArea;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getXpos() {
        return xpos;
    }

    public void setXpos(String xpos) {
        this.xpos = xpos;
    }

    public String getYpos() {
        return ypos;
    }

    public void setYpos(String ypos) {
        this.ypos = ypos;
    }

    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public Integer getPoteId() {
        return poteId;
    }

    public void setPoteId(Integer poteId) {
        this.poteId = poteId;
    }

    public Integer getSubId() {
        return subId;
    }

    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    public Integer getExpectRent() {
        return expectRent;
    }

    public void setExpectRent(Integer expectRent) {
        this.expectRent = expectRent;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getBuildUrl() {
        return buildUrl;
    }

    public void setBuildUrl(String buildUrl) {
        this.buildUrl = buildUrl;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Integer getDeadline() {
        return deadline;
    }

    public void setDeadline(Integer deadline) {
        this.deadline = deadline;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Store{" +
        "id=" + id +
        ", fid=" + fid +
        ", marketNum=" + marketNum +
        ", name=" + name +
        ", tenantId=" + tenantId +
        ", totalArea=" + totalArea +
        ", usableArea=" + usableArea +
        ", spec=" + spec +
        ", status=" + status +
        ", picUrl=" + picUrl +
        ", xpos=" + xpos +
        ", ypos=" + ypos +
        ", picId=" + picId +
        ", typeId=" + typeId +
        ", poteId=" + poteId +
        ", subId=" + subId +
        ", expectRent=" + expectRent +
        ", floor=" + floor +
        ", region=" + region +
        ", buildUrl=" + buildUrl +
        ", length=" + length +
        ", width=" + width +
        ", height=" + height +
        ", deadline=" + deadline +
        "}";
    }
}
