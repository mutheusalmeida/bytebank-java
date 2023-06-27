public class Account {
  private double accountBalance;
  private Client accountHolder;
  private int branch;
  private int checkDigit;

  
  public boolean deposit (double value) {
    this.accountBalance += value;
    
    return true;
  }
  
  public boolean withdraw (double value) {
    if (this.accountBalance >= value) {
      this.accountBalance  -= value;
      
      return true;
    }

    return false;
  }

  public boolean transfer (double value, Account designatedAccount) {
    if (this.withdraw(value)) {
      designatedAccount.deposit(value);

      return true;
    }

    return false;
  }

  // getters
  public double getAccountBalance () {
    return this.accountBalance;
  }
  
  public Client getaccountHolder() {
    return this.accountHolder;
  }

  public int getBranch() {
    return this.branch;
  }

  public int getCheckDigit() {
    return this.checkDigit;
  }

  // setters
  public void setaccountHolder(Client accountHolder) {
    this.accountHolder = accountHolder;
  }
}
