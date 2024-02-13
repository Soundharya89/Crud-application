package Example.service;

import Example.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUser();
    User getUserById(Long id);
    User updateUser(User user, Long id);
    void deleteUser(long id);

}
