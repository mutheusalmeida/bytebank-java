public interface Authenticated {
  void setPassword(String password);

  String authenticate(String password);
}
