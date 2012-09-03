package lab1;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the four other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */

/**
 * 
 * @Revised by Neil Urban
 */

public class Startup {
    public static void main(String[] args) {
        Employee employee = new Employee("Peter", "Piper", "333-1234");
        
        //Calls Day method in class Employee -- this method encapsulates the other helper methods
        //by calling them in the order that they are needed to occur.
        employee.startFirstDay(""); // ("" because passing a string is required for moveIntoCubicle method
        
        //Statement which prints out the employee's status by calling the getStatus method
        //from the Employee class.
        System.out.println("The employee's status is: " + employee.getStatus());
    }      
    
}
