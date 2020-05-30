package com.isa.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;


@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserDao userDao;

    @InjectMocks
    private UserService userService;

//    @BeforeEach
//    public void beforeEach() {
//        userDao = mock(UserDao.class);
//        userService = new UserService(userDao);
//    }

    @Test
    public void returnFromMock() {
        List<User> allUsersResult = userService.getAllUsers();
        System.out.println(allUsersResult);

//        List<User> usersResult = userService.findUsers("admin");
//        System.out.println(usersResult);

//        User userResult = userDao.findUser("admin");
//        System.out.println(userResult);
    }



}