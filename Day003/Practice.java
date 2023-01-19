import java.util.Scanner;

class Practice1
{
	public static void main(String[] args)
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class Practice2
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}

class Practice3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("숫자를 입력해주세요 : ");
		num = sc.nextInt();

		for(int i=1; i<=num; i++)
		{
			for(int j=num;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("♥");
			}
			System.out.println();
		}
	}
}

class Practice4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
            	int num;

            	System.out.println("홀수를 입력해주세요 : ");
            	num = sc.nextInt();

            	for (int i = 0 ; i <= (num / 2); i++) 
		{
                		for (int j = 1; j < num + 1; j++) 
			{
				if ( i==0 && j>(num/2) - i && j <= (num/2) +1 + i) {
					System.out.print("★");
				} else if (j > (num / 2) - i && j <= (num / 2) + 1 + i) 
				{
                        			System.out.print("♥");
                    			} else {
                       			 	System.out.print("♡");
                   			}
			}
			System.out.println();
                	}
            }
}

class Practice5
{
	public static void main(String[] args)
	{
		int j = 0;
		for(int i=0; i<5; i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(;j<=8-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}