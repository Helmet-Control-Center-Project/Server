package com.example.helmetproject.mapper;

import com.example.helmetproject.dto.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    void createUser(User user);

    User findUser(String userSsn);

    List<User> findAll();

}
