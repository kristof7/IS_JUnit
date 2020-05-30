package com.isa.user;


import com.isa.geometry.PointTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;


public class UserTest {

    private static final Logger logger = Logger.getLogger(PointTest.class.getName());

    @Test
    @DisplayName("Check if creating user with valid data provided ends with success")
    public void testIfUserCreatedForValidLoginInput() {
        logger.info("test if creating user with valid data provided ends with success");
    User user = new User("janko");
    assertEquals("janko", user.getLogin());
    assertNotEquals("lolo", user.getLogin());
    assertEquals("d3f4u17", user.getPassword());
    }

    @Test
    public void testIfExceptionThrownForDefaultConstructor() {
        logger.info("test if ExceptionThrownForDefaultConstructor");
        assertThrows(IllegalArgumentException.class, () -> new User());
    }

    @Test
    public void testIfExceptionThrownForNullLogin() {
        logger.info("test if ExceptionThrownForNullLogin");
        assertThrows(IllegalArgumentException.class, () -> new User(null));
    }

    @Test
    public void testIfExceptionThrownForEmptyLogin() {
        logger.info("test if ExceptionThrownForEmptyLogin");
        assertThrows(IllegalArgumentException.class, () -> new User(""));
    }

    @Test
    public void testIfExceptionThrownForNullPassword() {
        logger.info("test if ExceptionThrownForNullPassword");
        User user = new User("janko");
        assertThrows(IllegalArgumentException.class, () -> user.setPassword(null));
    }

    @Test
    public void testIfExceptionThrownForEmptyPassword() {
        logger.info("test if ExceptionThrownForEmptyPassword");
        User user = new User("janko");
        assertThrows(IllegalArgumentException.class, () -> user.setPassword(""));
    }

    @Test
    public void testIfToStringMethodReturnsValidOutput() {
        User user = new User("test1");
        user.setPassword("fff");
        assertEquals("User{" +
                "login='" + user.getLogin() + '\'' +
                ", password='" + user.getPassword() + '\'' +
                '}', user.toString());
    }



}
