package be.intecbrussel.repository;

import be.intecbrussel.model.Account;

public interface IAccountRepository {
    public void createAccount(Account account);
    public Account readAccount(String email);
    public void updateAccount(Account account);
    public void deleteAccount(Account account);
}
