public class PhoneBook {
    private PhoneInfo[] pArr = new PhoneInfo[100];
    private int count = 0;

    public boolean saveData(PhoneInfo info) {
        if (count > 100) {
            return false;
        }

        int i = 0, j = 0;
        for (i = 0; i < count; i++) {
            if (pArr[i].getName().compareTo(info.getName()) > 0) {
                for (j = count - 1; j >= i; j--) {
                    pArr[j + 1] = pArr[j];
                }
                break;
            }
        }
        pArr[i] = info;
        count++;
        return true;
    }

    public int searchName(String name) {
        int start = 0;
        int end = count - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (pArr[mid].getName().compareTo(name) == 0) {
                return mid;
            } else if (pArr[mid].getName().compareTo(name) > 0) {
                end = mid - 1;
            } else if (pArr[mid].getName().compareTo(name) < 0) {
                start = mid + 1;
            }
        }
        return -1;
    }

    public boolean searchData(String name) {
        int index = searchName(name);

        if (index == -1) {
            return false;
        }

        pArr[index].showPhoneInfo();
        return true;
    }

    public boolean deleteData(int index) {
        if (index == -1) {
            return false;
        }

        for(int i = index; i < count - 1; i++) {
            pArr[i] = pArr[i + 1];
        }
        pArr[count - 1] = null;
        count--;
        return true;
    }

    public void showAllData() {
        for(int i = 0; i < count; i++) {
            pArr[i].showPhoneInfo();
        }
    }

    public void endProgram() {
        System.exit(0);
    }


}