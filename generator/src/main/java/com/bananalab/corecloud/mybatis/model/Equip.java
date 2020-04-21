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
public class Equip extends Model<Equip> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String equipNum;

    /**
     * 绘测日期
     */
    private LocalDate plotTime;

    /**
     * 0 正常 1 维修中 2 损坏
     */
    private Integer status;

    /**
     * 视频链接地址
     */
    private String videoUrl;

    /**
     * 维修时间
     */
    private LocalDate mtcTime;

    /**
     * 维修人
     */
    private String repair;

    private String fid;

    private String xpos;

    private String ypos;

    /**
     * 监控600013识别器600014步行梯200005电梯200004
     */
    private String typeId;

    private String floor;

    /**
     * 位置
     */
    private String region;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEquipNum() {
        return equipNum;
    }

    public void setEquipNum(String equipNum) {
        this.equipNum = equipNum;
    }

    public LocalDate getPlotTime() {
        return plotTime;
    }

    public void setPlotTime(LocalDate plotTime) {
        this.plotTime = plotTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public LocalDate getMtcTime() {
        return mtcTime;
    }

    public void setMtcTime(LocalDate mtcTime) {
        this.mtcTime = mtcTime;
    }

    public String getRepair() {
        return repair;
    }

    public void setRepair(String repair) {
        this.repair = repair;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
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

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Equip{" +
        "id=" + id +
        ", equipNum=" + equipNum +
        ", plotTime=" + plotTime +
        ", status=" + status +
        ", videoUrl=" + videoUrl +
        ", mtcTime=" + mtcTime +
        ", repair=" + repair +
        ", fid=" + fid +
        ", xpos=" + xpos +
        ", ypos=" + ypos +
        ", typeId=" + typeId +
        ", floor=" + floor +
        ", region=" + region +
        "}";
    }
}
