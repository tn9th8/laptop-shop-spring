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
        final User newUser = this.userRepository.save(user); // save : upsert
        return newUser;
    }

    // update one
    public User updateOne(User user) {
        // find one
        final User tempUser = this.getOne(user.getId());
        // mapping
        tempUser.setFullName(user.getFullName());
        tempUser.setPhone(user.getPhone());
        tempUser.setAddress(user.getAddress());
        tempUser.setAvatar(user.getAvatar());
        tempUser.setRole(user.getRole());
        // save
        final User existingUser = this.userRepository.save(tempUser); // save : upsert
        return existingUser;
    }

    // delete one
    public void deleteOne(User user) {
        // is exist
        if (!this.userRepository.existsById(user.getId())) {
            throw new RuntimeException("User is not existing");
        }
        // delete
        this.userRepository.deleteById(user.getId());
    }

    // get all
    public List<User> getAll() {
        final List<User> users = this.userRepository.findAll();
        return users;
    }

    // get one
    public User getOne(Long id) {
        final User user = this.userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User is not existing"));
        return user;
    }

    // get home page
    public String getHomePage() {
        return "hello Spring MVC";
    }
}
