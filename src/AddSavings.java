import java.util.Scanner;
public class AddSavings {
    static Scanner scanner = new Scanner(System.in);
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
}
