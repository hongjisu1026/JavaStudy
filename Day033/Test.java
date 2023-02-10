import java.util.*;

class Test1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Box", "Toy", "Box", "Toy");
        HashSet<String> set = new HashSet<>(list); // set을 통해 중복 제거
        list = new ArrayList<>(set);

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

class Test2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());

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
