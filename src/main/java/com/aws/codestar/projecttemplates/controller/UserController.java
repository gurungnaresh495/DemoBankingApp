package com.aws.codestar.projecttemplates.controller;

import com.aws.codestar.projecttemplates.Entity.User;
import com.aws.codestar.projecttemplates.Service.BankService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private BankService aService;

    public UserController(BankService aService) {
        this.aService = aService;
    }

    @GetMapping("/getUsers")
    public List<User> showUsers(Model model)
    {
        return aService.findAll();
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user)
    {
        aService.addUser(user);
        return "Successful";
    }
}
