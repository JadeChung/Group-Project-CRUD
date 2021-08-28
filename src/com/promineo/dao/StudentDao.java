package com.promineo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.promineo.DBConnection;
import com.promineo.entity.Student;

public class StudentDao { //Entire Class Authored By Nathan Moore

	private Connection connection;
	private final String GET_STUDENTS_QUERY = "SELECT * FROM student WHERE teacher_id = ?";
	private final String CREATE_STUDENT_QUERY = "INSERT INTO student(teacher_id, first_name, last_name, birth_date) VALUES(?,?,?,?)";
	private final String DELETE_STUDENT_BY_STUDENTID = "DELETE FROM student WHERE student_id = ?";
	private final String UPDATE_STUDENT_BY_ID = "UPDATE student SET first_name = ?, last_name = ? WHERE student_id = ?";

    public StudentDao(){
		connection = DBConnection.getConnection();
    }

    public void createStudent(int teacher_id, String first_name, String last_name, String birth_date) throws SQLException{
    	PreparedStatement ps = connection.prepareStatement(CREATE_STUDENT_QUERY);
    	ps.setInt(1, teacher_id);
        ps.setString(2, first_name);
        ps.setString(3, last_name);
        ps.setString(4, birth_date);
        ps.executeUpdate();
    }

    public List<Student> readStudentsByTeacherId(int teacher_id) throws SQLException{
    	PreparedStatement ps = connection.prepareStatement(GET_STUDENTS_QUERY);
    	ps.setInt(1, teacher_id);
    	ResultSet rs = ps.executeQuery();
    	List<Student> students = new ArrayList<Student>();
    	
    	while (rs.next()) {
    		students.add(new Student(rs.getString(3), rs.getString(4)));
    	}
    	
    	return students;
    }

	public void updateStudentById(String first_name, String last_name, int id) throws SQLException{
        PreparedStatement ps = connection.prepareStatement(UPDATE_STUDENT_BY_ID);
        ps.setString(1, first_name);
        ps.setString(2, last_name);
        ps.setInt(3, id);
        ps.executeUpdate();
    }

    public void deleteStudentById(int id) throws SQLException{
    	PreparedStatement ps = connection.prepareStatement(DELETE_STUDENT_BY_STUDENTID);
    	ps.setInt(1, id);
    	ps.executeUpdate();
    }

}
