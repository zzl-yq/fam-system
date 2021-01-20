package com.zlz.model;

import com.zlz.base.BasePo;

/**
 * Created by zzl on 2021-01-07.
 */
public class CdUserAndRole extends BasePo {

    private static final long serialVersionUID = 5574380066897032064L;

    private String roleUserId;//角色用户id
    private String roleId;//角色id
    private String userId;//用户id

    public String getRoleUserId() {
        return roleUserId;
    }

    public void setRoleUserId(String roleUserId) {
        this.roleUserId = roleUserId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
