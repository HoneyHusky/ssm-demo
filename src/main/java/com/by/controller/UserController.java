package com.by.controller;

import com.by.pojo.User;
import com.by.service.UserService;
import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user"  ,method =     RequestMethod.GET)
    public void queryUser(Integer id){
        System.out.println(id);
    }

    @RequestMapping(value = "/users"  ,method =     RequestMethod.GET)
    public List<User> queryUser(){
        return userService.queryUser();
    }

    @RequestMapping(value = "/user/{id}" ,method = RequestMethod.POST )
    public User queryUserById(@PathVariable("id")Integer usedId){
        User user = new User("xxx", usedId, false);
        return user;
    }

    @RequestMapping(value = "/user/{id}" ,method = RequestMethod.DELETE )
    public void deleUserById(@PathVariable("id")Integer userId){
        System.out.println(userId);
    }
    @RequestMapping(value = "/user" ,method = RequestMethod.PUT )
    public void updUser(@RequestBody User user){
        System.out.println("修改 "+user);

    }
    @RequestMapping(value = "/user" ,method = RequestMethod.POST )
        public User addUser(@RequestBody User user){
            System.out.println("save "+user);
        return user;
    }
    @RequestMapping(value = "/user" ,method = RequestMethod.POST )
    public User addUser(Integer flag,@RequestBody User user){
        System.out.println("save "+user);
        return user;
    }
}
