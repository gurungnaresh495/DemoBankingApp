package com.aws.codestar.projecttemplates.DAO;


import com.aws.codestar.projecttemplates.Entity.Deposit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepositRepo extends JpaRepository<Deposit, Integer> {
}
