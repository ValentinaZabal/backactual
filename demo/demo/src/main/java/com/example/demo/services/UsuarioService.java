package com.example.demo.services;

import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios (){ return (ArrayList<UsuarioModel>) usuarioRepository.findAll();}

    public UsuarioModel guardarUsuario (UsuarioModel usuario) {return usuarioRepository.save(usuario);}


}
