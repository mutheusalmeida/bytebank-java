public abstract class AuthenticatedEmployee extends Employee {
  private String password;

  public AuthenticatedEmployee(String name, int id, double compensation, String password) {
    super(name, id, compensation);
    this.password = password;
  }

  public String authentication(String password) {
    if (password == this.password) {
      return "Login successful";
    } else {
      return "Login failed";
    }
  }
}
