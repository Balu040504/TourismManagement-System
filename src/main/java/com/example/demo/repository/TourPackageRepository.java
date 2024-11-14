package com.example.demo.repository;

import com.example.demo.model.TourPackage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourPackageRepository extends JpaRepository<TourPackage, Long> {
    // Additional custom queries can be added here if necessary
}
