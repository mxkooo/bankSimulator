import java.util.Scanner;
public class TransferBalance {
    static Scanner scanner = new Scanner(System.in);

    // TRANSFER OUTSIDE ACCOUNT
    public static void transferBalance() {
        System.out.println("Wpisz 1, aby przelać z konta głównego lub 2 z oszczędnościowego");
        int option = scanner.nextInt();
        System.out.println("Wpisz kwotę, jaką chcesz przelać");
        double transferAmount = scanner.nextDouble();
        if (option == 1){
            if (BankSimulator.getSaldo() >= transferAmount){
                BankSimulator.setSaldo(BankSimulator.getSaldo() - transferAmount);
                System.out.println("Pomyślnie przelano " + transferAmount + "zł. Masz teraz " + BankSimulator.saldo + "zł na koncie");
            }
        }else if (option == 2) {
            if (BankSimulator.getSavings() >= transferAmount){
                BankSimulator.setSavings(BankSimulator.getSavings() - transferAmount);
                System.out.println("Pomyślnie przelano " + transferAmount + "zł. Masz teraz " + BankSimulator.savings + "zł na koncie oszczędnościowym");
            }
        }else {
            System.out.println("Masz za mało środków na koncie");
            double missing = transferAmount - BankSimulator.saldo;
            System.out.println("Brakuje ci: " + missing);
        }
    }

    // TRANSFER INSIDE ACCOUNT
    public static void savingsToMain() {
        System.out.println("Wpisz kwotę, jaką chcesz przelać na główne konto");
        double toMainAmonut = scanner.nextDouble();
        if ( 0 < toMainAmonut){
            BankSimulator.setSavings(BankSimulator.getSavings() - toMainAmonut);
            BankSimulator.setSaldo(BankSimulator.getSaldo() + toMainAmonut);
            System.out.println("Pomyślnie przelano " + toMainAmonut + "zł. Masz teraz " + BankSimulator.savings + "zł na koncie oszczędnośćiowym");
            System.out.println("Stan konta wynosi teraz: " + BankSimulator.saldo + "zł");
        }else {
            System.out.println("Masz za mało środków na koncie");
            double missing = toMainAmonut - BankSimulator.saldo;
            System.out.println("Brakuje ci: " + missing);
        }
    }
}
