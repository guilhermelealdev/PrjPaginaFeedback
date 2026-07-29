package com.guilhermef.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guilhermef.br.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
