import java.util.Scanner;
public class HiitungBil
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu Pilihan");
        System.out.println("1. Fibonacci");
        System.out.println("2. Faktorial");
        System.out.print("Masukkan pilihan anda = ");
        int pilihan = input.nextInt();

        switch (pilihan)
        {
            case 1:
                System.out.print("Masukkan jumlah deret : ");
                int jumlahDeret = input.nextInt();
                for (int i = 1; i <= jumlahDeret; i++) {
                    System.out.print(fib(i) + " ");
                }
                break;
            case 2:
                System.out.print("Masukkan Faktorial: ");
                int angka = input.nextInt();
                System.out.println( + faktorial(angka));
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }

    public static int fib(int n) {
        return n < 2 ? n : fib(n - 1) + fib(n - 2);
    }

    public static int faktorial(int n) {
        return n <= 1 ? 1 : n * faktorial(n - 1);
    }
}