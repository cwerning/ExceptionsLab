package lab0;

/**
 *
 * @author Instlogin
 */
public class Startup {

    public static void main(String[] args) {
        // Always declare variables outside of try block so they can
        // be used elsewhere (see line 40)
        /*Employee emp = null;*/
        
        // Think about this code. It wouldn't work if firstName or lastName 
        // were null or empty string. Instead, the program will crash. 
        // Comment this out and see what happens with the correct sample below.
        
        /*
        String fullNameInCaps = null;
        try{
        emp = new Employee("Chad",null,"3333333333",20);
         fullNameInCaps = 
                emp.getFirstName().toUpperCase() 
                + " " + emp.getLastName().toUpperCase();
        System.out.println("Employee Name: " + fullNameInCaps);
        }catch(IllegalArgumentException iAE){
            System.out.println(iAE.getMessage());
        }catch(NullPointerException npe){
            System.out.println(npe.getMessage());
        }
        */
        
        //this is where I'm testing the throw exception for firstname
        Employee employee1;
        String employeeFullName = null;
        try{
        employee1 = new Employee("", "Werning", "333-33-3333",20);
        employeeFullName = employee1.getFirstName() + " " + employee1.getLastName();
            System.out.println(employeeFullName);
        }catch(IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
        
        //test throw exception for lastname
        Employee employee2;
        try{
            employee2 = new Employee("Chad",null, "333-33-3333", 20);
        }catch(IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
        
        //test throw exception for ssn
        Employee employee3;
        try{
            employee3 = new Employee("Chad","Werning", "333-333-3333", 20);
        }catch(IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
        
        //test throw exception for days off
        Employee employee4;
        try{
            employee3 = new Employee("Chad","Werning", "333-33-3333", 100);
        }catch(IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
        
    
        
        // Here's the correct way: use a try block to attempt code excecution.
        // then catch one or more exceptions if something goes wrong. But you
        // have to know what goes wrong -- if it's an exception or not. You
        // can do this by examining the code, the documentation or the output
        // if there's a crash. In this example the program does not crash and
        // the user gets a nice, friendly message.
//        try {
//            emp = new Employee("","","3333333333",28);
//            String fullNameInCaps = 
//                emp.getFirstName().toUpperCase() 
//                + " " + emp.getLastName().toUpperCase();
//            System.out.println("Employee Name: " + fullNameInCaps);
//            
//        } catch(IllegalArgumentException iae) {
//            System.out.println(iae.getMessage());
//        }
//        
//        System.out.println(emp.toString());
    }
}
