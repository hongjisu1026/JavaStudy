package test;

public class PhoneBook {
    private PhoneInfo[] pArr = new PhoneInfo[100];
    private int count;

    //사용자 저장 메소드
    public boolean saveData(String name, String phone, String birth) {
        if (count >= 100) {
            return false;
        }
        pArr[count++] = new PhoneInfo(name, phone, birth);
        return true;
    }

    //사용자 검색 메소드
    public boolean findData(String name) {
        boolean result = false;
        for (int i = 0; i < count; i++) {
            if (name.compareTo(pArr[i].getName()) == 0) {
                pArr[i].printPhoneInfo();
                result = true;
            }
        }
        return result;
    }

    //사용자 삭제 메소드
    public boolean deleteData(String phone) {
        boolean result = false;
        for (int i = 0; i < count; i++) {
            if (phone.compareTo(pArr[i].getPhone()) == 0) {
                for (int j = i; j < count - 1; j++) {
                    pArr[j] = pArr[j + 1];
                }
                result = true;
                pArr[count - 1] = null;
                count--;
            }
        }
        return result;
    }

    //전체 정보 검색 메소드
    public boolean printAllData() {
        boolean result = false;
        if(count > 0) {
            for (int i = 0; i < count; i++) {
                pArr[i].printPhoneInfo();
                System.out.println();
                result = true;
            }
        } else {
            return false;
        }

        return result;
    }
}

