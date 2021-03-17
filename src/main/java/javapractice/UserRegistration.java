package javapractice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void firstName(String name) {
        String regex = "^[A-Z]{1}[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(name);
        boolean bool = match.matches();
        if (bool)
            System.out.println(name + " is a valid name");
        else
            System.out.println(name + " is not a valid name");
    }
    public static void lastName(String name) {
        String regex = "^[A-Z]{1}[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(name);
        boolean bool = match.matches();
        if (bool)
            System.out.println(name + " is a valid last name");
        else
            System.out.println(name + " is not a valid last name");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First name");
        String firstName = sc.next();
        System.out.println("Enter Last name");
        String lastName = sc.next();
        firstName(firstName);
        lastName(lastName);
    }
}