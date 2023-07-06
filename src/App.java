public class App {
    public static void main(String[] args) {
        CheckingAccount client = new CheckingAccount(new Client(), 123, 4, 4000);
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.registerTaxable(client);
        
        try {
          client.withdraw(5000);
        } catch(InsufficientBalanceException ex) {
          System.err.println(ex.getMessage());
        }

        System.out.println(taxCalculator.getTotalTax());
    }
}
