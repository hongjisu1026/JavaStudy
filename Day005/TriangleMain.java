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
	int tWidth, tHeight, tArea;

	public void initTriangle(int w, int h)
	{
		tWidth = w;
		tHeight = h;
	}

	public void areaTriangle()
	{
		tArea = tWidth * tHeight / 2;
	}

	public void printTriangle()
	{
		System.out.println("밑변 : " + tWidth);
		System.out.println("높이 : " + tHeight);
		System.out.println("면적 : " + tArea + "\n");
	}
}