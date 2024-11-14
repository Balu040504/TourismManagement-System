package com.example.demo.repository;

import com.example.demo.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByPackageId(Long packageId); // Get all reviews for a specific tour package
    List<Review> findByUserId(Long userId); // Get all reviews posted by a specific user
}
