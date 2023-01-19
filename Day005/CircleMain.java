class CircleMain
{
	public static void main(String[] args)
	{
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle();

		c1.initCircle(5);
		c1.roundCircle();
		c1.areaCircle();
		c1.printCircle();
		
		c2.initCircle(10);
		c2.roundCircle();
		c2.areaCircle();
		c2.printCircle();

		c3.initCircle(30);
		c3.roundCircle();
		c3.areaCircle();
		c3.printCircle();
	}
}

class Circle
{
	double radius, round, area;
	double pi = 3.14;
	
	public void initCircle(double radius)
	{
		this.radius = radius;
	}
	
	public void roundCircle()
	{
		round = radius * 2 * pi;
	}

	public void areaCircle()
	{
		area = radius * radius * pi;
	}

	public void printCircle()
	{
		System.out.println("반지름 : " + radius);
		System.out.println("둘레 : " + round);
		System.out.println("넓이 : " + area + "\n");
	}
}