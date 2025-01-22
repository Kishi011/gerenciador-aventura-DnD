package com.dnd.gerenciador_aventura.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dnd.gerenciador_aventura.dto.FichaDTO;
import com.dnd.gerenciador_aventura.repositories.FichaRepository;

@Service
public class FichaService {

  @Autowired
  private FichaRepository fichaRepository;

  public List<FichaDTO> findAll() {
    return fichaRepository.findAll().stream().map(FichaDTO::new).toList();
  }

  public FichaDTO findById(Long id) {
    return fichaRepository.findById(id).map(FichaDTO::new).get();
  }

  
}
