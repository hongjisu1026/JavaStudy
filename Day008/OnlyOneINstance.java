class SimpleNumber
{
	int num=0;
	private static SimpleNumber snInst = new SimpleNumber();
	private SimpleNumber() {}	// 생성자 private
	public void addNum(int n) { num += n; }
	public void showNum() 
	{ 
		System.out.println(num); 
	}
	
	public static SimpleNumber getSimpleNumberInst()
	{
		return snInst;
	}
}

class OnlyOneINstance
{
	public static void main(String[] args)
	{
		SimpleNumber num1 = SimpleNumber.getSimpleNumberInst();
		num1.addNum(20);
		
		num1.showNum();

		SimpleNumber num2 = SimpleNumber.getSimpleNumberInst();
		num2.addNum(30);
		
		num2.showNum();
	}
}