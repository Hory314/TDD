package pl.coderslab.service;

import org.junit.After;
import org.junit.Before;
import org.mindrot.jbcrypt.BCrypt;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.entity.User;
import org.junit.Test;
import pl.coderslab.repositories.UserRepository;

import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.*;

@Transactional
public class UserServiceAddTest
{
    private User user;
    private UserService userService;


    @Before
    public void before() // setUp
    {
        this.user = new User();
        user.setName("Darek");
        user.setPassword("NiePodamCi");
        user.setEmail("darek@gmail.com");

        this.userService = new UserService();
    }

    @After
    public void after() // tearDown
    {

    }

    @Test
    public void addUserWithAllGoodDataTest()
    {
        // given -- user object created in @before with all good data
        User newUser = this.user; //referencja
        // Mockito.doNothing().when(userRepository.save(newUser));

        //when
        userService.add(newUser);

        //then
        assertThat("ID is null or not equal to 1L", newUser.getId(), is(1L));
        boolean checkPassword = BCrypt.checkpw("NiePodamCi", newUser.getPassword());
        assertThat("Passwords didn't match", checkPassword, is(true));
    }

    @Test(expected = Exception.class)
    public void addUserWithoutEmailTest()
    {
        // given -- user object created in @before with all good data
        User newUser = this.user;
        newUser.setEmail(null);

        //when
        userService.add(newUser);

        //then
        // should throw exception
    }
}
