package com.promineo.entity;

public class JobTitle { //Entire Class Authored By Nathan Moore
	
	private int job_id;
	private int teacher_id;
	private int grade_taught;
	private String start_date;
	private String end_date;
	
	public JobTitle(int job_id, int teacher_id, int grade_taught, String start_date, String end_date) {
		
		this.setJob_id(job_id);
		this.setTeacher_id(teacher_id);
		this.setGrade_taught(grade_taught);
		this.setStart_date(start_date);
		this.setEnd_date(end_date);
	}
	
	public JobTitle(int job_id, int grade_taught) {
		this.setJob_id(job_id);
		this.setGrade_taught(grade_taught);
	}
	
	public JobTitle(int grade_taught) {
		this.setGrade_taught(grade_taught);
	}

	
	public int getJob_id() {
		return job_id;
	}

	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}

	public int getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}

	public int getGrade_taught() {
		return grade_taught;
	}

	public void setGrade_taught(int grade_taught) {
		this.grade_taught = grade_taught;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
}
