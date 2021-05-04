package homework4;

public class CampaignManager  implements CampaignInterface{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.CampaignName +" isimli kampanya sisteme eklenmi�tir ve %" +
	campaign.rateofCampaign + " oran� ile indirim sa�lanmaktad�r.");
	
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.CampaignName +" isimli kampanya g�ncellenmi�tir.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.CampaignName +" isimli kampanya silinmi�tir.");
	}

	
	public static void earnDiscount(Gamer gamer, Game game , Campaign campaign) {
		
		if (gamer.getDiscountCode() == "956") {
			System.out.println(gamer.getDiscountCode() + " kodu ile " + campaign.CampaignName  + " isimli kampanyadan "  +"%"+campaign.rateofCampaign + " oran�nda indirim kazand�n�z.");
			System.out.println("Daha �nce fiyat� : " + game.getGamePrice() +" olan " + game.getGameName() + " indirim sonras� " +  " oyununun g�ncel �creti : " + (game.getGamePrice()-(game.getGamePrice()*(campaign.rateofCampaign)/100)) + " TL");
			
	
Game gametemp = new Game();
gametemp.setGamePrice(game.getGamePrice()-(game.getGamePrice()*(campaign.rateofCampaign)/100));
	
		
		}
		
		else 
		{
			System.out.println("Maalesef indirim kodunuz ge�ersiz.");
			System.out.println("Oyunun G�ncel �creti : " + game.getGamePrice());
			
		
			Game gametemp = new Game();
			gametemp.setGamePrice(game.getGamePrice());
			
			}
	

	
	
	}
	
}
	
	
	

