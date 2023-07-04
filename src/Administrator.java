public class Administrator extends Employee implements Authenticated {
  private String password;

  public Administrator(String name, int id, double compensation, String password) {
    super(name, id, compensation);
    this.password = password;
  }

  // setters 
  @Override
  public void setPassword(String password) {
    this.password = password;
  }

  //getters
  public double getBonification() {
    return super.getCompensation();
  }

  @Override
  public String authenticate(String password) {
    if (this.password == password) {
      return "Login successful";
    }

    return "Login failed";
  }
}
