package com.zlz.dao;

import com.zlz.model.CdMenu;
import com.zlz.vo.CdMenuVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zzl on 2021-01-07.
 */
public interface CdMenuDao {
    /**
     * 根据条件查询
     * @param cdMenuVo
     * @return
     */
    public List<CdMenu> selectAll(@Param("cdMenuVo")CdMenuVo cdMenuVo);

    public void add(@Param("cdMenu") CdMenu cdMenu);

    public void update(@Param("cdMenu") CdMenu cdMenu);


}
