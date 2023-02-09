// 1. 정의된 약속 / 구조
// 2. 정의된 클래스 틀
// 3. 효율적인 데이터 저장 방법
// 4. 저장된 데이터의 각종 연산
// 5. Array, List, Stack, Queue, Tree, Hash
// 6. Sort, Search, Max, Min
// 7. 데이터의 저장, 알고리즘을 구조화 해 놓은 프레임워크
// 9. 인터페이스를 기반으로 클래스들이 정의되어 있기 때문
// 10. ArrayList<E>, LinkedList<E>
// 11. 중복 저장 허용, 저장 순서 유지

import java.util.*;

class CollectionTest12 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);

        for (Integer e : list) {
            System.out.println(e);
        }
        System.out.println();
        list.remove(0);
        for (Integer e : list) {
            System.out.println(e);
        }
    }
}

class CollectionTest13 {
    public static void main(String[] args) {
        int size = 500;
        ArrayList<Integer> list = new ArrayList<>(size);
        list.ensureCapacity(500 * 2);
    }
}

class CollectionTest14 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(11);
        list.add(22);
        list.add(33);

        for (Integer e : list) {
            System.out.println(e);
        }
        System.out.println();
        list.remove(0);
        for (Integer e : list) {
            System.out.println(e);
        }
    }
}

// 15. 참조가 빠르다

class CollectionTest16 {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.store("First");

        box.nextBox = new Box<>();
        box.nextBox.store("Second");

        box.nextBox.nextBox = new Box<>();
        box.nextBox.nextBox.store("Third");

        System.out.println(box.pullOut());
        System.out.println(box.nextBox.pullOut());
        System.out.println(box.nextBox.nextBox.pullOut());
    }
}

class Box<T> {
    T item;
    Box<T> nextBox;

    public void store(T item) {
        this.item = item;
    }

    public T pullOut() {
        return item;
    }
}

// 17. 빠른 삭제와 삽입
// 18. 상황 1 : ArrayList | 상황 2 : LinkedList

class CollectionTest19 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();

        list.remove("Third");
        itr = list.iterator(); // 반복자 다시 호출해서 반복자의 참조를 처음으로 바꿔줌
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

class CollectionTest21 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();

        list.remove("Third");
        for (String s : list) {
            System.out.println(s);
        }
    }
}

// 23. 컬렉션 프레임워크에 저장된 요소를 읽어오는 방법을 표준화 시킴

class CollectionTest24 {
    public static void main(String[] args) {
        HashSet<String> hSet = new HashSet<>();
        hSet.add("First");
        hSet.add("Second");
        hSet.add("Third");
        hSet.add("Fourth");

        Iterator<String> itr = hSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();

        hSet.remove("Third");
        itr = hSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

class IntNumber<T extends Number> {
    T number;

    public IntNumber(T number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number.toString();
    }
}

class CollectionTest25 {
    public static void main(String[] args) {
        LinkedList<IntNumber<Integer>> list = new LinkedList<>();
        list.add(new IntNumber<>(10));
        list.add(new IntNumber<>(20));
        list.add(new IntNumber<>(30));

        Iterator<IntNumber<Integer>> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

// 26. List : 저장 순서가 유지되며 중복저장이 가능하다 | Set : 저장 순서가 유지되지 않으며 중복저장이 불가능하다.

class CollectionTest27 {
    public static void main(String[] args) {
        HashSet<String> hSet = new HashSet<>();
        hSet.add("First");
        hSet.add("Second");
        hSet.add("Third");
        hSet.add("First");

        System.out.println(hSet.size());
        for (String s : hSet) {
            System.out.println(s);
        }
    }
}

// 28. equals, hashCode
// 29. hashCode 메소드를 사용해 데이터들을 그룹화 시키고 equals 메소드를 통해 검색한다.

class SimpleNumber {
    int num;

    public SimpleNumber(int n) {
        num = n;
    }

    public String toString() {
        return String.valueOf(num);
    }

    @Override
    public int hashCode() {
        return num % 3;
    }

    @Override
    public boolean equals(Object obj) {
        SimpleNumber comp = (SimpleNumber) obj;
        return num == comp.num;
    }
}

class CollectionTest30 {
    public static void main(String[] args) {
        HashSet<SimpleNumber> hSet = new HashSet<SimpleNumber>();
        hSet.add(new SimpleNumber(10));
        hSet.add(new SimpleNumber(20));
        hSet.add(new SimpleNumber(20));

        System.out.println("저장된 데이터 수: " + hSet.size());

        Iterator<SimpleNumber> itr = hSet.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}

/*class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "(" + age + "세)";
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age % 3;
    }

    @Override
    public boolean equals(Object obj) {
        Person comp = (Person) obj;
        return name.equals(comp.name) && age == comp.age;
    }
}

class CollectionTest31 {
    public static void main(String[] args) {
        HashSet<Person> hSet = new HashSet<Person>();
        hSet.add(new Person("이진호", 10));
        hSet.add(new Person("이진호", 20));
        hSet.add(new Person("김명호", 20));
        hSet.add(new Person("김명호", 15));
        hSet.add(new Person("이진호", 20));
        hSet.add(new Person("김명호", 20));

        System.out.println("저장된 데이터 수 : " + hSet.size());

        Iterator<Person> itr = hSet.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}*/

class CollectionTest32 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(3);
        set.add(2);

        System.out.println("저장된 데이터 수 " + set.size());
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

// 33. Object
// 34. Comparator
// 35. ?
// 36. Comparable

/*class CollectionTest37 {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>();
        set.add(new Person("Lee", 24));
        set.add(new Person("Hong", 29));
        set.add(new Person("Choi", 21));

        Iterator<Person> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}*/

/*class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "[" + name + ", " + age + "세]";
    }

    @Override
    public int compareTo(Person o) {
        return age - o.age;
    }

    public String getName() {
        return name;
    }
}

class CollectionTest38 {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>(new StringCompareTo());
        set.add(new Person("Lee", 24));
        set.add(new Person("Hongg", 29));
        set.add(new Person("Choi", 21));

        Iterator<Person> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

class StringCompareTo implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().length() - o2.getName().length();
    }
}*/

class StringWrapper {
    String str;

    public StringWrapper(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    @Override
    public String toString() {
        return str;
    }
}

class CollectionTest39 {
    public static void main(String[] args) {
        TreeSet<StringWrapper> set = new TreeSet<>(new StringCompareTo());
        set.add(new StringWrapper("Orange"));
        set.add(new StringWrapper("Apple"));
        set.add(new StringWrapper("Dog"));
        set.add(new StringWrapper("Individual"));

        Iterator<StringWrapper> itr = set.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

class StringCompareTo implements Comparator<StringWrapper> {

    @Override
    public int compare(StringWrapper o1, StringWrapper o2) {
        return o1.getStr().length() - o2.getStr().length();
    }
}

// 40. listIterator 호출, hasPrevious()로 확인, previous()로 가져오기 | descendingIterator()
// 41. Comparator

class CollectionTest42 {
    public static void main(String[] args) {
        TreeSet<StringWrapper> set = new TreeSet<>(new StringCompareTo());
        set.add(new StringWrapper("Orange"));
        set.add(new StringWrapper("Apple"));
        set.add(new StringWrapper("Dog"));
        set.add(new StringWrapper("Individual"));

        Iterator<StringWrapper> itr = set.descendingIterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

// 44. Collection, Map

class CollectionTest45 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "나삼번");
        map.put(5, "윤오번");
        map.put(8, "박팔번");

        Iterator<Integer> itr = map.keySet().iterator();
        while(itr.hasNext()) {
            int key = itr.next();
            System.out.println(key + ", " + map.get(key));
        }
        System.out.println();

        map.remove(5);
        itr = map.keySet().iterator();
        while(itr.hasNext()) {
            int key = itr.next();
            System.out.println(key + ", " + map.get(key));
        }
    }
}

// 47. 빠른 검색
// 48. Collection, ?, Map

class CollectionTest49 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map1 = new TreeMap<>();
        mapPut(map1);

        Iterator<Integer> itr = map1.keySet().iterator();
        while(itr.hasNext()) {
            int key = itr.next();
            System.out.println(key + " " + map1.get(key));
        }
        System.out.println();

        Comparator<Integer> comparator = Comparator.reverseOrder();
        TreeMap<Integer, String> map2 = new TreeMap<>(comparator);
        mapPut(map2);
        itr = map2.keySet().iterator();
        while(itr.hasNext()) {
            int key = itr.next();
            System.out.println(key + " " + map2.get(key));
        }
    }

    public static void mapPut(TreeMap<Integer, String> map) {
        map.put(1, "data1");
        map.put(3, "data3");
        map.put(5, "data5");
        map.put(2, "data2");
        map.put(4, "data4");
    }
}
