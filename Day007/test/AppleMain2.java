import orange.seller.FruitSeller;
import orange.buyer.Buyer;

class AppleMain2
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