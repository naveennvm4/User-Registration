import javapractice.UserRegistration;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void checkGivenFirstNameIsValid() {
        UserRegistration person = new UserRegistration();
        boolean check = person.isFirstName("Naveen");
        Assertions.assertTrue(check);
    }
    @Test
    public void checkGivenLastNameIsValid() {
        UserRegistration person = new UserRegistration();
        boolean check = person.isLastName("Nani");
        Assertions.assertTrue(check);
    }
    @Test
    public void checkGivenEmailIsValid() {
        UserRegistration person = new UserRegistration();
        boolean check = person.isEmail("naveennvm4@gmail.com");
        Assertions.assertTrue(check);
    }
    @Test
    public void checkGivenPhoneNumberIsValid() {
        UserRegistration person = new UserRegistration();
        boolean check = person.isMobileNumber("91 7095252907");
        Assertions.assertTrue(check);
    }
    @Test
    public void checkGivenPasswordIsValid() {
        UserRegistration person = new UserRegistration();
        boolean check = person.isPassword("Naveen@216");
        Assertions.assertTrue(check);
    }
}