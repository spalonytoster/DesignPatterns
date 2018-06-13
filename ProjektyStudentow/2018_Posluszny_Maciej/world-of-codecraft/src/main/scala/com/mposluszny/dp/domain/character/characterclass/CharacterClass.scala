package com.mposluszny.dp.domain.character.characterclass

abstract class CharacterClass {
	def name: String
	def attackName: String
	val baseHp: Int 
	val baseAttack: Int
	val baseDefense: Int
  val hpPerLevel: Int
  val attackPerLevel: Int
  val defensePerLevel: Int
}