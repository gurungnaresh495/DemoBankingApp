package com.aws.codestar.projecttemplates.DAO;


import com.aws.codestar.projecttemplates.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AccountRepo extends JpaRepository<Account, Integer> {

    @Query("Select a from Account a where a.userId = :userId")
    public List<Account> getUserAccounts(@Param("userId") int userid);

}
