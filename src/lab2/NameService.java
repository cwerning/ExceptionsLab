package lab2;

import lab3.NameIsNullEmptyOrInvalidException;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws IllegalArgumentException if fullName is null or empty or has 
     * fewer than two parts
     */
    public final String extractLastName(String fullName) throws NameIsNullEmptyOrInvalidException, NullPointerException {
        int countSpace = fullName.length() - fullName.replace(" ", "").length();

        if (countSpace > 1 || countSpace == 0) {
            throw new NameIsNullEmptyOrInvalidException();
        }

        String[] parts = fullName.split(" ");

        String lastName = parts[1]; // Last Name

        // Your code goes here.
        return lastName;
    }
    

    
    
}
