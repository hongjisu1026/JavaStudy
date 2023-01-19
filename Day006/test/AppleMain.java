import orange.seller.Apple;

class AppleMain
{
	public static void main(String[] args)
	{
		Apple seller1 = new Apple(0, 30, 1500);
		Apple seller2 = new Apple(0, 20, 1000);
		
		orange.buyer.Apple buyer = new orange.buyer.Apple(10000);
		buyer.buyApple(seller1, 4500);
		buyer.buyApple(seller2, 2000);
		
		System.out.println("과일 판매자1의 현재 상황");
		seller1.showSaleResult();
		
		System.out.println("과일 판매자2의 현재 상황");
		seller2.showSaleResult();
		
		System.out.println("과일 구매자의 현재 상황");
		buyer.showBuyResult();
	}
}

