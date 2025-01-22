package com.dnd.gerenciador_aventura.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dnd.gerenciador_aventura.dto.PerfilDTO;
import com.dnd.gerenciador_aventura.repositories.PerfilRepository;

@Service
public class PerfilService {

  @Autowired
  private PerfilRepository perfilRepository;

  public List<PerfilDTO> findAll() {
    return perfilRepository.findAll().stream().map(PerfilDTO::new).toList();
  }

  public PerfilDTO findById(Long id) {
    return perfilRepository.findById(id).map(PerfilDTO::new).get();
  }
  

}
