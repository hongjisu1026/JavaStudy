import java.util.*;

class Test1 {
    public static void main(String[] args) {
        HashSet<Integer> hSet1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        HashSet<Integer> hSet2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));
        HashSet<Integer> temp = new HashSet<>();

        temp.addAll(hSet1);
        temp.addAll(hSet2);
        System.out.println("합집합 : " + temp);
        temp.clear();

        temp.addAll(hSet1);
        temp.retainAll(hSet2);
        System.out.println("교집합 : " + temp);
        temp.clear();

        temp.addAll(hSet1);
        temp.removeAll(hSet2);
        System.out.println("차집합 : " + temp);
    }
}

class Test2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("이자바", 2, 1, 70, 90, 70));
        // 이름, 반, 번호, 국어, 영어, 수학
        list.add(new Student("안자바", 2, 2, 60, 100, 80));
        list.add(new Student("홍길동", 1, 3, 100, 100, 100));
        list.add(new Student("남궁성", 1, 1, 90, 70, 80));
        list.add(new Student("김자바", 1, 2, 80, 80, 90));
        Collections.sort(list);
        calculateSchoolRank(list);
        calculateClassRank(list);
        Iterator<Student> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }

    private static void calculateSchoolRank(ArrayList<Student> list) {
        Student before = null;
        for (Student s : list) {
            int index = list.indexOf(s);
            if (index != 0) {
                before = list.get(index - 1);
                if (before.getTotal() == s.getTotal()) {
                    s.schoolRank = before.schoolRank;
                } else {
                    s.schoolRank = index + 1;
                }
            } else {
                s.schoolRank = index + 1;
            }
        }
    }

    private static void calculateClassRank(ArrayList<Student> list) {
        Student before = null;
        int n = 0;
        for (Student s : list) {
            int index = list.indexOf(s);
            if (index != 0) {
                before = list.get(index - 1);
                if (s.ban != before.ban) {
                    n = 0;
                    before.classRank = 0;
                }
                if (s.getTotal() == before.getTotal()) {
                    s.classRank = before.classRank;
                } else {
                    s.classRank = n + 1;
                }
            } else {
                s.classRank = n + 1;
            }
            n++;
        }
    }
}

class Student implements Comparable<Student> {
    String name;
    int ban, no, kor, eng, math;
    int schoolRank, classRank;

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getTotal() {
        return kor + eng + math;
    }

    public double getAverage() {
        double total = getTotal();
        return Math.round((total / 3) * 10) / 10.0;
    }

    public String toString() {
        return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", " + getAverage() + ", " + schoolRank + ", " + classRank;
    }

    @Override
    public int compareTo(Student o) {
        return ban == o.ban ? o.getTotal() - getTotal() : ban - o.ban;
    }
}

class Test3 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        deck.shuffle();
        Player[] pArr = {
                new Player("타짜", deck.pick(), deck.pick()),
                new Player("고수", deck.pick(), deck.pick()),
                new Player("물주", deck.pick(), deck.pick()),
                new Player("중수", deck.pick(), deck.pick()),
                new Player("하수", deck.pick(), deck.pick())
        };

        TreeMap<Player, Integer> rank = new TreeMap<>(new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o2.point - o1.point;
            }
        });

        for (Player p : pArr) {
            rank.put(p, deck.getPoint(p));
            System.out.println(p + " " + deck.getPoint(p));
        }
        System.out.println();
        System.out.println("1위는 " + rank.firstKey() + "입니다.");
    }
}

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
    int pos = 0; // 다음에 가져올 카드의 위치
    HashMap<String, Integer> jokbo = new HashMap<>();

    SutdaDeck() {
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = i < 10 && (num == 1 || num == 3 || num == 8);
            cards[i] = new SutdaCard(num, isKwang);
        }
        putJokbo(); // . 족보를 등록한다
    }

    public void putJokbo() {
        jokbo.put("KK", 4000);
        jokbo.put("1010", 3100);
        jokbo.put("12", 2060);
        jokbo.put("99", 3090);
        jokbo.put("21", 2060);
        jokbo.put("88", 3080);
        jokbo.put("14", 2050);
        jokbo.put("77", 3070);
        jokbo.put("41", 2050);
        jokbo.put("66", 3060);
        jokbo.put("19", 2040);
        jokbo.put("55", 3050);
        jokbo.put("91", 2040);
        jokbo.put("44", 3040);
        jokbo.put("110", 2030);
        jokbo.put("33", 3030);
        jokbo.put("101", 2030);
        jokbo.put("22", 3020);
        jokbo.put("104", 2020);
        jokbo.put("11", 3010);
        jokbo.put("410", 2020);
        jokbo.put("46", 2010);
        jokbo.put("64", 2010);
    }

    public SutdaCard pick() {
        SutdaCard card = null;

        if (pos >= 0 && pos < CARD_NUM) {
            card = cards[pos];
            cards[pos++] = null;
        } else {
            System.out.println("남은 카드가 없습니다.");
        }
        return card;
    }

    public void shuffle() {
        int i = (int) (Math.random() * CARD_NUM);
        int j = (int) (Math.random() * CARD_NUM);

        SutdaCard card = cards[i];
        cards[i] = cards[j];
        cards[j] = card;
    }

    public int getPoint(Player p) {
        if(p == null) return 0;

        SutdaCard c1 = p.c1;
        SutdaCard c2 = p.c2;
        Integer result = 0;

        if(c1.isKwang && c2.isKwang) {
            result = jokbo.get("KK");
        } else {
            result = jokbo.get("" + c1.num + c2.num);
            if (result == null) {
                result = (c1.num + c2.num) % 10 + 1000;
            }
        }

        p.point = result;
        return result;
    }
}

class Player {
    String name;
    SutdaCard c1;
    SutdaCard c2;
    int point; // - 카드의 등급에 따른 점수 새로 추가

    Player(String name, SutdaCard c1, SutdaCard c2) {
        this.name = name;
        this.c1 = c1;
        this.c2 = c2;
    }

    public String toString() {
        return "[" + name + "]" + c1.toString() + "," + c2.toString();
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}