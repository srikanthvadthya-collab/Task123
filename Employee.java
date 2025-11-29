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
public class Employee {
    
    String name;
    int empId;
    double basicsalary;
    
    Employee(String name, int empId, double basicSalary) {
        this.name = name;
        this.empId = empId;
        this.basicsalary = basicSalary;
    }
    
    double getHR(){
        return basicsalary * 0.20;
    }
    
    double getPF(){
        return basicsalary * 0.12;
    }
    
    double NetSalary(){
        return basicsalary + getHR() - getPF();
    }   
    
    void SalarySlip(){
        System.out.println("++++++++++ Salary Slip +++++++++");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID : " + empId);
        System.out.println("BasicSalary : " + basicsalary);
        System.out.println("HRA : " + getHR());
        System.out.println("PF : " + getPF());
        System.out.println("NetSalary : " +NetSalary());
        System.out.println("++++++++++ END ++++++++++");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Employee Name : ");
        String Ename = sc.nextLine();
        
        System.out.println("Enter Employee ID : ");
        int Eid = sc.nextInt();
        
        System.out.println("Enter Basic Salary : ");
        double Salary = sc.nextDouble();
        
        Employee EmpDetails = new Employee(Ename, Eid, Salary);
        
        EmpDetails.SalarySlip();
        
        sc.close();
    }
}
