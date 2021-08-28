package com.promineo.entity;

public class GradeLevel {
    //TODO Create variables, constructor and get/set methods
    private int id; //grade_id
    private int studentId; //student_id
    private int teacherId; //teacher_id
    private int gradeLevel; //grade_level

    public GradeLevel(int id, int studentId, int teacherId, int gradeLevel){
        this.id = id;
        this.studentId = studentId;
        this.teacherId = teacherId;
        this.gradeLevel = gradeLevel;
    }

    public int getId() {
        return id;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String toString(){
        return "ID: " + this.getId() + " "+
                "Student ID: " + this.getStudentId() + " " +
                "Teacher ID: " + this.getTeacherId() + " " +
                "Grade Level: " + this.getGradeLevel();
    }

}
