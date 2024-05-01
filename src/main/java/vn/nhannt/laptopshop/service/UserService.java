package vn.nhannt.laptopshop.service;

import org.springframework.stereotype.Service;
import java.util.List;

import vn.nhannt.laptopshop.domain.User;
import vn.nhannt.laptopshop.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    // DI
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // create one
    public User createOne(User user) {
        final User newUser = this.userRepository.save(user);
        return newUser;
    }

    // get all
    public List<User> getAll() {
        final List<User> users = this.userRepository.findAll();
        return users;
    }

    // get one
    public User getOne(Long id) {
        final User user = this.userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        return user;
    }

    // get home page
    public String getHomePage() {
        return "hello Spring MVC";
    }
}
