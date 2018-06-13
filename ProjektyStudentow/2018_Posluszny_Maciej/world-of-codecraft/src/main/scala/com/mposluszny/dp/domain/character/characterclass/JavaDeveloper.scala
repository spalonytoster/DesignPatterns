package com.mposluszny.dp.domain.character.characterclass

object JavaDeveloper extends CharacterClass {
  def name            = "Java Dev"
  def attackName      = "Hibernate"
  
  val baseHp          = 10
  val baseAttack      = 1
  val baseDefense     = 3
  val attackPerLevel  = 1
  val defensePerLevel = 1
  val hpPerLevel: Int = 2
}