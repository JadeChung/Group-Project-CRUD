package com.promineo.navigation;

import java.util.Scanner;

public class Menu {

    Scanner scanner;

    public Menu(){
        scanner = new Scanner(System.in);
    }

    public void start(){
        //TODO Menu
        String response = "";
        do{
            response = scanner.nextLine();

        }while(!response.equals("-1"));
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

}
