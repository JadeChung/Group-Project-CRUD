package com.promineo.entity;

public class EmergencyContact {

    private int id;
    private int studentId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    public EmergencyContact(int id, int studentId, String firstName, String lastName, String phoneNumber, String email){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString(){

        return "ID: "+this.getId() + " "+
                "Student ID: " + this.getStudentId() + " "+
                "First name: " + this.getFirstName() + " "+
                "Last name: " + this.getLastName() + " "+
                "Phone Number:" + this.getPhoneNumber() + " "+
                "Email: " + this.getEmail();
    }

    //TODO Create variables, constructor and get/set methods
}
