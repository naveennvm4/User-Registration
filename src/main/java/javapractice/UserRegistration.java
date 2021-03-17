package javapractice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void firstNameCheck(String name) {
        String regex = "^[A-Z]{1}[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(name);
        boolean bool = match.matches();
        if (bool)
            System.out.println(name + " is a valid name");
        else
            System.out.println(name + " is not a valid name");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String firstName = sc.next();
        firstNameCheck(firstName);
    }
}