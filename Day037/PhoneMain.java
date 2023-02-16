public class PhoneMain {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        readFile.readFile();
        while (true) {
            PhoneBookUI.choiceMenu();
        }
    }
}
