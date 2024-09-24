package com.example.lab1;

import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.databind.JsonNode;

import javax.lang.model.type.UnionType;
import java.util.Collection;

@RestController
public class UserManagementController {

    private final UserRepository userRepository;

    public UserManagementController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/api/v1/user")
    public User getUser(@RequestParam(value = "uid") int uid) {
        return this.userRepository.findUserByID(uid);
    }

    @PostMapping("/api/v1/user")
    public String addUser(@RequestBody User user){
        this.userRepository.addUser(user.getUid(), user);
        return "Add Successfully!";
    }

    @GetMapping("/api/v1/user/all")
    public Collection<User> getAllUsers(){
        return userRepository.findAllUsers();
    }

    @PutMapping("/api/v1/user")
    public String modifyUser(@RequestBody JsonNode json) {
        User saved_user = this.userRepository.findUserByID(json.get("uid").asInt());
        if (saved_user == null) {
            return "No such User!";
        }
        else {

            if (json.has("name")) {
                saved_user.setName(json.get("name").asText());
            }
            if (json.has("age")) {
                saved_user.setAge(json.get("age").asInt());
            }
            if (json.has("gender")) {
                saved_user.setGender(json.get("gender").asText());
            }
            return "Modify successfully!";
        }
    }

    @DeleteMapping("/api/v1/user")
    public String deleteUser(@RequestParam(value = "uid") int uid){
        if (this.userRepository.findUserByID(uid) == null) {
            return "No such User!";
        }
        else {
            this.userRepository.deleteUser(uid);
            return "Delete successfully!";
        }
    }

}
