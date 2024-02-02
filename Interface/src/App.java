import java.util.Scanner;

import Interface.Phone;

public class App {
    public static void main(String[] args) throws Exception {

        Phone apple12Pro = new Apple();

        PhoneUser dika = new PhoneUser(apple12Pro);

        dika.turnOnThePhone();

        Scanner inputan = new Scanner(System.in);
        int action;
        boolean isLoop = true;

        do {
            System.out.println("=== Apple Menu ===");
            System.out.println("[1] Power On");
            System.out.println("[2] Power Off");
            System.out.println("[3] Volume Up");
            System.out.println("[4] Volume Down");
            System.out.println("[0] Quit Menu");
            System.out.println("===================");

            System.out.println("Choose Menu :");
            action = inputan.nextInt();

            if (action == 1) {
                dika.turnOnThePhone();
            } else if (action == 2) {
                dika.tunOffThePhone();
            } else if (action == 3) {
                dika.makePhoneLouder();
            } else if (action == 4) {
                dika.makePhoneSilent();
            } else if (action == 0) {
                isLoop = false;
            } else {
                System.out.println("Please... Choose Correct Menu :)");
            }

        } while (isLoop);

        inputan.close();
    }
}
