

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emaildemo;

import java.io.IOException;

/**
 *
 * @author PoojaKoli
 */
public class EmailDemo {

    

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException {
       
        String[] to ={"shraddhagaikar24@gmail.com","dollykapoor753@gmail.com"};
        if
      (EmailSender.sendMail("kolipuja494@gmail.com","P00j@"+""+"$"+""+"Koli.888","message to receipents ",to))
        System.out.println("Email sent successfully");
        else 
        System.out.println("Sorry, an error occured");
        
        
    }
    
}
