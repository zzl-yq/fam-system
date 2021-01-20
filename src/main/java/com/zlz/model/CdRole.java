package com.zlz.model;

import com.zlz.base.BasePo;

/**
 * 权限表
 * Created by zzl on 2021-01-07.
 */
public class CdRole extends BasePo {

    private static final long serialVersionUID = 8060042360976065296L;

    private String roleId;//角色id
    private String roleName;//角色名称

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
