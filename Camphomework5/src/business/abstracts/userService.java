package business.abstracts;

import entities.conctretes.User;

public interface userService {
	
	void add(User user);
	void update(User user);
	void delete(User user);
	void Login(User user);
	
}
