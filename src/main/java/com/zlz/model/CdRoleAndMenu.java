package com.zlz.model;

import com.zlz.base.BasePo;

/**角色菜单表
 * Created by zzl on 2021-01-07.
 */
public class CdRoleAndMenu extends BasePo {

    private static final long serialVersionUID = -3330770477103082555L;

    private String roleMenuId;//角色菜单关联记录id
    private String roleId;//角色id
    private String menuId;//菜单id

    public String getRoleMenuId() {
        return roleMenuId;
    }

    public void setRoleMenuId(String roleMenuId) {
        this.roleMenuId = roleMenuId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
}
