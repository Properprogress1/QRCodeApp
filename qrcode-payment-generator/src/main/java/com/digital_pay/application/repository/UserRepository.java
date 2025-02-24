package com.digital_pay.application.repository;

import com.digital_pay.application.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
