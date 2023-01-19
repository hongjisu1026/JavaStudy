class AAA
{
	private String name;
	private int age;
	AAA(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String toString()
	{
		return name + " " + age;
	}
}

class AAAMain
{
	public static void main(String[] args)
	{
		AAA aaa = new AAA("홍길동", 20);
		System.out.println(aaa);
	}
}