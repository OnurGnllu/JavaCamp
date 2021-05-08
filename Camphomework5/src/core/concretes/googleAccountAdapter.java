package core.concretes;

import core.abstracts.SignUpService;
import entities.conctretes.User;
import jGoogle.googleAccountManager;

public class googleAccountAdapter implements SignUpService {

	@Override
	public void signUp(User user) {
	
		googleAccountManager manager = new googleAccountManager();
		manager.SignUp(user);
		
		
	}

	
}
