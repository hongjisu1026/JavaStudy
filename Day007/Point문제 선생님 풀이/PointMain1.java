class Point1
{
	private int xPos, yPos;

	public Point1(int x, int y)
	{
		xPos = x;
		yPos = y;
	}
	public void showPointInfo()
	{
		System.out.println("[" + xPos + ", " + yPos + "]");
	}
}

class Circle1
{
	private Point1 center;
	private int radius;
	
	Circle1(int xPos, int yPos, int radius)
	{
		center = new Point1(xPos, yPos);
		this.radius = radius;
	}

	public void showCircleInfo()
	{
		System.out.println("radius : " + radius);
		center.showPointInfo();
	}
}

class Ring1
{
	private Circle1 ic;
	private Circle1 oc;
	
	Ring1(int x1, int y1, int r1, int x2, int y2, int r2)
	{
		ic = new Circle1(x1, y1, r1);
		oc = new Circle1(x2, y2, r2);
	}

	public void showRingInfo()
	{
		System.out.println("Inner Circle Info...");
		ic.showCircleInfo();
		System.out.println("Outer Circle Info...");
		oc.showCircleInfo();
	}
}

class PointMain1
{
	public static void main(String[] args)
	{
		Ring1 ring = new Ring1(1, 1, 4, 2, 2, 9);
		ring.showRingInfo();
	}
}