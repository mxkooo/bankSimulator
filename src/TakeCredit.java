import java.util.Scanner;

public class TakeCredit {
    static Scanner scanner = new Scanner(System.in);
    public static void takeCredit() {
    System.out.println("Wpisz kwotę kredytu jaką chcesz zaciągnąć (maks. " + (5 * BankSimulator.saldo) + ").");
    double creditAmount = scanner.nextDouble();
    if (creditAmount < (5 * BankSimulator.saldo)) {
        BankSimulator.saldo += creditAmount;
        System.out.println("Pomyślnie zaciągnięto kredyt. Twój stan konta to teraz: " + BankSimulator.saldo);
    }
//        else if (saldo == 0){
//            System.out.println("Masz zbyt małą zdolność kredytową");
//        }
    else {
        System.out.println("Masz zbyt małą zdolność kredytową");
    }
}
}
