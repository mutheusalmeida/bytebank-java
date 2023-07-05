public class TaxCalculator {
  private double tax;
  private double accountBalance;

  public TaxCalculator(double accountBalance) {
    this.accountBalance = accountBalance;
  }

  public double getTax() {
    return this.tax;
  }


  public void calculateTax() {
    this.tax = this.accountBalance * 0.2;
  }
}
