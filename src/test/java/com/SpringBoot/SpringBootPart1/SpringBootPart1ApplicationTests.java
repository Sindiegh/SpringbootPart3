package com.SpringBoot.SpringBootPart1;

import com.SpringBoot.SpringBootPart1.Controller.UserController;
import com.SpringBoot.SpringBootPart1.Doa.FakeRepo;
import com.SpringBoot.SpringBootPart1.service.UserServiceImplementation;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;



class SpringBootPart1ApplicationTests {

	@Test
	public void testSecurityConfig() {
		assertThat(Boolean.parseBoolean(String.valueOf(new WebSecurityConfigurer())));
	}
	@Test
	public void userController() throws NoSuchMethodException {
		FakeRepo fakeRepo = new FakeRepo();

		UserServiceImplementation userServiceImplementation = new UserServiceImplementation(fakeRepo);
		assertThat(Boolean.parseBoolean(String.valueOf(new UserController(userServiceImplementation).updateUser(1))));
		assertThat(Boolean.parseBoolean(String.valueOf(new UserController(userServiceImplementation).getUser(1))));
		assertThat(Boolean.parseBoolean(String.valueOf(new UserController(userServiceImplementation).removeUser(1))));
	}
}

