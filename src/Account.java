public class Account {
  private double accountBalance;
  private Client accountHolder;
  private int branch;
  private int checkDigit;
  private static int clientsTotal;

  public Account (Client client, int branch, int checkDigit, double accountBalance) {
    clientsTotal++;
    this.accountHolder = client;
    this.branch = branch;
    this.checkDigit = checkDigit;
    this.accountBalance = accountBalance;
  }

  public Account (Client client, int branch, int checkDigit) {
    this(client, branch, checkDigit, 500);
  }
  
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

  public static int getClientsTotal() {
    return clientsTotal;
  }

  // setters
  public void setaccountHolder(Client accountHolder) {
    this.accountHolder = accountHolder;
  }
}
