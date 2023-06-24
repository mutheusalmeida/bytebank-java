public class Account {
  double accountBalance;
  String accounHolder;
  int branch;
  int checkDigit;

  void deposit (double value) {
    this.accountBalance += value;
  }
}
