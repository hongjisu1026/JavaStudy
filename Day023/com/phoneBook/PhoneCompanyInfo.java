package com.phoneBook;

public class PhoneCompanyInfo extends PhoneInfo{
    private String company;

    public PhoneCompanyInfo(String name, String phone, String company) {
        super(name, phone);
        this.company = company;
    }

    @Override
    public void showPhoneInfo() {
        super.showPhoneInfo();
        System.out.println("회사 : " + company);
    }
}
