package com.aws.codestar.projecttemplates.Service;
import com.aws.codestar.projecttemplates.Entity.*;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BankService {
    public void addUser(User user);

    public void addDeposit(Deposit deposit);

    public void addAccount(Account account);

    public void addReceipt(Receipt receipt);

    public List<User> findAll();

    public List<Account> getUserAccounts(int userId);

    public List<Deposit> getAccountDeposits(int accountNo);

    public List<Deposit> getUserDeposits(int userId);

    public float getCurrentBalance(int accountNo);

    public void setBalance(int accountNo, float newBalance);
}
