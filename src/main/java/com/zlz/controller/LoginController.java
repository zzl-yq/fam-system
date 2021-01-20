package com.zlz.controller;

import com.zlz.base.Ajson;
import com.zlz.model.CdUser;
import com.zlz.service.CdUserService;
import com.zlz.vo.CdUserVo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 登录请求
 * Created by zzl on 2021-01-11.
 */
@RestController
public class LoginController {

    @Autowired
    private CdUserService cdUserService;

    @GetMapping("/login")
    public Ajson login(HttpServletRequest request){
        Ajson ajson = new Ajson();
        String account = request.getHeader("account");
        String pwd = request.getHeader("pwd");
        if(StringUtils.isBlank(account)){
            ajson.setCode("2002");
            ajson.setMsg("账号不能为空!");
            return ajson;
        }
        if(StringUtils.isBlank(pwd)){
            ajson.setCode("2002");
            ajson.setMsg("密码不能为空!");
            return ajson;
        }

        CdUserVo qvo = new CdUserVo();
        qvo.setUserAccount(account);
        qvo.setUserPassword(pwd);
        CdUser user = cdUserService.selectUser(qvo);
        if(user != null){
            ajson.setCode("0000");
            ajson.setMsg("查询成功");
            ajson.setData(user);
        }else{
            ajson.setCode("0001");
            ajson.setMsg("查无数据");
        }
        return ajson;
    }

    @GetMapping("/login2")
    public Ajson login2(String account, String pwd, String yzm){
        Ajson ajson = new Ajson();
        if(StringUtils.isBlank(account)){
            ajson.setCode("2002");
            ajson.setMsg("账号不能为空!");
            return ajson;
        }
        if(StringUtils.isBlank(pwd)){
            ajson.setCode("2002");
            ajson.setMsg("密码不能为空!");
            return ajson;
        }

        CdUserVo qvo = new CdUserVo();
        qvo.setUserAccount(account);
        qvo.setUserPassword(pwd);
        CdUser user = cdUserService.selectUser(qvo);
        if(user != null){
            ajson.setCode("0000");
            ajson.setMsg("查询成功");
            ajson.setData(user);
        }else{
            ajson.setCode("0001");
            ajson.setMsg("查无数据");
        }
        return ajson;
    }



}
