import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.EventHandler;
import java.util.ArrayList;
import java.util.Arrays;

class Test1 {
    public static void main(String[] args) {
        SutdaDeck sutdaDeck = new SutdaDeck();

        String result = "";
        for (int i = 0; i < sutdaDeck.CARD_NUM; i++) {
            System.out.print(sutdaDeck.cards[i] + " ");
        }


    }
}

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];


    public SutdaDeck() {
        for (int i = 0; i < CARD_NUM; i++) {
            int num = i % 10 + 1;
            boolean isKwang = i < 10 && (num == 1 || num == 3 || num == 8);
            cards[i] = new SutdaCard(num, isKwang);
        }
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

class Buyer {
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 " + p + "을/를 살 수 없습니다.");
            return;
        }
        money -= p.price;
        add(p);
    }

    void add(Product p) {
        if (i >= cart.length) {
            Product[] newCart = new Product[i * 2];
            for (int j = 0; j < cart.length; j++) {
                newCart[j] = cart[j];
            }
            cart = newCart;
        }
        cart[i] = p;
        i++;
    }

    void summary() {
        String list = "";
        int sum = 0;
        for (int j = 0; j < cart.length; j++) {
            if (j == cart.length - 1) {
                list += cart[j].getClass().getName();
            } else {
                list += cart[j].getClass().getName() + ", ";
            }
            sum += cart[j].price;
        }
        System.out.println("구입한 물건 : " + list);
        System.out.println("사용한 금액 : " + sum);
        System.out.println("남은 금액 : " + money);
    }
}

class Product {
    int price;

    public Product(int price) {
        this.price = price;
    }
}

class Tv extends Product {
    Tv() {
        super(100);
    }

    @Override
    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}

class Audio extends Product {
    Audio() {
        super(50);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}


class Test2 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        b.summary();
    }
}

class Test3 {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                e.getWindow().setVisible(false);
                e.getWindow().dispose();
                System.exit(0);
            }
        });
    }
}