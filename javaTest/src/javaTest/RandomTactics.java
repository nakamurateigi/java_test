package javaTest;

public class RandomTactics implements Tactics{
	public int readTactics(){
		int playerhand = 0;

		double randomNum = Math.random() * 3;

		if(randomNum < 1) {
			playerhand = Player.STONE;
		}
		else if(randomNum < 2) {
			playerhand = Player.SCISSORS;
		}
		else if(randomNum < 3) {
			playerhand = Player.PAPER;
		}
		return playerhand;
	}

}
