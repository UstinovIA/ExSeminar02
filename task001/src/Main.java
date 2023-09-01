import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputFloat();
    }

    public static boolean isFloat(String string) {
        try {
            Float.parseFloat(string);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    public static float inputFloat() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Введите дробное число:");
            String inputStr = scanner.nextLine();
            if(isFloat(inputStr)) {
                return Float.parseFloat(inputStr);
            }
            System.out.println("Введено некорректное значение!");
        }
    }
}