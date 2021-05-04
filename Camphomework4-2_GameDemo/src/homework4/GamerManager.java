package homework4;

public class GamerManager implements GamerInterfaces{

	
	
	@Override
	public void SignUp(Gamer gamer) {
		edevletCheck.checkEdevlet(gamer);
		
		
		
	}

	@Override
	public void SignOut(Gamer gamer) {
		System.out.println(gamer.getUserName() + " Kullanýcý ismi ile çýkýþ yaptýnýz.");
		
	}

	@Override
	public void Update(Gamer gamer) {
		System.out.println(gamer.getUserName() + " Kullanýcýsý güncellendi.");
			
	
	}

	@Override
	public void Delete(Gamer gamer) {
		System.out.println(gamer.getUserName() + " Kullanýcýsý silindi.");
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}