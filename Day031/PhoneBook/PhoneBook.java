import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class PhoneBook {
    private static PhoneBook pb;
    //private HashSet<PhoneInfo> list;
    private TreeSet<PhoneInfo> treeSet;

    private PhoneBook() {
        //list = new HashSet<>();
        treeSet = new TreeSet<>();
    }

    public static PhoneBook getPhoneBookInst() {
        if (pb == null)
            pb = new PhoneBook();
        return pb;
    }

    public void inputPhoneInfo(PhoneInfo pInfo) {
        /*if(list.add(pInfo)) {
            System.out.println("데이터 입력이 완료되었습니다.");
        } else {
            System.out.println("데이터 저장 실패");
        }*/
        if (treeSet.add(pInfo)) {
            System.out.println("데이터 입력이 완료되었습니다.");
        } else {
            System.out.println("데이터 저장 실패");
        }
    }

    public boolean searchPhoneInfo(String name) {
        /*for (PhoneInfo p : list) {
            if (p.getName().compareTo(name) == 0) {
                p.showPhoneInfo();
                return true;
            }
        }*/
        for (PhoneInfo p : treeSet) {
            if (p.getName().compareTo(name) == 0) {
                p.showPhoneInfo();
                return true;
            }
        }
        return false;
    }

    public void deletePhoneInfo(String name) {
        /*Iterator<PhoneInfo> itr = list.iterator();
        while (itr.hasNext()) {
            PhoneInfo p = itr.next();
            if (p.getName().compareTo(name) == 0) {
                itr.remove();
            }
        }*/

        Iterator<PhoneInfo> itr = treeSet.iterator();
        while (itr.hasNext()) {
            PhoneInfo p = itr.next();
            if (p.getName().compareTo(name) == 0) {
                itr.remove();
            }
        }
        System.out.println("삭제가 완료되었습니다.");
    }

    public void showAllPhoneInfo() {
        /*for (PhoneInfo pInfo : list)
            pInfo.showPhoneInfo();*/
        for (PhoneInfo p : treeSet) {
            p.showPhoneInfo();
        }
    }
}