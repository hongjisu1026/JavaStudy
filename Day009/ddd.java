import java.util.Scanner;

class OverloadingTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 혹은 알파벳을 입력해주세요");
		char ch1 = sc.nextLine();
		int num1 = sc.nextInt();

		if(ch1)
		{
			print(ch1);
		} else if(num1)
		{
			print(num1);
		}
	}

	public void print(int num)
	{
		char ch = (char) num;
		System.out.println(ch);
	}

	public void print(char ch)
	{
		int num = (int) ch;
		System.out.println(num);
	}
}