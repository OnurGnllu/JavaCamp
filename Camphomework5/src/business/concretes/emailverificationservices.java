package business.concretes;

import entities.conctretes.User;

public class emailverificationservices {

	public static void verificationmail(User user) {
		
		System.out.println(user.getEmail() + " adresine doğrulama kodu gönderildi.");
		System.out.println("Doğrulandı...");
		
	}
	
	
}
