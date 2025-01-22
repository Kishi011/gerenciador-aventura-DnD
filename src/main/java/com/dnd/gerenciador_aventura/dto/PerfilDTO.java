package com.dnd.gerenciador_aventura.dto;

import com.dnd.gerenciador_aventura.model.Perfil;

public class PerfilDTO {

  private Long id;
  private String nome;
  private Perfil.Role role;

  public PerfilDTO() {}

  public PerfilDTO(Perfil perfil) {
    this.id = perfil.getId();
    this.nome = perfil.getNome();
    this.role = perfil.getRole();
  }

  /**
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * @return the nome
   */
  public String getNome() {
    return nome;
  }

  /**
   * @return the role
   */
  public Perfil.Role getRole() {
    return role;
  }


}
