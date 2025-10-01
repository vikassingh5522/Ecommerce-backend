package com.ecommerce.service;

import com.ecommerce.config.JWTProvider;
import com.ecommerce.exception.UserException;
import com.ecommerce.model.User;
import com.ecommerce.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService{

    private UserRepository userRepository;
    private JWTProvider jwtProvider;

    public UserServiceImplementation(UserRepository userRepository,JWTProvider jwtProvider){
        this.jwtProvider = jwtProvider;
        this.userRepository = userRepository;
    }

    @Override
    public User findUserById(Long userId) throws UserException {

        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent())
        {
            return user.get();
        }

        throw new UserException("User Not Found with id: "+userId);
    }

    @Override
    public User findUserProfileByJwt(String jwt) throws UserException {
        String email = jwtProvider.getEmailFromToken(jwt);

        User user = userRepository.findByEmail(email);

        if (user == null)
        {
            throw new UserException("User not found with email: "+email);
        }
        return user;
    }
}