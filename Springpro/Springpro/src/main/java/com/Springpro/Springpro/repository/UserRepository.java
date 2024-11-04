package com.Springpro.Springpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Springpro.Springpro.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    // Custom query methods can be added here if needed
}
