package classes;
import interfaces.Authenticated;

public class Manager extends Employee implements Authenticated {
  private Authenticator authenticator;

  public Manager(String name, int id, double compensation, String password) {
    super(name, id, compensation);
    this.authenticator = new Authenticator(password);
  }

  // setters 
  @Override
  public void setPassword(String password) {
    this.authenticator.setPassword((password));
  }

  //getters
  public double getBonification() {
    return super.getCompensation();
  }

  @Override
  public String authenticate(String password) {
    return this.authenticator.authenticate(password);
  }
}
