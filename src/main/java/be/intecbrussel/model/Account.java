package be.intecbrussel.model;

import jakarta.persistence.*;

@Entity
public class Account {

    @Id
    private String email;
    private String passw;
    @OneToOne(mappedBy = "account")
    private User user;

    public User getUser() {
        return user;
    }

    public Account() {
    }

    public Account(String email, String passw) {
        this.email = email;
        this.passw = passw;
    }


    public String getEmail() {
        return email;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    @Override
    public String toString() {
        return "Account{" +
                "email='" + email + '\'' +
                ", passw='" + passw + '\'' +
                '}';
    }
}
