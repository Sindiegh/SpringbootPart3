package com.SpringBoot.SpringBootPart1.service;

import com.SpringBoot.SpringBootPart1.Doa.FakeRepo;
import com.SpringBoot.SpringBootPart1.Doa.FakeRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {


    @Autowired
    FakeRepoInterface fakeRepoInterface ;

    public UserServiceImplementation(FakeRepoInterface repo) {
        this.fakeRepoInterface=repo;
    }

    @Override
    public String addUser(int userId, String userName, String userSurname) throws NoSuchMethodException {
        return fakeRepoInterface.insertUser(userId,userName,userSurname);
    }

    @Override
    @Cacheable("string")
    public String getUserById(int userId) {
        try
        {
            System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
            Thread.sleep(1000*5);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }


        return fakeRepoInterface.findUserById(userId);
    }

    @Override
    public String removeUser(int userId) {
        return fakeRepoInterface.deleteUser(userId);
    }
    }
