package br.com.bytebank.bank.model;

public abstract class Employee {
    private String name;
    private int id;
    private double compensation;

    public Employee(String name, int id, double compensation) {
        this.name = name;
        this.id = id;
        this.compensation = compensation;
    }

    // getters
    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public double getCompensation() {
        return this.compensation;
    }

    public abstract double getBonification();
}
