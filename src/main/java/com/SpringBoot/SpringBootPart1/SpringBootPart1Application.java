package com.SpringBoot.SpringBootPart1;

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


		Scanner input = new Scanner(System.in);
		SpringApplication application = new SpringApplication(Application.class);
		application.setDefaultProperties(Collections.singletonMap("server.port", "8888"));
		//application.run(args);
		try {

			FakeRepo fakeRepo = new FakeRepo();
			System.out.println(fakeRepo.insertUser(1, "Sindi", "K"));
			System.out.println(fakeRepo.findUserById(1));
			System.out.println(fakeRepo.deleteUser( 1));
			UserServiceImplementation userServiceImplementation = new UserServiceImplementation(fakeRepo);
			System.out.println(userServiceImplementation.addUser(54,"Til","Slip"));
			System.out.println(userServiceImplementation.getUserById(54));
			System.out.println(userServiceImplementation.removeUser(54));

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
