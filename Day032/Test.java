/*
import java.util.*;

class Test1 {
    public static void main(String[] args) {
        int size = 500;
        ArrayList<Integer> list = new ArrayList<>(size);
        list.ensureCapacity(size * 2);
    }
}

*/
/*
2-1. ArrayList
2-2. LinkedList
 *//*


class Person {
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
        return Objects.hash(name) + age % 3;
    }

    @Override
    public boolean equals(Object obj) {
        Person comp = (Person) obj;
        return name.equals(comp.name) && age == comp.age;
    }
}

class Test3 {
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
}

class Test4 {
    public static void main(String[] args) {
        TreeSet<Integer> sTree = new TreeSet<>();

        while (sTree.size() < 6) {
            int rand = (int) (Math.random() * 45) + 1;
            sTree.add(rand);
        }

        System.out.println(sTree);
    }
}*/
