package com.aws.codestar.projecttemplates.DAO;

import com.aws.codestar.projecttemplates.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
