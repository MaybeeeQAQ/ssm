package com.hand.ssm.mapper;

import com.hand.ssm.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> getAllUser();
    List<User> getUserByIdAndName(int id);
}
