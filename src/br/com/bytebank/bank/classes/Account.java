package br.com.bytebank.bank.classes;

import br.com.bytebank.bank.exceptions.InsufficientBalanceException;

/**
 * Account abstract class. Should be extended.
 * 
 * @author Matheus Almeida
 * @version 1.0.1
 */
public abstract class Account {
  protected double accountBalance;
  private Client accountHolder;
  private int branch;
  private int checkDigit;
  private static int clientsTotal;

  /**
   * Account constructor expects a instantiated Client, a branch, checkDigit, and accountBalance.
   * 
   * @param client
   * @param branch
   * @param checkDigit
   * @param accountBalance
   */
  public Account (Client client, int branch, int checkDigit, double accountBalance) {
    clientsTotal++;
    this.accountHolder = client;
    this.branch = branch;
    this.checkDigit = checkDigit;
    this.accountBalance = accountBalance;
  }

  /**
   * Account constructor without a required accountBalance.
   * 
   * @param client
   * @param branch
   * @param checkDigit
   */
  public Account (Client client, int branch, int checkDigit) {
    this(client, branch, checkDigit, 500);
  }
  
  public abstract boolean deposit (double value);
  
  public void withdraw (double value) {
    try {
      if (this.accountBalance < value) {
        throw new InsufficientBalanceException("You do not have sufficient funds");
      }
      
      this.accountBalance  -= value;
      System.out.println("Success");
    } catch(InsufficientBalanceException ex) {
      System.out.println(ex.getMessage());
    }
  }

  public void transfer (double value, Account designatedAccount) {
    this.withdraw(value);
    designatedAccount.deposit(value);
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

  /**
   * Set account holder.
   * 
   * @param accountHolder
   */
  public void setAccountHolder(Client accountHolder) {
    this.accountHolder = accountHolder;
  }
}
