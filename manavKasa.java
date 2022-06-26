import java.util.Scanner;
public class manavKasa {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, Domates = 1.11, Muz = 0.95, Patlıcan =5.00,a,e,d,m,p;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kaç kilo Armut : ");
        a = inp.nextDouble();

        System.out.println("Kaç kilo elma : ");
        e = inp.nextDouble();

        System.out.println("Kaç kilo domates : ");
        d = inp.nextDouble();

        System.out.println("Kaç kilo muz : ");
        m = inp.nextDouble();

        System.out.println("Kaç kilo patlıcan : ");
        p = inp.nextDouble();
        double toplam = (a*armut)+(e*elma)+(d*Domates)+(m*Muz)+(p*Patlıcan);

        System.out.println("Toplam Tutar : "+toplam);
    }
    
}
