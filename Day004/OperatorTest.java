import java.util.Scanner;

class OperatorTest
{
	public static void main(String[] args)
	{
		int bigNum = 0;
		int num1 =5, num2 = 3;
		bigNum = num1 > num2 ? num1 : num2;
		System.out.println(bigNum);
	}
}

class OperatorTest1
{
	public static void main(String[] args)
	{
		int num;
		int abs=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		num = sc.nextInt();
		
		abs = num>=0 ? num : -num;
		System.out.println(num+"의 절댓값 = " + abs);
	}
}
		
		