package com.qf.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author feng
 * @create 2019-05-20 下午 9:56
 */
public class VService {
    private String svrno;
    private String custname;
    private String svrtitle;
    //服务类型
    private String sertype;
    private String createname;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createtime;

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

    public String getSertype() {
        return sertype;
    }

    public void setSertype(String sertype) {
        this.sertype = sertype;
    }
}
