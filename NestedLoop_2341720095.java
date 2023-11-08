import java.util.Scanner;

public class NestedLoop_2341720095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double array[][] = new double[5][7];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("Masukkan suhu untuk Hari ke-" + (j + 1) + " : ");
                array[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Kota ke-" + (i + 1) + ": ");
            for (double suhu : array[i]) {
                System.out.print(suhu + " ");
            }
            System.out.println();
            
        }
    }
}