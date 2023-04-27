package com.prueba.tecnica.backend.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class UserDTO {


    private String nombre;


    private String apellido;



    private String correo;


    private String contrasena;
}
