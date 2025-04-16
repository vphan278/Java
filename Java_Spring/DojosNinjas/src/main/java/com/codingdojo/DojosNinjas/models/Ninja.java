package com.codingdojo.DojosNinjas.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "ninjas")
public class Ninja{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 3, max = 200)
	private String firstName;
	
	 @NotNull
	 @Size(min = 3, max = 200)
	 private String lastName;
	
	 @NotNull
	  // @Min(100)
	 @Min(value = 18, message = "Must be at least 0")
	 private Integer age;
	 
	 // created at and the updated at columns
	 @Column(updatable = false)
	 @DateTimeFormat(pattern = "yyyy-MM-dd")
	 private Date createdAt;
	 @DateTimeFormat(pattern = "yyyy-MM-dd")
	 private Date updatedAt;
	 
	 //One to Many
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "dojo_id")
	 private Dojo dojo;
	 
	 //empty and full constructor
	 public Ninja() {
		 
	 }
	 
	 public Ninja(String firstName, String lastName, Integer age) {
		    this.firstName = firstName;
		    this.lastName = lastName;
		    this.age = age;
	 }
	 
	 @PrePersist
	  protected void onCreate() {
	    this.createdAt = new Date();
	  }

	  @PreUpdate
	  protected void onUpdate() {
	    this.updatedAt = new Date();
	  }

	//Getters and Setters
		public Long getId() {
			return id;
		}
	
		public void setId(Long id) {
			this.id = id;
		}
	
		public String getFirstName() {
			return firstName;
		}
	
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
	
		public String getLastName() {
			return lastName;
		}
	
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
	
		public Integer getAge() {
			return age;
		}
	
		public void setAge(Integer age) {
			this.age = age;
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
	
		public Dojo getDojo() {
			return dojo;
		}
	
		public void setDojo(Dojo dojo) {
			this.dojo = dojo;
		}
	 
	  
	 
	 
}
