package homework4;

public class GamerManager implements GamerInterfaces{

	
	
	@Override
	public void SignUp(Gamer gamer) {
		edevletCheck.checkEdevlet(gamer);
		
		
		
	}

	@Override
	public void SignOut(Gamer gamer) {
		System.out.println(gamer.getUserName() + " Kullan�c� ismi ile ��k�� yapt�n�z.");
		
	}

	@Override
	public void Update(Gamer gamer) {
		System.out.println(gamer.getUserName() + " Kullan�c�s� g�ncellendi.");
			
	
	}

	@Override
	public void Delete(Gamer gamer) {
		System.out.println(gamer.getUserName() + " Kullan�c�s� silindi.");
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}