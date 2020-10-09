package com.aws.codestar.projecttemplates.DAO;


import com.aws.codestar.projecttemplates.Entity.Account;
import com.aws.codestar.projecttemplates.Entity.Deposit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface DepositRepo extends JpaRepository<Deposit, Integer> {

    @Query("Select d from Deposit d where d.accountNo = :accountNo")
    public List<Deposit> getAccountDeposits(@Param("accountNo") int accountNo);

    @Query("Select d from Deposit d JOIN Account a ON d.accountNo = a.accountNo WHERE a.userId = :userid")
    public List<Deposit> getUserDeposits(@Param("userid") int userId);

    @Query("Select a.currentBalance from Account a  WHERE a.accountNo =  :accountNo")
    public float getAccountBalance (@Param("accountNo") int accountNo);

    @Transactional
    @Modifying
    @Query("Update Account SET currentBalance = :newBalance WHERE accountNo = :accountNo")
    public void setBalance(@Param("accountNo") int accountNo, @Param("newBalance") float newBalance);

}
