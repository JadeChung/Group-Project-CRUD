package com.promineo.entity;

public class Student { //Entire Class Authored By Nathan Moore
	
	private int student_id;
	private int teacher_id;
	private String first_name;
	private String last_name;
	private String birth_date;
	
	public Student(int student_id, int teacher_id, String first_name, String last_name, String birth_date) {
		
		this.setStudent_id(student_id);
		this.setTeacher_id(teacher_id);
		this.setFirst_name(first_name);
		this.setLast_name(last_name);
		this.setBirth_date(birth_date);
		
	}
	
	public Student(String first_name, String last_name) {
		
		this.setFirst_name(first_name);
		this.setLast_name(last_name);
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public int getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}
}
