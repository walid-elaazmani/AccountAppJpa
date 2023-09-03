package be.intecbrussel.service;

import be.intecbrussel.model.Account;
import be.intecbrussel.repository.AccountRepository;

import java.util.List;
import java.util.Optional;

public class AccountService {
    private AccountRepository accountRepository = new AccountRepository();

    public boolean createAccount(Account account) {

        accountRepository.createAccount(account);

        return accountRepository.readAccount(account.getEmail())!=null;
    }

    public Optional<Account> getAccount(String email) {
        return Optional.ofNullable(accountRepository.readAccount(email));
    }

    public void createManyAccounts(List<Account> accountList) {
//        accountRepository.createManyAccounts(accountList);
    }
}
