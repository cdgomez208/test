package com.prueba.tecnica.backend.repositories;


import com.prueba.tecnica.backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {


    @Query(value = "select * from usuarios " +
            "where ID_USUARIO= :ID_USUARIO", nativeQuery = true)
    User userById(
            @Param("ID_USUARIO") Integer ID_USUARIO

    );

    @Query(value = "delete from usuarios " +
            "where ID_USUARIO= :ID_USUARIO", nativeQuery = true)
    User deleteUserById(
            @Param("ID_USUARIO") Integer ID_USUARIO

    );

    User findByCorreoAndContrasena(String correo,String contrasena) throws Exception;

}
