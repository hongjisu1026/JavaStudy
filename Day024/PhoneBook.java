import java.util.Vector;

public class PhoneBook {
    private Vector<PhoneInfo> vector = new Vector<>(100);
    private int count;

    public boolean saveData(PhoneInfo info) {
        count = vector.size();
        if (count > 100) {
            return false;
        }

        for(int i = 0; i < count; i++) {
            if(vector.get(i).getName().compareTo(info.getName()) > 0) {
                vector.add(i, info);
                return true;
            }
        }
        vector.add(info);
        return true;
    }

    public int searchName(String name) {
        int start = 0;
        int end = vector.size() - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (vector.get(mid).getName().compareTo(name) == 0) {
                return mid;
            } else if (vector.get(mid).getName().compareTo(name) > 0) {
                end = mid - 1;
            } else if (vector.get(mid).getName().compareTo(name) < 0) {
                start = mid + 1;
            }
        }
        return -1;
    }

    public boolean searchData(String name) {
        int index = searchName(name);
        if(index == -1) {
            return false;
        }
        vector.get(index).showPhoneInfo();
        return true;
    }

    public boolean deleteData(int index) {
        if(index == -1) {
            return false;
        }
        vector.remove(index);
        return true;
    }

    public void showAllData() {
        for(PhoneInfo info : vector) {
            info.showPhoneInfo();
        }
    }

    public void endProgram() {
        System.exit(0);
    }
}