import java.util.Random;
import java.util.Scanner;

class RandomTest
{
	public static void main(String[] args)
	{	
		Random rand = new Random();
		int num = 0;

		num = rand.nextInt(100);
		System.out.println(num);
	}
}

class RandomTest1
{
	public static void main(String[] args)
	{
		int s, r;
		int count = 0;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("게임을 시작합니다.");		

		r = rand.nextInt(100)+1;
		
		System.out.println("숫자를 입력하세요.");
		
		while(true) {
			s = sc.nextInt();
			count++;

			if(r>s)
			{
				System.out.println("당신이 입력한 숫자보다 큽니다.");
			} else if(r<s)
			{
				System.out.println("당신이 입력한 숫자보다 작습니다.");
			} else
			{
				System.out.println("정답입니다. 당신은 " + count + "번만에 정답을 입력하셨습니다.");
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}		
	}
}
		

			