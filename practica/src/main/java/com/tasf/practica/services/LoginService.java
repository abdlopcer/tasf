package com.tasf.practica.services;


import com.tasf.practica.models.User;
import com.tasf.practica.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {


    @Autowired
    private IUserRepository userRepository;

    public boolean login(String user, String password) {


      User u =   userRepository.findByUsernameAndPassword(user,password);

      if (u!= null){
          return true;


      }
      return false;



    }

    public boolean register(User user)  throws Exception {

        if (!validateUser(user)) throw new Exception("Favor de llenar todos los campos");
        if (!validatePasswordMatch(user)) throw new Exception("Las contraseñas no coinciden");


        if(userRepository.findByUsername(user.getUsername()) != null){
            throw new Exception("usuario ya registrado");

        }
        userRepository.save(user);


        return true;


    }


    private Boolean validatePasswordMatch(User user){
        return user.getPassword().equals(user.getPasswordConfirm());
    }

    private Boolean validateUser(User user){
        if (user.getUsername().trim().equals("")) return false;
        if (user.getPassword().trim().equals("")) return false;
        if (user.getPasswordConfirm().trim().equals("")) return false;

        return true;



    }



}
