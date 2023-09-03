package be.intecbrussel.repository;

import be.intecbrussel.config.EMFProvider;
import be.intecbrussel.model.Account;
import be.intecbrussel.model.User;
import jakarta.persistence.EntityManager;

import java.util.List;

public class UserRepository implements IUserRepository{
    @Override
    public boolean createUser(User user) {
        EntityManager em = EMFProvider.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();

        return true;
    }

    @Override
    public User readUser(Account account) {
        EntityManager em = EMFProvider.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        User user = em.find(User.class, account.getUser().getId());
        em.getTransaction().commit();
        em.close();

        return user;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public void createManyUsers(List<User> userList) {
    }
}
