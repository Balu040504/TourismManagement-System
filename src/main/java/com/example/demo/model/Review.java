package com.example.demo.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reviews")
public class Review {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(nullable = false)
private Long userId;

@Column(nullable = false)
private Long packageId;

@Column(nullable = false, length = 1000)
private String reviewText;

@Column(nullable = false)
private int rating; // Rating out of 5

@Temporal(TemporalType.TIMESTAMP)
private Date reviewDate;

// Getters and Setters
public Long getId() {
return id;
}

public void setId(Long id) {
this.id = id;
}

public Long getUserId() {
return userId;
}

public void setUserId(Long userId) {
this.userId = userId;
}

public Long getPackageId() {
return packageId;
}

public void setPackageId(Long packageId) {
this.packageId = packageId;
}

public String getReviewText() {
return reviewText;
}

public void setReviewText(String reviewText) {
this.reviewText = reviewText;
}

public int getRating() {
return rating;
}

public void setRating(int rating) {
this.rating = rating;
}

public Date getReviewDate() {
return reviewDate;
}

public void setReviewDate(Date reviewDate) {
this.reviewDate = reviewDate;
}
}
