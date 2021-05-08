package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


import business.abstracts.userService;
import core.abstracts.SignUpService;
import core.concretes.googleAccountAdapter;
import dataAccess.abstracts.userDao;
import entities.conctretes.User;

public class userManager implements userService {
	
	private userDao userdao;

private SignUpService signupservice;



	
	public userManager (userDao userdao,SignUpService singupservice) {
		super();
		this.userdao = userdao;
		this.signupservice = singupservice;
	
	}
	

	

  
		

	
	
	
	
	@Override
	public void add(User user) {
		//Veritaban�ndan al�nd� veri.
		if(!this.userdao.emailCheck(user))
		{
			System.out.println("Kay�t i�lemi ba�ar�s�z." + "\n" + "Bu email adresi daha �nceden al�nm�� -->" + user.getEmail());
			throw new ArithmeticException("Kay�tlanma Ge�ersiz.");
		}
			
	SignUpRules. singUpRules(user);	//Veritaban�yla alakas�z olan kurallar buraya yaz�ld�.
    emailverificationservices.verificationmail(user);
	this.userdao.add(user);
	this.signupservice.signUp(user);
	
	
	
	}
		
	

	@Override
	public void update(User user) {
		userdao.update(user);
		
	}

	@Override
	public void delete(User user) {
		userdao.delete(user);
		
	}


	@Override
	public void Login(User user) {
		if (!this.userdao.emailCheck(user)) {
			System.out.println("Ho�geldin "+ user.getFirstName()  + " Bilgilerin dogru. Giris yapildi.");
		} else {
			System.out.println("Giris basarisiz. Yanlis email ve sifre girdiniz.");
		}

	}
		
	}
	
	
	


