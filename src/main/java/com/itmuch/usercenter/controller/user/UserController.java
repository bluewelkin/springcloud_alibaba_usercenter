package com.itmuch.usercenter.controller.user;

import com.itmuch.usercenter.domain.entity.user.User;
import com.itmuch.usercenter.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {

    private final UserService userService;
//    http://127.0.0.1:8081/users/1
//    @GetMapping("/{id}")
//    public User findById(@PathVariable Integer id){
//        return  this.userService.findById(id);//
//
//    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id){
        return this.userService.findById(id);
    }

}
