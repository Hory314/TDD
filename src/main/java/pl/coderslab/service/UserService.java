package pl.coderslab.service;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.entity.User;
import pl.coderslab.repositories.UserRepository;

@Service
@Transactional
public class UserService
{
    @Autowired
    UserRepository userRepository;

    public void add(User newUser)
    {

        newUser.setPassword(BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt()));
        newUser.setId(1L);
     //   userRepository.save(newUser);
    }
}
