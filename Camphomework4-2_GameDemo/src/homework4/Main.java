package homework4;

public class Main {

	public static void main(String[] args) {
		
		
		Gamer gamer1 = new Gamer();
		gamer1.setFirstName("Onur");
		gamer1.setLastName("G�n�ll�");
		gamer1.setUserName("Onurgnllu");
		gamer1.setNationalityId("187954");
		gamer1.setDiscountCode("956");
		gamer1.setYearOfBirth("13.07.1998");
		
		
		Gamer gamer2 = new Gamer("Ugur", "Baran" , "188954","456");
		Gamer gamer3 = new Gamer("�erefcan", "Seyrek" , "188954","465");
		
		Game game1= new Game ("FarCry5",1 ,450);
		Game game2= new Game ("COD",2 ,560);
		Game game3= new Game ("GTA-5",3 ,240);
		
		
		GamerManager gamermanager1 = new GamerManager();
		gamermanager1.SignUp(gamer2);
		
		
		GameManager gamemanager1 = new GameManager();
		gamemanager1.gameUpdate(game1);
		
		
		Campaign campaign1 = new Campaign();
		campaign1.campainId = 1;
		campaign1.CampaignName = "May�slar Bizimdir �ndirimi";
		campaign1.CampaignDetail = "%20 Oran�nda indirim";
		campaign1.rateofCampaign = 20;
		
	
		
		CampaignManager campaignmanager = new CampaignManager();
		campaignmanager.add(campaign1);
		
salesDepartmant sales = new salesDepartmant();
sales.buyThisgame(gamer1, game2, campaign1);
	
		
		
	
		
		
		
		
		
		
	
	

}
}
