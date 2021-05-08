package core.concretes;

import NormalSignUp.jNormalSingUpManager;
import core.abstracts.SignUpService;
import entities.conctretes.User;
import jGoogle.googleAccountManager;

public class normalSignUpAdapter implements SignUpService  {

	@Override
	public void signUp(User user) {
	
		googleAccountManager manager = new googleAccountManager();
		manager.SignUp(user);
		
		
	}

	
	

}
