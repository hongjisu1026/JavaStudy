import java.io.*;

class IOTest {
    public static void main(String[] args) throws IOException {
        try (PrintStream out = new PrintStream(new FileOutputStream("println.txt"))) {
            MyInfo mInfo = new MyInfo("저는 자바 프로그래머입니다.");
            out.println("제 소개를 하겠습니다.");
            out.println(mInfo);
            out.printf("나이 %d, 몸무게 %dkg입니다.", 24, 72);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class MyInfo {
    String info;

    public MyInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return info;
    }
}

class PrintWriterStream {
    public static void main(String[] args) throws IOException {
        String str = null;
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("printf.txt")));
        out.printf("제 나이는 %d살 입니다.", 24);
        out.println("");

        out.println("저는 자바가 좋습니다.");
        out.print("특히 I/O 부분에서 많은 매력을 느낍니다.");
        out.close();

        BufferedReader bIn = new BufferedReader(new FileReader("printf.txt"));
        while ((str = bIn.readLine()) != null) {
            System.out.println(str);
        }
        bIn.close();
    }
}