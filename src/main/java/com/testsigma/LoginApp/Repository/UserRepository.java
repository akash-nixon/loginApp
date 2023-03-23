package com.testsigma.LoginApp.Repository;

import com.testsigma.LoginApp.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
