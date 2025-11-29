/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_cognizent;

/**
 *
 * @author Srikanth
 */
import java.util.Scanner;

public class LoginCreds {
    public static void main(String[] args) {
        Scanner S1 = new Scanner(System.in);
        System.out.println("Enter the valid Email ID");
        String ST1 = S1.nextLine();
        
        System.out.println("Enter the Password");
        String PW1 = S1.nextLine();
      
    if(!ST1.contains("@")){
            System.out.println("Inavlid Email Format");
    }
    if( PW1.length() < 8 ){
        System.out.println("Password too short");
    }else{
        System.out.println("Login Successful");
    }
    
    S1.close();
 }
}
