package homework4;

public class GameManager implements GameInterfaces {


@Override
public void gameAdd(Game game) {
	
	System.out.println(game.getGameName() + " Sisteme kaydedildi.");
	
}


@Override
public void gameDelete(Game game) {
	
	System.out.println(game.getGameName() + " Sistemden silindi.");
	
}

@Override
public void gameUpdate(Game game ) {

System.out.println(game.getGameName() + " isimli oyun  güncellendi. " );
}


public void gameNameChange(Game game , String newName ) {

	game.setGameName(newName);
System.out.println("Oyunun ismi "+ game.getGameName()+ " olarak deðiþtirildi." );
	
}








}