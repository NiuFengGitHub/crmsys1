package com.qf.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class SalChance {
    private Integer chcId;

    private String chcSource;

    private String chcCusrName;

    private String chcTitle;

    private Integer chcRate;

    private String chcLinkman;

    private String chcTel;

    private String chcMobile;

    private String chcDesc;

    private Integer chcCreateId;
    
    @JsonFormat(pattern="yyyy-MM-dd " ,timezone="GMT+8")
    private Date chcCreateDate;

    private Integer chcDueId;
    @JsonFormat(pattern="yyyy-MM-dd " ,timezone="GMT+8")
    private Date chcDueDate;

    private Integer chcStatus;

    private Integer chcFlag;

    public Integer getChcId() {
        return chcId;
    }

    public void setChcId(Integer chcId) {
        this.chcId = chcId;
    }

    public String getChcSource() {
        return chcSource;
    }

    public void setChcSource(String chcSource) {
        this.chcSource = chcSource == null ? null : chcSource.trim();
    }

    public String getChcCusrName() {
        return chcCusrName;
    }

    public void setChcCusrName(String chcCusrName) {
        this.chcCusrName = chcCusrName == null ? null : chcCusrName.trim();
    }

    public String getChcTitle() {
        return chcTitle;
    }

    public void setChcTitle(String chcTitle) {
        this.chcTitle = chcTitle == null ? null : chcTitle.trim();
    }

    public Integer getChcRate() {
        return chcRate;
    }

    public void setChcRate(Integer chcRate) {
        this.chcRate = chcRate;
    }

    public String getChcLinkman() {
        return chcLinkman;
    }

    public void setChcLinkman(String chcLinkman) {
        this.chcLinkman = chcLinkman == null ? null : chcLinkman.trim();
    }

    public String getChcTel() {
        return chcTel;
    }

    public void setChcTel(String chcTel) {
        this.chcTel = chcTel == null ? null : chcTel.trim();
    }

    public String getChcMobile() {
        return chcMobile;
    }

    public void setChcMobile(String chcMobile) {
        this.chcMobile = chcMobile == null ? null : chcMobile.trim();
    }

    public String getChcDesc() {
        return chcDesc;
    }

    public void setChcDesc(String chcDesc) {
        this.chcDesc = chcDesc == null ? null : chcDesc.trim();
    }

    public Integer getChcCreateId() {
        return chcCreateId;
    }

    public void setChcCreateId(Integer chcCreateId) {
        this.chcCreateId = chcCreateId;
    }

    public Date getChcCreateDate() {
        return chcCreateDate;
    }

    public void setChcCreateDate(Date chcCreateDate) {
        this.chcCreateDate = chcCreateDate;
    }

    public Integer getChcDueId() {
        return chcDueId;
    }

    public void setChcDueId(Integer chcDueId) {
        this.chcDueId = chcDueId;
    }

    public Date getChcDueDate() {
        return chcDueDate;
    }

    public void setChcDueDate(Date chcDueDate) {
        this.chcDueDate = chcDueDate;
    }

    public Integer getChcStatus() {
        return chcStatus;
    }

    public void setChcStatus(Integer chcStatus) {
        this.chcStatus = chcStatus;
    }

    public Integer getChcFlag() {
        return chcFlag;
    }

    public void setChcFlag(Integer chcFlag) {
        this.chcFlag = chcFlag;
    }
}