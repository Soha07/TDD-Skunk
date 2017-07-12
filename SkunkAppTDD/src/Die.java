
public class Die {

	private int lastTotal;
	private Roll die1;
	private Roll die2;
	
	
	
	public int roll() {
		return (int) Math.random()*6 +1;
		
	}

	public Roll getDie1() {
		return die1;
	}

	public void setDie1(Roll die1) {
		this.die1 = die1;
	}

	public Roll getDie2() {
		return die2;
	}

	public void setDie2(Roll die2) {
		this.die2 = die2;
	}

	public int getLastRollDie() {
		
		return lastTotal;
	}



	

}


	


