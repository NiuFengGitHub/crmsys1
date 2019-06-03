package com.qf.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author feng
 * @create 2019-05-21 下午 9:14
 */
public class VServicedeal {
    //服务编号
    private Integer id;
    //客户编号
    private String svrno;
    //客户名称
    private String custname;
    //类型
    private String sertype;
    //概要
    private String svrtitle;
    //创建人姓名
    private String createname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    //创建时间
    private Date createtime;
    //分配给人的名字
    private String distributename;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    //分配时间
    private Date distributedate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    //处理时间
    private Date dealdate;
    //服务处理
    private String deal;
    //处理结果
    private String result;
    //服务请求
    private String  request;
    //满意度
    private Integer satify;

    //服务状态
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getSvrno() {
        return svrno;
    }

    public void setSvrno(String svrno) {
        this.svrno = svrno;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getSvrtitle() {
        return svrtitle;
    }

    public void setSvrtitle(String svrtitle) {
        this.svrtitle = svrtitle;
    }

    public String getCreatename() {
        return createname;
    }

    public void setCreatename(String createname) {
        this.createname = createname;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDistributename() {
        return distributename;
    }

    public void setDistributename(String distributename) {
        this.distributename = distributename;
    }

    public Date getDistributedate() {
        return distributedate;
    }

    public void setDistributedate(Date distributedate) {
        this.distributedate = distributedate;
    }

    public Date getDealdate() {
        return dealdate;
    }

    public void setDealdate(Date dealdate) {
        this.dealdate = dealdate;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSertype() {
        return sertype;
    }

    public void setSertype(String sertype) {
        this.sertype = sertype;
    }

    public String getDeal() {
        return deal;
    }

    public void setDeal(String deal) {
        this.deal = deal;
    }

    public Integer getSatify() {
        return satify;
    }

    public void setSatify(Integer satify) {
        this.satify = satify;
    }
}
