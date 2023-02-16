import java.io.File;

class FileTest {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        File file = new File(path);
        System.out.println("현재 디렉터리 이름 : " + file.getName());
        show(file.listFiles());
        System.out.println();

        File dFile = file.getParentFile();
        System.out.println("상위 디렉터리 이름 : " + dFile.getName());
        show(dFile.listFiles());
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
    }
}