import business.abstracts.userService;
import business.concretes.userManager;
import core.concretes.googleAccountAdapter;
import core.concretes.normalSignUpAdapter;
import dataAccess.concretes.dataBase;
import entities.conctretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 =  new User(1,"Onur", "Gonullu", "onur323a@gmail.com","13442426");
		User user2 = new User(2,"Omer", "Deveceker", "omer21@gmail.com","895874");
		User user3 = new User(3,"Ali","Deneme","deneme1@gmail.com","123456");
		User user4= new User (4,"Suat","Deneme","deneme1232@gmail.com","123213");
		
userService usermanager = new userManager(new dataBase(),new googleAccountAdapter());

usermanager.add(user4);
System.out.println("----------------------");
usermanager.Login(user2);

	
	
	
	
	
	
	
	
	
	
	
	}

}
