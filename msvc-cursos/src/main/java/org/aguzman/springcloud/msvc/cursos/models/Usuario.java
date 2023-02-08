package org.aguzman.springcloud.msvc.cursos.models;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class Usuario {

    private Long id;

    private String nombre;

    private String email;

    private String password;
}
