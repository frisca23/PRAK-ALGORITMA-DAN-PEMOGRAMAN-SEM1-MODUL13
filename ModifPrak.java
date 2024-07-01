import java.util.Random;
import java.util.Scanner;
public class ModifPrak{
public static void main (String[]args)
{
   String prinsip; int i=1, pil, acak;
   Scanner masuk=new Scanner(System.in);
   Random rd=new Random();
   System.out.println(" M e n u");
   System.out.println("1. Bilangan Random");
   System.out.println("2. Semboyan Hidup");
   System.out.print("Masukan pilihan anda = ");
   pil=masuk.nextInt();
      if (pil == 1){
        System.out.println(" angka keberuntunganmu adalah =");
   while(i<=3){
      acak = rd.nextInt(20);
      System.out.println(acak); i++;
      }
   }
   else {
         System.out.print("Masukan prinsip hidup anda = ");
         prinsip=masuk.next();
         System.out.println("Prinsipmu adalah : "+prinsip);
         }
   }
}