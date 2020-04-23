/**
 * Created by centricgatewaypraisegod on 4/23/20.
 */
public class compoundInterest {
    public static void main(String[] erema){
        int x = 6;
        int y =9;
        int z = x /y;
        System.out.print(compInterest(500, 10, 2));
    }
    public static double compInterest(double p, double r, int n ) {
        return p * Math.pow(1 + r/100, n);
    }
}
