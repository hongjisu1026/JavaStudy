import java.util.*;

class Test1 {
    public static void main(String[] args) {
        HashSet<Integer> hSet = new HashSet<>();

        while (hSet.size() < 6) {
            int rand = (int) (Math.random() * 45) + 1;
            hSet.add(rand);
        }

        System.out.println(hSet);
    }
}

class Test2 {
    public static void main(String[] args) {
        HashSet<Integer> hSet = new HashSet<>();
        int[][] arr = new int[5][5];

        while (hSet.size() < 25) {
            int rand = (int) (Math.random() * 45) + 1;
            hSet.add(rand);
        }

        Iterator<Integer> itr = hSet.iterator();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = itr.next();
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Test3 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
        HashSet<Integer> temp = new HashSet<>();
        temp.addAll(set1);
        temp.addAll(set2);
        System.out.println("합집합 : " + temp);

        temp.clear();
        temp.addAll(set1);
        temp.retainAll(set2);
        System.out.println("교집합 : " + temp);

        temp.clear();
        temp.addAll(set1);
        temp.removeAll(set2);
        System.out.println("차집합 : " + temp);
    }
}

class Test4 {
    public static void main(String[] args) {
        TreeSet<Integer> tSet = new TreeSet<>();

        while (tSet.size() < 6) {
            int rand = (int) (Math.random() * 45) + 1;
            tSet.add(rand);
        }
        System.out.println(tSet);
    }
}

class Test5 {
    public static void main(String[] args) {
        TreeSet<String> tSet = new TreeSet<>(Arrays.asList("abc", "alien", "bat", "car", "Car", "disc", "dance", "dZZZ", "dzzz", "elephant", "elevator", "fan", "flower"));

        for (String str : tSet) {
            if (str.charAt(0) == 'b' || str.charAt(0) == 'c') {
                System.out.print(str + " ");
            }
        }
    }
}

class Test6 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 33; i <= 127; i++) {
            count++;
            char ch = (char) i;
            System.out.print(ch + " ");
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}

class Test7 {
    public static void main(String[] args) {
        TreeSet<Integer> tSet = new TreeSet<>(Arrays.asList(80, 95, 50, 35, 45, 65, 10, 100));
        List<Integer> list = new LinkedList<>();

        for (Integer i : tSet) {
            if (i < 50) {
                list.add(i);
            }
        }
        tSet.removeAll(list);

        System.out.println("50보다 작은 값 : " + list);
        System.out.println("50보다 큰 값 : " + tSet);
    }
}

class Test8 {
    public static void main(String[] args) {
        HashMap<String, String> hMap = new HashMap<>();
        hMap.put("myId", "1234");
        hMap.put("asdf", "1111");
        hMap.put("asdf", "1234");

        Scanner sc = new Scanner(System.in);
        System.out.print("id 입력 >> ");
        String id = sc.next();
        System.out.print("password 입력 >> ");
        String pwd = sc.next();

        if (hMap.containsKey(id)) {
            if (hMap.get(id).equals(pwd)) {
                System.out.println("아이디와 비밀번호가 일치합니다.");
            } else {
                System.out.println("비밀번호가 일치하지 않습니다.");
            }
        } else {
            System.out.println("존재하지 않는 아이디입니다.");
        }
    }
}

class Test9 {
    public static void main(String[] args) {
        int sum = 0;
        HashMap<String, Integer> hMap = new HashMap<>();
        hMap.put("김자바", 90);
        hMap.put("김자바", 100);
        hMap.put("이자바", 100);
        hMap.put("강자바", 80);
        hMap.put("안자바", 90);

        Iterator<String> itr = hMap.keySet().iterator();
        while (itr.hasNext()) {
            String name = itr.next();
            int score = hMap.get(name);
            sum += score;
            System.out.println("이름 : " + name + ", 점수 : " + score);
        }

        System.out.println("총점 : " + sum);
        System.out.println("평군 : " + sum / hMap.size());
        System.out.println("최고점 : " + Collections.max(hMap.values()));
        System.out.println("최저점 : " + Collections.min(hMap.values()));
    }
}

class Test10 {
    static HashMap<String, HashMap<String, String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addPhoneNo("친구", "이자바", "010-111-1111");
        addPhoneNo("친구", "김자바", "010-222-2222");
        addPhoneNo("친구", "김자바", "010-333-3333");
        addPhoneNo("회사", "김대리", "010-444-4444");
        addPhoneNo("회사", "김대리", "010-555-5555");
        addPhoneNo("회사", "박대리", "010-666-6666");
        addPhoneNo("회사", "이과장", "010-777-7777");
        addPhoneNo("세탁", "010-888-8888");

        printList();
    }

    static void addGroup(String groupName) {
        if (!phoneBook.containsKey(groupName))
            phoneBook.put(groupName, new HashMap<>());
    }

    static void addPhoneNo(String groupName, String name, String tel) {
        addGroup(groupName);
        HashMap<String, String> group = phoneBook.get(groupName);
        group.put(tel, name);
    }

    static void addPhoneNo(String name, String tel) {
        addPhoneNo("기타", name, tel);
    }

    static void printList() {
        Set<String> set = phoneBook.keySet();
        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {
            String key = itr.next();
            System.out.println(" * " + key + "[" + phoneBook.size() + "]");
            Iterator<String> itr2 = phoneBook.get(key).keySet().iterator();

            while (itr2.hasNext()) {
                String phone = itr2.next();
                String name = phoneBook.get(key).get(phone);
                System.out.println(name + " " + phone);
            }
            System.out.println();
        }
    }
}

class Test11 {
    public static void main(String[] args) {
        String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};
        HashMap<String, Integer> map = new HashMap<>();
        for(String s : data) {
            map.put(s, 0);
        }

        Iterator<String> itr = map.keySet().iterator();
        while(itr.hasNext()) {
            int count = 0;
            String key = itr.next();
            for(int i = 0 ; i < data.length; i++) {
                if(key.equals(data[i])) {
                    count ++;
                }
            }
            map.put(key, count);
            System.out.print(key + " : ");
            for(int i = 0; i < count; i++) {
                System.out.print("#");
            }
            System.out.println(" " + count);
        }



    }
}