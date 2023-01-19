class Multiply1
{
	public static void main(String[] args)
	{
		int i, j, m;
		for(i=2;i<=9;i++)
		{
			for(j=1;j<=9;j++)
			{
				m = i*j;
				System.out.println(i + " * " + j + " = " + m);
			}
			System.out.println();
		}
	}
}

class Multiply2
{
	public static void main(String[] args)
	{
		int i, j, m;
		for(i=2;i<=9;i++)
		{
			System.out.println(i + "단");
			for(j=1;j<=9;j++)
			{
				m = i*j;
				System.out.println(i + " * " + j + " = " + m);
			}
			System.out.println();
		}
	}
}

class Multiply3
{
	public static void main(String[] args)
	{
		int i, j, m;
		for(j=1;j<=9;j++)
		{
			for(i=2;i<=9;i++)
			{
				m = i*j;
				System.out.print(i + " * " + j + " = " + m + "\t");
			}
			System.out.println();
		}
	}
}

class Multiply4
{
	public static void main(String[] args)
	{
		int i, j, m;
		for(i=2;i<=9;i+=2)
		{
			for(j=1;j<=i;j++)
			{
				m = i*j;
				System.out.println(i + " * " + j + " = " + m);
			}
			System.out.println();
		}
	}
}

class Multiply5
{
	public static void main(String[] args)
	{
		int i, j, temp1,temp2, sum;
		
		for(i=0;i<10;i++) 
		{
			for(j=0; j<10; j++) 
			{
				temp1=(i*10)+j;
				temp2=(j*10)+i;
				sum = temp1+temp2;
				if(sum==99)
					System.out.println(temp1 + " + " + temp2 + " = 99" );
			}
		}


	}
}

class Multiply6
{
	public static void main(String[] args)
	{
		int num = 1;
		for (int i = 0; i < 5; i++) 
		{
                		for (int j = 1; j <= 5; j++) 
			{
                    			System.out.print(num++ + "\t");
                		}
                		System.out.println();
            	}
	}
}

class Multiply7
{
	public static void main(String[] args)
	{
		int num = 28;
		for (int i = 0; i < 3; i++) 
		{
                		for (int j = 1; j <= 3; j++) 
			{
                    			System.out.print(num-- + "\t");
                		}
                		System.out.println();
            	}
	}
}

class Multiply8
{
	public static void main(String[] args)
	{
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}	

class Multiply9
{
	public static void main(String[] args)
	{
		for(int i=0; i<4; i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=7;j>=i*2+1;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class Multiply9_1
{
	public static void main(String[] args)
	{
		int i=0, j=0;
		for(i=0; i<4; i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(;j<7-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
