import java.util.Scanner;
public class VucutKitleHesaplama {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double kilo,boy,endeks;

    System.out.println("kilonuzu giriniz");
    kilo =input.nextDouble();
    System.out.println("Boyunuzu giriniz");
    boy = input.nextDouble();

    endeks = (kilo)/(boy*boy);
    System.out.println("Vücut kitle endeksiniz : "+ endeks);





    }
    
}
