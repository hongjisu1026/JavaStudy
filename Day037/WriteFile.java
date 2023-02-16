import java.io.*;
import java.util.ArrayList;

public class WriteFile {

    public void writeFile(ArrayList<PhoneInfo> p) {
        try {
            FileOutputStream fos = new FileOutputStream(MenuString.THIS_PATH);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos);

            oos.writeObject(p);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
