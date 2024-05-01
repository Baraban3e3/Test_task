package com.clearsolutionstask.clearsol.repository;


import com.clearsolutionstask.clearsol.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
