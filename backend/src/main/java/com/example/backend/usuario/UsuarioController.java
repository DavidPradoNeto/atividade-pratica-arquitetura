package com.example.backend.usuario;

import java.util.List;
import java.util.Optional;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class UsuarioController {

    private UsuarioRepository repository;

    @RequestMapping(value = "/usuarios", method = RequestMethod.GET)
    public List<Usuario> getAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/usuario/{id}", method = RequestMethod.GET)
    public Optional<Usuario> getById(@PathVariable(value = "id") long id) {
        return repository.findById(id);
    }

    @RequestMapping(value = "/usuario", method = RequestMethod.POST)
    public Usuario addUsuario(@Validated @RequestBody Usuario user) {
        return repository.save(user);
    }

    @RequestMapping(value = "/usuario/{id}", method = RequestMethod.DELETE)
    public void deleteUsuario(@PathVariable(value = "id") long id) {
        repository.deleteById(id);
    }
}