package be.intecbrussel.model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String fname;
    private String lname;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "account_email")
    private Account account;

    public User(){

    }

    public User (String fname, String lname, Account account) {
        this.fname = fname;
        this.lname = lname;
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public long getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", account=" + account +
                '}';
    }
}
