package homework3;

public class userManager {

	public void name(User name) {
		System.out.println("Kullanýcýnýn Adý : " + name.getFirstName() + "  " + name.getLastName());
	}
  
	public void delete(User name) {
		System.out.println("Kullanýcýnýn Adý : " + name.getFirstName() + "  -  olan" + "Kiþi Silindi");
	}

	public void add(User name) {
		System.out.println("Kullanýcý Eklendi : " + name.getFirstName()  + "  -  Kullanýcýnýn ID si : " + name.getId());
	}

	public void getId(User name) {
		System.out.println("Kullanýcý ID si : " + name.getId());
	}

	public void getEmail(User name) {
		System.out.println("Kullanýcý Email Adresi : " + name.getEmail());
		
	}



}

