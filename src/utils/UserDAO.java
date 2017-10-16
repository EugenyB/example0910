package utils;

import tables.UserInfo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class UserDAO {
    @PersistenceContext
    EntityManager em;

    public List<UserInfo> findAll() {
        return em.createNamedQuery("UserInfo.FindAll").getResultList();
    }

    public void add(UserInfo userInfo) {
        em.persist(userInfo);
    }

    public void delete(int id) {
        UserInfo userInfo = em.find(UserInfo.class, id);
        em.remove(userInfo);
    }
}
