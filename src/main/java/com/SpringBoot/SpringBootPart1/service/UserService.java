package com.SpringBoot.SpringBootPart1.service;

public interface UserService {

    String addUser(int userId, String userName, String userSurname) throws NoSuchMethodException;
    String getUserById(int userId) throws InterruptedException;
    String removeUser(int userId);
}