/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ehumph13part3;
import java.util.*;
/**
 *
 * @author Ethan Humphries
 */
public class Ehumph13Part3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student student1 =  new Student("E", "Humphries", 22832340, true);
        student1.printDetails();
        
        
        //create a list with two students in it
        ArrayList<Student> studentList = new ArrayList();
        studentList.add(new Student("Stephanie", "Dowling", 12345678, false));
        studentList.add(new Student("Bob", "Dylan", 12345670, true));
        
       /* for(Student student: studentList){
            student.printDetails();
        }
        */
       
       // iterate through the list and print each students first and last names
       for(int i = 0; i < studentList.size(); i++){
           System.out.println(studentList.get(i).getFirstName());
           System.out.println(studentList.get(i).getLastName());
       }
       
       //check ther list for a student named bob and print his details if found
        for(Student student: studentList){
            if (student.getFirstName() == "Bob"){
                System.out.println("The student has been found:");
                student.printDetails();
            }
        }
        //remove bob from the list
        studentList.remove(1);
        System.out.println("Bob has been removed");
        
        //print the size of the array list
        System.out.println(studentList.size());
        
        //clear the array list
        studentList.clear();
        System.out.println("The student list has been cleared");
        
        //part 2 final task - create a new person & student and parse them to a method that takes objects as the parameter -  polymorphism
        Person person1 =  new Person("E", "Humphries");
        Student student3  = new Student("John", "Howard", 12345565, false);
        printPersonsName(person1);
        printPersonsName(student3);
    }
    
    // print method that takes an object as it's parameter and prints the first name
    public static void printPersonsName(Person person){
        System.out.println(person.getFirstName());
    }
    
}

