package com.sunhao.multimediaaccountshop.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sunhao.multimediaaccountshop.dal.UserMapper;
import com.sunhao.multimediaaccountshop.dal.dataobject.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {
    @Autowired
    private UserMapper userMapper;

    public Page<UserDO> getUserList(Integer pageNum, Integer pageSize) {
        Page<UserDO> page = PageHelper.startPage(pageNum, pageSize);
        userMapper.selectList(null);
        return page;
    }
}
