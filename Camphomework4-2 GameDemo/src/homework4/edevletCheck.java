package homework4;
//Utility Mant���
public class edevletCheck {
	static String nationalityId= "187954";
	static String dateOfBirth = "13.07.1998";
	static String firstName = "Onur";
	static String lastName = "G�n�ll�";
	
	
	

	public static void checkEdevlet(Gamer gamer) {
		
		if (gamer.getNationalityId() == nationalityId &&  gamer.getYearOfBirth()== dateOfBirth  && gamer.getFirstName()== firstName && gamer.getLastName()==lastName) {
			System.out.println(gamer.getFirstName() + " adli kullanici Do�ruland�.");
			System.out.println(gamer.getFirstName() + " adli kullanici eklendi.");
		}
			
			else {
				System.out.println(gamer.getFirstName() + " adli kullanici kay�t olamad�!");
				System.out.println(gamer.getFirstName() +" "+ gamer.getLastName() + "  adli kullanicinin bilgileri E-Devlet �zerinden do�rulanamad�.");
			}
		

}
}
