package org.example.pp311.services;


import org.example.pp311.models.User;

import java.util.List;

public interface UserService {
    void add( User user );
    void delete( int id );
    List<User> getAll();
    User get( int id );
    void uptdate( User user );
}
