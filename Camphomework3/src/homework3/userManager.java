package homework3;

public class userManager {

	public void name(User name) {
		System.out.println("Kullan�c�n�n Ad� : " + name.getFirstName() + "  " + name.getLastName());
	}
  
	public void delete(User name) {
		System.out.println("Kullan�c�n�n Ad� : " + name.getFirstName() + "  -  olan" + "Ki�i Silindi");
	}

	public void add(User name) {
		System.out.println("Kullan�c� Eklendi : " + name.getFirstName()  + "  -  Kullan�c�n�n ID si : " + name.getId());
	}

	public void getId(User name) {
		System.out.println("Kullan�c� ID si : " + name.getId());
	}

	public void getEmail(User name) {
		System.out.println("Kullan�c� Email Adresi : " + name.getEmail());
		
	}



}

