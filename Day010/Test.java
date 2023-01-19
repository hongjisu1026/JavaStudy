import java.util.Scanner;

class Test1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("영숫자를 입력해주세요.");
		String str = sc.nextLine();
		char ch = str.charAt(0);
		
		if(ch>='A' && ch<='Z')
		{
			System.out.println(ch + "는 대문자");
		} else if(ch>='a' && ch<='z')
		{
			System.out.println(ch + "는 소문자");
		} else if(ch>='0' && ch<='9')
		{
			System.out.println(ch + "는 숫자");
		} else
		{
			System.out.println("입력한 값은 영숫자가 아닙니다.");
		}
	}
}

class Test2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("영문자를 입력해주세요.");
		String str = sc.nextLine();
		char ch = str.charAt(0);
		int num = (int)ch;
		
		
		if(ch>='A' && ch<='Z')
		{
			System.out.println((char)(num+32));
		} else if(ch>='a' && ch<='z')
		{
			System.out.println((char)(num-32));
		} else
		{
			System.out.println("입력한 값은 영문자가 아닙니다.");
		}
	}
}

// 3. String은 "" 쌍따옴표 만으로도 객체가 생성되기 때문에

class Test4
{
	public static void main(String[] args)
	{
		System.out.println((int)(2.456789*100)*0.01);
	}
}

class Test5
{
	public static void main(String[] args)
	{
		System.out.println((int)(2.456789*100+0.5)*0.01);
	}
}
// 6. 2^16

class Test7
{
	public static void main(String[] args)
	{
		int apple, basket;
		Scanner sc = new Scanner(System.in);
		System.out.println("사과의 개수를 입력해주세요.");
		apple = sc.nextInt();
		
		if(apple%10 == 0)
		{
			basket = apple/10;
			System.out.println(basket);
		} else
		{
			basket = apple/10+1;
			System.out.println(basket);
		}		
	}
}

class Test8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int num = sc.nextInt();

		System.out.println(num>0 ? "양수" : num<0 ? "음수" : "0");
	}
}

class Test9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int num = sc.nextInt();
	
		System.out.println(10-(num%10));
	}
}

class Test10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("화씨를 입력해주세요");
		int f = sc.nextInt();

		float c = 5 / 9f * ( f - 32 );
		System.out.println((int)(c*100+0.5)*0.01);
	}
}

class Test11
{ 
	public static void main(String[] args) 
	{ 
		byte a = 10; 
		byte b = 20; 
		byte c = (byte)(a + b); 
		char ch = 'A'; 
		ch = (char)(ch + 2); 
		float f = 3 / 2f; 
		long l = 3000 * 3000 * 3000L; 
		float f2 = 0.1f; 
		double d = 0.1; 
		boolean result = (float)d==f2; 
		System.out.println("c="+c); 
		System.out.println("ch="+ch); 
		System.out.println("f="+f); 
		System.out.println("l="+l); 
		System.out.println("result="+result); 
	} 
}

// 12. -128
// 13. 127

class Test14
{
	public static void main(String[] args)
	{
		double d1 = 3.3333333333333;
		double d2 = 5.5555555555555;
		System.out.println(Math.round(d1 * 100) / 100.0);
		System.out.println(Math.round(d2 * 100)/100.0);
	}
}

// 15. 메소드 오버로딩 : 같은 이름의 메소드를 중복하여 정의하는것
class Test15
{
	public static void main(String[] args)
	{
		add(1, 2);
		add(1, 2, 3);
	}

	public static void add(int num1, int num2)
	{
		System.out.println(num1 + num2);
	}
	
	public static void add(int num1, int num2, int num3)
	{
		System.out.println(num1 + num2 + num3);
	}
}

// 16. 메서드 이름과 매개변수 리스트의 조합

class Test17
{
	public static void main(String[] args)
	{
		System.out.println((int)(Math.random()*10));
	}
}

class Test18
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int num = sc.nextInt();
	
		System.out.println((char)num);
	}
}

class Test19
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력해주세요.");
		String str = sc.nextLine();
		char ch = str.charAt(0);
	
		System.out.println((int)ch);
	}
}

class Test20
{
	public static void main(String[] args)
	{
		String str1 = "ABCDEFGHIJKLMN";
		StringBuilder sb1 = new StringBuilder(str1);
		System.out.println(sb1.reverse().toString());

		String str2 = "990208-1012752";
		StringBuilder sb2 = new StringBuilder(str2);
		int num = sb2.indexOf("-");
		if(num != 0)
		{
			System.out.println(sb2.deleteCharAt(num));
		}
	}
}

// 21. String 문자열은 변경이 불가능하고 StringBuffer / StringBuilder는 변경이 가능하다.