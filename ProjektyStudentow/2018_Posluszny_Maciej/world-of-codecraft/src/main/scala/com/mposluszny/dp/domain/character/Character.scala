package com.mposluszny.dp.domain.character

import com.mposluszny.dp.domain.character.characterclass.CharacterClass

class Character(
  val name: String = "Unknown",
  val characterClass: CharacterClass,
  var level: Int = 1) {

  def levelUp() = level += 1
  def hp = characterClass.baseHp + level * characterClass.hpPerLevel
  def attack = characterClass.baseAttack + level * characterClass.attackPerLevel
  def defense = characterClass.baseDefense + level * characterClass.defensePerLevel
}