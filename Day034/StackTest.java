import java.util.*;
import java.util.regex.Pattern;

class StackTest1 {
    public static void main(String[] args) {
        NewStack stack = new NewStack();
        stack.goURL("1.네이트");
        stack.goURL("2.야후");
        stack.goURL("3.네이버");
        stack.goURL("4.다음");

        stack.printStatus();

        stack.goBack();
        System.out.println("= 뒤로가기 버튼을 누른 후 =");
        stack.printStatus();

        stack.goBack();
        System.out.println("= 뒤로가기 버튼을 누른 후 =");
        stack.printStatus();

        stack.goForward();
        System.out.println("= '앞으로' 버튼을 누른 후 =");
        stack.printStatus();

        stack.goURL("codechobo.com");
        System.out.println("= 새로운 주소로 이동 후 =");
        stack.printStatus();
    }
}

class NewStack {
    Stack<String> back = new Stack<>();
    Stack<String> forward = new Stack<>();

    public void goURL(String str) {
        back.push(str);
        if (!forward.isEmpty()) {
            forward.clear();
        }
    }

    public void printStatus() {
        System.out.println("back : " + back);
        System.out.println("forward : " + forward);
        System.out.println("현재 화면은 '" + back.peek() + "' 입니다.");
        System.out.println();
    }

    public void goBack() {
        forward.push(back.peek());
        back.pop();
    }

    public void goForward() {
        back.push(forward.peek());
        forward.pop();
    }
}

class StackTest2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage : java ExpValidCheck \"EXPRESSION\"");
            System.out.println("Example : java ExpValidCheck \"((2+3)*1)+3\"");
        }
        Stack<String> stack = new Stack<>();
        String str = args[0];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                stack.push(ch + "");
            } else if (ch == ')') {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            System.out.println("괄호가 일치합니다.");
        } else {
            System.out.println("괄호가 일치하지 않습니다.");
        }
    }
}

class QueueTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
        Queue<String> queue = new LinkedList<>();
        while (true) {
            System.out.print(">> ");
            String menu = sc.nextLine();
            if (menu.equals("help")) {
                System.out.println("help - 도움말을 보여줍니다.");
                System.out.println("q 또는 Q - 프로그램을 종료합니다.");
                System.out.println("history - 최근에 입력한 명령어를 5개 보여줍니다.");
            } else if (menu.equals("q") || menu.equals("Q")) {
                System.exit(0);
            } else if (menu.equals("history")) {
                queue.add(menu);
                for (int i = 0; i < 5; i++) {
                    System.out.println((i + 1) + ". " + queue.peek());
                    queue.remove();
                }
            } else {
                queue.add(menu);
                System.out.println(menu);
            }
        }
    }
}

/*
12345
54321
 */

class HashSetTest1 {
    public static void main(String[] args) {
        HashSet<Integer> hSet = new HashSet<>();

        while (hSet.size() < 6) {
            int rand = (int) (Math.random() * 45) + 1;
            hSet.add(rand);
        }
        List<Integer> list = new LinkedList<>(hSet);
        Collections.sort(list);
        System.out.println(list);
    }
}

class HashSetTest2 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        HashSet<Integer> hSet = new HashSet<>();

        while (hSet.size() < 25) {
            int rand = (int) (Math.random() * 50) + 1;
            hSet.add(rand);
        }

        Iterator<Integer> itr = hSet.iterator();
        while (itr.hasNext()) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = itr.next();
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

class HashSetTest3 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new Person("David", 10));
        set.add(new Person("David", 10));

        System.out.println(set);
    }
}

class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ":" + age;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        Person comp = (Person) obj;
        return name.equals(comp.name);
    }
}

class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> tSet = new TreeSet<>();

        while (tSet.size() < 6) {
            int rand = (int) (Math.random() * 45) + 1;
            tSet.add(rand);
        }

        System.out.println(tSet);
    }
}