import java.util.Arrays;

class ArrayTest1 {
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

class ArrayTest2 {
    public static void main(String[] args) {
        double[] arOrg = {1.1, 2.2, 3.3, 4.4, 5.5};
        double[] arCpy = Arrays.copyOf(arOrg, arOrg.length);

        System.out.println("원본 : " + Arrays.toString(arOrg));
        System.out.println("복사본 : " + Arrays.toString(arCpy));
    }
}

class ArrayTest3 {
    public static void main(String[] args) {
        double[] arOrg = {1.1, 2.2, 3.3, 4.4, 5.5};
        double[] arCpy = Arrays.copyOf(arOrg, 3);

        System.out.println("원본 : " + Arrays.toString(arOrg));
        System.out.println("복사본 : " + Arrays.toString(arCpy));
    }
}

class ArrayTest4 {
    public static void main(String[] args) {
        double[] arOrg = {1.1, 2.2, 3.3, 4.4, 5.5};
        double[] arCpy = Arrays.copyOfRange(arOrg, 1, 4);

        System.out.println("원본 : " + Arrays.toString(arOrg));
        System.out.println("복사본 : " + Arrays.toString(arCpy));
    }
}

class ArrayTest5 {
    public static void main(String[] args) {
        int[] ar1 = {1, 2, 3, 4, 5};
        int[] ar2 = Arrays.copyOf(ar1, ar1.length);

        System.out.println(Arrays.equals(ar1, ar2));
    }
}

class INum {
    private int num;

    public INum(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        INum comp = (INum) obj;
        return num == comp.num;
    }
}

class ArrayTest6 {
    public static void main(String[] args) {
        INum[] ar1 = new INum[3];
        INum[] ar2 = new INum[3];

        ar1[0] = new INum(1);
        ar2[0] = new INum(1);

        ar1[1] = new INum(2);
        ar2[1] = new INum(2);

        ar1[2] = new INum(3);
        ar2[2] = new INum(3);

        System.out.println(Arrays.equals(ar1, ar2));
    }
}

class ArrayTest7 {
    public static void main(String[] args) {
        int[] ar1 = {1, 5, 3, 2, 4};
        double[] ar2 = {3.3, 2.2, 5.5, 1.1, 4.4};

        Arrays.sort(ar1);
        System.out.println(Arrays.toString(ar1));
        Arrays.sort(ar2);
        System.out.println(Arrays.toString(ar2));
    }
}

class ArrayTest8 {
    public static void main(String[] args) {
        int[] ar = {33, 55, 11, 44, 22};
        Arrays.sort(ar);
        System.out.println(Arrays.binarySearch(ar, 33));
    }
}

class ArrayTest9 {
    public static void main(String[] args) {
        Person[] ar = new Person[3];

        ar[0] = new Person("Lee", 29);
        ar[1] = new Person("Goo", 15);
        ar[2] = new Person("Soo", 37);

        Arrays.sort(ar);
        int index = Arrays.binarySearch(ar, new Person("?", 37));
        System.out.println(ar[index]);

    }
}