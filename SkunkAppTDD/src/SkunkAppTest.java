import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SkunkAppTest {

	private SkunkApp game;
	
	@Before
	public void setUp()
	{
		game = new SkunkApp ();
	}
	
	@Test
	public void testGetPlayerInfo() {
		game.getPlayerInfo();
		assertEquals(2, game.getNumberOfPlayers());
		assertEquals("Player 1", game.getPlayers(1));
	}

	@Test
	public void canCreateRoll() {
		Roll roll = new Roll ();
		assertTrue(roll.getLastTotal()<=12);
		assertTrue(roll.getLastTotal()>=2);
	}

	
	
	
	
}
