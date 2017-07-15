import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RollTest {
	public SkunkApp game;
	public FakeDie fake1;
	public FakeDie fake2;
    public Die die1;
    public Die die2;
	private int lastTotal;
	private Roll roll;
	
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
    @Test
    public void testIsSkunk1 () {
    	fake1 = new FakeDie(new int [] {1});
    	fake2 = new FakeDie(new int [] {3});
    	roll = new Roll (fake1, fake2);
    	assertTrue(roll.isOneSkunk());
    	assertFalse (roll.isDoubleSkunk());
    	assertFalse (roll.isSkunkDeuce());
    	
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	private void assertFalse(Object doubleSkunk) {
		// TODO Auto-generated method stub
		
	}
	private void assertTrue(Object oneSkunk) {
		// TODO Auto-generated method stub
		
	}
	
		
	}
    
