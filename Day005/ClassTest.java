class TriangleMain
{
	public static void main(String[] args)
	{
		Triangle t1 = new Triangle();
		t1.initTriangle(10, 5);

		Triangle t2 = new Triangle();
		t2.initTriangle(4, 2);

		Triangle t3 = new Triangle();
		t3.initTriangle(20, 10);
		
		t1.areaTriangle();
		t1.printTriangle();

		t2.areaTriangle();
		t2.printTriangle();

		t3.areaTriangle();
		t3.printTriangle();
	}
}

class Triangle
{
	int tBase, tHeight, tArea;

	public void initTriangle(int a, int b)
	{
		tBase = a;
		tHeight = b;
	}

	public void areaTriangle()
	{
		tArea = tBase * tHeight / 2;
	}

	public void printTriangle()
	{
		System.out.println(tArea);
	}
}