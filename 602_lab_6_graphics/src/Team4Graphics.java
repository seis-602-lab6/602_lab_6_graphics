import java.awt.Color;

public class Team4Graphics extends Graphics
{
	public Team4Graphics(Turtle t, double startX, double startY, double startHeading)
	{
		super(t, startX, startY, startHeading);
	}

	public static void drawH(Turtle t, double d, int N)
	{
		if (N == 0)
			return;

		// move to upper left H-tip
		t.turnLeft(90);
		t.goForward(d);
		t.turnLeft(-90);
		t.goForward(d);

		// draw scaled-down copy of self
		drawH(t, d / 2.0, N - 1);

		// back up to lower-left H-tip
		t.goForward(-2.0 * d);

		drawH(t, d / 2.0, N - 1);

		// move to upper-right H-tip

		t.goForward(d);
		t.turnLeft(-90);
		t.goForward(2.0 * d);
		t.turnLeft(90);
		t.goForward(d);

		drawH(t, d / 2.0, N - 1);

		// and back down to lower-right H-tip
		t.goForward(-2.0 * d);

		drawH(t, d / 2.0, N - 1);

		// don't forget to store original state of turtle!
		// (same location, same heading)

		t.goForward(d);
		t.turnLeft(90);
		t.goForward(d);
		t.turnLeft(-90);

	}

	public void draw()
	{
		turtle.penDown();
		turtle.setPenRadius(0.005);
		turtle.setPenColor(Color.RED);

		// drawSquare(t, 200);

		// drawNestedSquares(t, 50, 20, 20);
		
		turtle.penDown();
		spiral(turtle,10,2,100);

		// drawH(this.turtle, 75, 7);
		turtle.penUp();
	}

	private static void changeColor(Turtle t, int num)
	{
		switch (num % 3)
		{
		case 0:
			t.setPenColor(Color.BLUE);
			break;
		case 1:
			t.setPenColor(Color.RED);
			break;
		case 2:
			t.setPenColor(Color.GREEN);
			break;
		}
	}

	public static void spiral(Turtle t, double side, double inc, int num)
	{
		if (num == 0)
			return;
		
		changeColor(t,num);
		
		t.goForward(side);
		t.turnLeft(90);
		spiral(t, side+inc, inc, num-1);
	}
	
}
