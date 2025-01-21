package com.dnd.gerenciador_aventura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dnd.gerenciador_aventura.model.Aventura;
import com.dnd.gerenciador_aventura.services.AventuraService;

@RestController
@RequestMapping(value = "/aventura")
public class AventuraController {

  @Autowired
  private AventuraService aventuraService;

  @GetMapping
  public List<Aventura> findAll() {
    return aventuraService.findAll();
  }
}
