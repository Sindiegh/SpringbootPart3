package com.SpringBoot.SpringBootPart1.Application;

import java.util.Collections;
import java.util.Scanner;

import com.SpringBoot.SpringBootPart1.Controller.UserController;
import com.SpringBoot.SpringBootPart1.Doa.FakeRepo;
import com.SpringBoot.SpringBootPart1.service.UserServiceImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
class Application {
	public static void main(String[] args)throws NullPointerException {


		SpringApplication.run(Application.class, args);
		try {

			FakeRepo fakeRepo = new FakeRepo();
			UserServiceImplementation userServiceImplementation = new UserServiceImplementation(fakeRepo);
			UserController userController = new UserController(userServiceImplementation);
			System.out.println(userController.updateUser(1));
			System.out.println(userController.removeUser(1));
			System.out.println(userController.getUser(1));

		}
		catch (IndexOutOfBoundsException | NoSuchMethodException iobe)
		{
			iobe.getMessage();
		}
	}
}
