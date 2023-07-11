package br.com.bytebank.bank.classes;

public class BonificationManagement {
  private double total;

  // getters
  public double getTotal() {
    return this.total;
  }

  // setters 
  public void registerEmployee(Employee employee) {
    this.total += employee.getBonification();
  }
}
