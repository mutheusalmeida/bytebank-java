package br.com.bytebank.bank.model;

public class Connection implements AutoCloseable {
    public Connection() {
        System.out.println("Opening connection...");
    }

    public void getData() {
        System.out.println("Getting data...");
        throw new RuntimeException("Error getting data");
    }

    @Override
    public void close() {
        System.out.println("Connection closed");
    }
}
