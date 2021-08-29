package com.promineo.entity;
//Template Ryan Modified Jade
public class Teacher {
	private int teacherId;
	private String firstName;
	private String lastName;
	private String roomNumber;

	public Teacher(int teacherId, String firstName, String lastName, String roomNumber) {
		this.teacherId = teacherId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.roomNumber = roomNumber;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
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

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public String toString() {

		return "Teacher ID: " + this.getTeacherId() + " " + "First name: " + this.getFirstName() + " " + "Last name: "
				+ this.getLastName() + " " + "Room Number:" + this.getRoomNumber();

	}
}


