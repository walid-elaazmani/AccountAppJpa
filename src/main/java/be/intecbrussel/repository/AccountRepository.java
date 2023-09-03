package be.intecbrussel.repository;

import be.intecbrussel.config.EMFProvider;
import be.intecbrussel.model.Account;
import jakarta.persistence.EntityManager;

public class AccountRepository implements IAccountRepository{
    @Override
    public void createAccount(Account account) {
        EntityManager em = EMFProvider.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(account);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Account readAccount(String email) {
        EntityManager em = EMFProvider.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        Account dbAccount = em.find(Account.class, email);
        em.getTransaction().commit();
        em.close();

        return dbAccount;
    }

    @Override
    public void updateAccount(Account account) {

    }

    @Override
    public void deleteAccount(Account account) {

    }
}
