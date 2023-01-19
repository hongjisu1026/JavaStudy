class AppleMain
{
	public static void main(String[] args)
	{
		FruitSeller f1 = new FruitSeller(2000, 50, 50000);
		FruitSeller f2 = new FruitSeller(1000, 100, 100000);

		Buyer b = new Buyer(20000);

		b.buy(f1, 6000);
		f1.print();
		System.out.println();
		f2.print();
		System.out.println();
		b.print();
		
		System.out.println("=================");

		b.buy(f2, 5000);
		f1.print();
		System.out.println();
		f2.print();
		System.out.println();
		b.print();
	}	
}

class FruitSeller
{
	int price, count, money;
	public FruitSeller(int price, int count, int money)
	{
		this.price = price;
		this.count = count;
		this.money = money;
	}

	public int sell(int money)
	{
		this.money += money;
		int num = money / price;
		this.count -= num;
		return num;
	}

	public void print()
	{
		System.out.println("사과 가격 : " + price);
		System.out.println("사과 개수 : " + count);
		System.out.println("가진 돈 : " + money);
	}
}

class Buyer
{
	int count, money;
	public Buyer(int money)
	{
		this.money = money;
	}

	public void buy(FruitSeller fruitSeller, int money)
	{
		this.money -= money;
		this.count += fruitSeller.sell(money);
	}

	public void print()
	{
		System.out.println("사과 개수 : " + count);
		System.out.println("가진 돈 : " + money);
	}
}
	