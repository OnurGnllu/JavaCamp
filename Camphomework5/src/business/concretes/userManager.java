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
		//Veritabanýndan alýndý veri.
		if(!this.userdao.emailCheck(user))
		{
			System.out.println("Kayýt iþlemi baþarýsýz." + "\n" + "Bu email adresi daha önceden alýnmýþ -->" + user.getEmail());
			throw new ArithmeticException("Kayýtlanma Geçersiz.");
		}
			
	SignUpRules. singUpRules(user);	//Veritabanýyla alakasýz olan kurallar buraya yazýldý.
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
			System.out.println("Hoþgeldin "+ user.getFirstName()  + " Bilgilerin dogru. Giris yapildi.");
		} else {
			System.out.println("Giris basarisiz. Yanlis email ve sifre girdiniz.");
		}

	}
		
	}
	
	
	


