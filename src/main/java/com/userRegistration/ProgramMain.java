package com.userRegistration;

import java.util.Scanner;

public class ProgramMain
{
    //main methode
    public static void main(String[] args)
    {
        System.out.println("Enter First Name : ");
        //for user input
        Scanner sc = new Scanner(System.in);
        //store into the string
        String firstName = sc.next();
        //creating the object
        User_Registration user = new User_Registration();
        //calling the function with the help of object
        user.Validate_The_Name(firstName);

        System.out.println("Enter Last Name : ");
        String lastName = sc.next();
        //calling the function with the help of object
        user.Validate_The_Name(lastName);

        System.out.println("Enter Last Validate Email : ");
        String Email = sc.next();
        //calling the function with the help of object
        user.Validate_The_Email(Email);

        System.out.println("Enter Mobile Number : ");
        String mobileNumber = sc.next();
        //calling the function with the help of object
        user.Validate_The_Number(mobileNumber);

        System.out.println("Enter Password : ");
        String password1 = sc.next();
        //calling the function with the help of object
        user.Validate_The_Password(password1);

        System.out.println("Enter Password : ");
        String Password = sc.next();
        //calling the function with the help of object
        user.Upper_Case_Password(Password);

        System.out.println("Enter Password : ");
        String passwords = sc.next();
        //calling the function with the help of object
        user.Special_Character_Password(passwords);


    }
}
