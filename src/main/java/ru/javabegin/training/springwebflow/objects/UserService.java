package ru.javabegin.training.springwebflow.objects;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class UserService {

    private ArrayList<User> userList = new ArrayList<User>();

    public UserService() {
        userList.add(new User("user", "pass"));
    }

    public boolean userExist(User user) {

        if (userList.contains(user)) {
            return true;
        } else {
            return false;
        }
    }

    public String createUser(User user) {
        if (userNameExist(user.getName())) {
            return "exist";
        } else {
            userList.add(user);
            return "success";
        }
    }

    public boolean userNameExist(String userName) {
        for (User user : userList) {
            if (user.getName().equals(userName))
                return true;
        }
        return false;
    }

}
