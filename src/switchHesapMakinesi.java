import  java.util.Scanner;
public class switchHesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Sayıyı Giriniz : ");
        double sayi1 = input.nextDouble();

        System.out.println("2. Sayıyı Giriniz");
        double sayi2= input.nextDouble();

        System.out.println("Hangi işlemi yapmak istiyorsunuz?");
        int secim= input.nextInt();

        double sonuc = 0;

        switch (secim) {
            case 1:
                sonuc = sayi1 + sayi2;
break;
            case 2:
                sonuc = sayi1 - sayi2;
break;
            case 3:
                sonuc = sayi1 * sayi2;
break;
            case 4:
                sonuc = sayi1 / sayi2;
break;
            default:
                System.out.println("Geçersiz Seçim");
                return;
        }
        System.out.print("Sonuç : " + sonuc);
    }

}
