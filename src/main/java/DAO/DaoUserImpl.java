package DAO;

import Model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class DaoUserImpl implements DaoUser{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @SuppressWarnings("unckecked")
    public List allUsers() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }



    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public void delete(User user) {
        entityManager.remove(user);
    }

    @Override
    public void edit(User user) {
        entityManager.merge(user);
    }

    @Override
    public User getById(int id) {
        return entityManager.find(User.class, id);
    }
}
