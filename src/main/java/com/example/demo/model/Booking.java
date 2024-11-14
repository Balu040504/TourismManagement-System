package com.example.demo.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bookings")
public class Booking {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(nullable = false)
private Long userId;

@Column(nullable = false)
private Long packageId;

@Column(nullable = false)
@Temporal(TemporalType.DATE)
private Date bookingDate;

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

public Date getBookingDate() {
return bookingDate;
}

public void setBookingDate(Date bookingDate) {
this.bookingDate = bookingDate;
}
}
