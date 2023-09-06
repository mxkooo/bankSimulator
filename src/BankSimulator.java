import java.util.Scanner;

public class BankSimulator {

    public BankSimulator(){
        BankSimulator.setSaldo(100);
        BankSimulator.setSavings(100);
        loggingIn();
    }
    public static double saldo = 0;
    static double savings = 0;
    static Scanner scanner = new Scanner(System.in);
    public static void loggingIn() {
        System.out.println("Podaj swoję imię: ");
        String userName = scanner.nextLine();
        System.out.println("Witaj " + userName + ". Ustal swój numer PIN");
        int PIN = scanner.nextInt();
        System.out.println("Podaj numer pin do sprawdzenia: ");
        int pinToCheck = scanner.nextInt();
        if (PIN  == pinToCheck) {
            PrintMessage.printMessage();
        } else {
            System.out.println("Błędny numer pin");
        }
    }

    public static double getSaldo() {
        return saldo;
    }

    public static double getSavings() {
        return savings;
    }

    public static void setSavings(double savings) {
        BankSimulator.savings = savings;
    }

    public static void setSaldo(double saldo) {
        BankSimulator.saldo = saldo;
    }
}
