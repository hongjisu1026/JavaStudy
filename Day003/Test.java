import java.util.Scanner;

class Test
{
	public static void main(String[] args)
	{
		int num, i;
		boolean p = true;
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력해주세요.");
		num = sc.nextInt();

		if(num>1)
		{
			for(i=2; i<num; i++)
			{
				if(num%i==0) 
				{
					p = false;
					break;
				} 
			}
		} else
		{
			p = false;
		}

		if(!p)
		System.out.println("소수가 아닙니다.");
		else
		System.out.println("소수가 맞습니다.");
	}
}

class Test2
{
	public static void main(String[] args)
	{
		int num=0, i=0;

		for(num=2;num<=100;num++)
		{
			for(i=2;i<num;i++)
			{
				if(num%i==0) break;
			}
			if(num == i) System.out.println(num);
		}
	}
}

class Test3
{
	public static void main(String[] args)
	{
		int i=0, j=0;
		for(i=0;i<3;i++)
		{
			System.out.println("i= " + i);
			for(j=0;j<3;j++)
			{
				System.out.println("*** j= " + j);
			}
		}
	}
}
			
