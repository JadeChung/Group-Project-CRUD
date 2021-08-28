package com.promineo.dao;

import com.promineo.DBConnection;
import com.promineo.entity.EmergencyContact;
import com.promineo.entity.GradeLevel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GradeLevelDao {

    //TODO SQL statements
    private Connection connection;
    private final String CREATE_NEW_GRADE_LEVEL =
            "INSERT INTO grade_level(student_id, teacher_id, grade_level) VALUES(?, ?, ?)";
    private final String READ_GRADE_LEVEL = "SELECT * FROM grade_level WHERE grade_id = ?";
    private final String UPDATE_GRADE_LEVEL_BY_ID =
            "UPDATE grade_level SET student_id = ?, teacher_id = ?, grade_level = ? WHERE grade_id = ?";
    private final String DELETE_GRADE_LEVEL_BY_ID = "DELETE FROM grade_level WHERE grade_id = ?";

    public GradeLevelDao(){
        this.connection = DBConnection.getConnection();
        //TODO
    }

    public void createGradeLevel(int studentId, int teacherId, int gradeLevel) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(CREATE_NEW_GRADE_LEVEL);
        preparedStatement.setInt(1 ,studentId);
        preparedStatement.setInt(2, teacherId);
        preparedStatement.setInt(3, gradeLevel);
        preparedStatement.executeUpdate();
        System.out.println("Record created!");
    }

    public GradeLevel readGradeLevelById(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(READ_GRADE_LEVEL);
        preparedStatement.setInt(1, id);
        ResultSet resultSet =preparedStatement.executeQuery();
        if(resultSet.next()){
            return new GradeLevel(resultSet.getInt(1),
                    resultSet.getInt(2),
                    resultSet.getInt(3),
                    resultSet.getInt(4));
        }else{
            System.out.println("Invalid Id!");
            return null;
        }
    }

    public void updateGradeLevelById(int id, int studentId, int teacherId, int gradeLevel) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_GRADE_LEVEL_BY_ID);
        preparedStatement.setInt(1, studentId);
        preparedStatement.setInt(2, teacherId);
        preparedStatement.setInt(3, gradeLevel);
        preparedStatement.setInt(4, id);
        preparedStatement.executeUpdate();
        System.out.println("Record updated!");
    }

    public void deleteGradeLevelById(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_GRADE_LEVEL_BY_ID);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
        System.out.println("Record deleted!");
    }

}
