import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class ReadFile {
    public static ArrayList<PhoneInfo> info = new ArrayList<>();

    public void readFile() {
        try {
            FileInputStream fis = new FileInputStream(MenuString.THIS_PATH);
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);

            info = (ArrayList<PhoneInfo>) ois.readObject();
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
