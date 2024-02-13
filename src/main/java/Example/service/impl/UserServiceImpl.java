package Example.service.impl;

import Example.exception.ResourceNotFoundException;
import Example.model.User;
import Example.repository.UserRepository;
import Example.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository)
    {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()){
            return user.get();
        }
        else{
            throw new ResourceNotFoundException("User","id",id);
        }

    }

    @Override
    public User updateUser(User user, Long id) {
        User existinguser = userRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("User","Id",id));
        existinguser.setFirstName(user.getFirstName());
        existinguser.setLastName(user.getLastName());
        existinguser.setEmail(user.getEmail());
        userRepository.save(existinguser);
        return existinguser;

    }

    @Override
    public void deleteUser(long id) {
        userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User","id",id));
        userRepository.deleteById(id);
    }
}
