import java.util.Vector;

// 문제 1
class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name + " " + age);
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}

class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동", 20);

        try {
            System.out.print("원본 : ");
            p1.show();
            Person p2 = p1.clone();
            System.out.print("복사본 : ");
            p2.show();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

// 문제 2
class OuterClass {
    private String name;

    class InnerClass {
        public void print(String name) {
            System.out.println("이름 : " + name);
        }
    }
}

class Test2 {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass ic = oc.new InnerClass();

        ic.print("홍길동");
    }
}

// 문제 3
class NestedOuterClass {
    private static String name;

    public static class NestedInnerClass {
        public static void print(String name) {
            System.out.println("이름 : " + name);
        }
    }
}

class Test3 {
    public static void main(String[] args) {
        NestedOuterClass.NestedInnerClass.print("홍길동");
    }
}

//문제 4
interface LocalInterface {
    void print();
}

class OuterClass4 {
    public LocalInterface createLocalClassInst(final String name) {
        class LocalClass implements LocalInterface {
            public void print() {
                System.out.println("이름 : " + name);
            }
        }

        return new LocalClass();
    }
}

class Test4 {
    public static void main(String[] args) {
        OuterClass4 oc = new OuterClass4();
        LocalInterface lInterface = oc.createLocalClassInst("홍길동");
        lInterface.print();
    }
}

// 문제 5
interface Readable {
    public void read();
}

class OuterClass5 {
    private String myName;

    OuterClass5(String name) {
        myName = name;
    }

    public Readable createLocalClassInst(final int instID) { // final만 사용 가능
        class LocalClass implements Readable {
            public void read() {
                System.out.println("Outer inst name: " + myName);
                System.out.println("Local inst ID: " + instID);
            }
        }

        return new LocalClass();
    }
}

class LocalParamClassTest {
    public static void main(String[] args) {
        OuterClass5 out = new OuterClass5("My Outer Class");
        Readable localInst1 = out.createLocalClassInst(111);
        localInst1.read();

        Readable localInst2 = out.createLocalClassInst(222);
        localInst2.read();
    }
}

// 문제 6

class OuterClass6 {
    private String myName;

    OuterClass6(String name) {
        myName = name;
    }

    public LocalClass createLocalClassInst(final int instID) {
        return new LocalClass() {
            public void read() {
                System.out.println("Outer inst name: " + myName);
                System.out.println("Local inst ID: " + instID);
            }
        };

    }
}

interface LocalClass {
    void read();
}

class LocalParamClassTest6 {
    public static void main(String[] args) {
        OuterClass6 out = new OuterClass6("My Outer Class");
        LocalClass localInst1 = out.createLocalClassInst(111);
        localInst1.read();

        LocalClass localInst2 = out.createLocalClassInst(222);
        localInst2.read();
    }
}

// vector 문제
class Product {
    int price;            // 제품의 가격
    int bonusPoint;        // 제품구매 시 제공하는 보너스점수

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

    Product() {
    } // 기본 생성자
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

class Buyer {            // 고객, 물건을 사는 사람
    int money = 1000;    // 소유금액
    int bonusPoint = 0;    // 보너스점수
    Vector<Product> vector = new Vector<>(10);

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
            return;
        }

        money -= p.price;            // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint;    // 제품의 보너스 점수를 추가한다.
        vector.add(p);
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void refund(Product p) {
        money += p.price;
        bonusPoint -= p.bonusPoint;
        vector.remove(p);
    }

    void summary() {            // 구매한 물품에 대한 정보를 요약해서 보여 준다.
        int sum = 0;            // 구입한 물품의 가격합계
        String itemList = "";    // 구입한 물품목록

        for(int i = 0; i < vector.size(); i++) {
            sum += vector.get(i).price;
            if(i == vector.size() - 1) {
                itemList += vector.get(i);
            } else {
                itemList += vector.get(i) + ", ";
            }
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        Tv tv = new Tv();
        Computer com = new Computer();
        Audio audio = new Audio();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.summary();
        System.out.println();
        b.refund(tv);
        b.summary();

    }
}