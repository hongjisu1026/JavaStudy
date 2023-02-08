public class PhoneMain {
    public static void main(String[] args) {
        int choice = 0;

        while (true) {
            try {
                PhoneBookUI.mainMenu();
                choice = PhoneBookUI.sc.nextInt();
                PhoneBookUI.sc.nextLine();
                if (choice < PhoneMenuString.INPUT_PHONEINFO || choice > PhoneMenuString.PROGRAM_QUIT)
                    throw new MenuChoiceException(choice);

                switch (choice) {
                    case PhoneMenuString.INPUT_PHONEINFO:
                        PhoneBookUI.inputMenu();
                        PhoneBookUI.inputMenuChoice();
                        break;
                    case PhoneMenuString.SEARCH_PHONEINFO:
                        PhoneBookUI.searchPhoneInfo();
                        break;
                    case PhoneMenuString.DELETE_PHONEINFO:
                        PhoneBookUI.deletePhoneInfo();
                        break;
                    case PhoneMenuString.SHOW_ALL_PHONEINFO:
                        PhoneBookUI.showAllPhoneInfo();
                        break;
                    case PhoneMenuString.PROGRAM_QUIT:
                        return;

                }
            } catch (MenuChoiceException e) {
                System.out.println(e.getMessage());
                e.showWrongMenu();
            }
        }
    }
}