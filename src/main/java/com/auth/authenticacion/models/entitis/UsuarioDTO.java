package com.auth.authenticacion.models.entitis;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
    @NotEmpty(message = "Debes de llenar el dato de usuario")
    private String nombre;
    @NotEmpty(message = "Debes de llenar el dato de contrasena")
    private String contrasena;
    @NotEmpty(message = "Debes de llenar el dato de email")
    private String email;

}
