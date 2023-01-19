package orange.seller;

public class Apple
{
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;
	
	public Apple(int money, int appleNum, int price)
	{
		myMoney=money;
		numOfApple=appleNum;
		APPLE_PRICE=price;
	}
	
	public int saleApple(int money)
	{
		int num=money/APPLE_PRICE;
		numOfApple-=num;
		myMoney+=money;
		return num;
	}
	public void showSaleResult()
	{
		System.out.println("남은 사과: " + numOfApple);
		System.out.println("판매 수익: " + myMoney);
	}
} 