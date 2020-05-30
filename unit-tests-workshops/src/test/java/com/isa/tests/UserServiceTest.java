package com.isa.tests;

import com.isa.person.Person;
import com.isa.user.User;
import com.isa.user.UserDao;
import com.isa.user.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserDao userDao;

    @InjectMocks
    private UserService userService;


    // sposob bez wstrzykniecia @mock w userService
//    @BeforeEach
//    public void returnFromMock() {
//        userDao = mock(UserDao.class);
//        userService = new UserService(mock(UserDao.class));
//        }

    // 2 sposób z zaciagnieciem @mock

//    @Test
//    public void returnFromMock() {
//        List<User> allUsersResult = userService.getAllUsers();
//        System.out.println(allUsersResult);
//
//        List<User> usersResult = userService.findUsers("admin");
//        System.out.println(usersResult);
//
//        User user = userDao.findUser("admin");
//        System.out.println(user);
//    }

//================================================================================
    @Test
    public void returnFromMockGetAllUsers() {
        List<User> users = Arrays.asList(
                new User("admin"),
                new User("John"),
                new User("Steve"),
                new User("Jackson"),
                new User("Mark")
        );
        when(userDao.getAllUsers()).thenReturn(users);
        System.out.println(userDao.getAllUsers());
        List<User> allUsersResult = userService.getAllUsers();

        assertThat(allUsersResult).hasSize(5);
    }

    @Test
    public void returnFromMockFindUsers() {
        List<User> users = Arrays.asList(
                new User("admin"),
                new User("Arhn"),
                new User("Areve"),
                new User("Jackson"),
                new User("Mark")
        );
        when(userDao.getAllUsers()).thenReturn(users);

        List<User> findUsersResult = userService.findUsers("Ar");

        assertThat(findUsersResult).hasSize(2)
        .contains(new User("Arhn"));
    }

    @Test
    public void shouldReturnTrueIfUserExists() {

        when(userDao.findUser(eq("Jackson"))).thenReturn(new User("Jackson"));

        boolean result = userService.doesUserExist("Jackson");

        assertThat(result).isTrue();
    }

    @Test
    public void shouldReturnTrueIfUserDoesNotExist() {

        when(userDao.findUser(eq("frodo"))).thenReturn(null);

        boolean result = userService.doesUserExist("frodo");

        assertThat(result).isFalse();
    }
// zad 6 i 8 do domu
    @Test
    public void shouldReturnExceptionWhileDeleteUserNotExist() {

        when(userDao.findUser(eq("frodo"))).thenReturn(null);

        boolean result = userService.doesUserExist("frodo");

        assertThat(result).isFalse();
    }


}

