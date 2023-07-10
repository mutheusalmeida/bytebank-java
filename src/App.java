import classes.CheckingAccount;
import classes.Client;
import classes.Connection;
import classes.TaxCalculator;

public class App {
    public static void main(String[] args) {
        CheckingAccount client = new CheckingAccount(new Client(), 123, 4, 4000);
        CheckingAccount client2 = new CheckingAccount(new Client(), 786, 9, 1000);
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.registerTaxable(client);
        
        client.withdraw(3900);
        client.transfer(300, client2);

        System.out.println(taxCalculator.getTotalTax());

        try (Connection connection = new Connection()) {
          connection.getData();
        } catch (IllegalStateException ex) {
          System.out.println(ex);
        }
    }
}
