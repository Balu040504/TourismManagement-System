package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Hotel;

import java.util.List;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
    List<Hotel> findByPackageId(Long packageId); // Get all hotels associated with a specific tour package
    List<Hotel> findByCity(String city); // Get all hotels in a specific city
}
