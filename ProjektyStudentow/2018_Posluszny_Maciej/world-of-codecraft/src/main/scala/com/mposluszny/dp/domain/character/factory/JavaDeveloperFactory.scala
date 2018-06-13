package com.mposluszny.dp.domain.character.factory

import com.mposluszny.dp.domain.character.Character
import com.mposluszny.dp.domain.character.characterclass.JavaDeveloper

object JavaDeveloperFactory extends CharacterFactory {
  
  def getIntern(name: String) = {
    super.getIntern(name = name, characterClass = JavaDeveloper)
  }
  
  def getJunior(name: String) = {
    super.getIntern(name = name, characterClass = JavaDeveloper)
  }
  
  def getRegular(name: String) = {
    super.getIntern(name = name, characterClass = JavaDeveloper)
  }
  
  def getSenior(name: String) = {
    super.getIntern(name = name, characterClass = JavaDeveloper)
  }
}