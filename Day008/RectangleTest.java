class Rectangle
{
	private int ulx, uly;		// 좌 상단 x, y 좌표
	private int lrx, lry;		// 우 하단 x, y 좌표

	public void setRectangle(int lrx, int lry, int ulx, int uly)
	{
		if(lrx<=ulx || lry<=uly)
		{
			System.out.println("좌표값 틀림");
			return;
		} 
		if(!isRectangle(ulx) || !isRectangle(lrx))
		{
			System.out.println("x 좌표값 틀림");
			return;
		}
		if(!isRectangle(uly) || !isRectangle(lry))
		{
			System.out.println("y 좌표값 틀림");
			return;
		} 	
		
		this.ulx = ulx;
		this.uly = uly;
		this.lrx = lrx;
		this.lry = lry;	
	}

	public boolean isRectangle(int pos)
	{
		if(pos<=0 || pos>100)
			return false;
		else
			return true;
	}

	public void showArea()
	{
		int xLen = lrx-ulx;
		int yLen = lry-uly;
		System.out.println("넓이 : " + (xLen*yLen));
	}
}

class RectangleTest
{
	public static void main(String[] args)
	{
		Rectangle rec = new Rectangle();
		rec.setRectangle(-3, -1, 2, 7);
		rec.showArea();

		rec.setRectangle(2, 2, 8, 8);
		rec.showArea();

		rec.setRectangle(22, 22, 10, 10);
		rec.showArea();
	}
}