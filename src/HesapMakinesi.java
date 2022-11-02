import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int a,b,islem;

        Scanner input = new Scanner(System.in);
        System.out.println("Sayi1 giriniz :");
        a = input.nextInt();
        System.out.println("Sayi2 giriniz :");
        b = input.nextInt();
        System.out.println("Islem giriniz :");
        islem = input.nextInt();

        switch (islem) {
            case 1 :
                System.out.println("Toplam :" + (a+b));
                break;
            case 2 :
                System.out.println("Çıkarma :" + (a-b));
                break;
            case 3 :
                System.out.println("Çarpma :" + (a*b));
                break;
            case 4 :
                System.out.println("Bölme :" + (a/b));
                break;
            default:
                System.out.println("Yanlis girdiniz");
        }
    }
}
