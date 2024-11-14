package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "hotels")
public class Hotel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(nullable = false)
private String name;

@Column(nullable = false, length = 1000)
private String address;

@Column(nullable = false)
private String city;

@Column(nullable = false)
private String phoneNumber;

@Column
private String amenities; // Comma-separated list of amenities

@Column
private Long packageId; // Foreign key
}