package com.qf.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class VLost {
    private Integer id;
    //流失客户名称
    private String lstCustName;

    //客户经理
    private String lstLastManagerName;
    //上次下单时间
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date lstLastOrderDate;

    //确认流失时间
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date lstLostDate;
    //暂缓措施
    private String lstDelay;

    //状态
    private Integer lstStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLstCustName() {
        return lstCustName;
    }

    public void setLstCustName(String lstCustName) {
        this.lstCustName = lstCustName;
    }

    public String getLstLastManagerName() {
        return lstLastManagerName;
    }

    public void setLstLastManagerName(String lstLastManagerName) {
        this.lstLastManagerName = lstLastManagerName;
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

    public Integer getLstStatus() {
        return lstStatus;
    }

    public void setLstStatus(Integer lstStatus) {
        this.lstStatus = lstStatus;
    }

    public String getLstDelay() {
        return lstDelay;
    }

    public void setLstDelay(String lstDelay) {
        this.lstDelay = lstDelay;
    }
}
