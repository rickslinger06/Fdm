package com.fdmgroupBookstore.Service;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

import Data.UserRepository;
import Model.User;
import Service.AuthenticationService;
import Service.UserNotFoundException;



public class AuthenticationServiceTest {
	
	UserRepository mockUserRepository;
	AuthenticationService authenticationService;
	

	@Test
	public void test_authenticationMethodTakesAUsernameAndReturnsAUser() throws UserNotFoundException{
		mockUserRepository = mock(UserRepository.class);
		authenticationService = new AuthenticationService(mockUserRepository);

		User expectedUser = new User();
		String username = "bMiller";
		String password = "password1234";
		expectedUser.setUsername(username);
		expectedUser.setPassword(password);
		
	
		when(mockUserRepository.findByUsername(username)).thenReturn(expectedUser);

		User actualUser = authenticationService.authenticate(username, password);
		

		verify(mockUserRepository, times(1)).findByUsername(username);
		assertEquals(expectedUser, actualUser);
				
			
	}

}
