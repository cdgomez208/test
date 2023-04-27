package com.prueba.tecnica.backend.entities;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "\"usuarios\"", schema = "public")
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class User implements Serializable {
    @Id
    @Column(name = "id_usuario", nullable = false)
    private Integer idUser;

    @Column(name = "correo", nullable = false)
    private String correo;

    @Column(name = "contrasena", nullable = false)
    private String contrasena;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;


}
