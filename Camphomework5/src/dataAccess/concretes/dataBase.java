package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.userDao;
import entities.conctretes.User;

public class dataBase implements userDao {
	
	List<User> users = new ArrayList<>();
	
	public dataBase() {
		User user1=new User(1,"Ali","Deneme","deneme1@gmail.com","123456");
		User user2=new User(2,"Hakan","Deneme","deneme2@gmail.com","654321");
		User user3=new User(3,"Burak","Deneme","deneme2@gmail.com","1234567");
		User user4=new User(1,"Onur", "Gonullu", "onur323a@gmail.com","13442426");
		
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);



}
	
	
	

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName() + " Sisteme eklendi. Sistemimize Hoşgeldiniz.");
		users.add(user); //user arrayine yollandı.
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName() + " Sistemden silindi.");
		
	}
	
	@Override
	public void update(User user) {

		System.out.println("Kullanıcı veritabanında güncellendi.");
	}
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}




	@Override
	public User get(String email) {
		User user=users.stream()
				.filter(u->u.getEmail()==email)
				.findFirst()
				.orElse(null);
		return user;
	}




	@Override
	public boolean emailCheck(User user) {
		
		for(User u : users)
		{
			if(u.getEmail() == user.getEmail())
			{
				return false;
			}
		}
		return true;
	}

}
