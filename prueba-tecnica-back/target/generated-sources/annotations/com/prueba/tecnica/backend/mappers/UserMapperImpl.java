package com.prueba.tecnica.backend.mappers;

import com.prueba.tecnica.backend.dtos.CreateUserDTO;
import com.prueba.tecnica.backend.dtos.CreateUserDTO.CreateUserDTOBuilder;
import com.prueba.tecnica.backend.dtos.LoginDTO;
import com.prueba.tecnica.backend.dtos.UpdateUserDTO;
import com.prueba.tecnica.backend.dtos.UserDTO;
import com.prueba.tecnica.backend.entities.User;
import java.util.Objects;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-19T16:51:57-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO map(User source) {
        if ( source == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setNombre( source.getNombre() );
        userDTO.setApellido( source.getApellido() );
        userDTO.setCorreo( source.getCorreo() );
        userDTO.setContrasena( source.getContrasena() );

        return userDTO;
    }

    @Override
    public User map(UserDTO source) {
        if ( source == null ) {
            return null;
        }

        User user = new User();

        user.setCorreo( source.getCorreo() );
        user.setContrasena( source.getContrasena() );
        user.setNombre( source.getNombre() );
        user.setApellido( source.getApellido() );

        return user;
    }

    @Override
    public CreateUserDTO mapCreate(User source) {
        if ( source == null ) {
            return null;
        }

        CreateUserDTOBuilder createUserDTO = CreateUserDTO.builder();

        if ( source.getIdUser() != null ) {
            createUserDTO.idUser( source.getIdUser() );
        }
        createUserDTO.nombre( source.getNombre() );
        createUserDTO.apellido( source.getApellido() );
        createUserDTO.correo( source.getCorreo() );
        createUserDTO.contrasena( source.getContrasena() );

        return createUserDTO.build();
    }

    @Override
    public User mapCreate(CreateUserDTO source) {
        if ( source == null ) {
            return null;
        }

        User user = new User();

        user.setIdUser( source.getIdUser() );
        user.setApellido( source.getApellido() );
        user.setNombre( source.getNombre() );
        user.setCorreo( source.getCorreo() );
        user.setContrasena( source.getContrasena() );

        return user;
    }

    @Override
    public UpdateUserDTO mapUpdate(User source) {
        if ( source == null ) {
            return null;
        }

        UpdateUserDTO updateUserDTO = new UpdateUserDTO();

        updateUserDTO.setNombre( source.getNombre() );
        updateUserDTO.setApellido( source.getApellido() );
        updateUserDTO.setCorreo( source.getCorreo() );
        updateUserDTO.setContrasena( source.getContrasena() );

        return updateUserDTO;
    }

    @Override
    public User mapUpdate(UpdateUserDTO source) {
        if ( source == null ) {
            return null;
        }

        User user = new User();

        user.setApellido( source.getApellido() );
        user.setNombre( source.getNombre() );
        user.setCorreo( source.getCorreo() );
        user.setContrasena( source.getContrasena() );

        return user;
    }

    @Override
    public LoginDTO mapLogin(User source) {
        if ( source == null ) {
            return null;
        }

        LoginDTO loginDTO = new LoginDTO();

        loginDTO.setCorreo( source.getCorreo() );
        loginDTO.setContrasena( source.getContrasena() );

        return loginDTO;
    }

    @Override
    public User mapLogin(LoginDTO source) {
        if ( source == null ) {
            return null;
        }

        User user = new User();

        user.setCorreo( source.getCorreo() );
        user.setContrasena( source.getContrasena() );

        return user;
    }
}
