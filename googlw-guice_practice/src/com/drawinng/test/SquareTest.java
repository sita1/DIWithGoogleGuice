import static org.junit.Assert.*;

import org.junit.Test;

import com.drawinng.annotations.ColorValue;
import com.drawinng.annotations.EdgeValue;
import com.drawinng.practice.DrawSquare;

public class SquareTest {
	
	private DrawSquare drawSquare = new DrawSquare("RED",42) ;

	@Test
	public void squareColorAndEdge_PostiveCase() {
	assertEquals("drawing square color : RED edge : 42",drawSquare.draw());
	}

}
