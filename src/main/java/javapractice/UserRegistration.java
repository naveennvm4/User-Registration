package javapractice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);
    public static void entry(String firstName, String lastName, String email, String mobile, String password) {
        System.out.println("First Name: " + Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", firstName));
        System.out.println("Last Name: " + Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", lastName));
        System.out.println("E-Mail: " + Pattern.matches("^[a-zA-Z0-9]{3,}([.]{1}+[a-zA-Z0-9]{3,})*[@]" +
                "           {1}[a-zA-Z0-9]{2,}[.]{1}[a-zA-Z0-9]{2,}([.]{1}[a-zA-Z0-9]{2,})*$", email));
        System.out.println("Mobile Number: " + Pattern.matches("^[9][1][\s][6-9][0-9]{9}$", mobile));
        System.out.println("Password: " + Pattern.matches("^(?=.*[\\\\@\\\\#\\\\$\\\\%\\\\&\\\\_\\\\,\\\\.])" +
                            "(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$", password));
    }
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        System.out.println("Enter first name");
        String firstName = sc.nextLine();
        System.out.println("Enter last name");
        String lastName = sc.nextLine();
        System.out.println("Enter email");
        String email = sc.nextLine();
        System.out.println("Enter Mobile No");
        String mobile = sc.nextLine();
        System.out.println("Enter password");
        String password = sc.nextLine();
        entry(firstName, lastName, email, mobile, password);
    }
}