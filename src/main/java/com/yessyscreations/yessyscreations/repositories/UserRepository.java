package com.yessyscreations.yessyscreations.repositories;

import com.yessyscreations.yessyscreations.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long>{
}
