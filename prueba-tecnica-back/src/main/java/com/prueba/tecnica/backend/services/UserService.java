package com.prueba.tecnica.backend.services;

import java.util.List;

import com.prueba.tecnica.backend.dtos.*;
import com.prueba.tecnica.backend.entities.User;


public interface UserService {


	UserResponse createUser(CreateUserDTO createUserDTO) throws Exception;

	List<UserDTO> getAllUser();

	UserDTO getUserDtoById(int idUser);

	User getUserById(int idUser);

	User deteleUserById(int idUser);

	UserResponse updateUser(UpdateUserDTO userDto, int idUser) throws Exception;

	UserResponse getLogin(String correo ,String contrasena) throws Exception;
}
