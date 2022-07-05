package ir.maktab74;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        global:while (true) {
            try {
                showMainMenu();
                int inputNumber = scanner.nextInt();
                switch (inputNumber) {
                    case 1:
                        firstProgram();
                        break;
                    case 2:
//                        secondProgram();
                        break;
                    case 3:
//                        thirdProgram();
                        break;
                    case 4:
//                        fourthProgram();
                        break;
                    case 5:
                        break global;
                }
            } catch (Exception e) {
                System.out.println("please enter the correct value!!!");
                scanner.next();
            }
        }
    }

    private static void firstProgram() {
        List<String> names = new ArrayList<>(Arrays.asList("Ahmad", "Ali", "Milad", "Yousof", "Mohammad", "Hesam", "Reza"));

        Map<Integer, List<String>> listMap = names.stream().collect(groupingBy(String::length));

        /*listMap.forEach(
                (a,b) -> System.out.println(a + "=" + b)
        );*/

        System.out.println(listMap);
    }

    public static void showMainMenu() {
        System.out.println("1: first program");
        System.out.println("2: second program");
        System.out.println("3: third program");
        System.out.println("4: fourth program");
        System.out.println("5: exit");
        System.out.print("plz choose a number: ");
    }
}
