package com.prueba.tecnica.backend.dtos;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder(toBuilder = true)
public class CreateUserDTO {

	private int idUser;

	@JsonProperty("nombre")
	private String nombre;

	@JsonProperty("apellido")
	private String apellido;

	@JsonProperty("correo")
	private String correo;

	@JsonProperty("contrasena")
	private String contrasena;

}
