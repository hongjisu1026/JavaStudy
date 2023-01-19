package test;

import java.util.Scanner;

public class PhoneMain {
    public static void main(String[] args) {
        Scanner sc = PhoneBookUI.sc;
        final int SAVE_DATA = 1;
        final int FIND_DATA = 2;
        final int DELETE_DATA = 3;
        final int PRINT_ALL_DATA = 4;
        final int END_PROGRAM = 5;

        while (true) {
            PhoneBookUI.choiceNumber();
            int choice = sc.nextInt();
            sc.nextLine(); //버퍼에 남은 엔터값 지우기
            System.out.println();
            switch (choice) {
                case SAVE_DATA:
                    PhoneBookUI.saveDataUI();
                    break;
                case FIND_DATA:
                    PhoneBookUI.findDataUI();
                    break;
                case DELETE_DATA:
                    PhoneBookUI.deleteDataUI();
                    break;
                case PRINT_ALL_DATA:
                    PhoneBookUI.printAllDataUI();
                    break;
                case END_PROGRAM:
                    PhoneBookUI.endProgram();
                    return;
                default:
                    PhoneBookUI.wrongNumber();
            }
        }
    }
}