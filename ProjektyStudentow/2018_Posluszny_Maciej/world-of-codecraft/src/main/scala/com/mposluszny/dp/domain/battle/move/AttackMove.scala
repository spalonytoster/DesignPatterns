package com.mposluszny.dp.domain.battle.move

import com.mposluszny.dp.domain.battle.Player
import org.slf4j.LoggerFactory

object AttackMove extends PlayerMove {

  private val _logger = LoggerFactory.getLogger(classOf[PlayerMove])

  def execute(player: Player, enemy: Player) = {
    _logger.info(player.pseudonym + " used '" + player.character.characterClass.attackName + "'!")
    
    val damage = calculateDamage(player, enemy)
    enemy.takeDamage(damage)
    _logger.info(enemy.pseudonym + " loses " + damage + " hp due to '" + player.character.characterClass.attackName + "' by " + player.pseudonym)
  }
  
  def calculateDamage(player: Player, enemy: Player): Int = {
    val attackReduced = player.calculateDamage - enemy.character.defense
    
    if (attackReduced > 0) attackReduced
    else 0
  }
}