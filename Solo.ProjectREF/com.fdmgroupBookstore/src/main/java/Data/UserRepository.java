package Data;

import Model.User;

public interface UserRepository {
	
	boolean validate(String username, String password);
	public User findByUsername(String username);

}
