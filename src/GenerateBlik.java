import java.util.Random;

public class GenerateBlik {
    public static void generateBlik(){
        Random random = new Random();
        int randomNumber = random.nextInt(900000)  + 100000;
        System.out.println("Twój numer BLIK to: " + randomNumber);
    }
}
