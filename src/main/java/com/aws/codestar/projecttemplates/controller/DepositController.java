package com.aws.codestar.projecttemplates.controller;

import com.aws.codestar.projecttemplates.Entity.Deposit;
import com.aws.codestar.projecttemplates.Entity.Receipt;
import com.aws.codestar.projecttemplates.Service.BankService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deposit")
public class DepositController {

    private BankService aService;

    public DepositController(BankService aService) {
        this.aService = aService;
    }

    @GetMapping("/accountDeposits")
    public List<Deposit> getAccountDeposits(@RequestParam(name ="accountNo") Integer accountNo)
    {
        return aService.getAccountDeposits(accountNo);
    }

    @GetMapping("/userDeposits")
    public List<Deposit> getUserDeposits(@RequestParam(name ="userId") Integer userId)
    {
        return aService.getUserDeposits(userId);
    }

    @PostMapping("/makeDeposit")
    public Receipt makeDeposit (@RequestBody Deposit deposit, @RequestParam(name ="receiptType") String receiptType)
    {
        float balance = aService.getCurrentBalance(deposit.getAccountNo());
        float amount = deposit.getDepositAmount();
        float newBalance = balance + amount;
        Receipt aReceipt = new Receipt(receiptType, balance, newBalance, amount, deposit.getAccountNo());
        aService.setBalance(deposit.getAccountNo(), newBalance);
        aService.addReceipt(aReceipt);
        return aReceipt;
    }

}
