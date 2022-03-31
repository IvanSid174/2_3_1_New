package web.config.DAO;

import web.config.Model.User;

import java.util.List;

public interface DaoUser {
    List<User> allUsers();
    void add(User user);
    void delete(int id);
    void edit(User user);
    User getById(int id);
}
