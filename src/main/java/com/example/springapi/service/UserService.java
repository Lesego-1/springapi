package com.example.springapi.service;

import org.springframework.stereotype.Service;
import com.example.springapi.api.model.User;
import java.util.*;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "Ida", 32, "ida@mail.com");

        userList.addAll(Arrays.asList(user1));
    }

    public Optional<User> getUser(Integer id) {
        Optional<User> optional = Optional.empty();
        for (User user: userList) {
            if (id == user.getId()) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }

    public User createUser(User user) {
        userList.add(user);
        return user;
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(userList);
    }

    public boolean deleteUser(Integer id) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId() == id) {
                userList.remove(i);
                return true;
            }
        }
        return false;
    }
}
