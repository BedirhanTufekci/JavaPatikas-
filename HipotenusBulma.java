import java.util.Scanner;
public class HipotenusBulma {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner input = new Scanner(System.in);

        System.out.println("1.kenarı giriniz");
        a = input.nextInt();
        System.out.println("2.kenarı giriniz");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("hipotenüs değeri :"+c);

    


        
        
    }
    
}
