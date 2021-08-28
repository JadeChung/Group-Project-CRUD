package com.promineo.dao;


import com.promineo.DBConnection;
import com.promineo.entity.EmergencyContact;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmergencyContactDao { //Author Ryan Leyva

    private Connection connection;
    private final String CREATE_NEW_EMERGENCY_CONTACT =
            "INSERT INTO emergency_contact(student_id, first_name, last_name, phone_number, email) VALUES(?, ?, ?, ?, ?)";
    private final String READ_EMERGENCY_CONTACT = "SELECT * FROM emergency_contact WHERE contact_id = ?";
    private final String UPDATE_EMERGENCY_CONTACT_BY_ID =
            "UPDATE emergency_contact SET student_id = ?, first_name = ?, last_name = ?, phone_number = ?, email = ? WHERE contact_id = ?";
    private final String DELETE_EMERGENCY_CONTACT_BY_ID = "DELETE FROM emergency_contact WHERE contact_id = ?";


    public EmergencyContactDao(){
        this.connection = DBConnection.getConnection();
    }

    public void createEmergencyContact(int studentId,
                                       String firstName,
                                       String lastName,
                                       String phoneNumber,
                                       String email) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(CREATE_NEW_EMERGENCY_CONTACT);
        preparedStatement.setInt(1, studentId);
        preparedStatement.setString(2, firstName);
        preparedStatement.setString(3, lastName);
        preparedStatement.setString(4, phoneNumber);
        preparedStatement.setString(5, email);
        preparedStatement.executeUpdate();
        System.out.println("Record created!");
    }

    public EmergencyContact readEmergencyContactById(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(READ_EMERGENCY_CONTACT);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()){
            return new EmergencyContact(resultSet.getInt(1),
                    resultSet.getInt(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5),
                    resultSet.getString(6));
        }else{
            System.out.println("Invalid record ID!");
            return null;
        }

    }

    public void updateEmergencyContact(int id,
                                       int studentId,
                                       String firstName,
                                       String lastName,
                                       String phoneNumber,
                                       String email) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_EMERGENCY_CONTACT_BY_ID);
        preparedStatement.setInt(1, studentId);
        preparedStatement.setString(2, firstName);
        preparedStatement.setString(3, lastName);
        preparedStatement.setString(4, phoneNumber);
        preparedStatement.setString(5, email);
        preparedStatement.setInt(6, id);
        preparedStatement.executeUpdate();
        System.out.println("Record updated!");
    }

    public void deleteEmergencyContactById(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_EMERGENCY_CONTACT_BY_ID);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
        System.out.println("Record deleted!");
    }

}
