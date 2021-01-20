package com.zlz.model;

import com.zlz.base.BasePo;

/**菜单表
 * Created by zzl on 2021-01-06.
 */
public class CdMenu extends BasePo {

    private static final long serialVersionUID = -4147717233546592685L;
    private String menuId;//菜单记录id
    private String menuName;//菜单名称，也就是我们在系统里看到的菜单选项的名称
    private String menuUrl;//菜单的访问url,通过该url才能访问菜单的内容
    private String parentId;//父菜单id,如果是子菜单，则记录其父菜单id,否则，-1记录呗
    private String order;//菜单级别,对菜单分级进行记录，1级菜单，2级菜单。。。

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
