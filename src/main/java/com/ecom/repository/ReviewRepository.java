package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.beans.Review;
@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer>{
	

}
