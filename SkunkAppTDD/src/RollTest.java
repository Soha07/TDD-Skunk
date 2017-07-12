import org.junit.Before;
import org.junit.Test;

public class RollTest {
	public SkunkApp game;
    public Die die1;
    public Die die2;
	private int lastTotal;
	
    @Before
    public void setUp()
    {
    	die1 = new Die ();
    	die2 = new Die ();
    }
    @Test
	public void roll(){
    die1.roll();
	die2.roll();
	
	this.lastTotal= die1.getLastRollDie() + die2.getLastRollDie();
    }
}