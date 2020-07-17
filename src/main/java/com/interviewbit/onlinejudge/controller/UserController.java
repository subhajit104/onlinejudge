package com.interviewbit.onlinejudge.controller;
import com.interviewbit.onlinejudge.Service.UserService;
import com.interviewbit.onlinejudge.UserDto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/user/register")
    public UserRegistrationDto userRegister(@RequestBody UserRegistrationDto userRegistrationDto)
    {

    }
}
