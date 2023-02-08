import java.util.*;

/*class CollectionTest {
    public static void main(String[] args) {
        int size = 500;
        ArrayList<Integer> list = new ArrayList<>(size);
        list.ensureCapacity(size * 2);
    }
}

class HashSetTest {
    public static void main(String[] args) {
        HashSet<Person> hSet = new HashSet<>();
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

/*class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    *//*@Override
    public int hashCode() {
        return name.hashCode() + age % 3;
    }*//*

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        Person comp = (Person) obj;
        return name.equals(comp.name) && age == comp.age;
    }

    public String toString() {
        return name + "(" + age + "세)";
    }
}*/

/*
class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        while (treeSet.size() < 6) {
            int rand = (int) (Math.random() * 45) + 1;
            treeSet.add(rand);
        }
        System.out.println(treeSet);
    }
}

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showData() {
        System.out.printf("%s %d \n", name, age);
    }

    public int compareTo(Person p) {
        return Integer.compare(age, p.age);
        // return age - p.age;
    }
}

class ComparablePerson {
    public static void main(String[] args) {
        TreeSet<Person> sTree = new TreeSet<Person>();
        sTree.add(new Person("Lee", 24));
        sTree.add(new Person("Hong", 29));
        sTree.add(new Person("Choi", 21));

        Iterator<Person> itr = sTree.iterator();
        while (itr.hasNext())
            itr.next().showData();
    }
}*/

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showData() {
        System.out.printf("%s %d \n", name, age);
    }

    public String getName() {
        return name;
    }

    public int compareTo(Person p) {
        if (age > p.age)
            return 1;
        else if (age < p.age)
            return -1;
        else
            return 0;
    }
}

class StringComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}

class ComparablePerson {
    public static void main(String[] args) {
        TreeSet<Person> sTree = new TreeSet<>(new StringComparator());
        sTree.add(new Person("Lee", 24));
        sTree.add(new Person("Hong", 29));
        sTree.add(new Person("Choi", 21));

        Iterator<Person> itr = sTree.iterator();
        while (itr.hasNext())
            itr.next().showData();
    }
}