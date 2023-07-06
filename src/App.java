public class App {
    public static void main(String[] args) {
        CheckingAccount client = new CheckingAccount(new Client(), 123, 4, 4000);
        TaxCalculator taxCalculator = new TaxCalculator();
        
        try {
          taxCalculator.registerTaxable(client);
        } catch(ArithmeticException ex) {
          System.err.println(ex.getMessage());
        }

        System.out.println(taxCalculator.getTotalTax());
    }
}
