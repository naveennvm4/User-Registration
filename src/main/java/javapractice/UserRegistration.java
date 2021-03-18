package javapractice;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean isFirstName(String firstName) {
        return Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", firstName);
    }
    public boolean isLastName(String lastName) {
        return Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", lastName);
    }
    public boolean isEmail(String email) {
        return Pattern.matches("^[a-zA-Z0-9]{3,}([\\.\\+\\-]?[a-zA-Z0-9]{3,})?[@][A-Za-z0-9]{1,}[.]" +
                                "[A-Za-z]{2,4}[,]?([.][A-Za-z]{2,4}[.]?)?$", email);
    }
    public boolean isMobileNumber(String mobile) {
        return Pattern.matches("^[9][1][\\s][6-9][0-9]{9}$", mobile);
    }
    public boolean isPassword(String password) {
        return Pattern.matches("^(?=.*[\\@\\#\\$\\%\\&\\_\\,\\.])(?=.*[A-Z])(?=.*[0-9])" +
                                "(?=.*[a-z]).{8,}$", password);
    }
    public static void main(String[] args) {
        String firstName = "Naveen";
        String lastName = "Nani";
        String email = "naveennvm@gmail.com";
        String mobile = "91 7095252907";
        String password = "Naveen@216";
        UserRegistration person = new UserRegistration();
        person.isFirstName(firstName);
        person.isLastName(lastName);
        person.isEmail(email);
        person.isMobileNumber(mobile);
        person.isPassword(password);
    }
}