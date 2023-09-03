package be.intecbrussel.repository;

import be.intecbrussel.model.Account;
import be.intecbrussel.model.User;

import java.util.List;

public interface IUserRepository {
    public boolean createUser(User user);
    public User readUser(Account account);
    public void updateUser(User user);
    public void deleteUser(User user);
    public void createManyUsers(List<User> userList);

}
