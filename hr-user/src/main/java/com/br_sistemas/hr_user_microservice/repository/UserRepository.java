package com.br_sistemas.hr_user_microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br_sistemas.hr_user_microservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail (String email);

}
