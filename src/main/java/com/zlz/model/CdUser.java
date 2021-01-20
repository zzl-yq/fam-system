package com.zlz.model;

import com.zlz.base.BasePo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 账户表
 * Created by zzl on 2021-01-06.
 */
public class CdUser extends BasePo {

    private static final long serialVersionUID = -7224034233534774939L;
    private String userId;//主键
    private String userName;//用户名
    private String userAccount;//账号
    private String userPassword;//密码
    private String userState;//状态（0停用，1启用）

    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.REFRESH},fetch = FetchType.LAZY)
    @JoinTable(name = "cd_user_role",inverseJoinColumns={@JoinColumn(name="roleId")},joinColumns={@JoinColumn(name="userId")})
    private List<CdRole> roles = new ArrayList<>();

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }
}
