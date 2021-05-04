package homework4;

public class CampaignManager  implements CampaignInterface{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.CampaignName +" isimli kampanya sisteme eklenmiþtir ve %" +
	campaign.rateofCampaign + " oraný ile indirim saðlanmaktadýr.");
	
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.CampaignName +" isimli kampanya güncellenmiþtir.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.CampaignName +" isimli kampanya silinmiþtir.");
	}

	
	public static void earnDiscount(Gamer gamer, Game game , Campaign campaign) {
		
		if (gamer.getDiscountCode() == "956") {
			System.out.println(gamer.getDiscountCode() + " kodu ile " + campaign.CampaignName  + " isimli kampanyadan "  +"%"+campaign.rateofCampaign + " oranýnda indirim kazandýnýz.");
			System.out.println("Daha önce fiyatý : " + game.getGamePrice() +" olan " + game.getGameName() + " indirim sonrasý " +  " oyununun güncel ücreti : " + (game.getGamePrice()-(game.getGamePrice()*(campaign.rateofCampaign)/100)) + " TL");
			
	
Game gametemp = new Game();
gametemp.setGamePrice(game.getGamePrice()-(game.getGamePrice()*(campaign.rateofCampaign)/100));
	
		
		}
		
		else 
		{
			System.out.println("Maalesef indirim kodunuz geçersiz.");
			System.out.println("Oyunun Güncel Ücreti : " + game.getGamePrice());
			
		
			Game gametemp = new Game();
			gametemp.setGamePrice(game.getGamePrice());
			
			}
	

	
	
	}
	
}
	
	
	

