/*
class GenericTest1 {
    public static void main(String[] args) {
        OrangeBox orangeBox = new OrangeBox();
        orangeBox.store(new Orange(10));
        Orange orange = orangeBox.pullOut();
        orange.showSugarContent();

        AppleBox appleBox = new AppleBox();
        appleBox.store(new Apple(200));
        Apple apple = appleBox.pullOut();
        apple.showAppleWeight();
    }
}

class Orange {
    int sugarContent;

    public Orange(int sugarContent) {
        this.sugarContent = sugarContent;
    }

    public void showSugarContent() {
        System.out.println("당도 : " + sugarContent);
    }
}

class OrangeBox {
    Orange orange;

    public void store(Orange orange) {
        this.orange = orange;
    }

    public Orange pullOut() {
        return orange;
    }
}

class Apple {
    int weight;

    public Apple(int weight) {
        this.weight = weight;
    }

    public void showAppleWeight() {
        System.out.println("무게 : " + weight);
    }
}

class AppleBox {
    Apple apple;

    public void store(Apple apple) {
        this.apple = apple;
    }

    public Apple pullOut() {
        return apple;
    }
}
*/

/*
class GenericTest2 {
    public static void main(String[] args) {
        FruitBox box1 = new FruitBox();
        box1.store(new Orange(10));
        Orange orange = (Orange) box1.pullOut();
        orange.showSugarContent();

        FruitBox box2 = new FruitBox();
        box2.store(new Apple(200));
        Apple apple = (Apple) box2.pullOut();
        apple.showAppleWeight();
    }
}

class Orange {
    int sugarContent;

    public Orange(int sugarContent) {
        this.sugarContent = sugarContent;
    }

    public void showSugarContent() {
        System.out.println("당도 : " + sugarContent);
    }
}

class Apple {
    int weight;

    public Apple(int weight) {
        this.weight = weight;
    }

    public void showAppleWeight() {
        System.out.println("무게 : " + weight);
    }
}

class FruitBox {
    Object obj;
    public void store(Object obj) {
        this.obj = obj;
    }

    public Object pullOut() {
        return obj;
    }
}
*/

/*
class GenericTest3 {
    public static void main(String[] args) {
        FruitBox box1 = new FruitBox();
        box1.store("오렌지");
        Orange orange = (Orange) box1.pullOut();
        orange.showSugarContent();

        FruitBox box2 = new FruitBox();
        box2.store(new Apple(200));
        Apple apple = (Apple) box2.pullOut();
        apple.showAppleWeight();
    }
}

class Orange {
    int sugarContent;

    public Orange(int sugarContent) {
        this.sugarContent = sugarContent;
    }

    public void showSugarContent() {
        System.out.println("당도 : " + sugarContent);
    }
}

class Apple {
    int weight;

    public Apple(int weight) {
        this.weight = weight;
    }

    public void showAppleWeight() {
        System.out.println("무게 : " + weight);
    }
}

class FruitBox {
    Object obj;
    public void store(Object obj) {
        this.obj = obj;
    }

    public Object pullOut() {
        return obj;
    }
}
*/

/*
class GenericTest4 {
    public static void main(String[] args) {
        OrangeBox orangeBox = new OrangeBox();
        orangeBox.store("오렌지");
        Orange orange = orangeBox.pullOut();
        orange.showSugarContent();

        AppleBox appleBox = new AppleBox();
        appleBox.store(new Apple(200));
        Apple apple = appleBox.pullOut();
        apple.showAppleWeight();
    }
}

class Orange {
    int sugarContent;

    public Orange(int sugarContent) {
        this.sugarContent = sugarContent;
    }

    public void showSugarContent() {
        System.out.println("당도 : " + sugarContent);
    }
}

class OrangeBox {
    Orange orange;

    public void store(Orange orange) {
        this.orange = orange;
    }

    public Orange pullOut() {
        return orange;
    }
}

class Apple {
    int weight;

    public Apple(int weight) {
        this.weight = weight;
    }

    public void showAppleWeight() {
        System.out.println("무게 : " + weight);
    }
}

class AppleBox {
    Apple apple;

    public void store(Apple apple) {
        this.apple = apple;
    }

    public Apple pullOut() {
        return apple;
    }
}
*/

/*
class GenericTest5 {
    public static void main(String[] args) {
        FruitBox<Orange> box1 = new FruitBox<>();
        box1.store(new Orange(10));
        Orange orange = box1.pullOut();
        orange.showSugarContent();

        FruitBox<Apple> box2 = new FruitBox<>();
        box2.store(new Apple(200));
        Apple apple = box2.pullOut();
        apple.showAppleWeight();
    }
}

class Orange {
    int sugarContent;

    public Orange(int sugarContent) {
        this.sugarContent = sugarContent;
    }

    public void showSugarContent() {
        System.out.println("당도 : " + sugarContent);
    }
}

class Apple {
    int weight;

    public Apple(int weight) {
        this.weight = weight;
    }

    public void showAppleWeight() {
        System.out.println("무게 : " + weight);
    }
}

class FruitBox<T> {
    T t;
    public void store(T t) {
        this.t = t;
    }

    public T pullOut() {
        return t;
    }
}*/

/*
class GenericTest6 {
    public static void main(String[] args) {
        FruitBox<Orange> box1 = new FruitBox<>();
        box1.store("오렌지");
        Orange orange = box1.pullOut();
        orange.showSugarContent();

        FruitBox<Apple> box2 = new FruitBox<>();
        box2.store(new Apple(200));
        Apple apple = box2.pullOut();
        apple.showAppleWeight();
    }
}

class Orange {
    int sugarContent;

    public Orange(int sugarContent) {
        this.sugarContent = sugarContent;
    }

    public void showSugarContent() {
        System.out.println("당도 : " + sugarContent);
    }
}

class Apple {
    int weight;

    public Apple(int weight) {
        this.weight = weight;
    }

    public void showAppleWeight() {
        System.out.println("무게 : " + weight);
    }
}

class FruitBox<T> {
    T t;
    public void store(T t) {
        this.t = t;
    }

    public T pullOut() {
        return t;
    }
}
*/

/*
class GenericTest7 {
    public static void main(String[] args) {
        FruitBox<Orange> orBox = new FruitBox<Orange>(new Orange(10));
        Orange org = orBox.pullOut();
        org.showSugarContent();

        FruitBox<Apple> apBox = new FruitBox<Apple>(new Apple(20));
        Apple app = apBox.pullOut();
        app.showAppleWeight();
    }
}

class Orange {
    int sugarContent;

    public Orange(int sugarContent) {
        this.sugarContent = sugarContent;
    }

    public void showSugarContent() {
        System.out.println("당도 : " + sugarContent);
    }
}

class Apple {
    int weight;

    public Apple(int weight) {
        this.weight = weight;
    }

    public void showAppleWeight() {
        System.out.println("무게 : " + weight);
    }
}

class FruitBox<T> {
    T t;

    public FruitBox(T t) {
        this.t = t;
    }

    public T pullOut() {
        return t;
    }
}
*/

/*class GenericMethod1 {
    public static void main(String[] args) {
        AAA aaa = new AAA();
        aaa.show(new BBB());
    }
}

class AAA {
    public <T> void show (T t) {
        System.out.println(t);
    }
}

class BBB {
    @Override
    public String toString() {
        return "BBB";
    }
}*/

/*
class GenericMethod2 {
    public static void main(String[] args) {
        AAA aaa = new AAA();
        aaa.show(new BBB(), new CCC());
    }
}

class AAA {
    public <T, U> void show (T t, U u) {
        System.out.println(t);
        System.out.println(u);
    }
}

class BBB {
    @Override
    public String toString() {
        return "BBB";
    }
}

class CCC {
    @Override
    public String toString() {
        return "CCC";
    }
}*/

/*
class GenericMethod3 {
    public static void main(String[] args) {
        AAA<BBB, CCC> aaa = new AAA();
        aaa.setT(new BBB());
        aaa.setU(new CCC());
    }
}

class AAA<T, U> {
    T t;
    U u;

    public void setT(T t) {
        this.t = t;
    }

    public void setU(U u) {
        this.u = u;
    }
}

class BBB {
    @Override
    public String toString() {
        return "BBB";
    }
}

class CCC {
    @Override
    public String toString() {
        return "CCC";
    }
}*/

// 4. 형변환 안함

/*
interface SimpleInterface {
    public void showYourName();
}

class UpperClass {
    public void showYourAncestor() {
        System.out.println("UpperClass");
    }
}

class AAA extends UpperClass implements SimpleInterface {
    public void showYourName() {
        System.out.println("Class AAA");
    }
}

class BBB extends UpperClass implements SimpleInterface {
    public void showYourName() {
        System.out.println("Class BBB");
    }
}

class GenericMethod5 {
    public static <T> void showInstanceAncestor(T param) {
        ((UpperClass) param).showYourAncestor();
    }

    public static <T> void showInstanceName(T param) {
        ((SimpleInterface) param).showYourName();
    }

    public static void main(String[] args) {
        AAA aaa = new AAA();
        BBB bbb = new BBB();

        showInstanceAncestor(aaa);
        showInstanceName(aaa);
        showInstanceAncestor(bbb);
        showInstanceName(bbb);
    }
}*/

/*
interface SimpleInterface {
    public void showYourName();
}

class UpperClass {
    public void showYourAncestor() {
        System.out.println("UpperClass");
    }
}

class AAA implements SimpleInterface {
    public void showYourName() {
        System.out.println("Class BBB");
    }
}

class BBB extends UpperClass {
}


class BoundedTypeParam {
    public static <T extends UpperClass> void showInstanceAncestor(T param) {
        param.showYourAncestor();

    }

    public static <T extends SimpleInterface> void showInstanceName(T param) {
        param.showYourName();
    }

    public static void main(String[] args) {
        AAA aaa = new AAA();
        BBB bbb = new BBB();

        showInstanceAncestor(aaa);
        showInstanceName(bbb);
    }
}*/
