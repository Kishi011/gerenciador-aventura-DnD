package com.dnd.gerenciador_aventura.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aventura")
public class Aventura {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String title;
  private String adventureType;

  public Aventura() {};

  public Aventura(Long id, String title, String adventureType) {
    this.id = id;
    this.title = title;
    this.adventureType = adventureType;
  };

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAdventureType() {
    return adventureType;
  }

  public void setAdventureType(String adventureType) {
    this.adventureType = adventureType;
  }
}
