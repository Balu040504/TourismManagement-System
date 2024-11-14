package com.example.demo.service;

import com.example.demo.model.TourPackage;
import com.example.demo.repository.TourPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourPackageService {

    @Autowired
    private TourPackageRepository tourPackageRepository;

    // Method to retrieve all tour packages from the database
    public List<TourPackage> getAllTourPackages() {
        return tourPackageRepository.findAll();
    }

    // You can add more methods for specific functionality, like getting packages by ID, name, etc.
    public TourPackage getTourPackageById(Long id) {
        return tourPackageRepository.findById(id).orElse(null);
    }
}
