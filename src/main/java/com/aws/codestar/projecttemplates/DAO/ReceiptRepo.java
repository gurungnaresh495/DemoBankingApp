package com.aws.codestar.projecttemplates.DAO;


import com.aws.codestar.projecttemplates.Entity.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceiptRepo extends JpaRepository<Receipt, Integer> {
}
