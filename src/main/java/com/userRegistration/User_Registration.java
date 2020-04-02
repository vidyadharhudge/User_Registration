package com.userRegistration;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Scanner;

public class User_Registration
{
    public void Validate_The_Name(String name)
    {
        String regex = "^[A-Z][a-z]{3,}$";
        boolean pattern = name.matches(regex);
        if (pattern) {
            System.out.println("Name is Valid");
        } else {
            System.out.println("Name Is Invalid");
        }
    }
    public void Validate_The_Email(String name)
    {
        String regex="^[a-zA-Z0-9]{3,}+[@][a-zA-Z0-9]{3,}+[.][a-zA-Z]{3,}$";
        boolean pattern = name.matches(regex);
        if (pattern)
        {
            System.out.println("Email is Valid");
        }
        else
        {
            System.out.println("Email Is Invalid");
        }

    }
    public void Validate_The_Number(String name)
    {
        String regex="^[0-9]{2}[ ][0-9]{10}$";
        boolean pattern = name.matches(regex);
        if (pattern)
        {
            System.out.println("Number is Valid");
        }
        else
        {
            System.out.println("Number Is Invalid");
        }

    }
    public void Validate_The_Password(String name)
    {
        String regex="^[A-Z]{1}[a-z]{5}[0-9]{3}$";
        boolean pattern = name.matches(regex);
        if (pattern)
        {
            System.out.println("password is Valid");
        }
        else
        {
            System.out.println("password Is Invalid");
        }

    }




    public static void main(String[] args)
    {
        System.out.println("Enter First Name : ");
        Scanner sc=new Scanner(System.in);
        String firstName=sc.next();
        User_Registration user = new User_Registration();
        user.Validate_The_Name(firstName);
        System.out.println("Enter Last Name : ");
        String lastName=sc.next();
        user.Validate_The_Name(lastName);
        System.out.println("Enter Last Validate Email : ");
        String Email=sc.next();
        user.Validate_The_Email(Email);
        System.out.println("Enter Mobile Number : ");
        String mobileNumber=sc.next();
        user.Validate_The_Number(mobileNumber);
        System.out.println("Enter Password : ");
        String password=sc.next();
        user.Validate_The_Password (password);




    }
}
