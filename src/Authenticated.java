public abstract interface Authenticated {
  public String password = "";

  public abstract void setPassword(String password);

  public abstract String authenticate(String password);
}
