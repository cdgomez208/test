package com.prueba.tecnica.backend.mappers;

import java.util.Objects;
import com.prueba.tecnica.backend.dtos.CreateUserDTO;
import com.prueba.tecnica.backend.dtos.LoginDTO;
import com.prueba.tecnica.backend.dtos.UserDTO;
import com.prueba.tecnica.backend.entities.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.prueba.tecnica.backend.dtos.UpdateUserDTO;

@Mapper( imports = Objects.class )
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO map(User source);
    @InheritInverseConfiguration(name = "map")
    @Mapping(source= "correo", target= "correo")
    @Mapping(source= "contrasena", target= "contrasena")
    @Mapping(source= "nombre", target= "nombre")
    @Mapping(source= "apellido", target= "apellido")
    User map(UserDTO source);


    CreateUserDTO mapCreate(User source);
    @InheritInverseConfiguration(name = "mapCreate")
    @Mapping(source= "idUser", target= "idUser")
    @Mapping(source= "apellido", target= "apellido")
    @Mapping(source= "nombre", target= "nombre")
    @Mapping(source= "correo", target= "correo")
    @Mapping(source= "contrasena", target= "contrasena")
    User mapCreate(CreateUserDTO source);


    UpdateUserDTO mapUpdate(User source);
    @InheritInverseConfiguration(name = "mapUpdate")
    @Mapping(source= "apellido", target= "apellido")
    @Mapping(source= "nombre", target= "nombre")
    @Mapping(source= "correo", target= "correo")
    @Mapping(source= "contrasena", target= "contrasena")
    User mapUpdate(UpdateUserDTO source);

  LoginDTO mapLogin(User source);
    @InheritInverseConfiguration(name = "mapLogin")
    @Mapping(source= "correo", target= "correo")
    @Mapping(source= "contrasena", target= "contrasena")
    User mapLogin(LoginDTO source);


}