public class Account {
  double accountBalance;
  String accounHolder;
  int branch;
  int checkDigit;

  public void deposit (double value) {
    this.accountBalance += value;
  }

  public boolean withdraw (double value) {
    if (this.accountBalance >= value) {
      this.accountBalance  -= value;
      
      return true;
    } else {
      return false;
    }
  }
}
