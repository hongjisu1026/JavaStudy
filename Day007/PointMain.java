class Point
{
	private int xPos, yPos;

	public Point(int x, int y)
	{
		xPos = x;
		yPos = y;
	}
	public void showPointInfo()
	{
		System.out.println("[" + xPos + ", " + yPos + "]");
	}
}

class Circle
{
	private int r;

	public Circle(int r)
	{
		this.r = r;
	}

	public void showCircleInfo()
	{
		System.out.println("radius : " + r);
	}
}

class Ring
{
	private int x1, y1, r1, x2, y2, r2;

	public Ring(int x1, int y1, int r1, int x2, int y2, int r2)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.r1 = r1;
		this.x2 = x2;
		this.y2 = y2;
		this.r2 = r2;
	}

	public void showRingInfo()
	{
		System.out.println("Inner Circle Info...");
		Point point1 = new Point(x1, y1);
		Circle circle1 = new Circle(r1);	
	
		circle1.showCircleInfo();
		point1.showPointInfo();

		System.out.println("Outer Circle Info...");
		Point point2 = new Point(x2, y2);
		Circle circle2 = new Circle(r2);	
	
		circle2.showCircleInfo();
		point2.showPointInfo();
	}
}

class PointMain
{
	public static void main(String[] args)
	{
		Ring ring = new Ring(1, 1, 4, 2, 2, 9);
		ring.showRingInfo();
	}
}