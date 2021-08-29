package com.promineo.dao;

//Author Jade
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.promineo.DBConnection;
import com.promineo.entity.Teacher;

public class TeacherDao {

	private Connection connection;
	private final String CREATE_NEW_TEACHER = "INSERT INTO teacher(first_name, last_name, room_number) VALUES(?, ?, ?)";
	private final String READ_TEACHER = "SELECT * FROM teacher WHERE teacher_id = ?";
	private final String UPDATE_TEACHER_BY_ID = "UPDATE teacher SET teacher_id = ?, first_name = ?, last_name = ?, room_number = ? WHERE teacher_id = ?";

	public TeacherDao() {
		this.connection = DBConnection.getConnection();

	}

	public void createTeacher(String firstName, String lastName, String roomNumber) throws SQLException {
		PreparedStatement preparedstatement = connection.prepareStatement(CREATE_NEW_TEACHER);
		preparedstatement.setString(1, firstName);
		preparedstatement.setString(2, lastName);
		preparedstatement.setString(3, roomNumber);
		preparedstatement.executeUpdate();
		System.out.println("Teacher added to database for 2020-2021 school year!");
	}

	public Teacher readTeacherByTeacherId(int teacherId) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement(READ_TEACHER);
		preparedStatement.setInt(1, teacherId);
		ResultSet RS = preparedStatement.executeQuery();
		if (RS.next()) {
			return new Teacher(RS.getInt(1), RS.getString(2), RS.getString(3), RS.getString(4));
		} else {
			System.out.println("Teacher ID is invalid!");
			return null;
		}

	}

	public void updateTeacher(int teacherId, String firstName, String lastName, String roomNumber) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_TEACHER_BY_ID);
		preparedStatement.setInt(1, teacherId);
		preparedStatement.setString(2, firstName);
		preparedStatement.setString(3, lastName);
		preparedStatement.setString(4, roomNumber);
		preparedStatement.executeUpdate();
		System.out.println("Teacher information updated!");
	}

}
