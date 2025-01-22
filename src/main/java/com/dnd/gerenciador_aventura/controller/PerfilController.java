package com.dnd.gerenciador_aventura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dnd.gerenciador_aventura.dto.PerfilDTO;
import com.dnd.gerenciador_aventura.services.PerfilService;

@RestController
@RequestMapping("/perfil")
public class PerfilController {

  @Autowired
  private PerfilService perfilService;

  @GetMapping
  public List<PerfilDTO> findAll() {
    return perfilService.findAll();
  }

  @GetMapping("/{id}")
  public PerfilDTO findById(@PathVariable Long id) {
    return perfilService.findById(id);
  }

  
}
