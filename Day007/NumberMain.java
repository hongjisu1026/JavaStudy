class Number
{
	public int num1;
	Number()
	{
		num1 ++;
	}
	public void printCS()
	{
		System.out.println(num1);
	}
}

class NumberMain
{
	public static void main(String[] args)
	{
		Number n1 = new Number();
		Number n2 = new Number();
		Number n3 = new Number();
	}
}