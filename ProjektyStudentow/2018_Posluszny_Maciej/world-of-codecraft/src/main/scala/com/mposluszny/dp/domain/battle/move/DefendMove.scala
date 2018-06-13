package com.mposluszny.dp.domain.battle.move

import com.mposluszny.dp.domain.battle.Player
import org.slf4j.LoggerFactory
import com.mposluszny.dp.domain.battle.strategy.BattleStrategy

object DefendMove extends PlayerMove {
  
  private val _logger = LoggerFactory.getLogger(classOf[PlayerMove])
  private val _reflectFlatMinimum = 2;
  private val _reflectPercentMinimum = 0.05;
  
  def execute(defending: Player, attacking: Player) = {
//    _logger.info(defending.pseudonym + " defends against " + attacking.pseudonym + "'!")
    
    val enemyDamage     =  AttackMove.calculateDamage(attacking, defending)
    val reflectFlat     = _reflectFlatMinimum + defending.character.defense / 2
    val reflectPercent  = _reflectPercentMinimum + defending.character.defense / 100
    val reflectedDamage = (reflectFlat + reflectPercent * enemyDamage).floor.toInt
    
    attacking.takeDamage(reflectedDamage)
    _logger.info(defending.pseudonym + " reflects " + reflectedDamage + " damage by defending!")
  }
}