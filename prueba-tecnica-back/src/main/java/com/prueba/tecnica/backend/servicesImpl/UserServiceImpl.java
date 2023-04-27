package com.prueba.tecnica.backend.servicesImpl;

import com.prueba.tecnica.backend.dtos.*;
import com.prueba.tecnica.backend.entities.User;
import com.prueba.tecnica.backend.mappers.UserMapper;
import com.prueba.tecnica.backend.repositories.UserRepository;
import com.prueba.tecnica.backend.services.UserService;
import java.util.*;
import java.util.stream.Collectors;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    UserMapper pqrMapper;


    @Override
    public UserResponse createUser(CreateUserDTO createUserDTO) throws Exception {
        User user = pqrMapper.mapCreate(createUserDTO);

       String contrasena= createUserDTO.getContrasena();
        UserResponse userResponse = new UserResponse();
        user = userRepository.save(user);
        userResponse.setUser(pqrMapper.map(user));
        return userResponse;
    }


    @Override
    public List<UserDTO> getAllUser() {
        return userRepository.findAll().stream().map((user) -> mapToDto(user)
        ).collect(Collectors.toList());
    }

    @Override
    public UserDTO getUserDtoById(int idUser) {
        User pqr = getUserById(idUser);
        UserDTO dto = mapToDto(pqr);
        return dto;
    }

    @Override
    public User getUserById(int idUser) {
        return userRepository.userById(idUser);
    }

    @Override
    public User deteleUserById(int idUser) {
        return userRepository.deleteUserById(idUser);
    }

    private UserDTO mapToDto(User user) {
        UserDTO dto = pqrMapper.map(user);
        return dto;

    }

    @Override
    @Transactional
    public UserResponse updateUser(UpdateUserDTO updateUserDTO, int IdUser) throws Exception {
        User user = getUserById(IdUser);
        UserResponse userResponse = new UserResponse();
        user = userRepository.save(user);
        userResponse.setUser(pqrMapper.map(user));

        return userResponse;
    }

    @Override
    public UserResponse getLogin(String correo,String contrasena) throws Exception {


        User us= userRepository.findByCorreoAndContrasena(correo,contrasena);
        UserResponse userResponse = new UserResponse();
        userResponse.setUser(pqrMapper.map(us));
        return userResponse;
    }


}
