import orange.seller.Seller;
import orange.buyer.Buyer;

class AppleMain {

    public static void main(String[] var0) {
        Seller var1 = new Seller();
        Seller var2 = new Seller();
        var1.initApple(2000, 50, 50000);
        var2.initApple(1000, 100, 100000);
        Buyer var3 = new Buyer();
        var3.initCustomer(20000);
        var3.buy(var1, 6000);
        var1.printApple();
        System.out.println();
        var2.printApple();
        System.out.println();
        var3.printCustomer();
        System.out.println("------------");
        var3.buy(var2, 5000);
        var1.printApple();
        System.out.println();
        var2.printApple();
        System.out.println();
        var3.printCustomer();
    }
}

