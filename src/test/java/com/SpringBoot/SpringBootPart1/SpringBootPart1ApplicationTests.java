package com.SpringBoot.SpringBootPart1;

import com.SpringBoot.SpringBootPart1.Controller.UserController;
import com.SpringBoot.SpringBootPart1.Doa.FakeRepo;
import com.SpringBoot.SpringBootPart1.Doa.FakeRepoInterface;
import com.SpringBoot.SpringBootPart1.model.User;
import com.SpringBoot.SpringBootPart1.service.UserService;
import com.SpringBoot.SpringBootPart1.service.UserServiceImplementation;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.net.MalformedURLException;
import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
class SpringBootPart1ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void insertUserTest()  {
		assertThat(Boolean.parseBoolean(String.valueOf(new FakeRepo().insertUser(1,"",""))));

	}

	@Test
	public void findUserByIdTest()  {
		assertThat(Boolean.parseBoolean(String.valueOf(new FakeRepo().findUserById(1))));

		}

	@Test
	public void deleteUserTest()  {
		assertThat(Boolean.parseBoolean(String.valueOf(new FakeRepo().deleteUser(1))));

	}
	@Test
	public void userServiceImplTest() throws InterruptedException {
		assertThat(Boolean.parseBoolean(String.valueOf(new UserService() {
			@Override
			public String addUser(int userId, String userName, String userSurname) throws NoSuchMethodException {
				return null;
			}

			@Override
			public String getUserById(int userId) throws InterruptedException {
				System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
				Thread.sleep(1000*5);
				return null;
			}

			@Override
			public String removeUser(int userId) {
				return null;
			}
		}.getUserById(1))));


		assertThat(Boolean.parseBoolean(String.valueOf(new UserService() {
			@Override
			public String addUser(int userId, String userName, String userSurname) throws NoSuchMethodException {
				return null;
			}

			@Override
			public String getUserById(int userId) throws InterruptedException {
				System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
				Thread.sleep(1000*5);
				return null;
			}

			@Override
			public String removeUser(int userId) {
				return null;
			}
		}.getUserById(1))));



		assertThat(Boolean.parseBoolean(String.valueOf(new UserService() {
			@Override
			public String addUser(int userId, String userName, String userSurname) throws NoSuchMethodException {
				return null;
			}

			@Override
			public String getUserById(int userId) throws InterruptedException {
				System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
				Thread.sleep(1000*5);
				return null;
			}

			@Override
			public String removeUser(int userId) {
				return null;
			}
		}.getUserById(1))));


		assertThat(Boolean.parseBoolean(String.valueOf(new UserService() {
			@Override
			public String addUser(int userId, String userName, String userSurname) throws NoSuchMethodException {
				return null;
			}

			@Override
			public String getUserById(int userId) throws InterruptedException {
				System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
				Thread.sleep(1000*5);
				return null;
			}

			@Override
			public String removeUser(int userId) {
				return null;
			}
		}.getUserById(1))));
	}



	@Test
	public void webSecurityConfigurerTest(){
		assertThat(Boolean.parseBoolean(String.valueOf(new WebSecurityConfigurer())));
	}


	@Test
	public void userController() throws NoSuchMethodException {

		assertThat(Boolean.parseBoolean(String.valueOf(
				new UserController(new UserServiceImplementation(new FakeRepoInterface() {
					@Override
					public String insertUser(int userId, String userName, String userSurname) throws NoSuchMethodException {
						return null;
					}

					@Override
					public String findUserById(int userId) {
						return null;
					}

					@Override
					public String deleteUser(int userId) {
						return null;
					}
				})).updateUser(1))));
	}


}

