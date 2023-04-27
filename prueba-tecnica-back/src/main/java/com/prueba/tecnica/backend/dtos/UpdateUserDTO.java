package com.prueba.tecnica.backend.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UpdateUserDTO {



    private String nombre;

    private String apellido;

    private String correo;

    private String contrasena;

}
