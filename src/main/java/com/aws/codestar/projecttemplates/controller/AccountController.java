package com.aws.codestar.projecttemplates.controller;

import com.aws.codestar.projecttemplates.Entity.Account;
import com.aws.codestar.projecttemplates.Service.BankService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    private BankService aService;

    public AccountController(BankService aService) {
        this.aService = aService;
    }

    @GetMapping("/userAccounts")
    public List<Account> userAccounts(@RequestParam(name = "userId") Integer userId)
    {
        return aService.getUserAccounts(userId);
    }

    @PostMapping("/addUserAccount")
    public String addUserAccount(@RequestBody Account account)
    {
        aService.addAccount(account);
        return account.getAccountType() + " account added successfully";
    }
}
