package com.zlz.service;

import com.zlz.model.CdUser;
import com.zlz.vo.CdUserVo;

import java.util.List;

/**
 * Created by zzl on 2021-01-08.
 */
public interface CdUserService {

    public List<CdUser> findUserAll(CdUserVo cdUserVo);

    public void addUser(CdUser cdUser);

    public void updateUser(CdUser cdUser);

    public void deletUser(CdUser cdUser);

    public CdUser selectUser(CdUserVo cdUserVo);
}
