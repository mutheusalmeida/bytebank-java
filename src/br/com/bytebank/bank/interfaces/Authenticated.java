package br.com.bytebank.bank.interfaces;

public interface Authenticated {
  void setPassword(String password);

  String authenticate(String password);
}
