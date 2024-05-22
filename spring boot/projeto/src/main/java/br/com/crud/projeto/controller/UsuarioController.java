package br.com.crud.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.crud.projeto.model.UsuarioModel;
import br.com.crud.projeto.repository.UsuarioRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/bd")
public class UsuarioController {
    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping("usuarios")
    public ResponseEntity<UsuarioModel> PostMethodName (@RequestBody
    UsuarioModel usuarioModel){
        UsuarioModel _usuarioModel = usuarioRepository.save
        (usuarioModel);

        return new ResponseEntity<>(_usuarioModel, HttpStatus.CREATED);
    }
}
