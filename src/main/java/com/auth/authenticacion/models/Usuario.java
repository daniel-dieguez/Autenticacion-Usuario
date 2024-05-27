package com.auth.authenticacion.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {


    private String id_persona;
    private String nombre;
    private String contrasena;
    private String email;



}
