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
            if (saldo >= transferAmount){
                saldo -= transferAmount;
                System.out.println("Pomyślnie przelano " + transferAmount + "zł. Masz teraz " + saldo + "zł na koncie");
            }
        }else if (option == 2) {
            if (savings >= transferAmount){
                savings -= transferAmount;
                System.out.println("Pomyślnie przelano " + transferAmount + "zł. Masz teraz " + savings + "zł na koncie oszczędnościowym");
            }
        }else {
            System.out.println("Masz za mało środków na koncie");
            double missing = transferAmount - saldo;
            System.out.println("Brakuje ci: " + missing);
        }
    }

    // TRANSFER INSIDE ACCOUNT
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
}
