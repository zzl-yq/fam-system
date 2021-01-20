package com.zlz.service;

import com.github.pagehelper.PageInfo;
import com.zlz.dao.CdUserDao;
import com.zlz.model.CdUser;
import com.zlz.vo.CdUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zzl on 2021-01-08.
 */
@Service
public class CdUserServiceImpl implements CdUserService {

    @Autowired(required = false)
    private CdUserDao cdUserDao;

    @Override
    public List<CdUser> findUserAll(CdUserVo cdUserVo) {
        int pageNum = cdUserVo.getPageNo();
        int pageSize = cdUserVo.getPageSize();
        List<CdUser> list = cdUserDao.findAll(cdUserVo,pageNum,pageSize);
        PageInfo<CdUser> pi = new PageInfo<CdUser>(list);
        cdUserVo.setCount((int)pi.getTotal());
        return list;
    }

    @Override
    @Transactional
    public void addUser(CdUser cdUser) {
        cdUserDao.addUser(cdUser);
    }


    @Override
    @Transactional
    public void updateUser(CdUser cdUser) {
        cdUserDao.updateUser(cdUser);
    }

    @Override
    @Transactional
    public void deletUser(CdUser cdUser) {
        cdUserDao.deletUser(cdUser.getUserId());
    }

    @Override
    public CdUser selectUser(CdUserVo cdUserVo) {
        CdUser cdUser = cdUserDao.selectUser(cdUserVo);
        return cdUser;
    }


}
