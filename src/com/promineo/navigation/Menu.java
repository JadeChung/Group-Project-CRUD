package com.promineo.navigation;

import com.promineo.dao.EmergencyContactDao;
import com.promineo.dao.GradeLevelDao;
import com.promineo.entity.EmergencyContact;
import com.promineo.entity.GradeLevel;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    Scanner scanner;
    EmergencyContactDao emergencyContactDao;
    GradeLevelDao gradeLevelDao;

    public Menu(){
        scanner = new Scanner(System.in);
        emergencyContactDao = new EmergencyContactDao();
        gradeLevelDao = new GradeLevelDao();
    }

    public void start(){
        //TODO Menu
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

    private void printMainMenu(){
        System.out.println("Please select an option:");
        System.out.println("-1. " + "Exit");
        System.out.println("1. " + "Manage Students");
        System.out.println("2. " + "Manage Grade Levels");
        System.out.println("3. " + "Manage Student Emergency Contacts");
        System.out.println("4. " + "Manage Teachers");
        System.out.println("5. " + "Manage Job Titles");
    }

    private void manageStudents(){
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
                    case 3:
                        this.updateStudent();
                    case 4:
                        this.deleteStudent();
                }

            }while(!response.equals("-1"));

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void printStudentMenu(){
        System.out.println("Please select an option:");
        System.out.println("-1. " + "Back");
        System.out.println("1. " + "Create student");
        System.out.println("2. " + "Read student");
        System.out.println("3. " + "Update student");
        System.out.println("4. " + "Delete student");
    }



    private void manageEmergencyContacts(){

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

    private void printEmergencyContactsMenu(){
        System.out.println("Please select an option:");
        System.out.println("-1. " + "Back");
        System.out.println("1. " + "Create emergency contact");
        System.out.println("2. " + "Read emergency contact");
        System.out.println("3. " + "Update emergency contact");
        System.out.println("4. " + "Delete emergency contact");
    }

    private void manageTeachers(){
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

    private void printTeachersMenu(){
        System.out.println("Please select an option:");
        System.out.println("-1. " + "Back");
        System.out.println("1. " + "Create teacher");
        System.out.println("2. " + "Read teacher");
        System.out.println("3. " + "Update teacher");
    }

    private void manageJobTitles(){
        String response = "";
        try{

            do{
                printEmergencyContactsMenu();
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
                    case 4:
                        this.deleteEmergencyContact();
                }

            }while(!response.equals("-1"));

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void printJobTitlesMenu(){
        System.out.println("Please select an option:");
        System.out.println("-1. " + "Back");
        System.out.println("1. " + "Create job titles");
        System.out.println("2. " + "Read job titles");
        System.out.println("3. " + "Update job titles");
        System.out.println("4. " + "Delete job titles");
    }

    private void manageGradeLevels(){
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

    private void printGradeLevelsMenu(){
        System.out.println("Please select an option:");
        System.out.println("-1. " + "Exit");
        System.out.println("1. " + "Create grade level");
        System.out.println("2. " + "Read grade level");
        System.out.println("3. " + "Update grade level");
        System.out.println("4. " + "Delete grade level");
    }


    private void createEmergencyContact() throws SQLException {
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



    private void readEmergencyContact() throws SQLException {
        int id;
        printRequestMessage("id", "emergency Contact");
        String temp = scanner.nextLine();
        id= Integer.parseInt(temp);
        EmergencyContact contact = emergencyContactDao.readEmergencyContactById(id);
        if(contact != null){
            System.out.println(contact.toString());
        }
    }

    private void updateEmergencyContact() throws SQLException {
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

    private void deleteEmergencyContact() throws SQLException {
        int id;
        printRequestMessage("id", "emergency Contact");
        String temp = scanner.nextLine();
        id= Integer.parseInt(temp);
        emergencyContactDao.deleteEmergencyContactById(id);
    }

    private void createGradeLevel() throws SQLException {
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

    private void readGradeLevel() throws SQLException {
        int id;
        printRequestMessage("id", "grade level record");
        String temp = scanner.nextLine();
        id= Integer.parseInt(temp);
        GradeLevel gradeLevel = gradeLevelDao.readGradeLevelById(id);
        System.out.println(gradeLevel.toString());
    }

    private void updateGradeLevel() throws SQLException {
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

    private void deleteGradeLevel() throws SQLException {
        int id;
        printRequestMessage("id", "grade level record");
        String temp = scanner.nextLine();
        id= Integer.parseInt(temp);
        gradeLevelDao.deleteGradeLevelById(id);
    }

    private void createJobTitle(){
        //TODO
    }

    private void readJobTitle(){
        //TODO
    }

    private void updateJobTitle(){
        //TODO
    }

    private void deleteJobTitle(){
        //TODO
    }


    private void createStudent(){
        //TODO
    }

    private void readStudent(){
        //TODO
    }

    private void updateStudent(){
        //TODO
    }

    private void deleteStudent(){

    }

    private void createTeacher(){
        //TODO
    }

    private void readTeacher(){
        //TODO
    }

    private void updateTeacher(){

    }

    private void printRequestMessage(String var, String obj){
        System.out.println("Enter the " + var + " of the "+ obj +":");
    }

}

