package DAO;

import Model.User;

import java.util.List;

public interface DaoUser {
    List<User> allUsers();
    void add(User user);
    void delete(User user);
    void edit(User user);
    User getById(int id);
}
