package com.tasf.practica.repositories;


import com.tasf.practica.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {

public User findByUsernameAndPassword(String username, String password);
    public User findByUsername(String username);

}
