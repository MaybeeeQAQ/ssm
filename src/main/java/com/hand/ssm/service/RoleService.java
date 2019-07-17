package com.hand.ssm.service;

import com.hand.ssm.mapper.RoleMapper;
import com.hand.ssm.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    RoleMapper roleMapper;

    public List<Role> getAllRole(){
        return roleMapper.getAllRole();


    }
}
