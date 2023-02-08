class Test1 {
    public static void main(String[] args) {
        String[] arr = new String[]{
                "AAA", "BBB", "CCC"
        };

        showArray(arr);
    }

    public static <T> void showArray(T[] arr) {
        for (T t : arr) {
            System.out.print(t + "\t");
        }
    }
}

// 2. Apple의 인스턴스, Apple의 하위클래스
// 3. Fruit
// 4. <? extends Fruit>

/*
class Test5 {
    public static void main(String[] args) {
        FruitBox<Fruit> box1 = new FruitBox<>();
        box1.set(new Fruit());
        FruitBox<Apple> box2 = new FruitBox<>();
        box2.set(new Apple());

        fruit(box1);
        fruit(box2);
    }

    public static void fruit(FruitBox<? extends Fruit> box) {
        Fruit fruit = box.pullOut();
        System.out.println(fruit);
    }
}

class FruitBox<T> {
    T t;

    public void set(T t) {
        this.t = t;
    }

    public T pullOut() {
        return t;
    }
}

class Fruit {
    @Override
    public String toString() {
        return "과일";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        System.out.println(super.toString());
        return "사과";
    }
}*/

// 6. <?>
// 7. <? super Apple>
// 8. class BBB<T> extends AAA<T> {}
// 9. class BBB extends AAA<String> {}
// 10. interface AAA<T> {}
/* 11. class BBB<T> implements AAA<T> {}
       class BBB implements AAA<String> {} */

class DBox<L, R> {
    private L left;
    private R right;

    public void set(L o, R r) {
        left = o;
        right = r;
    }

    public String toString() {
        return left + " & " + right;
    }
}

class DDBox<T, K> {
    T t;
    K k;

    public void set(T t, K k) {
        this.t = t;
        this.k = k;
    }
}

class Test12 {
    public static void main(String[] args) {
        DBox<String, Integer> box1 = new DBox<>();
        box1.set("Apple", 25);
        DBox<String, Integer> box2 = new DBox<>();
        box2.set("Orange", 33);
        DDBox<DBox<String, Integer>, DBox<String, Integer>> ddbox = new DDBox<>();
        ddbox.set(box1, box2);
        System.out.println(ddbox);
    }
}

class Test13 {
    public static void main(String[] args) {
        DBox<String, Integer> box1 = new DBox<>();
        box1.set("Apple", 25);
        DBox<String, Integer> box2 = new DBox<>();
        box2.set("Orange", 33);

        DBox<DBox<String, Integer>, DBox<String, Integer>> box3 = new DBox<>();
        box3.set(box1, box2);
        System.out.println(box3);
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
}

class BoundedWildcardDemo {
    public static void addBox(Box<? super Integer> b1, Box<? extends Integer> b2, Box<? extends Integer> b3) {
        b1.set(b2.get() + b3.get());	// 프로그래머의 실수가 있는 부분
    }

    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        box1.set(24);
        Box<Integer> box2 = new Box<>();
        box2.set(37);
        Box<Integer> result = new Box<>();
        result.set(0);

        addBox(result, box1, box2);    // result에 24 + 37의 결과 저장
        System.out.println(result.get());    // 61 출력
    }
}

class BoundedWildcardGeneric {
    // box에 con과 동일한 내용물이 들었는지 확인
    public static <T> boolean compBox(Box<? extends T> box, T con) {
        T bc = box.get();
        //box.set(con);		// 프로그래머의 실수로 삽입된 문장, 때문에 내용물이 바뀐다.
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