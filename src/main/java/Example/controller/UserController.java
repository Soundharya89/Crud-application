package Example.controller;

import Example.model.User;
import Example.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService)
    {
        super();
        this.userService = userService;
    }

    //create user RESTAPI
    @PostMapping("/")
    public ResponseEntity<User> saveUser(@RequestBody User user)
    {
        return new ResponseEntity<User>(userService.saveUser(user), HttpStatus.CREATED);
    }

    //get all user REST API
    @GetMapping
    public List<User>getAllUser(){
        return userService.getAllUser();
    }

    //get user by id REST API
    @GetMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") long empId){
        return new ResponseEntity<User>(userService.getUserById(empId),HttpStatus.OK);

    }

    //update user REST API
    @PutMapping("{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") long id, @RequestBody User user){
        return new ResponseEntity<User>(userService.updateUser(user,id),HttpStatus.OK);
    }

    //delete user RESTAPI
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") long id){

        userService.deleteUser(id);
        return  new ResponseEntity<String>("User deleted successfully",HttpStatus.OK);
    }
}

