package projectwork.etaa.service;

import projectwork.etaa.model.User;

import java.util.List;

public interface UserService {

    public User save(User user);

    public void deleteById(Long id);

    public List<User> getAllUsers();


}
