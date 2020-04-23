import java.util.Scanner;

/**
 * Created by centricgatewaypraisegod on 4/23/20.
 */
public class compoundInterest {
    public static void main(String[] erema){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double p= input.nextDouble();
        System.out.print("Enter Rate: ");
        double r= input.nextDouble();
        System.out.print("Enter Time: ");
        double t= input.nextDouble();

        System.out.printf("Compound Interest is %.2f",(compInterest(p, r,t)-p));
        System.out.println();
        System.out.printf("Amount after " + t + " years is %.2f", compInterest(p, r,t));

    }

    public static double compInterest(double p, double r, double n ) {
        return p * Math.pow(1 + r/100, n);
    }
}
