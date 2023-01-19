import orange.area.Circle;

class CircleMain
{
	public static void main(String[] args)
	{
		orange.area.Circle c1 = new orange.area.Circle(5);
		System.out.println(c1.calArea());

		orange.parimeter.Circle c2 = new orange.parimeter.Circle(10);
		System.out.println(c2.calParimeter());

		Circle c3 = new Circle(20);
		System.out.println(c3.calArea());
	}
}
