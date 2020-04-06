package com.userRegistration;

public class User_Registration
{
    //function for the validating the first name and last name
    public void Validate_The_Name(String name)
    {
        String regex = "^[A-Z][a-z]{3,}$";
        boolean pattern = name.matches(regex);
        if (pattern)
        {
            System.out.println("Name is Valid");
        }
        else
        {
            System.out.println("Name Is Invalid");
        }
    }
    //function for validating the email
    public void Validate_The_Email(String name)
    {
        String emailPattern1 = "^[a-zA-Z0-9]{3,}+[@]{1}$";
        String emailPattern2 = "^[a-zA-Z0-9]{3,}+[@]{1}[a-zA-Z0-9]{3,}$";
        String emailPattern3 = "^[a-zA-Z0-9]{3,}+[@]{1}[a-zA-Z0-9]{3,}+[.][a-zA-Z]{3,}$";
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
    //function for the validating the number
    public void Validate_The_Number(String name)
    {
        String regex="^[0-9]{2}[0-9]{10}$";
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
    //function for validating the password
    public void Validate_The_Password(String name1)
    {
        String regex="^[A-Z]{1}[a-z]{5}[0-9]{3}$";
        boolean pattern = name1.matches(regex);
        if (pattern)
        {
            System.out.println("password is Valid For Use Case 5");
        }
        else
        {
            System.out.println("password Is Invalid For Use Case 5");
        }

    }
    //function for validating password for upper and lower case letter
    public void Upper_Case_Password(String name)
    {
        String regex="^[A-Z]{1}[a-z]{5}[0-9]{3}$";
        boolean pattern = name.matches(regex);
        if (pattern)
        {
            System.out.println("password is Valid For Both Cases 6 and 7");
        }
        else
        {
            System.out.println("password Is Invalid For Both Cases 6 and 7");
        }

    }

    //function for containing the exactly one special character
    public void Special_Character_Password(String name)
    {
        String regex="^[A-Z]{1}[a-z]{4}[\\!\\@\\#\\%\\$\\&\\*]{1}[0-9]{4}";

        boolean pattern = name.matches(regex);
        if (pattern)
        {
            System.out.println("password is Valid ");
        }
        else
        {
            System.out.println("password Is Invalid ");
        }

    }
}
