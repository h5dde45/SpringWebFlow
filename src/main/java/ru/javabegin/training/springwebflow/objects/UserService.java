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

	public  String createUser(User user){
        if (userExist(user)) {
            return "exist";
        } else {
            userList.add(user);
            return "success";
        }
    }
//
//		userList.add(user);
//	}

}
