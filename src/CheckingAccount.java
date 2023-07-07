public class CheckingAccount extends Account implements Taxable {
  public CheckingAccount(Client client, int branch, int checkDigit, double accountBalance) {
    super(client, branch, checkDigit, accountBalance);
  }

  public boolean withdraw(double value) {
    double newValue = value + (value * 0.015);

    return super.withdraw(newValue);
  }

  public boolean deposit(double value) {
    super.accountBalance += (value - 10);
    
    return true;
  }

  public double getTax() {
    return super.getAccountBalance() * 0.15;
  }
}
