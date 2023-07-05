public class App {
    public static void main(String[] args) {
        CheckingAccount client = new CheckingAccount(new Client(), 123, 4, 4000);
        TaxCalculator taxCalculator = new TaxCalculator();

        taxCalculator.registerTaxable(client);

        System.out.println(taxCalculator.getTotalTax());
    }
}
