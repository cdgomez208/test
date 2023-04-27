package com.prueba.tecnica.backend.controllers;

import java.net.URI;

import com.prueba.tecnica.backend.dtos.*;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.prueba.tecnica.backend.servicesImpl.UserServiceImpl;

@RequestMapping("users")
@CrossOrigin(origins = "*")
@RestController
public class UserController {

	@Autowired
	private UserServiceImpl userService;

	@ApiOperation(value = "get User by Id", response = ResponseDTO.class)
	@RequestMapping(value = "getId/{idUser}", method = RequestMethod.GET)
	public ResponseEntity<?> getUser(@PathVariable int idUser) {
		return ResponseEntity.ok(userService.getUserById(idUser));
	}
	@ApiOperation(value = "delete User", response = ResponseDTO.class)
	@RequestMapping(value = "delete/{idUser}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deteleUser(
			@PathVariable Integer idUser
	) {
		return ResponseEntity.ok(userService.deteleUserById(idUser));
	}
	@ApiOperation(value = "getAlls", response = ResponseDTO.class)
	@RequestMapping(value = "getAlls", method = RequestMethod.GET)
	public ResponseEntity<?> getAllUsers() {
		return ResponseEntity.ok(userService.getAllUser());
	}

	@ApiOperation(value = "create User", response = ResponseDTO.class)
	@RequestMapping(value = "create", method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@RequestBody CreateUserDTO dto) throws Exception {

		UserResponse response = userService.createUser(dto);
		return ResponseEntity.created(URI.create("/user/v1" ))
				.body(response);
	}
	@ApiOperation(value = "update user", response = ResponseDTO.class)
	@RequestMapping(value = "update/{idUser}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateUser(@PathVariable int idUser, @RequestBody UpdateUserDTO dto)
			throws Exception {
		UserResponse response = userService.updateUser(dto, idUser);
		return ResponseEntity.ok(response);
	}


	@ApiOperation(value = "get login ", response = ResponseDTO.class)
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public ResponseEntity<?> getLoginUser(@RequestBody String correo,String contrasena)
			throws Exception {
		UserResponse response = userService.getLogin(correo,contrasena);
		return ResponseEntity.ok(response);
	}

}