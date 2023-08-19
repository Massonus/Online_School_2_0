package com.example.onlineschool_2_0.repositories;

import com.example.onlineschool_2_0.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String nickname);

}
