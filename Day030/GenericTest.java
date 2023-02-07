/*class Generic1 {
    public static void main(String[] args) {
        String[] stArr = new String[] {
                "AAA", "BBB", "CCC"
        };
        newArray(stArr);
    }

    public static <T> void newArray(T[] t) {
        for (T value : t) {
            System.out.println(value);
        }
    }
}

// 2. Apple 의 인스턴스, Apple 을 상속하는 인스턴스의 참조값
// 3. Fruit 을 담고 있는 FruitBox
// 4. FruitBox<? extends Fruit> box = new FruitBox<Fruit>();

class Fruit {
    public void show() {
        System.out.println("과일");
    }
}

class Apple1 extends Fruit {
    @Override
    public void show() {
        super.show();
        System.out.println("사과");
    }
}

class FruitBox1<T> {
    T t;
    public void store(T t) {
        this.t = t;
    }
    public T pullOut() {
        return t;
    }
}

class Generic5 {
    public static void main(String[] args) {
        FruitBox1<Fruit> box1 = new FruitBox1<>();
        box1.store(new Fruit());

        FruitBox1<Apple1> box2 = new FruitBox1<>();
        box2.store(new Apple1());

        genericFruitBox(box1);
        genericFruitBox(box2);
    }

    public static void genericFruitBox(FruitBox1<? extends Fruit> box) {
        Fruit fruit = box.pullOut();
        fruit.show();
    }
}

// 6. FruitBox<?>
// 7. FruitBox<? super Apple>

class AAA<T> {
    T tAAA;
}

class BBB<T> extends AAA<T> {
    T tBBB;
}

class CCC extends AAA<Integer> {
    int tCCC;
}*/


/*interface MyInterface<T> {
    public T myFunc(T item);
}

interface AAA<T> {
    void aaa(T item);
}

class MyImplement<T> implements MyInterface<T>
{
    public T myFunc(T item)
    {
        return item;
    }
}

class DBox<L, R> {
    private L left;
    private R right;
    public void set(L left, R right) {
        this.left = left;
        this.right = right;
    }

    public String toString() {
        return left + " & " + right;
    }
}

class DDBox<U, D> {
    private U u;
    private D d;
    public void set(U u, D d) {
        this.u = u;
        this.d = d;
    }

    public String toString() {
        return u.toString() + "\n" + d.toString();
    }
}

class MainClass1 {
    public static void main(String[] args) {
        DBox<String, Integer> box1 = new DBox<>();
        box1.set("Apple", 25);
        DBox<String, Integer> box2 = new DBox<>();
        box2.set("Orange", 33);
        DDBox<DBox<String, Integer>, DBox<String, Integer>> ddbox = new DDBox<>();
        ddbox.set(box1, box2);	// 두 개의 상자를 하나의 상자에 담음
        System.out.println(ddbox);
    }
}*/
/*class MainClass2 {
    public static void main(String[] args) {
        DBox2<String, Integer> box1 = new DBox2<>();
        box1.set("Apple", 25);
        DBox2<String, Integer> box2 = new DBox2<>();
        box2.set("Orange", 33);

        DBox2<DBox2<String, Integer>, DBox2<String, Integer>> box3 = new DBox2<>();
        box3.set(box1, box2);

        System.out.println(box3);
    }
}

class DBox2<L, R> {
    private L left;
    private R right;

    public void set(L left, R right) {
        this.left = left;
        this.right = right;
    }

    public String toString() {
        return left + " & " + right;
    }
}

class Box<T> {
    private T ob;

    public void set(T o) {
        ob = o;
    }

    public T get() {
        return ob;
    }
}

class BoxSwapDemo {
    public static <T extends Number> void swapBox(Box<T> box1, Box<T> box2) {
        T tempBox = box1.get();
        box1.set(box2.get());
        box2.set(tempBox);
    }

    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        box1.set(99);

        Box<Integer> box2 = new Box<>();
        box2.set(55);

        System.out.println(box1.get() + " & " + box2.get());
        swapBox(box1, box2);    // 정의해야 할 swapBox 메소드
        System.out.println(box1.get() + " & " + box2.get());
    }
}*/

class Box<T> {
    private T ob;
    public void set(T o) { ob = o; }
    public T get() { return ob; }
}

class BoundedWildcardGeneric {
    // box에 con과 동일한 내용물이 들었는지 확인
    public static <T> boolean compBox(Box<? extends T> box, T con) {
        T bc = box.get();
        // box.set(con);		// 프로그래머의 실수로 삽입된 문장, 때문에 내용물이 바뀐다.
        return bc.equals(con);
    }

    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        box1.set(24);

        Box<String> box2 = new Box<>();
        box2.set("Poly");

        if(compBox(box1, 25))
            System.out.println("상자 안에 25 저장");

        if(compBox(box2, "Moly"))
            System.out.println("상자 안에 Moly 저장");

        System.out.println(box1.get());
        System.out.println(box2.get());
    }
}