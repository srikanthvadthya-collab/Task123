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
public class LoginSystem {
    
    public static void main(String[] args) {
        Scanner Log = new Scanner(System.in);
        System.out.println("Enter the email adress");
        String email = Log.nextLine();
        
        System.out.println("Enter the Password");
        String pwd = Log.nextLine();
        
        if(!email.contains("@")){
            System.out.println("Invalid Email");
            
            }
        if(pwd.length() < 8){
            System.out.println("Passowrd length short");
        }
        else{
                    System.out.println("Login Success");
                    }
        }
    }

