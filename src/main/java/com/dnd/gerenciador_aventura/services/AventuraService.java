package com.dnd.gerenciador_aventura.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dnd.gerenciador_aventura.model.Aventura;
import com.dnd.gerenciador_aventura.repositories.AventuraRepository;

@Service
public class AventuraService {

  @Autowired
  private AventuraRepository aventuraRepository;

  public List<Aventura> findAll() {
    return aventuraRepository.findAll();
  }
}
