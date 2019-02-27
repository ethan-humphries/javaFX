/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ehumph13part3;
/**
 *
 * @author
 */
public class Student extends Person {
    private Integer studentNumber;
    private boolean enrolled;
    
    public Student() {
        
    }
    
    public Student(String firstName, String lastName,Integer studentNumber, boolean enrolled) {
        super(firstName, lastName);
        this.studentNumber =  studentNumber;
        this.enrolled =  enrolled;
    }

        public Integer getStudentNumber() {
        return studentNumber;
    }

    /**
     * @param studentNumber the studentNumber to set
     */
    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    /**
     * @return the enrolled
     */
    public boolean isEnrolled() {
        return enrolled;
    }

    /**
     * @param enrolled the enrolled to set
     */
    public void setEnrolled(boolean enrolled) {
        this.enrolled = enrolled;
    }
    
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Enrolled: " + enrolled);
    }

    
}

