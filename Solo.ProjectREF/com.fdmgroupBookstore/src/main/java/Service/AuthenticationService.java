package Service;


import Data.UserRepository;
import Model.User;

public class AuthenticationService {
	
	UserRepository userRepository;
	
	public AuthenticationService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User authenticate(String username, String password) throws UserNotFoundException{
		
		User user = userRepository.findByUsername(username);
		
		if(user.getPassword() == password) {
			return user;
		} else {
		throw new UserNotFoundException("User not found");
	}
	
	}

}
