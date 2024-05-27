package com.auth.authenticacion.controller;


import com.auth.authenticacion.dao.UsuarioService;
import com.auth.authenticacion.models.Usuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/autentication")
public class UsuarioController {

    private Logger logger = LoggerFactory.getLogger(UsuarioController.class);

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getAllUsuarios() {
        logger.info("se realizo consulta sobre listado");
        return usuarioService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable("id") String id_persona) {
        logger.info("se realizo consulta en busqueda de Id");
        return usuarioService.findById(id_persona)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        logger.info("se agrego nuevo usuario");
        return usuarioService.save(usuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuarioById(@PathVariable("id") String id_persona) {
        logger.info("se elimino usuario ");
        usuarioService.deleteById(id_persona);
        return ResponseEntity.noContent().build();
    }




}
