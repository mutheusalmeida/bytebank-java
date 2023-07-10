package classes;
import interfaces.Taxable;

public class TaxCalculator {
  private double totalTax;

  public double getTotalTax() {
    return this.totalTax;
  }

  public void registerTaxable(Taxable taxable) {
    double tax = taxable.getTax();

    this.totalTax += tax;
  }
}
