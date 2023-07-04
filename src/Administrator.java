public class Administrator extends AuthenticatedEmployee {
  public Administrator(String name, int id, double compensation, String password) {
    super(name, id, compensation, password);
  }

  public double getBonification() {
    return super.getCompensation();
  }
}
