package com.example.lab1;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;

@Repository
public class UserRepository {
    private final HashMap<Integer, User> userList;
    public UserRepository() {
        this.userList = new HashMap<>();
    }

    public User findUserByID(int uid) {
        return this.userList.get(uid);
    }

    public Collection<User> findAllUsers(){
        return userList.values();
    }

    public void addUser(int uid, User user){
        userList.put(uid, user);
    }

    public void deleteUser(int uid){
        userList.remove(uid);
    }

}
