package com.SpringBoot.SpringBootPart1.Doa;

public interface FakeRepoInterface {

    String insertUser(int userId, String userName, String userSurname) throws NoSuchMethodException;
    String findUserById(int userId);
    String deleteUser(int userId);

}