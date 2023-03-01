import  java.util.Scanner;
public class ifelseHesapMakinesi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int s1, s2, choose;

        System.out.println("1. Sayıyı Giriniz :");
        s1 = input.nextInt();

        System.out.println("2. Sayıyı Giriniz");
        s2 = input.nextInt();

        System.out.println("İşlem Türünü Seçiniz (1-Toplama 2-Çıkarma 3-Çarpma 4-Bölme): ");
        choose = input.nextInt();

        if (choose == 1) {
            System.out.println("Toplam : " + (s1 + s2));
        } else if (choose == 2) {
            System.out.println("Çıkarma : " + (s1 - s2));
        } else if (choose == 3) {
            if (s2 != 0) {
                System.out.println("Bölme : " + (s1 / s2));
            }
            ;
        } else {
            System.out.println("Sıfıra Bölünme Hatası ");

        }





    }
}










