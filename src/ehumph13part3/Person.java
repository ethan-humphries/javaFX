/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ehumph13part3;

/**
 *
 * @author Not Oliviah
 */
public class Person {
    private String firstName;
    private String lastName;
 
    public Person() {
        
    }
    
    public Person(String firstName, String lastName) {
        this.firstName =  firstName;
        this.lastName =  lastName;

    }
    
        public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    public void printDetails() {
        System.out.println("The student's details are: ");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    }
}

