package com.dnd.gerenciador_aventura.dto;

import java.util.Date;

// import org.springframework.beans.BeanUtils;

import com.dnd.gerenciador_aventura.model.Aventura;

public class AventuraDTO {

  private Long id;
  private String title;
  private String adventureType;
  private String adventureDescription;
  private Date creationDate;

  public AventuraDTO() {}

  public AventuraDTO(Aventura entity) {
    // só funciona se o DTO tiver Getters e Setters
    //BeanUtils.copyProperties(entity, this); // copia as propriedades da entidade para esse objeto

    this.id = entity.getId();
    this.title = entity.getTitle();
    this.adventureType = entity.getAdventureType();
    this.adventureDescription = entity.getAdventureDescription();
    this.creationDate = entity.getCreationDate();
  }

  /**
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * @return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * @return the adventureType
   */
  public String getAdventureType() {
    return adventureType;
  }

  /**
   * @return the adventureDescription
   */
  public String getAdventureDescription() {
    return adventureDescription;
  }

  /**
   * @return the creationDate
   */
  public Date getCreationDate() {
    return creationDate;
  };
}
