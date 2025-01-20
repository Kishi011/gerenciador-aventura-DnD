package com.dnd.gerenciador_aventura.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aventura")
public record Aventura(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id,
  String title,
  String adventureType
) {
}
