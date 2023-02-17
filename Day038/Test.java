// 1. File

import java.io.File;
import java.io.IOException;

class Test1 {
    public static void main(String[] args) {
        File my = new File("C:\\MyJava\\my.bin");
        File you = new File("C:\\YourJava");
        File reFile = null;
        if (you.mkdir()) {
            reFile = new File(you, "my.bin");
        }

        if (my.renameTo(reFile)) {
            System.out.println("성공");
        }
    }
}

class Test2 {
    public static void main(String[] args) {
        File my = new File("C:" + File.separator + "MyJava" + File.separator + "my.bin");
        File you = new File("C:" + File.separator + "YourJava");
        File reFile = null;
        if (you.mkdir()) {
            reFile = new File(you, "my.bin");
        }

        if (my.renameTo(reFile)) {
            System.out.println("성공");
        }
    }
}

class Test3 {
    public static void main(String[] args) {
        File file = new File("AAA");
        System.out.println(file.getAbsolutePath());

        File sFile = new File("AAA" + File.separator + "BBB");
        System.out.println(sFile.getAbsolutePath());
    }
}

class Test4 {
    public static void main(String[] args) {
        File file = new File("MyDir");
        File[] list = file.listFiles();
        if (list == null) {
            System.out.println("폴더가 존재하지 않습니다.");
            file.mkdir();
        } else {
            for (File f : list) {
                System.out.print(f.getName() + " ");
                if (f.isDirectory()) {
                    System.out.println("DIR");
                } else {
                    System.out.println("FILE");
                }
            }
        }

        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("java.version"));
    }
}

class Test5 {
    public static void main(String[] args) {
        String dir = System.getProperty("user.dir");
        File file = new File(dir);
        System.out.println("현재 폴더 : " + file.getName());
        show(file.listFiles());

        File pFile = file.getParentFile();
        System.out.println("상위 폴더 : " + pFile.getName());
        show(pFile.listFiles());
    }

    public static void show(File[] list) {
        for (File f : list) {
            System.out.print(f.getName() + " ");
            if (f.isDirectory()) {
                System.out.println("DIR");
            } else {
                System.out.println("FILE");
            }
        }
        System.out.println();
    }
}