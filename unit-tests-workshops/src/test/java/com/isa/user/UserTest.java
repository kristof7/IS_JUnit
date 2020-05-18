package com.isa.user;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    @DisplayName("Check if creating user with valid data provided ends with success")
    public void testIfUserCreatedForValidLoginInput() {

        User user = new User("janek");

        assertEquals("janek", user.getLogin());
        assertNotEquals("mirek", user.getLogin());
        assertEquals("d3f4u17", user.getPassword());
    }

    @Test
    @DisplayName("Check if user password changed with success")
    public void testIfUserPasswordChangedCorrectly() {

        User user = new User("janek");
        user.setPassword("trudne_do_zlamania_haslo");

        assertNotEquals("d3f4u17", user.getPassword());
        assertEquals("trudne_do_zlamania_haslo", user.getPassword());
    }

    @Test
    @DisplayName("Check if user login details are displayed correctly")
    public void testIfToStringReturnsExpectedFormat() {

        User user = new User("janek");
        String expectedUserLoginDetails = "User{login='janek', password='d3f4u17'}";

        assertEquals(expectedUserLoginDetails, user.toString());
    }

    @Test
    public void testIfExceptionThrownForDefaultConstructor() {
        assertThrows(IllegalArgumentException.class, () -> new User());
    }

    @Test
    public void testIfExceptionThrownForNullLogin() {
        assertThrows(IllegalArgumentException.class, () -> new User(null));
    }

    @Test
    public void testIfExceptionThrownForEmptyLogin() {
        assertThrows(IllegalArgumentException.class, () -> new User(""));
    }

    @Test
    public void testIfExceptionThrownForNullPassword() {
        User user = new User("janek");
        assertThrows(IllegalArgumentException.class, () -> user.setPassword(null));
    }

    @Test
    public void testIfExceptionThrownForEmptyPassword() {
        User user = new User("janek");
        assertThrows(IllegalArgumentException.class, () -> user.setPassword(""));
    }
}
