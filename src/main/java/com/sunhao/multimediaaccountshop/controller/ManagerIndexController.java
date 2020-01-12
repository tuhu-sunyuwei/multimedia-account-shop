package com.sunhao.multimediaaccountshop.controller;

import com.github.pagehelper.Page;
import com.sunhao.multimediaaccountshop.common.Layui;
import com.sunhao.multimediaaccountshop.dal.dataobject.UserDO;
import com.sunhao.multimediaaccountshop.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/manager")
public class ManagerIndexController {

    @Autowired
    private ManagerService managerService;

    @RequestMapping("")
    public String toIndex() {
        return "manager/index";
    }

    @RequestMapping("/userList")
    public String userList() {
        return "manager/userList";
    }

    @ResponseBody
    @RequestMapping(value = "/getUserList", method = RequestMethod.GET)
    public Layui getUserList(@RequestParam(required = false) String username, @RequestParam(value = "page") Integer page,
                             @RequestParam(value = "limit") Integer limit) {
        Page<UserDO> userList = managerService.getUserList(page, limit);
        Layui data = Layui.data((int) userList.getTotal(), userList);
        return data;
    }
}
