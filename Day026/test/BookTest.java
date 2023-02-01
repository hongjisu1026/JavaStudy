import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < cards.length; i++) {
            int j = i % 10 + 1;
            boolean isKwang = (i < 10 && (j == 1 || j == 3 || j == 8));

            cards[i] = new SutdaCard(j, isKwang);
        }
    }

    public void shuffle() {
        SutdaCard temp;
        int[] random = new int[CARD_NUM];
        for (int i = 0; i < random.length; i++) {
            int index = (int) (Math.random() * CARD_NUM);
            temp = cards[i];
            cards[i] = cards[index];
            cards[index] = temp;
        }
    }

    public SutdaCard pick(int index) {
        return cards[index];
    }

    public SutdaCard pick() {
        int r = (int) (Math.random() * 20);

        return cards[r];
    }
}

class SutdaCard {
    final int NUM;
    final boolean IS_KWANG;

    SutdaCard() {
        this(1, true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.NUM = num;
        this.IS_KWANG = isKwang;
    }

    public String toString() {
        return NUM + (IS_KWANG ? "K" : "");
    }
}

class BookTest1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ", ");
        }
    }
}

class BookTest2 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ", ");
        }

        System.out.println();
        System.out.println(deck.pick(0));
    }
}

/*
3. 상위클래스의 메소드를 재정의 하는것, 단 [메소드명, 매개변수, 리턴타입]이 전부 같아야함
4. c, d
 */

/*class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product {
    Tv() {
        super(100); // 상위클래스의 생성자를 가장 먼저 호출해줘야 함.
    }

    public String toString() {
        return "Tv";
    }
}

class BookTest5 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}*/

/*
6. 조상에 정의된 인스턴스 변수들이 초기화되도록 하기 위해서.
7. Child() -> Child(int x) -> Parent() -> Parent(int x) -> Object(), 실행 결과 : x = 200
8. a
9. c
 */

class MyTv2 {
    boolean isPowerOn;
    int channel;
    int volume;
    int prevChannel;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void gotoPrevChannel() {
        setChannel(prevChannel);
    }

    public void setChannel(int channel) {
        prevChannel = this.channel;
        this.channel = channel;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }
}

class BookTest10 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();
        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setVolume(20);
        System.out.println("VOL:" + t.getVolume());
    }
}

class BookTest11 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();
        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setChannel(20);
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());
    }
}

/*
12. c
13. 싱글톤 패턴
 */

class BookTest14 {
    public static void main(String[] args) {
        SutdaCard card = new SutdaCard(1, true);
    }
}

/*
15. e
16. e
 */

class Marine extends Unit { // 보병
    void move(int x, int y) { /* */ }

    void stop() { /* */ }

    void stimPack() { /* .*/}
}

class Tank extends Unit { // 탱크
    void move(int x, int y) {
    }

    void stop() { /* */ }

    void changeMode() {
    }
}

class Dropship extends Unit { // 수송선
    void move(int x, int y) { /* */ }

    void stop() { /* */ }

    void load() { /* .*/ }

    void unload() { /* .*/ }
}

abstract class Unit {
    int x, y;

    abstract void move(int x, int y);

    abstract void stop();
}

class BookTest18 {
    public static void main(String[] args) {
        Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
        for (int i = 0; i < arr.length; i++)
            BookTest18.action(arr[i]);
    } // main

    public static void action(Robot robot) {
        if (robot instanceof DanceRobot) {
            ((DanceRobot) robot).dance();
        } else if (robot instanceof SingRobot) {
            ((SingRobot) robot).sing();
        } else if (robot instanceof DrawRobot) {
            ((DrawRobot) robot).draw();
        }
    }
}

class Robot {
}

class DanceRobot extends Robot {
    void dance() {
        System.out.println("춤을 춥니다.");
    }
}

class SingRobot extends Robot {
    void sing() {
        System.out.println("노래를 합니다.");
    }
}

class DrawRobot extends Robot {
    void draw() {
        System.out.println("그림을 그립니다.");
    }
}

class BookTest19 {
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
    } // add(Product p)

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
    } // summary()
}

class Product {
    int price; // 제품의 가격

    Product(int price) {
        this.price = price;
    }
}

class Tv extends Product {
    Tv() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product {
    Audio() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}

/*
20. p.x = 100
    Child Method
    p.x = 200
    Child Method
21. Movable 인터페이스를 구현한 클래스
 */

abstract class Shape {
    Point p;

    Shape() {
        this(new Point(0, 0));
    }

    Shape(Point p) {
        this.p = p;
    }

    abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

    Point getPosition() {
        return p;
    }

    void setPosition(Point p) {
        this.p = p;
    }
}

class Circle extends Shape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double calcArea() {
        return r * r * Math.PI;
    }
}

class Rectangle extends Shape {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    boolean isSquare() {
        return width == height && width != 0 && height != 0;
    }

    @Override
    double calcArea() {
        return width * height;
    }
}

class Point {
    int x;
    int y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[" + x + "," + y + "]";
    }
}

class BookTest23 {
    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
        System.out.println("면적의 합 : " + sumArea(arr));
    }

    public static double sumArea(Shape[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].calcArea();
        }
        return sum;
    }
}

// 24. e

class Outer {
    class Inner {
        int iv = 100;
    }
}

class BookTest25 {
    public static void main(String[] args) {
        Outer oc = new Outer();
        Outer.Inner ic = oc.new Inner();
        System.out.println(ic.iv);
    }
}

class Outer2 {
    static class Inner2 {
        int iv = 200;
    }
}

class BookTest26 {
    public static void main(String[] args) {
        Outer2.Inner2 ic = new Outer2.Inner2();
        System.out.println(ic.iv);
    }
}

class Outer3 {
    int value = 10;

    class Inner3 {
        int value = 20;

        void method1() {
            int value = 30;
            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer3.this.value);
        }
    } // Inner클래스의 끝
} // Outer클래스의 끝

class BookTest27 {
    public static void main(String[] args) {
        Outer3 oc = new Outer3();
        Outer3.Inner3 inner = oc.new Inner3();
        inner.method1();
    }
}

class BookTest28 {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.addWindowListener(new WindowAdapter() {
            public void WindowClosing(WindowEvent e) {
                e.getWindow().setVisible(false);
                e.getWindow().dispose();
                System.exit(0);
            }
        });
    }
}

//29. 메서드가 종료가 되어 지역변수가 메모리 상에서 소멸된 시점에도 이 지역변수를 참조하는 경우가 있울 수 있기 때문에

