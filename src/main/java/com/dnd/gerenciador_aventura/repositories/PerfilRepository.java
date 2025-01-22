package com.dnd.gerenciador_aventura.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dnd.gerenciador_aventura.model.Perfil;


// Componente de repositório para acesso ao banco de dados
public interface PerfilRepository extends JpaRepository<Perfil, Long>{

}
