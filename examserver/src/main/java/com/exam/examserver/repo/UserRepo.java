package com.exam.examserver.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.examserver.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

	public User findByUserName(String userName);

}
