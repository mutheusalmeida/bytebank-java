package br.com.bytebank.bank.classes;

public class Authenticator {
  private String password;

  public Authenticator(String password) {
    this.password = password;
  }

  // setters 
  public void setPassword(String password) {
    this.password = password;
  }

  public String authenticate(String password) {
    if (this.password == password) {
      return "Login successful";
    }

    return "Login failed";
  }
}
