package com.sapient.trg.service;

import java.time.LocalDate;

public class Person {
	
	private Integer personId;
	private String firtsName;
	private String lastName;
	private LocalDate birthdate;
	private Long mobile;

	
	public Person() {
	}
	
	public Person(Integer personId, String firtsName, String lastName, LocalDate birthdate, Long mobile) {
		super();
		this.personId = personId;
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.birthdate = birthdate;
		this.mobile = mobile;
	}
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getFirtsName() {
		return firtsName;
	}
	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	
	
	
}
