package com.dnd.gerenciador_aventura.dto;

import org.springframework.beans.BeanUtils;

import com.dnd.gerenciador_aventura.model.Ficha;
import com.dnd.gerenciador_aventura.model.Perfil;

public class FichaDTO {
  
  private Long id;
  private Perfil jogador;

  private String nomePersonagem;
  private String classe;
  private String raca;
  private Integer hp;
  private Integer xp;

  private Integer forca;
  private Integer destreza;
  private Integer constituicao;
  private Integer inteligencia;
  private Integer sabedoria;
  private Integer carisma;

  private Integer inspiracao;
  private Integer bonusProficiencia;
  
  public FichaDTO() {}

  public FichaDTO(Ficha entity) {
    // só funciona se o DTO tiver Getters e Setters
    BeanUtils.copyProperties(entity, this); // copia as propriedades da entidade para esse objeto
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
   * @return the jogador
   */
  public Perfil getJogador() {
    return jogador;
  }

  /**
   * @param jogador the jogador to set
   */
  public void setJogador(Perfil jogador) {
    this.jogador = jogador;
  }

  /**
   * @return the nomePersonagem
   */
  public String getNomePersonagem() {
    return nomePersonagem;
  }

  /**
   * @param nomePersonagem the nomePersonagem to set
   */
  public void setNomePersonagem(String nomePersonagem) {
    this.nomePersonagem = nomePersonagem;
  }

  /**
   * @return the classe
   */
  public String getClasse() {
    return classe;
  }

  /**
   * @param classe the classe to set
   */
  public void setClasse(String classe) {
    this.classe = classe;
  }

  /**
   * @return the raca
   */
  public String getRaca() {
    return raca;
  }

  /**
   * @param raca the raca to set
   */
  public void setRaca(String raca) {
    this.raca = raca;
  }

  /**
   * @return the hp
   */
  public Integer getHp() {
    return hp;
  }

  /**
   * @param hp the hp to set
   */
  public void setHp(Integer hp) {
    this.hp = hp;
  }

  /**
   * @return the xp
   */
  public Integer getXp() {
    return xp;
  }

  /**
   * @param xp the xp to set
   */
  public void setXp(Integer xp) {
    this.xp = xp;
  }

  /**
   * @return the forca
   */
  public Integer getForca() {
    return forca;
  }

  /**
   * @param forca the forca to set
   */
  public void setForca(Integer forca) {
    this.forca = forca;
  }

  /**
   * @return the destreza
   */
  public Integer getDestreza() {
    return destreza;
  }

  /**
   * @param destreza the destreza to set
   */
  public void setDestreza(Integer destreza) {
    this.destreza = destreza;
  }

  /**
   * @return the constituicao
   */
  public Integer getConstituicao() {
    return constituicao;
  }

  /**
   * @param constituicao the constituicao to set
   */
  public void setConstituicao(Integer constituicao) {
    this.constituicao = constituicao;
  }

  /**
   * @return the inteligencia
   */
  public Integer getInteligencia() {
    return inteligencia;
  }

  /**
   * @param inteligencia the inteligencia to set
   */
  public void setInteligencia(Integer inteligencia) {
    this.inteligencia = inteligencia;
  }

  /**
   * @return the sabedoria
   */
  public Integer getSabedoria() {
    return sabedoria;
  }

  /**
   * @param sabedoria the sabedoria to set
   */
  public void setSabedoria(Integer sabedoria) {
    this.sabedoria = sabedoria;
  }

  /**
   * @return the carisma
   */
  public Integer getCarisma() {
    return carisma;
  }

  /**
   * @param carisma the carisma to set
   */
  public void setCarisma(Integer carisma) {
    this.carisma = carisma;
  }

  /**
   * @return the inspiracao
   */
  public Integer getInspiracao() {
    return inspiracao;
  }

  /**
   * @param inspiracao the inspiracao to set
   */
  public void setInspiracao(Integer inspiracao) {
    this.inspiracao = inspiracao;
  }

  /**
   * @return the bonusProficiencia
   */
  public Integer getBonusProficiencia() {
    return bonusProficiencia;
  }

  /**
   * @param bonusProficiencia the bonusProficiencia to set
   */
  public void setBonusProficiencia(Integer bonusProficiencia) {
    this.bonusProficiencia = bonusProficiencia;
  }


}
