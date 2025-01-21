package com.dnd.gerenciador_aventura.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dnd.gerenciador_aventura.model.Aventura;


// Componente de repositório para acesso ao banco de dados
public interface AventuraRepository extends JpaRepository<Aventura, Long>{

}
