package com.hand.ssm.test;

import com.hand.ssm.mapper.UserMapper;
import com.hand.ssm.pojo.Student;
import com.hand.ssm.pojo.User;
import com.hand.ssm.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml", "classpath:mybatis/applicationContext-mybatis.xml", "classpath:mybatis/applicationContext-tx.xml"})
public class StudentTest {
     @Autowired
     private StudentService studentService;

     @Autowired
     private UserMapper userMapper;
     @Test
     public void testStudentService(){
         List<Student> list=studentService.getAllStudent();
         for(int i=0;i<list.size();i++){
             System.out.println("sno:"+list.get(i).getSno()+"--sname:"+list.get(i).getSname()+"--score:"+list.get(i).getScore());
         }
     }

     @Test
     public void testUserMapper(){
         List<User> list=userMapper.getAllUser();
         for(int i=0;i<list.size();i++){
             System.out.print(list.get(i).getUid()+"-----"+list.get(i).getUname());
             for(int j=0;j<list.get(i).getRoleList().size();j++){
                 System.out.print(list.get(i).getRoleList().get(j).getRname()+" ");
             }
             System.out.println();
         }
     }

     @Test
     public void testInsertStudent(){
         Student student=new Student();
         student.setSno(11);
         student.setSname("mark");
         student.setScore("23");
         studentService.insertStudent(student);
     }


}
