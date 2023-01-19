package orange.seller;

public class FruitSeller
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