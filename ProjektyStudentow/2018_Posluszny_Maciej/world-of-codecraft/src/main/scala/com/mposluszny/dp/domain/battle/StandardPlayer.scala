package com.mposluszny.dp.domain.battle

import scala.util.Random
import org.slf4j.LoggerFactory
import com.mposluszny.dp.domain.character.Character
import com.mposluszny.dp.domain.battle.move.PlayerMove
import com.mposluszny.dp.domain.battle.strategy.BattleStrategy

class StandardPlayer(_character: Character, _strategy: BattleStrategy) extends Player {
  private val _logger = LoggerFactory.getLogger(classOf[StandardPlayer])
  private var _currentHp = character.hp
  
  def character               = _character
  def strategy                = _strategy
  
  def currentHp               = _currentHp
  def pseudonym               = s"""${character.characterClass.name} ${character.name}"""
  def takeDamage(damage: Int) = _currentHp -= damage
  def defeated                = currentHp <= 0
  def move                    = _strategy.getMove()
  def calculateDamage         = character.attack
}