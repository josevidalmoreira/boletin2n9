
package boletin2_9;
import java.util.Scanner;

public class Boletin2_9 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int b100,b20,b5,m1, c;
        System.out.println("teclea cantidad:");
        c=sc.nextInt();
        b100= c/100;
        b20=(c%100)/20;
        b5=((c%100)%20)/5;
        m1=(((c%100)%20)%5)/1;
        System.out.println("tienes en total de "+b100+"  biletes de cien  "+b20+" billetes de veinte "+b5+" billetes de cinco  "+m1+" monedas de 1" );
        
    }
    
}
