package homework4;

public class Game implements EntityBase {
	private String gameName;
	private int gameId;
	private int gamePrice;
	
public Game () {
		

	}

public Game (String gameName , int gameId ,int gamePrice) {
	this.gameName = gameName;
	this.gameId = gameId;
	this.gamePrice = gamePrice;
	
}
	
	
	
	
	
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public int getGamePrice() {
		return gamePrice;
	}
	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}
}
