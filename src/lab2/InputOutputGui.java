package lab2;

import javax.swing.JOptionPane;
import lab3.NameIsNullEmptyOrInvalidException;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public final void startConversation() {
        
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        String lastName = "";
        
        try{
        lastName = nameService.extractLastName(fullName);
  
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
        }catch (NameIsNullEmptyOrInvalidException fninoe){
            System.out.println(fninoe.getMessage());
            
        }catch(NullPointerException npe){
            System.out.println(npe.getMessage());
        }
        
    }
     
}
