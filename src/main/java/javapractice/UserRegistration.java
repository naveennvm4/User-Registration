package javapractice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);
    public static void entry(String email) {
        System.out.println("E-Mail: " + Pattern.matches("^[a-zA-Z0-9]{3,}([.]{1}+[a-zA-Z0-9]{3,})*[@]" +
                "           {1}[a-zA-Z0-9]{2,}[.]{1}[a-zA-Z0-9]{2,}([.]{1}[a-zA-Z0-9]{2,})*$", email));
    }
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        System.out.println("Enter email");
        String email = sc.nextLine();
        entry(email);
    }
}