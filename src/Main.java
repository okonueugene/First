import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte months = 12;
        final byte percent= 100;
        
        Scanner scanner =new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        double interest = scanner.nextDouble();
        System.out.print("Period (Years): ");
        int period = scanner.nextInt();
        int numberOfPayments = period * months;
        double monthlyInterestRate=interest/percent/months;

        double mortgage=principal*((monthlyInterestRate*Math.pow((1+monthlyInterestRate),numberOfPayments))/(Math.pow((1+monthlyInterestRate),numberOfPayments)-1));

        System.out.print("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
