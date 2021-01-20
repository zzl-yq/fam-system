package com.zlz.service;

import com.zlz.dao.CdMenuDao;
import com.zlz.model.CdMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zzl on 2021-01-07.
 */
@Service
public class CdMenuServiceImpl implements CdMenuService {

    @Autowired(required = false)
    private CdMenuDao cdMenuDao;


    @Override
    public void add(CdMenu cdMenu) {
        cdMenuDao.add(cdMenu);
    }
}
