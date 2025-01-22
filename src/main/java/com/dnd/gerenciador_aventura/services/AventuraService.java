package com.dnd.gerenciador_aventura.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dnd.gerenciador_aventura.dto.AventuraDTO;
import com.dnd.gerenciador_aventura.repositories.AventuraRepository;

@Service
public class AventuraService {

  @Autowired
  private AventuraRepository aventuraRepository;

  @Transactional(readOnly = true)
  public List<AventuraDTO> findAll() {
    return aventuraRepository.findAll().stream().map(AventuraDTO::new).toList();
  }

  @Transactional(readOnly = true)
  public AventuraDTO findById(Long id) {
    return aventuraRepository.findById(id).map(AventuraDTO::new).get();
  }

  
}
