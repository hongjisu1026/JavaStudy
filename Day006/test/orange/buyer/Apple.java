package orange.buyer;

public class Apple
{
	int myMoney;
	int numOfApple;
	
	public Apple(int money)
	{
		myMoney=money;
		numOfApple=0;
	}
	
	public void buyApple(orange.seller.Apple seller, int money)
	{
		numOfApple+=seller.saleApple(money);
		myMoney-=money;
	}
	public void showBuyResult()
	{
		System.out.println("현재 잔액: " + myMoney);
		System.out.println("사과 개수: " + numOfApple);		
	}
}