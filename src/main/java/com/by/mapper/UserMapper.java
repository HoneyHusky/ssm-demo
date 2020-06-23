package com.by.mapper;


import com.by.pojo.User;
import com.by.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public interface UserMapper {

    List<User> queryUser();
}
