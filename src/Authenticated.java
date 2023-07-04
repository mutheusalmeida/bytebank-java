public abstract interface Authenticated {
  public abstract void setPassword(String password);

  public abstract String authenticate(String password);
}
