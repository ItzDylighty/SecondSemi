package com.mycompany.studentsystem;

public class Student extends Person{
    private String studentId;
    private double gpa;
    private String course;
    
    
    public Student(String name, int age, String address,
                    String StudentID, double gpa, String course){
        super(name, age, address);
        this.studentId = studentId;
        this.gpa = gpa;
        this.course = course;
    }
    
    public String getStudentID(){
        return studentId;
    }
    
    public double getGpa(){
        return gpa;
    }
    
    public String course(){
        return course;
    }
    
    public void setStudentID(String studentID){
        this.studentId = studentID;
    }
    
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    
    public void setCourse(){
        this.course = course;
    }
    
     public String displayDetails() {
        return super.displayDetails() + "\nStudent ID: " + studentId + "\nGPA: " + gpa + "\nCourse: " + course;
    }
}
