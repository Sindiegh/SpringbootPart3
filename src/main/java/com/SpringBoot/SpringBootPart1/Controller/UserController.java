package com.SpringBoot.SpringBootPart1.Controller;

import com.SpringBoot.SpringBootPart1.service.UserServiceImplementation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {


    final UserServiceImplementation userServiceImplementation;

    public UserController(UserServiceImplementation userServiceImplementation) {
        this.userServiceImplementation = userServiceImplementation;
    }

    @PutMapping("/{userId}")
    public ResponseEntity<String> updateUser(@PathVariable(value = "userId") int userId) throws NoSuchMethodException {

        userServiceImplementation.addUser(userId,"Sindiswa","Khama");

        return  new ResponseEntity<>("Success!", HttpStatus.NO_CONTENT);

    }


    @DeleteMapping("/{userId}")
    public ResponseEntity<String> removeUser(@PathVariable(value = "userId") int userId) throws NoSuchMethodException {

        userServiceImplementation.addUser(userId,"Sindiswa","Khama");

        return  new ResponseEntity<>("Success!", HttpStatus.NO_CONTENT);

    }

    @GetMapping("/{userId}")
    public ResponseEntity<String> getUser(@PathVariable(value = "userId") int userId) throws NoSuchMethodException {

        userServiceImplementation.addUser(userId,"Sindiswa","Khama");

        return  new ResponseEntity<>("Success!", HttpStatus.NO_CONTENT);

    }





}
