package sk.umb.luiza.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.umb.luiza.domain.model.User;
import sk.umb.luiza.domain.repository.UserRepository;

@Service
@Slf4j
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User userLogin(User user) {
        return userRepository.findByStudentIdAndPassword(user.getStudentId(), user.getPassword());
    }
}
