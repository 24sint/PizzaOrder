package com.tts.pizzaorder.customerorder;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

@Entity
public class CustomerOrder {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
		private Long id;
		
		private String firstName;
		private String lastName;
		private String email;
		private String phoneNumber;
		private String numberOfOrder;
		private String timeOfOrder;
	
	@Column
	@CreationTimestamp
		private Date signedUp;


 public CustomerOrder(String firstName, String lastName, String email, String phoneNumber, String numberOfOrder,String timeOfOrder, Date signedUp){
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.numberOfOrder = numberOfOrder;
		this.timeOfOrder = timeOfOrder;
		this.signedUp = signedUp;
}


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


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getPhoneNumber() {
	return phoneNumber;
}


public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}


public String getNumberOfOrder() {
	return numberOfOrder;
}


public void setNumberOfOrder(String numberOfOrder) {
	this.numberOfOrder = numberOfOrder;
}


public String getTimeOfOrder() {
	return timeOfOrder;
}


public void setTimeOfOrder(String timeOfOrder) {
	this.timeOfOrder = timeOfOrder;
}


public Date getSignedUp() {
	return signedUp;
}


public void setSignedUp(Date signedUp) {
	this.signedUp = signedUp;
}


@Override
public String toString() {
	return "Pizza [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
			+ ", phoneNumber=" + phoneNumber + ", numberOfOrder=" + numberOfOrder + ", timeOfOrder=" + timeOfOrder
			+ ", signedUp=" + signedUp + "]";
}	

}   



