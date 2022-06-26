import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class KDVhesaplama {
    public static void main(String[] args) {
        double tutar,kdvOran=0.18;
        Scanner input = new Scanner(System.in);

    System.out.println("tutarı giriniz : ");
    tutar=input.nextDouble();

    double kdvTutar = tutar*kdvOran;
    double kvdliTutar = tutar + kdvTutar;
    
    System.out.println("KDV'siz Tutar :"+tutar);
    System.out.println("KDV oranı : "+kdvOran);
    System.out.println("Kdv tutarı : "+kdvTutar);
    System.out.println("KDV'li tutar :"+kvdliTutar);

    


        
    }
    
    
}
