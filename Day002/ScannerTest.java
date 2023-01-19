import java.util.Scanner;

class ScannerTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		System.out.println("첫번째 숫자를 입력하세요 : ");
		num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요 : ");
		num2 = sc.nextInt();
		System.out.println("당신이 입력한 두 수는 : " + num1 + "과 " + num2 + "입니다.");
	}
}

class ScannerTest1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		System.out.println("첫번째 숫자를 입력하세요 : ");
		num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요 : ");
		num2 = sc.nextInt();
		if (num1>num2)
			System.out.println(num1 + "이/가 " + num2 + "보다 큽니다.");
		else if (num1<num2)
			System.out.println(num1 + "이/가 " + num2 + "보다 작습니다.");
		else
			System.out.println(num1 + "와/과 " + num2 + "는 같습니다.");
		sc.close();
	}
}

class ScannerTest2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, num4, num5;
		int temp;
		System.out.println("첫번째 숫자를 입력하세요 : ");
		num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요 : ");
		num2 = sc.nextInt();
		System.out.println("세번째 숫자를 입력하세요 : ");
		num3 = sc.nextInt();
		System.out.println("네번째 숫자를 입력하세요 : ");
		num4 = sc.nextInt();
		System.out.println("다섯번째 숫자를 입력하세요 : ");
		num5 = sc.nextInt();

		if ( num1 > num2 )
		{
			temp = num1;
			num1 = num2;
			num2 = temp;
		} else if ( num1 > num3 )
		{
			temp = num1;
			num1 = num3;
			num3 = temp;
		} else if ( num1 > num4 )
		{ 
			temp = num1;
			num1 = num4;
			num4 = temp;
		} else if ( num1 > num5 )
		{ 
			temp = num1;
			num1 = num5;
			num5 = temp;
		}

		if ( num2 > num3 )
		{
			temp = num2;
			num2 = num3;
			num3 = temp;
		} else if ( num2 > num4 )
		{
			temp = num2;
			num2 = num4;
			num4 = temp;
		} else if ( num2 > num5 )
		{ 
			temp = num2;
			num2 = num5;
			num5 = temp;
		}
		if ( num3 > num4 )
		{ 
			temp = num3;
			num3 = num4;
			num4 = temp;
		} else if ( num3 > num5 )
		{ 
			temp = num3;
			num3 = num5;
			num5 = temp;
		}
		if ( num4 > num5 )
		{
			temp = num4;	
			num4 = num5;
			num5 = temp;
		}	
		
		

		System.out.println("정렬 후 : " + num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);
	}
}
		