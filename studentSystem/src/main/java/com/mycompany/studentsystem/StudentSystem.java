package com.mycompany.studentsystem;

public class StudentSystem {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentInformationSystem().setVisible(true);
            }
        });
    }
}
