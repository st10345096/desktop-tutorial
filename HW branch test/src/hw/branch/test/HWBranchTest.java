/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw.branch.test;

import java.util.Scanner;

/**
 *
 * @author tonym
 */
public class HWBranchTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            boolean ageMark40 = false;
        
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Enter your name: "); 
        String name = scan.nextLine();
   
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        
               
        if(age > 20)
        {
            while(age > 30)
              {
                age = age - 1;
              }
            if(age == 40)
              {
               System.out.println(name + " You have reached the " + age + " years marker!");
               ageMark40 = True;
               
              }
            else {System.out.println(name + " You are under 30 years.");}
            
         
        }
        else {System.out.println(name + " You are " + age + " years old and therefore underage");}
    
    }
    
}
