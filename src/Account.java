public abstract class Account {
  protected double accountBalance;
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
  
  public abstract boolean deposit (double value);
  
  public boolean withdraw (double value) throws InsufficientBalanceException {
    if (this.accountBalance >= value) {
      this.accountBalance  -= value;
      
      return true;
    }

    throw new InsufficientBalanceException("You do not have sufficient funds");
  }

  public boolean transfer (double value, Account designatedAccount) throws InsufficientBalanceException {
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
  
  public Client getAccountHolder() {
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
  public void setAccountHolder(Client accountHolder) {
    this.accountHolder = accountHolder;
  }
}
