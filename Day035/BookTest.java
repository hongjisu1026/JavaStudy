import java.util.*;
import java.util.regex.Pattern;
/*
class BookTest1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> kyo = new ArrayList<>(); // 교집합
        ArrayList<Integer> cha = new ArrayList<>(); // 차집합
        ArrayList<Integer> hap = new ArrayList<>(); // 합집합
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        hap.addAll(list1);
        hap.addAll(list2);

        cha.addAll(list1);
        cha.removeAll(list2);

        kyo.addAll(list1);
        kyo.retainAll(list2);

        System.out.println("list1="+list1);
        System.out.println("list2="+list2);
        System.out.println("kyo="+kyo);
        System.out.println("cha="+cha);
        System.out.println("hap="+hap);
    }
}

*/
/*
2. 7
   6
   3
   2
*//*


// 3. a
// 4. 11번째

class BookTest5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("홍길동",1,1,100,100,100));
        list.add(new Student("남궁성",1,2,90,70,80));
        list.add(new Student("김자바",1,3,80,80,90));
        list.add(new Student("이자바",1,4,70,90,70));
        list.add(new Student("안자바",1,5,60,100,80));
        Collections.sort(list);
        Iterator<Student> it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}

class Student implements Comparable<Student> {
    String name;
    int ban;
    int no;
    int kor, eng, math;
    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    int getTotal() {
        return kor+eng+math;
    }
    float getAverage() {
        return (int)((getTotal()/ 3f)*10+0.5)/10f;
    }
    public String toString() {
        return name +","+ban +","+no +","+kor +","+eng +","+math
                +","+getTotal() +","+getAverage();
    }

    @Override
    public int compareTo(Student o) {
        return Objects.hash(name) - Objects.hash(o.name);
    }
}*/

/*class Student implements Comparable<Student> {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
    }

    public String toString() {
        return name
                + "," + ban
                + "," + no
                + "," + kor
                + "," + eng
                + "," + math
                + "," + getTotal()
                + "," + getAverage()
                ;
    }

    public int compareTo(Student o) {
        if (o != null) {
            Student tmp = o;
            return name.compareTo(tmp.name);
        } else {
            return -1;
        }
    }
} // class Student

class BookTest6 {
    static int getGroupCount(TreeSet<Student> tset, int from, int to) {
        int count = 0;
        Iterator<Student> itr = tset.iterator();
        while(itr.hasNext()) {
            Student temp = itr.next();
            float avg = temp.getAverage();
            if(avg >= from && avg < to) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o1.getAverage() - o2.getAverage());
            }
        });
        set.add(new Student("홍길동", 1, 1, 100, 100, 100));
        set.add(new Student("남궁성", 1, 2, 90, 70, 80));
        set.add(new Student("김자바", 1, 3, 80, 80, 90));
        set.add(new Student("이자바", 1, 4, 70, 90, 70));
        set.add(new Student("안자바", 1, 5, 60, 100, 80));
        Iterator it = set.iterator();
        while (it.hasNext())
            System.out.println(it.next());
        System.out.println("[60~69] :" + getGroupCount(set, 60, 70));
        System.out.println("[70~79] :" + getGroupCount(set, 70, 80));
        System.out.println("[80~89] :" + getGroupCount(set, 80, 90));
        System.out.println("[90~100] :" + getGroupCount(set, 90, 101));
    }
}*/

/*
class BookTest7 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("이자바", 2, 1, 70, 90, 70));
        list.add(new Student("안자바", 2, 2, 60, 100, 80));
        list.add(new Student("홍길동", 1, 3, 100, 100, 100));
        list.add(new Student("남궁성", 1, 1, 90, 70, 80));
        list.add(new Student("김자바", 1, 2, 80, 80, 90));
        Collections.sort(list, new BanNoAscending());
        Iterator<Student> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
    }

    public String toString() {
        return name
                + "," + ban
                + "," + no
                + "," + kor
                + "," + eng
                + "," + math
                + "," + getTotal()
                + "," + getAverage()
                ;
    }

    public int getBan() {
        return ban;
    }

    public int getNo() {
        return no;
    }
}


class BanNoAscending implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getBan() == o2.getBan()) {
            return o1.getNo() - o2.getNo();
        }
        return o1.getBan() - o2.getBan();
    }
}*/

/*class Student implements Comparable<Student> {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int total; // 총점
    int schoolRank; // 전교등수

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        total = kor + eng + math;
    }

    int getTotal() {
        return total;
    }

    float getAverage() {
        return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
    }

    public int getSchoolRank() {
        return schoolRank;
    }

    public String toString() {
        return name
                + "," + ban
                + "," + no
                + "," + kor
                + "," + eng
                + "," + math
                + "," + getTotal()
                + "," + getAverage()
                + "," + schoolRank;
    }

    @Override
    public int compareTo(Student o) {
        return o.getTotal() - getTotal();
    }
} // class Student

class BookTest8 {
    public static void calculateSchoolRank(List<Student> list) {
        Collections.sort(list); // list . 먼저 를 총점기준 내림차순으로 정렬한다
        int prevRank = -1; // 이전 전교등수
        int prevTotal = -1; // 이전 총점
        int length = list.size();

        for(Student s : list) {
            int index = list.indexOf(s);
            if (index > 0) {
                prevTotal = list.get(index - 1).getTotal();
                prevRank = list.get(index - 1).getSchoolRank();
            }
            if(s.getTotal() == prevTotal) {
                s.schoolRank = prevRank;
            } else {
                s.schoolRank = (index + 1);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("이자바", 2, 1, 70, 90, 70));
        list.add(new Student("안자바", 2, 2, 60, 100, 80));
        list.add(new Student("홍길동", 1, 3, 100, 100, 100));
        list.add(new Student("남궁성", 1, 1, 90, 70, 80));
        list.add(new Student("김자바", 1, 2, 80, 80, 90));

        calculateSchoolRank(list);
        Iterator<Student> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}*/

/*class Student implements Comparable<Student> {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int total;
    int schoolRank; // 전교등수
    int classRank; // 반등수

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        total = kor + eng + math;
    }

    int getTotal() {
        return total;
    }

    float getAverage() {
        return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
    }

    public int getSchoolRank() {
        return schoolRank;
    }

    public int compareTo(Student o) {
        if (o != null) {
            Student tmp = o;
            return tmp.total - this.total;
        } else {
            return -1;
        }
    }

    public String toString() {
        return name
                + "," + ban
                + "," + no
                + "," + kor
                + "," + eng
                + "," + math
                + "," + getTotal()
                + "," + getAverage()
                + "," + schoolRank
                + "," + classRank // 새로추가
                ;
    }
}

class ClassTotalComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getTotal() - o1.getTotal();
    }
}

class BookTest9 {
    public static void calculateClassRank(List<Student> list) {
        Collections.sort(list, new ClassTotalComparator());
        int prevBan = -1;
        int prevRank = -1;
        int prevTotal = -1;
        int length = list.size();

        for (Student s : list) {
            int index = list.indexOf(s);
            if (index > 0) {
                prevBan = list.get(index - 1).ban;
                prevRank = list.get(index - 1).classRank;
                prevTotal = list.get(index - 1).getTotal();
            }
            if (s.ban != prevBan) {
                prevRank = -1;
                prevTotal = -1;
            }
            if (s.getTotal() == prevTotal) {
                s.classRank = prevRank;
            } else {
                s.classRank = (index + 1);
            }
        }
    }

    public static void calculateSchoolRank(List<Student> list) {
        Collections.sort(list); // list . 먼저 를 총점기준 내림차순으로 정렬한다
        int prevRank = -1; // 이전 전교등수
        int prevTotal = -1; // 이전 총점
        int length = list.size();

        for (Student s : list) {
            int index = list.indexOf(s);
            if (index > 0) {
                prevTotal = list.get(index - 1).getTotal();
                prevRank = list.get(index - 1).getSchoolRank();
            }
            if (s.getTotal() == prevTotal) {
                s.schoolRank = prevRank;
            } else {
                s.schoolRank = (index + 1);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("이자바", 2, 1, 70, 90, 70));
        list.add(new Student("안자바", 2, 2, 60, 100, 80));
        list.add(new Student("홍길동", 1, 3, 100, 100, 100));
        list.add(new Student("남궁성", 1, 1, 90, 70, 80));
        list.add(new Student("김자바", 1, 2, 80, 80, 90));
        calculateSchoolRank(list);
        calculateClassRank(list);
        Iterator<Student> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}*/

class BookTest10 {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        int[][] board = new int[5][5];
        for (int i = 0; set.size() < 25; i++) {
            set.add((int) (Math.random() * 30) + 1);
        }
        Iterator<Integer> it = set.iterator();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = it.next();
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*class SutdaCard {
    int num;
    boolean isKwang;
    SutdaCard() {
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    public boolean equals(Object obj) {
        if(obj instanceof SutdaCard) {
            SutdaCard c = (SutdaCard)obj;
            return num==c.num && isKwang==c.isKwang;
        } else {
            return false;
        }
    }
    public String toString() {
        return num + ( isKwang ? "K":"");
    }

    @Override
    public int hashCode() {
        return num % 3;
    }
}
class BookTest11 {
    public static void main(String[] args) {
        SutdaCard c1 = new SutdaCard(3,true);
        SutdaCard c2 = new SutdaCard(3,true);
        SutdaCard c3 = new SutdaCard(1,true);
        HashSet<SutdaCard> set = new HashSet<>();
        set.add(c1);
        set.add(c2);
        set.add(c3);
        System.out.println(set);
    }
}*/



class BookTest14 {
    static ArrayList<Student> record = new ArrayList<>(); // 성적데이터를 저장할 공간
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            switch (displayMenu()) {
                case 1:
                    inputRecord();
                    break;
                case 2:
                    displayRecord();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
            }
        }
    }

    static int displayMenu() {
        System.out.println("**************************************************");
        System.out.println("*               성적 관리 프로그램               *");
        System.out.println("**************************************************");
        System.out.println();
        System.out.println("1. 학생성적 입력하기");
        System.out.println();
        System.out.println("2. 학생성적 보기");
        System.out.println();
        System.out.println("3. 프로그램 종료");
        System.out.println();
        System.out.print("원하는 메뉴를 선택하세요. (1~3) : ");
        int menu = 0;
        while(true) {
            try {
                menu = sc.nextInt();
                if (menu >= 1 && menu <= 3) {
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("입력오류입니다.");
                System.out.print("원하는 메뉴를 선택하세요. (1~3) : ");
            }
        }

        return menu;
    }

    static void inputRecord() {
        System.out.println("1. 학생성적 입력하기");
        System.out.println("'이름, 반, 번호, 국어성적, 영어성적, 수학성적'의 순서로 공백없이 입력하세요.");
        System.out.println("입력을 마치려면 q 를 입력하세요. 메인화면으로 돌아갑니다.");
        while (true) {
            System.out.print(">> ");
            try {
                String str = sc.next();

                if (str.equalsIgnoreCase("q")) {
                    return;
                } else {
                    Scanner s = new Scanner(str).useDelimiter(",");
                    record.add(new Student(s.next(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()));
                    System.out.println("입력 완료, 마치려면 q를 입력하세요.");
                }
            } catch (Exception e) {
                System.out.println("입력오류입니다.");
            }
        } // end of while
    }

    static void displayRecord() {
        int koreanTotal = 0;
        int englishTotal = 0;
        int mathTotal = 0;
        int total = 0;
        int length = record.size();
        if (length > 0) {
            System.out.println();
            System.out.println("이름 반 번호 국어 영어 수학 총점 평균 전교등수 반등수");
            System.out.println("====================================================");

            for (int i = 0; i < length; i++) {
                Student student = record.get(i);
                System.out.println(student);
                koreanTotal += student.kor;
                mathTotal += student.math;
                englishTotal += student.eng;
                total += student.total;
            }

            System.out.println("====================================================");
            System.out.println("총점 : " + koreanTotal + " " + englishTotal
                    + " " + mathTotal + " " + total);

            System.out.println();
        } else {
            System.out.println("====================================================");

            System.out.println("데이터가 없습니다.");

            System.out.println("====================================================");
        }
    }
}

class Student implements Comparable<Student> {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int total;
    int schoolRank;
    int classRank; // 반등수

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        total = kor + eng + math;
    }

    int getTotal() {
        return total;
    }

    float getAverage() {
        return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
    }

    public int compareTo(Student o) {
        if (o != null) {
            Student tmp = (Student) o;
            return tmp.total - this.total;
        } else {
            return -1;
        }
    }

    public String toString() {
        return name
                + "," + ban
                + "," + no
                + "," + kor
                + "," + eng
                + "," + math
                + "," + getTotal()
                + "," + getAverage()
                + "," + schoolRank
                + "," + classRank
                ;
    }
}