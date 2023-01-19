package orange.buyer;
import orange.seller.FruitSeller;

public class Buyer
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