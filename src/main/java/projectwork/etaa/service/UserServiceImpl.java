package projectwork.etaa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projectwork.etaa.model.User;
import projectwork.etaa.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {

        return userRepository.save(user);
    }


    @Override
    public void deleteById(Long id) {

        Optional<User> user = userRepository.findById(id);

    }

    @Override
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }
}
