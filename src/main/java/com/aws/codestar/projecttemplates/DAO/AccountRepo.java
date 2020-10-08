package com.aws.codestar.projecttemplates.DAO;


import com.aws.codestar.projecttemplates.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account, Integer> {

}
