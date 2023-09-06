import java.util.Scanner;

public class PrintMessage {
    static Scanner scanner = new Scanner(System.in);
    public static void printMessage(){
        System.out.println("Zostałeś prawidłowo zalogowany");
        System.out.println("---------------");
        if (BankSimulator.getSaldo() > 0 ){
            System.out.println("Twoje saldo wynosi: " + BankSimulator.getSaldo());
            System.out.println("---------------");
        }
        if (BankSimulator.getSavings() > 0 ){
            System.out.println("Twoje oszczędności to: " + BankSimulator.getSavings());
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
    }
}
