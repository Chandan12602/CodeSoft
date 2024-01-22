import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the  base currency: ");
        String baseCurrency = scanner.nextLine();
        System.out.print("Enter the target currency: ");
        String targetCurrency = scanner.nextLine();

        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);

        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        double convertedAmount = convertCurrency(amount, exchangeRate);

        System.out.println("Converted amount: " + convertedAmount + " " + targetCurrency);
    }

    private static double getExchangeRate(String baseCurrency, String targetCurrency) {

        return 1.5;
}

    private static double convertCurrency(double amount, double exchangeRate) {
        return amount * exchangeRate;
    }
}