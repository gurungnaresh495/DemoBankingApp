package com.aws.codestar.projecttemplates.Service;


import com.aws.codestar.projecttemplates.DAO.*;
import com.aws.codestar.projecttemplates.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankService{

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private AccountRepo accountRepo;

    @Autowired
    private DepositRepo depositRepo;

    @Autowired
    private ReceiptRepo receiptRepo;

    @Override
    public void addUser(User user) {
        userRepo.save(user);
    }

    @Override
    public void addDeposit(Deposit deposit) {
        depositRepo.save(deposit);
    }

    @Override
    public void addAccount(Account account) {
        accountRepo.save(account);
    }

    @Override
    public void addReceipt(Receipt receipt) {
        receiptRepo.save(receipt);
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public List<Account> getUserAccounts(int userId) {
        return (List<Account>) accountRepo.getUserAccounts(userId);
    }
}
