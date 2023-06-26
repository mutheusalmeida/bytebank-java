public class Account {
  double accountBalance;
  Client accounHolder;
  int branch;
  int checkDigit;

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
}
