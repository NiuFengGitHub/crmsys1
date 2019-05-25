package com.qf.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class CstLost {
    private Integer lstId;

    private String lstCustNo;

    private Integer lstLastManagerId;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date lstLastOrderDate;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date lstLostDate;

    private String lstDelay;

    private String lstReason;

    private Integer lstStatus;

    private Integer lastFlag;

    public Integer getLstId() {
        return lstId;
    }

    public void setLstId(Integer lstId) {
        this.lstId = lstId;
    }

    public String getLstCustNo() {
        return lstCustNo;
    }

    public void setLstCustNo(String lstCustNo) {
        this.lstCustNo = lstCustNo == null ? null : lstCustNo.trim();
    }

    public Integer getLstLastManagerId() {
        return lstLastManagerId;
    }

    public void setLstLastManagerId(Integer lstLastManagerId) {
        this.lstLastManagerId = lstLastManagerId;
    }

    public Date getLstLastOrderDate() {
        return lstLastOrderDate;
    }

    public void setLstLastOrderDate(Date lstLastOrderDate) {
        this.lstLastOrderDate = lstLastOrderDate;
    }

    public Date getLstLostDate() {
        return lstLostDate;
    }

    public void setLstLostDate(Date lstLostDate) {
        this.lstLostDate = lstLostDate;
    }

    public String getLstDelay() {
        return lstDelay;
    }

    public void setLstDelay(String lstDelay) {
        this.lstDelay = lstDelay == null ? null : lstDelay.trim();
    }

    public String getLstReason() {
        return lstReason;
    }

    public void setLstReason(String lstReason) {
        this.lstReason = lstReason == null ? null : lstReason.trim();
    }

    public Integer getLstStatus() {
        return lstStatus;
    }

    public void setLstStatus(Integer lstStatus) {
        this.lstStatus = lstStatus;
    }

    public Integer getLastFlag() {
        return lastFlag;
    }

    public void setLastFlag(Integer lastFlag) {
        this.lastFlag = lastFlag;
    }
}