package com.zlz.vo;

import com.zlz.base.BaseVo;

/**
 * Created by zzl on 2021-01-08.
 */
public class CdUserVo extends BaseVo {

    private static final long serialVersionUID = 2115403099938010496L;

    private String userId;
    private String userName;
    private String userAccount;
    private String userState;
    private String userPassword;

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

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
