package com.promineo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.promineo.DBConnection;
import com.promineo.entity.JobTitle;

public class JobTitleDao {

	private Connection connection;
	private final String GET_JOBTITLE_Query = "SELECT grade_taught FROM job_title WHERE teacher_id = ? AND start_date = ?";
	private final String CREATE_NEW_JOBTITLE_QUERY = "INSERT INTO job_title(teacher_id, grade_taught, start_date, end_date) VALUES(?,?,?,?)";
	private final String DELETE_JOBTITLE_BY_JOBID = "DELETE FROM job_title WHERE job_id = ?";
	
    //TODO SQL statements

    public JobTitleDao(){
        //TODO
    	connection = DBConnection.getConnection();
    }
    
    public JobTitle getjobTitle(int teacher_id, String start_date) throws SQLException {
    	PreparedStatement ps = connection.prepareStatement(GET_JOBTITLE_Query);
    	ps.setInt(1, teacher_id);
    	ps.setString(2, start_date);
    	ResultSet rs = ps.executeQuery();
    	rs.next();
    	return populateGrade(rs.getInt(2));
    	
    }
    
    private JobTitle populateGrade(int grade_level) {
    	return new JobTitle(grade_level);
    }

    public void createJobTitle(int teacher_id, int grade_taught, String start_date, String end_date) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(CREATE_NEW_JOBTITLE_QUERY);
        ps.setInt(1, teacher_id);
        ps.setInt(2, grade_taught);
        ps.setString(3, start_date);
        ps.setString(4, end_date);
        ps.executeUpdate();
    }

    public JobTitle readJobTitleById(int id){
        return null; //TODO
    }


    public void deleteJobTitleById(int id) throws SQLException{
    	PreparedStatement ps = connection.prepareStatement(DELETE_JOBTITLE_BY_JOBID);
    	ps.setInt(1, id);
    	ps.executeUpdate();
    }

}
