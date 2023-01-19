/*
4-1
1. x>10 && x<20
2. ch != ' ' && ch != '\t'
3. ch=='x' || ch=='X'
4. ch>='0' && ch<='9'
5. (ch>='A'&&ch<='Z') || (ch>='a'&&ch<='z')
6. year%400==0 || year%4==0 && year%100!=0
7. !powerOn
8. str.equals("yes")
*/

class LoopTest2
{
	public static void main(String[] args)
	{
		int sum = 0;
		for(int i=1; i<=20; i++)
		{
			if(i%2==0 || i%3==0) continue;
			sum += i;
		}
		System.out.println(sum);
	}
}

class LoopTest3
{
	public static void main(String[] args)
	{
		int sum = 0;
		int temp = 0;
		for(int i=1; i<=10; i++)
		{
			temp += i;
			sum += temp;
		}
		System.out.println(sum);
	}
}

class LoopTest4
{
	public static void main(String[] args)
	{
		int sum = 0;
		int s = 1;
		int num =0;
		for(int i=1; sum<100; i++, s=-s)
		{
			num = s*i;
			sum += num;
		}
		System.out.println(num);
	}
}

class LoopTest5 
{
	public static void main(String[] args) 
	{
		int i=0;
		while( i<=10) 
		{
			int j=0;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

class LoopTest6
{
	public static void main(String[] args)
	{
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=6; j++)
			{
				if(i+j==6)
				{
					System.out.println("(" + i + ", " + j + ")");
				}
			}
		}
	}
} 

class LoopTest7 {
	public static void main(String[] args)
	{
		int value = ( (int)(Math.random()*6)+1 );
		System.out.println("value:"+value);
	}
}
class LoopTest8
{
	public static void main(String[] args)
	{
		for(int i=0; i<=10; i++)
		{
			for(int j=0; j<=10; j++)
			{
				if((2*i + 4*j) == 10)
				System.out.println("x = " + i + ", y = " + j);
			}
		}
	}
}

class LoopTest9
{
	public static void main(String[] args) 
	{
		String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++) 
		{
			sum += str.charAt(i) - '0';
		}
		System.out.println("sum="+sum);
	}
}

class LoopTest10 
{
	public static void main(String[] args) 
	{
		int num = 12345;
		int sum = 0;
		while(num>0)
		{
			sum += num%10;
			num /= 10;
		}
		System.out.println("sum="+sum);
	}
}

class LoopTest11 
{
	public static void main(String[] args) 
	{
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; f5rv
		System.out.print(num1+","+num2);
		for (int i = 0 ; i < 8 ; i++ )
		{
			num3 = num1 + num2;
			System.out.print(","+num3);
			num1 = num2;
			num2 = num3;
		}			
	}
}

class LoopTest12
{
	public static void main(String[] args)
	{
		for(int i=0; i<3; i++)
		{
			for(int j=1; j<4; j++)
			{
				for(int k=2; k<5; k++)
				{
					int num = k + (3 * i);
					if(num<10)
					System.out.print(num + " * " + j + " = " + num*j + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

class LoopTest13
{
	public static void main(String[] args)
	{
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		for(int i=0; i < value.length() ;i++)
		{
			if(value.charAt(i)>='0' && value.charAt(i)<='9') continue;
			else
			{
				isNumber = false;
				break;
			}
		}
		if (isNumber) {
		System.out.println(value+"는 숫자입니다.");
		} else {
		System.out.println(value+"는 숫자가 아닙니다.");
		}
	} 
}

class LoopTest14
{
	public static void main(String[] args)
	{
	// 1~100 answer . 사이의 임의의 값을 얻어서 에 저장한다
		int answer = (int)(Math.random() * 100 + 1);
		int input = 0;
		int count = 0;
		java.util.Scanner s = new java.util.Scanner(System.in);
		do {
			count++;
			System.out.print("1과 100 사이의 값을 입력하세요 : "); 
			input = s.nextInt();
			if(answer>input)
			{
				System.out.println("더 큰 수를 입력하세요.");
			} else if(answer<input)
			{
				System.out.println("더 작은 수를 입력하세요");
			} else
			{
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 " + count + "번입니다.");
				break;
			}
		} while(true);
	} 
}

class LoopTest15
{
	public static void main(String[] args)
	{
		int number = 12321;
		int tmp = number;
		int result =0;
		while(tmp !=0) {
			result = result*10 + tmp % 10;
			tmp /= 10;
		}
		if(number == result)
		System.out.println( number + " 는 회문수 입니다.");
		else
		System.out.println( number + " 는 회문수가 아닙니다.");
	}
}