package com.hand.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.hand.ssm.pojo.Role;
import com.hand.ssm.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/ssm")
@Controller
public class StudentController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("/getAllRole")
    public String getAllStudent(){
        PageHelper.startPage(2,3);
        List<Role> list=roleService.getAllRole();
        for (int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
        return "helloworld";
    }

}
