package org.example.pp311.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.example.pp311.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImp implements  UserDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public void add(User user) {
        entityManager.persist( user );
    }

    @Override
    public void delete(int id) {
        User user = entityManager.find(User.class, id);
        if (user != null) {
            entityManager.remove( user );
        }
    }

    @Override
    public List<User> getAll() {
        Query query = entityManager.createQuery( "from User" );
        return query.getResultList();
    }

    @Override
    public User get( int id ) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void uptdate(User user) {
        System.out.println( user.getName() );
        entityManager.merge( user );
    }
}
