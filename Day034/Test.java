/*
import java.util.*;

*/
/*
class Test1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Box", "Toy", "Box", "Toy");
        HashSet<String> hSet = new HashSet<>(list);
        list = new ArrayList<>(hSet);

        System.out.println(list);
    }
}

class Test2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());

        // Key-Value 기반 데이터 저장
        map.put(45, "Brown");
        map.put(37, "James");
        map.put(23, "Martin");

        // Key만 담고 있는 컬렉션 인스턴스 생성
        Set<Integer> ks = map.keySet();

        // 전체 Key 출력 (for-each문 기반)
        for (Integer n : ks)
            System.out.print(n.toString() + '\t');
        System.out.println();

        // 전체 Value 출력 (for-each문 기반)
        for (Integer n : ks)
            System.out.print(map.get(n).toString() + '\t');
        System.out.println();

        // 전체 Value 출력 (반복자 기반)
        for (Iterator<Integer> itr = ks.iterator(); itr.hasNext(); )
            System.out.print(map.get(itr.next()) + '\t');
        System.out.println();
    }
}

class Test3 {
    public static void main(String[] args) {
        Person[] ar = new Person[3];

        ar[0] = new Person("Lee", 29);
        ar[1] = new Person("Goo", 15);
        ar[2] = new Person("Soo", 37);

        Arrays.sort(ar);
        for (Person p : ar) {
            System.out.println(p);
        }
    }
}

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }

    @Override
    public int compareTo(Person o) {
        return age - o.age;
    }
}

class Test4 {
    public static void main(String[] args) {
        double[] arOrg = {1.1, 2.2, 3.3, 4.4, 5.5};
        double[] arCpy = Arrays.copyOf(arOrg, arOrg.length);

        System.out.println("원본 : " + Arrays.toString(arOrg));
        System.out.println("복사본 : " + Arrays.toString(arCpy));
    }
}

class Test5 {
    public static void main(String[] args) {
        double[] arOrg = {1.1, 2.2, 3.3, 4.4, 5.5};
        double[] arCpy = Arrays.copyOfRange(arOrg, 0, 3);

        System.out.println("원본 : " + Arrays.toString(arOrg));
        System.out.println("복사본 : " + Arrays.toString(arCpy));
    }
}

class Test6 {
    public static void main(String[] args) {
        double[] arOrg = {1.1, 2.2, 3.3, 4.4, 5.5};
        double[] arCpy = Arrays.copyOfRange(arOrg, 1, 4);

        System.out.println("원본 : " + Arrays.toString(arOrg));
        System.out.println("복사본 : " + Arrays.toString(arCpy));
    }
}

class Test7 {
    public static void main(String[] args) {
        int[] ar1 = {1, 2, 3, 4, 5};
        int[] ar2 = Arrays.copyOf(ar1, ar1.length);

        System.out.println(Arrays.equals(ar1, ar2));
    }
}

class Test8 {
    public static void main(String[] args) {
        INum[] ar1 = new INum[3];
        INum[] ar2 = new INum[3];

        ar1[0] = new INum(1);
        ar2[0] = new INum(1);

        ar1[1] = new INum(2);
        ar2[1] = new INum(2);

        ar1[2] = new INum(3);
        ar2[2] = new INum(3);

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        System.out.println(Arrays.equals(ar1, ar2));
    }
}

class INum implements Comparable<INum> {
    private int num;

    public INum(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return num % 3;
    }

    @Override
    public boolean equals(Object obj) {
        INum comp = (INum) obj;
        return num == comp.num;
    }

    @Override
    public int compareTo(INum o) {
        return num - o.num;
    }
}

class Test9 {
    public static void main(String[] args) {
        int[] ar1 = {1, 5, 3, 2, 4};
        double[] ar2 = {3.3, 2.2, 5.5, 1.1, 4.4};

        Arrays.sort(ar1);
        Arrays.sort(ar2);
        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));
    }
}

class Test10 {
    public static void main(String[] args) {
        int[] ar = {33, 55, 11, 44, 22};
        Arrays.sort(ar);

        System.out.println(Arrays.binarySearch(ar, 33));
    }
}

class Test11 {
    public static void main(String[] args) {
        Person[] ar = new Person[3];

        ar[0] = new Person("Lee", 29);
        ar[1] = new Person("Goo", 15);
        ar[2] = new Person("Soo", 37);

        Arrays.sort(ar);
        int index = Arrays.binarySearch(ar, new Person("?", 37));
        System.out.println(ar[index]);
    }
}*//*


*/
/*class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }

    @Override
    public int compareTo(Person o) {
        return o.age - age;
    }
}

class Test12 {
    public static void main(String[] args) {
        Person[] ar = new Person[3];

        ar[0] = new Person("Lee", 29);
        ar[1] = new Person("Goo", 15);
        ar[2] = new Person("Soo", 37);

        Arrays.sort(ar);

        for(Person p : ar)
            System.out.println(p);
    }
}*//*


class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }

    @Override
    public int compareTo(Person o) {
        return name.length() - o.name.length();
    }
}

class Test13 {
    public static void main(String[] args) {
        Person[] ar = new Person[3];

        ar[0] = new Person("Leeee", 29);
        ar[1] = new Person("Gooo", 15);
        ar[2] = new Person("Soo", 37);

        Arrays.sort(ar);

        for(Person p : ar)
            System.out.println(p);
    }
}
*/
