package com.auth.authenticacion.dao;

import com.auth.authenticacion.models.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> findAll(){
        return usuarios;
    }

    public Optional<Usuario> findById(String id_persona){
        return usuarios.stream()
                .filter(usuario -> usuario.getId_persona().equals(id_persona))
                .findFirst();
    }

    public Usuario save (Usuario usuario){
        usuarios.add(usuario);
        return usuario;
    }

    public void deleteById(String id_persona) {
        usuarios.removeIf(usuario -> usuario.getId_persona().equals(id_persona));
    }


}
