
public class Roll {

	private FakeDie die1;
	private FakeDie die2;
	private int lastTotal;

	public Roll(FakeDie fake1, FakeDie fake2)
	{
		this.setDie1(fake1);
		this.setDie2(fake2);
	}

	public int getLastTotal(){
		return lastTotal;
		
	}
	public Object isOneSkunk() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object isDoubleSkunk() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object isSkunkDeuce() {
		// TODO Auto-generated method stub
		return false;
	}

	public FakeDie getDie2() {
		return die2;
	}

	public void setDie2(FakeDie die2) {
		this.die2 = die2;
	}

	public FakeDie getDie1() {
		return die1;
	}

	public void setDie1(FakeDie die1) {
		this.die1 = die1;
	}
}