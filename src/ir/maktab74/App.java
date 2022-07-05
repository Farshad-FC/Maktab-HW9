package ir.maktab74;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        global:
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
                    case 5:
                        fifthProgram();
                        break;
                    case 6:
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

        System.out.println(listMap);
    }

    private static void secondProgram() {
        List<String> names = new ArrayList<>(Arrays.asList(
                "Ahmad", "Ali", "Milad", "Yousof", "Mohammad", "Hesam", "Reza", "Amir", "Mehran"
        ));

        Map<Integer, List<String>> listMap = names.stream().collect(groupingBy(String::length));

        listMap.forEach(
                (a, b) -> System.out.println(a + "=" + b + " " + b.size())
        );
    }

    private static void thirdProgram() {
        BiFunction<Float, Float, Float> average = (a, b) -> {
            return (a + b) / 2;
        };

        while (true) {
            try {
                System.out.print("plz enter first number: ");
                float firstNumber = scanner.nextFloat();

                System.out.print("plz enter second number: ");
                float secondNumber = scanner.nextFloat();

                System.out.format("average = " + average.apply(firstNumber, secondNumber));
            } catch (Exception e) {
                System.out.println("please enter the correct value!!!");
                scanner.next();
            }
        }
    }

    private static void fourthProgram() {
        BiFunction<String, String, Boolean> function = (a, b) -> {
            if (a.startsWith(b) && a.endsWith(b))
                return true;
            else
                return false;
        };

        System.out.print("plz enter a string: ");
        String inputString = scanner.next();

        System.out.print("plz enter a character: ");
        String inputChar = scanner.next();

        System.out.println(function.apply(inputString, inputChar));

    }

    private static void fifthProgram() {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(5);
        nums.add(1);
        nums.stream()
                .filter(val -> val > 1)
                .forEach(val -> System.out.println(val));
    }

    public static void showMainMenu() {
        System.out.println("=".repeat(20));
        System.out.println("1: first program");
        System.out.println("2: second program");
        System.out.println("3: third program");
        System.out.println("4: fourth program");
        System.out.println("5: fifth program");
        System.out.println("6: exit");
        System.out.print("plz choose a number: ");
    }
}
