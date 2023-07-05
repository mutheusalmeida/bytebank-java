public class CheckingAccount extends Account implements Taxable {
  private TaxCalculator tax;

  public CheckingAccount(Client client, int branch, int checkDigit, double accountBalance) {
    super(client, branch, checkDigit, accountBalance);
    this.tax = new TaxCalculator(accountBalance);
  }

  public boolean withdraw(double value) {
    double newValue = value + (value * 0.015);

    return super.withdraw(newValue);
  }

  public boolean deposit(double value) {
    super.accountBalance += (value - 10);
    
    return true;
  }

  @Override
  public double getTax() {
    return this.tax.getTax();
  }

  @Override
  public void calculateTax() {
    this.tax.calculateTax();
  }
}
