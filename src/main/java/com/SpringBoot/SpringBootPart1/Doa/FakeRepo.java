package com.SpringBoot.SpringBootPart1.Doa;

import com.SpringBoot.SpringBootPart1.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public  class FakeRepo implements FakeRepoInterface{
    private static ArrayList<User> usr = new ArrayList<>();

    @Override
    public String insertUser(int userId, String userName, String userSurname) {
        User user = new User(userId,userName,userSurname);
        usr.add(user);
        return userName + " entered";
    }

    @Override
    public String findUserById(int userId) {
        for (User userArray: usr ) {
            if (userArray.getUserId() == userId){
                return "Hi there "+ User.getUserName()  ;
            }
        }


        return null;
    }

    @Override
    public String deleteUser(int userId) {
        User user = new User(userId,"","");
        usr.remove(user);
        return "User removed";

    }


}
