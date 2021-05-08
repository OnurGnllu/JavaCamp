package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.userService;
import core.abstracts.SignUpService;
import dataAccess.abstracts.userDao;
import entities.conctretes.User;




public class SignUpRules  {
	
	
	private userDao userdao;

private SignUpService signupservice;



	
	public void userManager (userDao userdao,SignUpService singupservice) {
		
		this.userdao = userdao;
		this.signupservice = singupservice;

	}
	
	 private final static Pattern validEmailAddressRegex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
				Pattern.CASE_INSENSITIVE);
		private static boolean validateEmail(String email) {
			Matcher matcher = validEmailAddressRegex.matcher(email);
			return matcher.find();
		}
	
	
	public static  boolean singUpRules (User user) {
		
		if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("Isminiz veya soyisminiz 2 harften fazla olmalidir. Lütfen kontrol ediniz.");
			throw new ArithmeticException("Kayýtlanma Geçersiz.");

		} 
		
		else if (user.getPassword().length()<6) {
			System.out.println("parolaniz 6 karakterden az olamaz.");
			throw new ArithmeticException("Kayýtlanma Geçersiz.");

		}
			
		else if (!validateEmail(user.getEmail())) {
			System.out.println("Yanlis E-Mail adresi girdiniz. Lütfen kontrol ediniz.");
			throw new ArithmeticException("Kayýtlanma Geçersiz.");

		}
		return false; 

	
		
		
		
		
	


	
	
	
	
	}
}
