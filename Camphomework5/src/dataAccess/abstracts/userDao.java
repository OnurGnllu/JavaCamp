package dataAccess.abstracts;

import java.util.List;

import entities.conctretes.User;

public interface userDao {
	
	void add(User user);
	void delete(User user);
	List<User> getAll();
	User get(String email);
	void update(User user);
	boolean emailCheck(User user);

}
