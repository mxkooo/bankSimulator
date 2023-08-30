import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        setSaldo(120);
        hello();
    }


    static double saldo = 0;
    static Scanner scanner = new Scanner(System.in);
    static List<Integer> realPin = new ArrayList<>();
    public static void addBalance() {
        System.out.println("Wpisz kwotę, jaką chcesz doładować konto");
        double incomeAmount = scanner.nextDouble();
        saldo += incomeAmount;
        System.out.println("Twoje saldo wynosi teraz: " + saldo);
    }
    public static void transferBalance() {
        System.out.println("Wpisz kwotę, jaką chcesz przelać");
        double transferAmount = scanner.nextDouble();
        if (saldo >= transferAmount){
            saldo -= transferAmount;
            System.out.println("Pomyślnie przelano " + transferAmount + "zł. Masz teraz " + saldo + "zł na koncie");
        }else {
            System.out.println("Masz za mało środków na koncie");
            double missing = transferAmount - saldo;
            System.out.println("Brakuje ci: " + missing);
        }
    }
    public static void generateBlik(){
        Random random = new Random();
        int randomNumber = random.nextInt(900000)  + 100000;
        System.out.println("Twój numer BLIK to: " + randomNumber);
    }
    public static void takeCredit() {
        System.out.println("Wpisz kwotę kredytu jaką chcesz zaciągnąć (maks. " + 5 * saldo + ").");
        double creditAmount = scanner.nextDouble();
        if (creditAmount <= (5 * saldo)) {
            saldo += creditAmount;
            System.out.println("Pomyślnie zaciągnięto kredyt. Twój stan konta to teraz: " + saldo);
        }
//        else if (saldo == 0){
//            System.out.println("Masz zbyt małą zdolność kredytową");
//        }
        else {
            System.out.println("Masz zbyt małą zdolność kredytową");
        }
    }
    public static void hello() {
        System.out.println("Podaj swoję imię: ");
        String userName = scanner.nextLine();
        System.out.println("Witaj " + userName + ". Ustal swój numer PIN");
        int PIN = scanner.nextInt();
        realPin.add(PIN);
        System.out.println("Podaj numer pin do sprawdzenia: ");
        int pinToCheck = scanner.nextInt();
        if (PIN  == pinToCheck) {
            System.out.println("Zostałeś prawidłowo zalogowany");
            System.out.println("---------------");
            System.out.println("Twój numer PIN to: " + PIN);
            System.out.println("---------------");
            if (saldo > 0 ){
                System.out.println("Twoje saldo wynosi: " + saldo);
                System.out.println("---------------");
            }
            System.out.println("Wybierz operację jaką chcesz wykonać: ");
            System.out.println("1, aby doładować konto,");
            System.out.println("2, aby obciążyć konto,");
            System.out.println("3, aby wygenerować numer BLIK.");
            System.out.println("4, aby zaciągnać kredyt.");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    addBalance();
                    break;
                case 2:
                    transferBalance();
                    break;
                case 3:
                    generateBlik();
                    break;
                case 4:
                    takeCredit();
            }
        } else {
            System.out.println("Błędny numer pin");
        }
    }

    public static double getSaldo() {
        return saldo;
    }

    public static void setSaldo(double saldo) {
        Main.saldo = saldo;
    }
}