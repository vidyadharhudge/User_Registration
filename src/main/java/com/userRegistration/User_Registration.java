package com.userRegistration;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Scanner;

public class User_Registration
{
    public void validFirstName(String name)
    {
        String regex ="^[A-Z][a-z]{3,}$";
        boolean pattern = name.matches(regex);
        if (pattern)
        {
            System.out.println("Nmae is valid");
        }
        else
        {
            System.out.println("Name Is Invalid");
        }

    }
    public static void main(String[] args)
    {
        System.out.println("Enter Name : ");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        User_Registration user = new User_Registration();
        user.validFirstName(name);
    }
}
