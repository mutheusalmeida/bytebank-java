public class Manager extends AuthenticatedEmployee {
  public Manager(String name, int id, double compensation, String password) {
    super(name, id, compensation, password);
  }

  public double getBonification() {
    return super.getCompensation();
  }
}
