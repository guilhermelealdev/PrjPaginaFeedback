package com.guilhermef.br.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guilhermef.br.entities.Feedback;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long>{
	
	public List<Feedback> findByUserUsername(String username);
	public List<Feedback> findByType(String type);
	public List<Feedback> findByStatus(String status);
	
}
