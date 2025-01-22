package com.dnd.gerenciador_aventura.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_perfil")
public class Perfil {

  public static enum Role {ADMIN, JOGADOR};

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;

  @Column(name = "game_role")
  @Enumerated(EnumType.STRING) // define como guardar o enum na tabela EnumType.ORDINAL: guarda como número || EnumType.STRING: guarda como String literal
  private Role role;

  public Perfil() {}

  /**
   * @param id
   * @param nome
   * @param role
   */
  public Perfil(Long id, String nome, Role role) {
    this.id = id;
    this.nome = nome;
    this.role = role;
  }

  /**
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * @return the nome
   */
  public String getNome() {
    return nome;
  }

  /**
   * @param nome the nome to set
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * @return the role
   */
  public Role getRole() {
    return role;
  }

  /**
   * @param role the role to set
   */
  public void setRole(Role role) {
    this.role = role;
  }

  
}
