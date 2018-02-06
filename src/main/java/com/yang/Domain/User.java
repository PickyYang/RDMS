package com.yang.Domain;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by Frank Yang on 2018-02-06.
 */
public class User {
    private String name;
    private String password;
    @JSONField(serialize = false)
    private String remarks;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
