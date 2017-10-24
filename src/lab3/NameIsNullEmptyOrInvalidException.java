/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author cwerning
 */
public class NameIsNullEmptyOrInvalidException extends IllegalArgumentException{

    private static String errMsg = 
            "The input you have provided is null, empty, or does not have two parts. Please enter your first name followed by last name seperated by one space";
    
    public NameIsNullEmptyOrInvalidException() {
        super(errMsg);
    }

    public NameIsNullEmptyOrInvalidException(String s) {
        super(errMsg);
    }

    public NameIsNullEmptyOrInvalidException(String message, Throwable cause) {
        super(errMsg, cause);
    }

    public NameIsNullEmptyOrInvalidException(Throwable cause) {
        super(cause);
    }
    
    
}
