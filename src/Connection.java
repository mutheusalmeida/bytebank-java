public class Connection {
  public Connection() {
    System.out.println("Opening connection...");
  }

  public void getData() {
    System.out.println("Getting data...");
    throw new RuntimeException("Error");
  }
  
  public void close() {
    System.out.println("Connection closed");
  }
}
