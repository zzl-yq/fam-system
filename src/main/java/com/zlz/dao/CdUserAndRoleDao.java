package com.zlz.dao;

import com.zlz.model.CdUserAndRole;
import com.zlz.vo.CdUserAndRoleVo;
import org.apache.ibatis.annotations.Param;

/**
 * Created by zzl on 2021-01-11.
 */
public interface CdUserAndRoleDao {
    /**
     * 新增
     * @param cdUserAndRoleVo
     */
    public void selectAll(@Param("cdUserAndRoleVo")CdUserAndRoleVo cdUserAndRoleVo);

    public void delete(@Param("roleUserId") String id);

    public void update(@Param("cdUserAndRoleVo")CdUserAndRoleVo cdUserAndRoleVo);



}
