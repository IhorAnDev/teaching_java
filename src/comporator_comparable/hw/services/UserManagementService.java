package comporator_comparable.hw.services;

import comporator_comparable.hw.enteties.User;

import java.util.List;


public interface UserManagementService {

	String registerUser(User user);
	
	List<User> getUsers();

	User getUserByEmail(String userEmail);

}
