package service;

import DAO.DaoUser;
import DAO.DaoUserImpl;
import Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService{
    private  final DaoUser daoUser;
    @Autowired
    public UserServiceImpl(DaoUser daoUser) {
        this.daoUser = daoUser;
    }

    @Override
    public List<User> allUsers() {
        return daoUser.allUsers();
    }

    @Override
    public void add(User user) {
        daoUser.add(user);

    }

    @Override
    public void delete(User user) {
        daoUser.delete(user);

    }

    @Override
    public void edit(User user) {
        daoUser.edit(user);

    }

    @Override
    public User getById(int id) {
        return daoUser.getById(id);
    }
}
