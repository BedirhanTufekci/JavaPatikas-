import java.util.Scanner;

public class notOrtalamasi {
    public static void main(String[] args) {
        // değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        //scanner sınıfı tanımlandı
        Scanner inp = new Scanner(System.in);

        //kullanıcı degerlerini al
        System.out.println("Matematik notuzu girin");
        mat = inp.nextInt();

        System.out.println("fizik notuzu girin");
        fizik = inp.nextInt();

        System.out.println("kimya notuzu girin");
        kimya = inp.nextInt();

        System.out.println("turkce notuzu girin");
        turkce = inp.nextInt();

        System.out.println("tarih notuzu girin");
        tarih = inp.nextInt();

        System.out.println("muzik notuzu girin");
        muzik = inp.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam /6;

        System.out.println("Ortalamanız : " + sonuc);
        boolean sınıfGecildiMi = sonuc>=60;
        String str = sınıfGecildiMi ? "sınıfı gecti " : "sınıfta kaldı";
        System.out.println(str);
        

 
     
       

    }
}
