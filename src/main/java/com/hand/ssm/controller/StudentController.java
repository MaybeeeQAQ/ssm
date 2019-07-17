package com.hand.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.hand.ssm.pojo.Student;
import com.hand.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/ssm")
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/getAllStudent")
    public String getAllStudent(){
        PageHelper.startPage(1,3);
        List<Student> list=studentService.getAllStudent();
        for(int i=0;i<list.size();i++){
            System.out.println("sno:"+list.get(i).getSno()+"--sname:"+list.get(i).getSname()+"--score:"+list.get(i).getScore());
        }
        return "helloworld";
    }

    @RequestMapping("/paramTest")
    public String paramTest(){
        return "bootstrap";
    }
}
