import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How Many Rounds You Want To Play :  ");
        int round = sc.nextInt();

        int sPlayer = 0, sComputer = 0;

        for (int i = 1; i <= round; i++) {
            System.out.println("\nROCK = 0, PAPER = 1, SCISSOR = 2");

            System.out.print("Enter Your Choice :  ");
            int a = sc.nextInt();

            Random r = new Random();
            int b = r.nextInt(3);
            System.out.println("Computer's Choice :  " + b);

            System.out.print("\t\t");

            if (a == b) {
                System.out.println("TIE");
            } else if (a == 0 && b == 1) {
                System.out.println("LOSE");
                sComputer += 1;
            } else if (a == 1 && b == 0) {
                System.out.println("WON");
                sPlayer += 1;
            } else if (a == 1 && b == 2) {
                System.out.println("LOSE");
                sComputer += 1;
            } else if (a == 2 && b == 1) {
                System.out.println("WON");
                sPlayer += 1;
            } else if (a == 2 && b == 0) {
                System.out.println("LOSE");
                sComputer += 1;
            } else if (a == 0 && b == 2) {
                System.out.println("WON");
                sPlayer += 1;
            } else {
                System.out.println("INVALID");
            }
        }
        System.out.println("\n\t: SCOREBOARD :");
        System.out.println("Player = " + sPlayer + "\t Computer = " + sComputer);
        if (sPlayer > sComputer) {
            System.out.println("\tPlayer Won The Match...");
        } else if (sComputer > sPlayer) {
            System.out.println("\tComputer Won The Match...");
        } else {
            System.out.println("\tMATCH TIE");
        }

        sc.close();
    }
}
