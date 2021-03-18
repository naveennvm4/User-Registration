package javapractice;

import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean isFirstName(String firstName) throws UserRegistrationException {
        if(Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", firstName))
            return true;
        else
            throw new UserRegistrationException("Invalid First Name");
    }

    public static boolean isLastName(String lastName) throws UserRegistrationException {
        if(Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", lastName))
            return true;
        else
            throw new UserRegistrationException("Invalid Last Name");
    }

    public static boolean isEmail(String email) throws UserRegistrationException {
        if(Pattern.matches("^[a-zA-Z0-9]{3,}([\\.\\+\\-]?[a-zA-Z0-9]{3,})?[@][A-Za-z0-9]{1,}[.]" +
                            "[A-Za-z]{2,4}[,]?([.][A-Za-z]{2,4}[.]?)?$", email))
            return true;
        else
            throw new UserRegistrationException("Invalid Email");

    }

    public static boolean isMobileNumber(String mobile) throws UserRegistrationException {
        if(Pattern.matches("^[9][1][\\s][6-9][0-9]{9}$", mobile))
            return true;
        else
            throw new UserRegistrationException("Invalid Mobile Number");
    }

    public static boolean isPassword(String password) throws UserRegistrationException {
        if(Pattern.matches("^(?=.*[\\@\\#\\$\\%\\&\\_\\,\\.])(?=.*[A-Z])(?=.*[0-9])" +
                            "(?=.*[a-z]).{8,}$", password))
            return true;
        else
            throw new UserRegistrationException("Invalid Password");
    }

    public static void main(String[] args) {
        String firstName = "Naveen";
        String lastName = "Nani";
        String email = "naveennvm4@gmail.com";
        String mobile = "91 7095252907";
        String password = "Naveen@216";
        UserRegistration person = new UserRegistration();
        try {
            isFirstName(firstName);
        }
        catch(Exception e) {System.out.println("Exception is " + e);
        }
        try {
            isLastName(lastName);
        }
        catch(Exception e) {
            System.out.println("Exception is " + e);
        }
        try {
            isEmail(email);
        }
        catch(Exception e) {
            System.out.println("Exception is " + e);
        }
        try {
            isMobileNumber(mobile);
        }
        catch(Exception e) {
            System.out.println("Exception is " + e);
        }
        try {
            isPassword(password);
        }
        catch(Exception e) {
            System.out.println("Exception is " + e);
        }
    }
}