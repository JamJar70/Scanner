package userinput;

import java.util.Scanner;

public class UserInput {

    
   public static void main(String[] args) {
       System.out.println("Please enter the following information so I can sell it for a profit");  
       Scanner sc = new Scanner(System.in);
       System.out.println("First Name");
       System.out.println("Surname");
       System.out.println("Grade");
       System.out.println("Student ID");
       System.out.println("Login");
       System.out.println("GPA");
       String first = sc.nextLine();
       String last = sc.nextLine();
       String grade = sc.nextLine();
       String ID = sc.nextLine();
       String log = sc.nextLine();
       String GPA = sc.nextLine();
       System.out.println("Your Information");
       System.out.println("First Name: "+ first);
       System.out.println("Surname: "+ last);
       System.out.println("Grade: "+ grade);
       System.out.println("Student ID: "+ ID);
       System.out.println("Login: "+ log);
       System.out.println("GPA: "+ GPA);
    }
    
}
