package com.mposluszny.dp.domain.character.factory

import com.mposluszny.dp.domain.character.characterclass.JavaScriptDeveloper
import com.mposluszny.dp.domain.character.Character

object JavaScriptDeveloperFactory extends CharacterFactory {
  
  def getIntern(name: String) = {
    super.getIntern(name = name, characterClass = JavaScriptDeveloper)
  }
  
  def getJunior(name: String) = {
    super.getIntern(name = name, characterClass = JavaScriptDeveloper)
  }
  
  def getRegular(name: String) = {
    super.getIntern(name = name, characterClass = JavaScriptDeveloper)
  }
  
  def getSenior(name: String) = {
    super.getIntern(name = name, characterClass = JavaScriptDeveloper)
  }
}