public class Manager extends Employee {
  private String password;

  public Manager(String name, int id, double compensation, String password) {
    super(name, id, compensation);
    this.password = password;
  }

  public boolean authentication(String password) {
    if (password == this.password) {
      return true;
    } else {
      return false;
    }
  }

  public double getBonification() {
    return super.getCompensation() * 0.8;
  }
}
