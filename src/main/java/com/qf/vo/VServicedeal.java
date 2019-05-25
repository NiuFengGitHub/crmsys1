package com.qf.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author feng
 * @create 2019-05-21 下午 9:14
 */
public class VServicedeal {
    private String svrno;
    private String custname;
    private String svrtitle;
    private String createname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createtime;
    private String distributename;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date distributedate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dealdate;
    private String result;

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
}
