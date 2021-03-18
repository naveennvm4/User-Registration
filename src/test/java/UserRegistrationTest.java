import javapractice.UserRegistration;
import javapractice.UserRegistrationException;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void checkGivenFirstNameIsValid() throws UserRegistrationException {
        UserRegistration person = new UserRegistration();
        boolean check = person.isFirstName("Naveen");
        Assertions.assertTrue(check);
    }
    @Test
    public void checkGivenLastNameIsValid() throws UserRegistrationException {
        UserRegistration person = new UserRegistration();
        boolean check = person.isLastName("Nani");
        Assertions.assertTrue(check);
    }
    @Test
    public void checkGivenEmailIsValid() throws UserRegistrationException {
        UserRegistration person = new UserRegistration();
        boolean check = person.isEmail("naveennvm4@gmail.com");
        Assertions.assertTrue(check);
    }
    @Test
    public void checkGivenPhoneNumberIsValid() throws UserRegistrationException {
        UserRegistration person = new UserRegistration();
        boolean check = person.isMobileNumber("91 7095252907");
        Assertions.assertTrue(check);
    }
    @Test
    public void checkGivenPasswordIsValid() throws UserRegistrationException {
        UserRegistration person = new UserRegistration();
        boolean check = person.isPassword("Naveen@216");
        Assertions.assertTrue(check);
    }
}