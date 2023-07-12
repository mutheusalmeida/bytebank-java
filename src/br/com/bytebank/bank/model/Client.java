package br.com.bytebank.bank.model;

public class Client {
    private String name;
    private String id;
    private String profession;

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public String getProfession() {
        return this.profession;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
