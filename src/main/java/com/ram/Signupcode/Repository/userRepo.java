package com.example.GatherHubProject.Repository;

import com.example.GatherHubProject.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface userRepo  extends JpaRepository<User,Integer> {

User findByemail(String email);




}
