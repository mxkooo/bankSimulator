import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        setSavings(100);
        setSaldo(120);
        hello();
    }


    static double saldo = 0;
    static double savings = 0;
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
    public static void addSavings() {
        System.out.println("Wpisz kwotę, jaką chcesz przelać na konto oszczędnościowe");
        double savingsAmount = scanner.nextDouble();
        if (saldo >= savingsAmount){
            saldo -= savingsAmount;
            savings += savingsAmount;
            System.out.println("Pomyślnie przelano " + savingsAmount + "zł. Masz teraz " + savings + "zł na koncie oszczędnośćiowym");
            System.out.println("Stan konta wynosi teraz: " + saldo + "zł");
        }else {
            System.out.println("Masz za mało środków na koncie");
            double missing = savingsAmount - saldo;
            System.out.println("Brakuje ci: " + missing);
        }
    }
    public static void savingsToMain() {
        System.out.println("Wpisz kwotę, jaką chcesz przelać na główne konto");
        double toMainAmonut = scanner.nextDouble();
        if ( 0 < toMainAmonut){
            savings -= toMainAmonut;
            saldo += toMainAmonut;
            System.out.println("Pomyślnie przelano " + toMainAmonut + "zł. Masz teraz " + savings + "zł na koncie oszczędnośćiowym");
            System.out.println("Stan konta wynosi teraz: " + saldo + "zł");
        }else {
            System.out.println("Masz za mało środków na koncie");
            double missing = toMainAmonut - saldo;
            System.out.println("Brakuje ci: " + missing);
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
            if (savings > 0 ){
                System.out.println("Twoje oszczędności to: " + savings);
                System.out.println("---------------");
            }
            System.out.println("Wybierz operację jaką chcesz wykonać: ");
            System.out.println("1, aby doładować konto,");
            System.out.println("2, aby obciążyć konto,");
            System.out.println("3, aby wygenerować numer BLIK.");
            System.out.println("4, aby zaciągnać kredyt.");
            System.out.println("5, aby dodać oszczędności.");
            System.out.println("6, aby przelać z oszczędności na konto .");
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
                    break;
                case 5:
                    addSavings();
                    break;
                case 6:
                    savingsToMain();
                    break;
                default:
                    System.out.println("Złe dane");
            }
        } else {
            System.out.println("Błędny numer pin");
        }
    }

    public static double getSaldo() {
        return saldo;
    }

    public static void setSavings(double savings) {
        Main.savings = savings;
    }

    public static void setSaldo(double saldo) {
        Main.saldo = saldo;
    }
}