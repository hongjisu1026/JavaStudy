package orange.seller;

public class FriendMain {
    public static void main(String[] args) {
        Friend fnd = new Friend("hong", "2000", "seoul");
        try {
            Friend copyFnd = fnd.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
