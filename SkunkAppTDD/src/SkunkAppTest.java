import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class SkunkAppTest {

	private RollTest data = new RollTest();

	@Before
	public void setUp()
	{
		data.game = new SkunkApp ();
	}
	
	@Test
	public void testGetPlayerInfo() {
		data.game.getPlayerInfo();
		assertEquals(2, data.game.getNumberOfPlayers());
		assertEquals("Player 1", data.game.getPlayers(1));
	}

	

	
	
}
