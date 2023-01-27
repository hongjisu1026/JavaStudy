package com.phoneBook;

public class PhoneBook {
    private PhoneInfo[] pArr = new PhoneInfo[100];
    private int count = 0;

    public boolean saveData(PhoneInfo info) {
        int i = 0, j = 0;
        if (count > 100) {
            return false;
        }
        for (i = 0; i < count; i++) {
            if (pArr[i].getName().compareTo(info.getName()) > 0) {
                for (j = count - 1; j >= i; j--) {
                    this.pArr[j + 1] = this.pArr[j];
                }
                break;
            }
        }
        pArr[i] = info;
        count++;
        return true;
    }

    public int binarySearch(String name) {
        int start = 0;
        int end = count - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (pArr[mid].getName().compareTo(name) == 0) {
                return mid;
            } else if (pArr[mid].getName().compareTo(name) > 0) {
                start = mid + 1;
            } else if (pArr[mid].getName().compareTo(name) < 0) {
                end = mid - 1;
            }
        }
        return -1;
    }

    public boolean searchData(String name) {
        int index = binarySearch(name);
        if (index != -1) {
            pArr[index].showPhoneInfo();
            return true;
        }
        return false;
    }

    public void deleteData(int index) {
       for (int i = count - 1; i > index; i--) {
                pArr[i - 1] = pArr[i];
            }
            pArr[count - 1] = null;
            count--;
    }

    public boolean showAllData() {
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                pArr[i].showPhoneInfo();
            }
            return true;
        }
        return false;
    }

    public void endProgram() {
        System.exit(0);
    }
}
