package com.promineo.navigation;


import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import com.promineo.dao.EmergencyContactDao;
import com.promineo.dao.GradeLevelDao;
import com.promineo.entity.EmergencyContact;
import com.promineo.entity.GradeLevel;

import java.sql.SQLException;
import java.util.Scanner;

import com.promineo.dao.JobTitleDao;
import com.promineo.dao.StudentDao;
import com.promineo.dao.TeacherDao;
import com.promineo.entity.JobTitle;
import com.promineo.entity.Student;
import com.promineo.entity.Teacher;

public class Menu {


	Scanner scanner;
	private JobTitleDao jobtitleDao = new JobTitleDao();
	private StudentDao studentDao = new StudentDao();
	private TeacherDao teacherDao = new TeacherDao();
    EmergencyContactDao emergencyContactDao;
    GradeLevelDao gradeLevelDao;

    public Menu(){//Author Ryan Leyva

        scanner = new Scanner(System.in);
        emergencyContactDao = new EmergencyContactDao();
        gradeLevelDao = new GradeLevelDao();
    }
    
    		
    public void start(){//Author Ryan Leyva
        String response = "";
        try{

            do{
                printMainMenu();
                response = scanner.nextLine();
                int i = Integer.parseInt(response);
                switch(i){
                    case 1:
                        this.manageStudents(); //Manage Emergency Contacts
                        break;
                    case 2:
                        this.manageGradeLevels(); //Manage Grade levels
                        break;
                    case 3:
                        this.manageEmergencyContacts(); // Manage Emergency Contacts
                        break;
                    case 4:
                        this.manageTeachers(); //Manage Teachers
                        break;
                    case 5:
                        this.manageJobTitles();

                }

            }while(!response.equals("-1"));

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    private void printMainMenu(){//Author Ryan Leyva
        System.out.println("Please select an option:");
        System.out.println("-1. " + "Exit");
        System.out.println("1. " + "Manage Students");
        System.out.println("2. " + "Manage Grade Levels");
        System.out.println("3. " + "Manage Student Emergency Contacts");
        System.out.println("4. " + "Manage Teachers");
        System.out.println("5. " + "Manage Job Titles");
    }

    private void manageStudents(){//Author Ryan Leyva

        String response = "";
        try{

            do{
                printStudentMenu();

                response = scanner.nextLine();
                int i = Integer.parseInt(response);
                switch(i){
                    case 1:
                        this.createStudent();
                        break;
                    case 2:
                        this.readStudent();
                        break;
                    case 3:
                        this.updateStudent();
                        break;
                    case 4:
                        this.deleteStudent();

                }

            }while(!response.equals("-1"));

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    private void printStudentMenu(){ //Author Ryan Leyva
        System.out.println("Please select an option:");
        System.out.println("-1. " + "Back");
        System.out.println("1. " + "Create student");
        System.out.println("2. " + "List a Teacher's Students");
        System.out.println("3. " + "Update student");
        System.out.println("4. " + "Delete student");
    }



    private void manageEmergencyContacts(){ //Author Ryan Leyva

        String response = "";
        try{

            do{
                printEmergencyContactsMenu();
                response = scanner.nextLine();
                int i = Integer.parseInt(response);
                switch(i){
                    case 1:
                        this.createEmergencyContact();
                        break;
                    case 2:
                        this.readEmergencyContact();
                        break;
                    case 3:
                        this.updateEmergencyContact();
                        break;
                    case 4:
                        this.deleteEmergencyContact();
                        break;
                }

            }while(!response.equals("-1"));

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    private void printEmergencyContactsMenu(){ //Author Ryan Leyva
        System.out.println("Please select an option:");
        System.out.println("-1. " + "Back");
        System.out.println("1. " + "Create emergency contact");
        System.out.println("2. " + "Read emergency contact");
        System.out.println("3. " + "Update emergency contact");
        System.out.println("4. " + "Delete emergency contact");
    }

    private void manageTeachers(){ //Author Ryan Leyva

        String response = "";
        try{

            do{
                printTeachersMenu();

                response = scanner.nextLine();
                int i = Integer.parseInt(response);
                switch(i){
                    case 1:
                        this.createTeacher();
                        break;
                    case 2:
                        this.readTeacher();
                    case 3:
                        this.updateTeacher();

                }

            }while(!response.equals("-1"));

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void printTeachersMenu(){ //Author Ryan Leyva
        System.out.println("Please select an option:");
        System.out.println("-1. " + "Back");
        System.out.println("1. " + "Create teacher");
        System.out.println("2. " + "Read teacher");
        System.out.println("3. " + "Update teacher");
    }

    private void manageJobTitles(){ //Author Ryan Leyva

        String response = "";
        try{

            do{
            	printJobTitlesMenu();

                response = scanner.nextLine();
                int i = Integer.parseInt(response);
                switch(i){
                    case 1:
                        this.createJobTitle();
                        break;
                    case 2:
                        this.readJobTitle();
                        break;
                    case 3:
                        this.deleteJobTitle();

                }

            }while(!response.equals("-1"));

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void printJobTitlesMenu(){ //Author Ryan Leyva
        System.out.println("Please select an option:");
        System.out.println("-1. " + "Back");
        System.out.println("1. " + "Create job titles");
        System.out.println("2. " + "Read job titles");
        System.out.println("3. " + "Delete job titles");
    }

    private void manageGradeLevels(){ //Author Ryan Leyva

        String response = "";
        try{

            do{
                printGradeLevelsMenu();

                response = scanner.nextLine();
                int i = Integer.parseInt(response);
                switch(i){
                    case 1:
                        this.createGradeLevel();
                        break;
                    case 2:
                        this.readGradeLevel();
                        break;
                    case 3:
                        this.updateGradeLevel();
                        break;
                    case 4:
                        this.deleteGradeLevel();
                        break;

                }

            }while(!response.equals("-1"));

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void printGradeLevelsMenu(){ //Author Ryan Leyva
        System.out.println("Please select an option:");
        System.out.println("-1. " + "Exit");
        System.out.println("1. " + "Create grade level");
        System.out.println("2. " + "Read grade level");
        System.out.println("3. " + "Update grade level");
        System.out.println("4. " + "Delete grade level");

    }


    private void createEmergencyContact() throws SQLException { //Author Ryan Leyva
        int studentId;
        String firstName;
        String lastName;
        String phoneNumber;
        String email;
        printRequestMessage("valid student Id", "emergency Contact");
        String temp = scanner.nextLine();
        studentId= Integer.parseInt(temp);
        printRequestMessage("first name", "emergency Contact");
        firstName = scanner.nextLine();
        printRequestMessage("last name", "emergency Contact");
        lastName = scanner.nextLine();
        printRequestMessage("phone number", "emergency Contact");
        System.out.println("Format: (555) 555 5555");
        phoneNumber = scanner.nextLine();
        printRequestMessage("email address", "emergency Contact");
        email = scanner.nextLine();
        emergencyContactDao.createEmergencyContact(studentId, firstName, lastName, phoneNumber, email);
    }



    private void readEmergencyContact() throws SQLException { //Author Ryan Leyva
        int id;
        printRequestMessage("id", "emergency Contact");
        String temp = scanner.nextLine();
        id= Integer.parseInt(temp);
        EmergencyContact contact = emergencyContactDao.readEmergencyContactById(id);
        if(contact != null){
            System.out.println(contact.toString());
        }
    }

    private void updateEmergencyContact() throws SQLException { //Author Ryan Leyva
        int id;
        printRequestMessage("id", "emergency Contact");
        String temp = scanner.nextLine();
        id= Integer.parseInt(temp);
        EmergencyContact contact = emergencyContactDao.readEmergencyContactById(id);
        System.out.println("Current values:");
        System.out.println(contact.toString());

        int studentId;
        String firstName;
        String lastName;
        String phoneNumber;
        String email;
        printRequestMessage("valid student Id", "emergency Contact");
        String temp1 = scanner.nextLine();
        studentId= Integer.parseInt(temp1);
        printRequestMessage("first name", "emergency Contact");
        firstName = scanner.nextLine();
        printRequestMessage("last name", "emergency Contact");
        lastName = scanner.nextLine();
        printRequestMessage("phone number", "emergency Contact");
        System.out.println("Format: (555) 555 5555");
        phoneNumber = scanner.nextLine();
        printRequestMessage("email address", "emergency Contact");
        email = scanner.nextLine();
        emergencyContactDao.updateEmergencyContact(id, studentId, firstName, lastName, phoneNumber, email);

    }

    private void readGradeLevel() throws SQLException { //Author Ryan Leyva
        int id;
        printRequestMessage("id", "grade level record");
        String temp = scanner.nextLine();
        id= Integer.parseInt(temp);
        GradeLevel gradeLevel = gradeLevelDao.readGradeLevelById(id);
        System.out.println(gradeLevel.toString());
    }

    private void updateGradeLevel() throws SQLException { //Author Ryan Leyva
        int id;
        printRequestMessage("id", "grade level to update");
        String temp = scanner.nextLine();
        id= Integer.parseInt(temp);
        GradeLevel gradeLevelObj = gradeLevelDao.readGradeLevelById(id);
        System.out.println("Current values:");
        System.out.println(gradeLevelObj.toString());
        int studentId;
        int teacherId;
        int gradeLevel;
        printRequestMessage("valid student ID", "grade level record");
        String tempStudentId = scanner.nextLine();
        studentId= Integer.parseInt(tempStudentId);
        printRequestMessage("valid teacher ID", "grade level record");
        String tempTeacherId = scanner.nextLine();
        teacherId = Integer.parseInt(tempTeacherId);
        printRequestMessage("the students grade level", "grade level record");
        String tempGrade = scanner.nextLine();
        gradeLevel = Integer.parseInt(tempGrade);
        gradeLevelDao.updateGradeLevelById(id, studentId, teacherId, gradeLevel);
    }

    private void deleteGradeLevel() throws SQLException { //Author Ryan Leyva
        int id;
        printRequestMessage("id", "grade level record");
        String temp = scanner.nextLine();
        id= Integer.parseInt(temp);
        gradeLevelDao.deleteGradeLevelById(id);

    }


    private void deleteEmergencyContact() throws SQLException { //Author Ryan Leyva
        int id;
        printRequestMessage("id", "emergency Contact");
        String temp = scanner.nextLine();
        id= Integer.parseInt(temp);
        emergencyContactDao.deleteEmergencyContactById(id);
    }

    private void createGradeLevel() throws SQLException { //Author Ryan Leyva
        int studentId;
        int teacherId;
        int gradeLevel;
        printRequestMessage("valid student ID", "grade level record");
        String tempStudentId = scanner.nextLine();
        studentId= Integer.parseInt(tempStudentId);
        printRequestMessage("valid teacher ID", "grade level record");
        String tempTeacherId = scanner.nextLine();
        teacherId = Integer.parseInt(tempTeacherId);
        printRequestMessage("the students grade level", "grade level record");
        String tempGrade = scanner.nextLine();
        gradeLevel = Integer.parseInt(tempGrade);
        gradeLevelDao.createGradeLevel(studentId, teacherId, gradeLevel);

    }
    
    private void createJobTitle() throws SQLException{ //Author Nathan Moore
        System.out.println("Enter Teacher ID: ");
        int teacher_id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Grade Taught: ");
        int grade_taught = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Start Date: ");
        String start_date = scanner.nextLine();
        System.out.println("Enter End Date: ");
        String end_date = scanner.nextLine();
        jobtitleDao.createJobTitle(teacher_id, grade_taught, start_date, end_date);
        System.out.println("Job Assignment Successfully Added");
    }

    private void readJobTitle() throws SQLException{ //Author Nathan Moore
        System.out.println("Enter Job ID: ");
        int job_id = Integer.parseInt(scanner.nextLine());
        JobTitle job = jobtitleDao.readJobTitleById(job_id);
        System.out.println("Grade Taught: " + job.getGrade_taught());
       
    }


    private void deleteJobTitle() throws SQLException{ //Author Nathan Moore
        System.out.println("Enter Job ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        jobtitleDao.deleteJobTitleById(id);
        System.out.println("Job Assignment Successfully Deleted");
    }
    
    
    private void createStudent() throws SQLException{ //Author Nathan Moore
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

    private void readStudent() throws SQLException{ //Author Nathan Moore
        System.out.println("Enter Teacher ID: ");
        int teacher_id = Integer.parseInt(scanner.nextLine());
        List<Student> student = studentDao.readStudentsByTeacherId(teacher_id);
        for (Student students : student) {
        	System.out.println(students.getFirst_name() + " " + students.getLast_name());
        }
    }

    private void updateStudent() throws SQLException{ //Author Nathan Moore
        System.out.println("Enter Student ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the student's name? ");
        String first_name = scanner.nextLine();
        System.out.println("What is the student's last name? ");
        String last_name = scanner.nextLine();
        studentDao.updateStudentById(first_name, last_name, id);
        System.out.println("Successfully Updated");
    }

    private void deleteStudent() throws SQLException{ //Author Nathan Moore
    	System.out.println("Enter Student ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        studentDao.deleteStudentById(id);
        System.out.println("Successfully Deleted");
    }

    private void createTeacher(){
        //TODO
    }

    private void readTeacher() throws SQLException{
        System.out.println("Enter the Teacher ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        Teacher teacher = teacherDao.readTeacherByTeacherId(id);
        System.out.println("Teacher ID: " + teacher.getTeacherId() + " First Name: " + teacher.getFirstName() + " Last Name: " 
        + teacher.getLastName() + " Room Number: " + teacher.getRoomNumber());
        
        
    }

    private void updateTeacher(){

    }

    private void printRequestMessage(String var, String obj){
        System.out.println("Enter the " + var + " of the "+ obj +":");
    }

}

 