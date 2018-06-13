package com.mposluszny.dp.domain.character.factory

import com.mposluszny.dp.domain.character.Character
import com.mposluszny.dp.domain.character.characterclass.CharacterClass

class CharacterFactory {
  
  protected def getIntern(name: String, characterClass: CharacterClass): Character = {
    new Character(
        name = name,
        characterClass = characterClass,
        level = 1
    )
  }
  
  protected def getJunior(name: String, characterClass: CharacterClass): Character = {
    new Character(
        name = name,
        characterClass = characterClass,
        level = 3
    )
  }
  
  protected def getRegular(name: String, characterClass: CharacterClass): Character = {
    new Character(
        name = name,
        characterClass = characterClass,
        level = 6
    )
  }
  
  protected def getSenior(name: String, characterClass: CharacterClass): Character = {
    new Character(
        name = name,
        characterClass = characterClass,
        level = 10
    )
  }
}