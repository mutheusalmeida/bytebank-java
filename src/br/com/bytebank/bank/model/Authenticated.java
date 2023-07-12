package br.com.bytebank.bank.model;

public interface Authenticated {
  void setPassword(String password);

  String authenticate(String password);
}
