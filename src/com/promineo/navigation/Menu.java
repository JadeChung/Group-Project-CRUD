package com.promineo.navigation;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.promineo.dao.JobTitleDao;
import com.promineo.dao.StudentDao;
import com.promineo.entity.JobTitle;
import com.promineo.entity.Student;

public class Menu {

	Scanner scanner;
	private JobTitleDao jobtitleDao = new JobTitleDao();
	private StudentDao studentDao = new StudentDao();
    
    private List<String> options = Arrays.asList(
    		"Read Job Title", 
    		"Create Job Title", 
    		"Delete Job Title",
    		"Display Students",
    		"Create New Student",
    		"Delete Student",
    		"Update Student");
    
    public Menu(){
        scanner = new Scanner(System.in);
    }

    public void start() throws SQLException {
        //TODO Menu
        String response = "";
        do{
        	printMenu();
            response = scanner.nextLine();
             
            
            if (response.equals("1")) {
            	readJobTitle();
            } else if (response.equals("2")) {
            	createJobTitle();
            	System.out.println("Entry Successfully Created");
            } else if (response.equals("3")) {
            	deleteJobTitle();
            	System.out.println("Entry Successfully Deleted");
            } else if (response.equals("4")) {
            	readStudent();
            } else if (response.equals("5")) {
            	createStudent();
            } else if (response.equals("6")) {
            	deleteStudent();
            } else if (response.equals("7")) {
            	updateStudent();
            } 
            
            System.out.println("Press enter to continue....");
            scanner.nextLine();

        } while(!response.equals("-1"));
    }

    
    private void printMenu() {
    	System.out.println("Select an Option:\n-----------------");
    	
    	for (int i = 0; i < options.size(); i++) {
    		System.out.println(i + 1 + ")" + options.get(i));
    	}
    }
    
    private void createEmergencyContact(){
        //TODO
    }

    private void readEmergencyContact(){
        //TODO
    }

    private void updateEmergencyContact(){
        //TODO
    }

    private void deleteEmergencyContact(){
        //TODO
    }

    private void createGradeLevel(){
        //TODO
    }

    private void readGradeLevel(){
        //TODO
    }

    private void updateGradeLevel(){
        //TODO
    }

    private void deleteGradeLevel(){
        //TODO
    }

    private void createJobTitle() throws SQLException{
        System.out.println("Enter Teacher ID: ");
        int teacher_id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Grade Taught: ");
        int grade_taught = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Start Date: ");
        String start_date = scanner.nextLine();
        System.out.println("Enter End Date: ");
        String end_date = scanner.nextLine();
        jobtitleDao.createJobTitle(teacher_id, grade_taught, start_date, end_date);
    }

    private void readJobTitle() throws SQLException{
        System.out.println("Enter Job ID: ");
        int job_id = Integer.parseInt(scanner.nextLine());
        JobTitle job = jobtitleDao.readJobTitleById(job_id);
        System.out.println("Grade Taught: " + job.getGrade_taught());
       
    }


    private void deleteJobTitle() throws SQLException{
        System.out.println("Enter Job ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        jobtitleDao.deleteJobTitleById(id);
    }
    
    
    private void createStudent() throws SQLException{
        System.out.println("Enter Teacher ID: ");
        int teacher_id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter First Name: ");
        String first_name = scanner.nextLine();
        System.out.println("Enter Last Name: ");
        String last_name = scanner.nextLine();
        System.out.println("Enter Date Of Birth: ");
        String birth_date = scanner.nextLine();
        studentDao.createStudent(teacher_id, first_name, last_name, birth_date);
        
        
    }

    private void readStudent() throws SQLException{
        System.out.println("Enter Teacher ID: ");
        int teacher_id = Integer.parseInt(scanner.nextLine());
        List<Student> student = studentDao.readStudentsByTeacherId(teacher_id);
        for (Student students : student) {
        	System.out.println(students.getFirst_name());
        }
    }

    private void updateStudent() throws SQLException{
        System.out.println("Enter Student ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the student's name? ");
        String first_name = scanner.nextLine();
        System.out.println("What is the student's last name? ");
        String last_name = scanner.nextLine();
        studentDao.updateStudentById(first_name, last_name, id);
    }

    private void deleteStudent() throws SQLException{
    	System.out.println("Enter Student ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        studentDao.deleteStudentById(id);
    }

    private void createTeacher(){
        //TODO
    }

    private void readTeacher(){
        //TODO
    }

    private void updateTeacher(){

    }

}
