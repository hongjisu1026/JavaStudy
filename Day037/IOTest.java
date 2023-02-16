// 1. 데이터의 흐름, 데이터의 흐름을 형성해주는 통로
// 2. InputStream, OutputStream
// 3. InputStream
// 4. close(), read()
// 5. read()
// 6. -1
// 7. InputStream <-> OutputStream
//    FileInputStream <-> FileOutputStream
// 8. write(), close()

import java.io.*;

class IOTest9 {
    public static void main(String[] args) {
        int count = 0;
        int i = 0;
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream("test.txt");
            os = new FileOutputStream("testCpy.txt");
            while ((i = is.read()) != -1) {
                count++;
                os.write(i);
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null) is.close();
                if (os != null) os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

// 10. read()
// 11. write()

class IOTest12 {
    public static void main(String[] args) {
        byte[] r = new byte[1024];
        int i = 0, j = 0;
        try (FileInputStream is = new FileInputStream("test.txt");
                FileOutputStream os = new FileOutputStream("testCpy.txt")) {
            while((i = is.read(r)) != -1) {
                j += i;
                os.write(r, 0, i);
            }
            System.out.println(j);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// 13. 필터스트림
//     필터입력스트림, 필터출력스트림
// 14. DataInputStream, DataOutputStream