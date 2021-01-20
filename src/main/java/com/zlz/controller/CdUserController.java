package com.zlz.controller;

import com.zlz.base.Ajson;
import com.zlz.model.CdUser;
import com.zlz.service.CdUserService;
import com.zlz.vo.CdUserVo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zzl on 2021-01-08.
 */
@RestController
@RequestMapping("/user")
public class CdUserController {
    @Autowired
    private CdUserService cdUserService;

    @PostMapping("/findAll")
    public Ajson getUserList(@RequestBody CdUserVo cdUserVo){
        List<CdUser> list = cdUserService.findUserAll(cdUserVo);
        Ajson ajson = new Ajson();
        ajson.setData(list);
        ajson.setCode("0000");
        ajson.setMsg("查询成功");
        ajson.setVo(cdUserVo);
        return ajson;
    }

    /**
     *
     * @param cdUser
     */
    @PostMapping("/add")
    public Ajson addUser(@RequestBody CdUser cdUser){
        Ajson ajson = new Ajson();
        try{
            cdUserService.addUser(cdUser);
            ajson.setCode("0000");
            ajson.setMsg("保存数据成功");
        }catch (Exception e){
            e.printStackTrace();
            ajson.setCode("2001");
            ajson.setMsg(e.getMessage());
        }
        return ajson;
    }

    @PostMapping("/update")
    public Ajson updateUser(@RequestBody CdUser cdUser){
        Ajson ajson = new Ajson();
        try{
//            cdUser.setLastUpDate(Calendar.getInstance());
            cdUserService.updateUser(cdUser);
            ajson.setCode("0000");
            ajson.setMsg("修改成功");
        }catch (Exception e){
            e.printStackTrace();
            ajson.setCode("2001");
            ajson.setMsg(e.getMessage());
        }
        return ajson;
    }

    @PostMapping("/delete")
    public Ajson deletUser(@RequestBody CdUser cdUser){
        Ajson ajson = new Ajson();
        try {
            if(StringUtils.isNotBlank(cdUser.getUserId())){
                cdUserService.deletUser(cdUser);
                ajson.setCode("0000");
                ajson.setMsg("删除成功");
            }else{
                ajson.setMsg("条件不能为空");
                ajson.setCode("2002");
            }
        }catch (Exception e){
            e.printStackTrace();
            ajson.setMsg(e.getMessage());
            ajson.setCode("2001");
        }
        return ajson;
    }

    @PostMapping("/select")
    public Ajson selectUser(@RequestBody CdUserVo cdUserVo){
        Ajson ajson = new Ajson();
        try {
            CdUser cdUser = cdUserService.selectUser(cdUserVo);
            ajson.setMsg("查询成功");
            ajson.setCode("0000");
            ajson.setData(cdUser);
        }catch (Exception e){
            e.printStackTrace();
            ajson.setCode("2001");
            ajson.setMsg(e.getMessage());
        }
        return ajson;
    }
}
