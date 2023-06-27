public class Account {
  private double accountBalance;
  private Client accounHolder;
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
  
  public Client getAccounHolder() {
    return this.accounHolder;
  }

  public int getBranch() {
    return this.branch;
  }

  public int getCheckDigit() {
    return this.checkDigit;
  }

  // setters
  public void setAccounHolder(Client accounHolder) {
    this.accounHolder = accounHolder;
  }
}
