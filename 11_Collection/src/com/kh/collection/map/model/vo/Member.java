package com.kh.collection.map.model.vo;

public class Member {
	private String id;
	private String password;
	private String name;
	private String birthDay;
	private String phone;
	
	public Member() {}

	public Member(String id, String password, String name, String birthDay, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.birthDay = birthDay;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public String getPhone() {
		return phone;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", birthDay=" + birthDay + ", phone="
				+ phone + "]";
	}
}
