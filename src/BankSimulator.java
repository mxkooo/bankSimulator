import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BankSimulator {

    private final AddSavings addSavings;
    private final AddBalance addBalance;
    private final GenerateBlik generateBlik;
    private final TakeCredit takeCredit;
    private final TransferBalance transferBalance;
    public BankSimulator(
            AddSavings addSavings,
            AddBalance addBalance,
            GenerateBlik generateBlik,
            TakeCredit takeCredit,
            TransferBalance transferBalance) {
        this.addSavings = addSavings;
        this.addBalance = addBalance;
        this.generateBlik = generateBlik;
        this.takeCredit = takeCredit;
        this.transferBalance = transferBalance;
    }

//    public BankSimulator(){
//        setSaldo(100);
//        setSavings(100);
//        hello();
//    }
    public static double saldo = 0;
    static double savings = 0;
    static Scanner scanner = new Scanner(System.in);
    public static void hello() {
        System.out.println("Podaj swoję imię: ");
        String userName = scanner.nextLine();
        System.out.println("Witaj " + userName + ". Ustal swój numer PIN");
        int PIN = scanner.nextInt();
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
                    AddBalance.addBalance();
                    break;
                case 2:
                    TransferBalance.transferBalance();
                    break;
                case 3:
                    GenerateBlik.generateBlik();
                    break;
                case 4:
                    TakeCredit.takeCredit();
                    break;
                case 5:
                    AddSavings.addSavings();
                    break;
                case 6:
                    TransferBalance.savingsToMain();
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
