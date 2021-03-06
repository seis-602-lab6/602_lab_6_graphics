// eric says hi!
import java.awt.Color;
// team 1 says bye bye
// team1
public class Team1Graphics extends Graphics
{
	public Team1Graphics(Turtle t, double startX, double startY, double startHeading)
	{
		super(t, startX, startY, startHeading);
	}
	
	public static void drawH (Turtle t, double d, int N)
	{
		if (N==0)
			return;
		
		// move to upper left H-tip
		t.turnLeft(90);
		t.goForward(d);
		t.turnLeft(-90);
		t.goForward(d);
		
		// draw scaled-down copy of self
		drawH(t,d/2.0,N-1);
		
		// back up to lower-left H-tip
		t.goForward(-2.0*d);
		
		drawH(t,d/2.0,N-1);
		
		// move to upper-right H-tip
		
		t.goForward(d);
		t.turnLeft(-90);
		t.goForward(2.0*d);
		t.turnLeft(90);
		t.goForward(d);
		
		drawH(t,d/2.0,N-1);
		
		// and back down to lower-right H-tip
		t.goForward(-2.0*d);
		
		drawH(t,d/2.0,N-1);
		
		// don't forget to store original state of turtle!
		//	(same location, same heading)
		
		t.goForward(d);
		t.turnLeft(90);
		t.goForward(d);
		t.turnLeft(-90);
		
	}

	public void draw()
	{
		
		turtle.penDown();
		turtle.setPenColor(Color.GREEN);
		drawH(this.turtle, 75, 1);
		turtle.setPenColor(Color.BLACK);
		turtle.penUp();
	}
}
