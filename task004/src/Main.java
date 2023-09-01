import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        isValidateInput(inputLine);
    }

    public static void isValidateInput(String line) {
        if(line.equalsIgnoreCase("")){
            throw new RuntimeException("Пустые строки вводить нельзя");
        }
    }
}