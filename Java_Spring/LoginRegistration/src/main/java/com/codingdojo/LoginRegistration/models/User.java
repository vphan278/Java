package com.codingdojo.LoginRegistration.models;

import java.util.Date;



import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {
  // define all the variables with their corrosponding validations , from id, name
  // email password

  // adding the id, applying the rule that it is a unique id , and is auto
  // generated
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  // Username - letters only, at least 3 characters, not blank
  @NotEmpty(message = "Username is required!")
  @Size(min = 3, max = 30, message = "Username must be between 3 and 30 characters")
  private String userName;

  @NotEmpty(message = "Email is required!")
  @Email(message = "Please enter a valid email!")
  private String email;

  @NotEmpty(message = "Password is required!")
  @Size(min = 8, max = 128, message = "Password must be between 8 and 128 characters")
  private String password;
  // Password - at least 8 characters, not blank
  @Transient
  @NotEmpty(message = "Confirm Password is required!")
  @Size(min = 8, max = 128, message = "Confirm Password must be between 8 and 128 characters")
  private String confirm;

  // adding the created at and updated at is crusial for me

  // created at and the updated at columns
  @Column(updatable = false)
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date createdAt;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date updatedAt;

  public User(
      String userName,
      String email,
      String password) {
    this.userName = userName;
    this.email = email;
    this.password = password;
  }

  @PrePersist
  protected void onCreate() {
    this.createdAt = new Date();
  }

  @PreUpdate
  protected void onUpdate() {
    this.updatedAt = new Date();
  }

  // empty constructor
  public User() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getConfirm() {
    return confirm;
  }

  public void setConfirm(String confirm) {
    this.confirm = confirm;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

}