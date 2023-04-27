package com.prueba.tecnica.backend.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LoginDTO {

    @JsonProperty("correo")
    private String correo;

    @JsonProperty("contrasena")
    private String contrasena;
}
