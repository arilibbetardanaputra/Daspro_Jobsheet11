import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.println("Tebak angka (1-10) : ");
                int answer = input.nextInt();
                input.nextLine();

                if (answer == number) {
                    System.out.println("Jawaban benar!");
                    success = true;
                } else {
                    System.out.println("Jawaban salah. Coba lagi.");
                }
            } while (!success);

            System.out.println("Apakah Anda ingin mengulang permainan (Y/y)?");
            menu = input.next().charAt(0);
            input.nextLine();
        } while (menu == 'y' || menu == 'Y');
    }
}