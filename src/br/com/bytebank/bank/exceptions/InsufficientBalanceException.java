package br.com.bytebank.bank.exceptions;


public class InsufficientBalanceException extends Exception {
  public InsufficientBalanceException(String msg) {
    super(msg);
  }
}
