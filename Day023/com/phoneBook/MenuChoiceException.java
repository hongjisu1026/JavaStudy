package com.phoneBook;

public class MenuChoiceException extends Exception {
    // int menu;
    public MenuChoiceException(int menu) {
        super(menu + "에 해당하는 선택은 존재하지 않습니다. \n메뉴 선택을 처음부터 다시 진행합니다.");
        // this.menu = menu;
    }
/*
    public void showWrongNumber (int number) {
        System.out.println(menu + "에 해당하는 선택은 존재하지 않습니다.");
        System.out.println("메뉴 선택을 처음부터 다시 진행합니다.");
    }
*/

}
