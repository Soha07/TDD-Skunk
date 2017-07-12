
public class SkunkApp {

	private int numberOfPlayers ;
    private String[] playerName;
	
	public void getPlayerInfo() {
	 numberOfPlayers = 2;
	 playerName = new String [numberOfPlayers];
	 playerName[0] = "Player 1";
	 playerName[1] = "Player 2";
		
	}
	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}
	public String getPlayers(int playerNumber) {
		return playerName [playerNumber-1];
	}


public static void main(String[] args) {
		

	}






}
