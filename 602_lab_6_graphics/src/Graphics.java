
public abstract class Graphics
{
	protected Turtle turtle;
	
	public Graphics(Turtle t, double startX, double startY, double startHeading)
	{
		turtle = t;
		turtle.setX(startX);
		turtle.setY(startY);
		turtle.setAngle(startHeading);
	}
	
	public abstract void draw();
	
	public static void main(String[] args)
	{
		Turtle t = new Turtle(0.0,0.0,0.0);
		
		t.penDown();
		t.goForward(300);
		t.goForward(-600);
		t.goForward(300);
		t.turnLeft(90);
		t.goForward(300);
		t.goForward(-600);
		t.goForward(300);
		t.turnLeft(-90);

		new Team1Graphics(t,-150.0, -150, 90.0).draw();
		
		new Team2Graphics(t,-150, 150, 90.0).draw();
		
		new Team3Graphics(t,150.0, -150.0, 90.0).draw();
		
		new Team4Graphics(t,150.0, 150.0, 90.0).draw();
		
		
		
	}
}
