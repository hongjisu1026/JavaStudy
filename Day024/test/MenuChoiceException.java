public class MenuChoiceException extends Exception{

    public MenuChoiceException() {
        super("잘못된 메뉴 선택");
    }

    public void showWrongChoice(int menu) {
        System.out.println(menu + "에 해당하는 선택은 존재하지 않습니다.");
        System.out.println("메뉴 선택을 처음부터 다시 진행합니다.");
    }

    public void showWrongDeleteMenuChoice(String deleteMenu) {
        System.out.println("\"" + deleteMenu + "\"" + "에 해당하는 선택은 존재하지 않습니다.");
        System.out.println("메뉴 선택을 처음부터 다시 진행합니다.");
    }
}
