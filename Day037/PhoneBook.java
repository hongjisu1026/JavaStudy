import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class PhoneBook {
    static ArrayList<PhoneInfo> info = ReadFile.info;
    WriteFile writeFile = new WriteFile();

    public void saveData() {
        writeFile.writeFile(info);
    }

    public boolean saveGeneralData(String name, String phone) {
        boolean flag = duplicationPhone(phone);
        if (!flag) {
            return false;
        }
        info.add(new PhoneInfo(name, phone));
        return true;
    }

    public boolean saveUnivData(String name, String phone, String major, int year) {
        boolean flag = duplicationPhone(phone);
        if (!flag) {
            return false;
        }
        info.add(new PhoneUnivInfo(name, phone, major, year));
        return true;
    }

    public boolean saveCompanyData(String name, String phone, String company) {
        boolean flag = duplicationPhone(phone);
        if (!flag) {
            return false;
        }
        info.add(new PhoneCompanyInfo(name, phone, company));
        return true;
    }

    public boolean searchData(String phone) {
        for (PhoneInfo p : info) {
            if (p.getPhone().compareTo(phone) == 0) {
                p.showPhoneInfo();
                return true;
            }
        }
        return false;
    }

    public boolean duplicationPhone(String phone) {
        for (PhoneInfo p : info) {
            if (p.getPhone().compareTo(phone) == 0) {
                return false;
            }
        }
        return true;
    }

    public void deleteData(String phone) {
        for (PhoneInfo p : info) {
            if (p.getPhone().compareTo(phone) == 0) {
                info.remove(p);
                return;
            }
        }
    }

    public boolean showAllData() {
        if (info.isEmpty()) {
            return false;
        }
        for (PhoneInfo p : info) {
            p.showPhoneInfo();
        }
        return true;
    }

    public void endProgram() {
        saveData();
        System.exit(0);
    }
}
