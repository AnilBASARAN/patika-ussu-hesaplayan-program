import java.util.Scanner;
public class UssuHesapla {
    public static void main(String[] args) {
        int numberAlt,numberUst;
        Scanner input = new Scanner(System.in);
// üssü almak artık daha kolay
       //   Math.pow(üst,alt)  yapıp kolaya kaçmıyoruz, for loop dönüyoruz.
        
        System.out.print("Üssü alınacak sayıyı giriniz.   ");
        numberAlt = input.nextInt();

        System.out.print("Üssü sayısını giriniz.   ");
        numberUst = input.nextInt();
        int total = 1;
        for(int i = 1; i <= numberUst;i++ ){
            total *= numberAlt;
        }

        System.out.println(numberAlt+" üssü " + numberUst+" :  "+total);
    }
}
