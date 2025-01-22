package com.dnd.gerenciador_aventura.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_aventura")
public class Aventura {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String title;
  private String adventureType;

  @Column(columnDefinition = "TEXT") // Altera o campo String na tabela para se comportar como tipo TEXT
  private String adventureDescription;
  private Date creationDate;

  public Aventura() {};

  /**
   * @param id
   * @param title
   * @param adventureType
   * @param adventureDescription
   * @param creationDate
   */
  public Aventura(Long id, String title, String adventureType, String adventureDescription, Date creationDate) {
    this.id = id;
    this.title = title;
    this.adventureType = adventureType;
    this.adventureDescription = adventureDescription;
    this.creationDate = creationDate;
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
   * @return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * @param title the title to set
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * @return the adventureType
   */
  public String getAdventureType() {
    return adventureType;
  }

  /**
   * @param adventureType the adventureType to set
   */
  public void setAdventureType(String adventureType) {
    this.adventureType = adventureType;
  }

  /**
   * @return the adventureDescription
   */
  public String getAdventureDescription() {
    return adventureDescription;
  }

  /**
   * @param adventureDescription the adventureDescription to set
   */
  public void setAdventureDescription(String adventureDescription) {
    this.adventureDescription = adventureDescription;
  }

  /**
   * @return the creationDate
   */
  public Date getCreationDate() {
    return creationDate;
  }

  /**
   * @param creationDate the creationDate to set
   */
  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  
}
