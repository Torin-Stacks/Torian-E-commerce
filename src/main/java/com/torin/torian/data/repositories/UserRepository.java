package com.torin.torian.data.repositories;

import com.torin.torian.data.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByEmailAddress(String email);

}
