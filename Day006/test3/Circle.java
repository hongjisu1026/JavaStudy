package orange.area;

public class Circle
{
	double radius;
	public Circle(double radius)
	{
		this.radius = radius;
	}
	public double calArea()
	{
		return 3.14 * radius * radius;
	}
}

