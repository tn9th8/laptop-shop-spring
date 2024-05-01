package vn.nhannt.laptopshop.service;

import org.springframework.stereotype.Service;
import java.util.List;

import vn.nhannt.laptopshop.domain.User;
import vn.nhannt.laptopshop.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createOne(User user) {
        final User newUser = this.userRepository.save(user);
        return newUser;
    }

    public List<User> getAll() {
        final List<User> users = this.userRepository.findAll();
        return users;
    }

    public String handleHomePage() {
        return "hello Spring MVC";
    }
}
