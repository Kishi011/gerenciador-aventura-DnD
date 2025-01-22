package com.dnd.gerenciador_aventura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dnd.gerenciador_aventura.dto.FichaDTO;
import com.dnd.gerenciador_aventura.services.FichaService;

@RestController
@RequestMapping("/ficha")
public class FichaController {

  @Autowired
  private FichaService fichaService;

  @GetMapping
  public List<FichaDTO> findAll() {
    return fichaService.findAll();
  }

  @GetMapping("/{id}")
  public FichaDTO findById(@PathVariable Long id) {
    return fichaService.findById(id);
  }

  
}
