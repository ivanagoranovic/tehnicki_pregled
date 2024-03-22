package com.tehnikus.tehnicki_pregled.repository;

import com.tehnikus.tehnicki_pregled.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
