package com.zlz.dao;

import com.zlz.model.CdUser;
import com.zlz.vo.CdUserVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zzl on 2021-01-07.
 */

public interface CdUserDao {
    /**
     *根据条件查询
     * @return
     */
    public List<CdUser> findAll(@Param("cdUserVo")CdUserVo cdUserVo, @Param("pageNum")int startIndex, @Param("pageSize")int pageNumIn);

    /**
     * 添加用户信息
     * @param cdUser
     */
    public void addUser(@Param("cdUser")CdUser cdUser);

    /**
     * 修改用户信息
     * @param cdUser
     */
    public void updateUser(@Param("cdUser")CdUser cdUser);

    /**
     * 删除用户信息
     * @param userId
     */
    public void deletUser(@Param("userId") String userId);

    /**
     * 获取单个用户信息
     * @param cdUserVo
     * @return
     */
    public CdUser selectUser(@Param("cdUserVo")CdUserVo cdUserVo);


}
