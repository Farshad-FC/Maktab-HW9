package ir.maktab74;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {
                showMainMenu();
                int inputNumber = scanner.nextInt();
                switch (inputNumber) {
                    case 1:
                        firstProgram();
                        break;
                    case 2:
                        secondProgram();
                        break;
                    case 3:
                        thirdProgram();
                        break;
                    case 4:
                        fourthProgram();
                        break;
                }
            } catch (Exception e) {
                System.out.println("please enter the correct value!!!");
            }
        }
    }

    public static void showMainMenu() {
        System.out.println("1: first program");
        System.out.println("2: second program");
        System.out.println("3: third program");
        System.out.println("4: fourth program");
        System.out.print("plz choose a number: ");
    }
}
