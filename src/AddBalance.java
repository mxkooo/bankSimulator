import java.util.Scanner;

public class AddBalance {
    static Scanner scanner = new Scanner(System.in);
    public static void addBalance() {
        System.out.println("Wpisz kwotę, jaką chcesz doładować konto");
        double incomeAmount = scanner.nextDouble();
        BankSimulator.saldo += incomeAmount;
        System.out.println("Twoje saldo wynosi teraz: " + BankSimulator.saldo);
    }
}
