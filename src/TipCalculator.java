import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        //Total bill
        System.out.print("Bill: ");
        double bill = scan.nextDouble();

        //Tip Percentage
        System.out.print("Tip percentage: ");
        int tipPercent = scan.nextInt();

        //Number of people in the party
        System.out.print("Number of people: ");
        int numOfPeople = scan.nextInt();

        //The total tip amount
        double totalTip = bill * (tipPercent / 100.0);
        String rtotalTip = df.format(totalTip);
        double reTotalTip = Double.parseDouble(rtotalTip);
        System.out.println("Total Tip: " + rtotalTip);

        //The total bill including tip
        double totalBillTip = reTotalTip + bill;
        String rtotalBillTip = df.format(totalBillTip);
        double retotalBillTip = Double.parseDouble(rtotalBillTip);
        System.out.println("Total bill including tip: " + rtotalBillTip);

        //The tip per person
        double tipPerPerson = reTotalTip / numOfPeople;
        System.out.println("Tip per person: " + df.format(tipPerPerson));

        //The total per person
        double totalPerPerson = retotalBillTip / numOfPeople;
        System.out.println("Total per person: " + df.format(totalPerPerson));
    }
}