package com.dnd.gerenciador_aventura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dnd.gerenciador_aventura.dto.AventuraDTO;
import com.dnd.gerenciador_aventura.services.AventuraService;

@RestController
@RequestMapping("/aventura")
public class AventuraController {

  @Autowired
  private AventuraService aventuraService;

  @GetMapping
  public List<AventuraDTO> findAll() {
    return aventuraService.findAll();
  }

  @GetMapping("/{id}")
  public AventuraDTO findById(@PathVariable Long id) {
    return aventuraService.findById(id);
  }

  
}
