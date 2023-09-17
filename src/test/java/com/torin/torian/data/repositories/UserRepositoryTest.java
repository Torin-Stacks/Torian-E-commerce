package com.torin.torian.data.repositories;

import com.torin.torian.TorianApplication;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import com.torin.torian.data.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;


import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class UserRepositoryTest {
@Autowired
private UserRepository userRepository;
@Test
public void testThatUserCanSave(){

    userRepository.save(User.builder().name("torin").password("ultimate").username("torin").emailAddress("test@gmail.com").phoneNumber("090878728").build());
    userRepository.save(User.builder().name("torian").password("optimal").username("torina").emailAddress("test1@gmail.com").phoneNumber("09087890").build());
    Optional <User> foundUser = userRepository.findByEmailAddress("test@gmail.com");
    assertNotNull(foundUser);
}
}