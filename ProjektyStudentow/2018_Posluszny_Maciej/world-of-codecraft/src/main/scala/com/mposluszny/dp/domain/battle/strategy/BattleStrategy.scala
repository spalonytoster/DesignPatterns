package com.mposluszny.dp.domain.battle.strategy

import com.mposluszny.dp.domain.battle.move.PlayerMove
import scala.util.Random
import com.mposluszny.dp.domain.battle.move.AttackMove
import com.mposluszny.dp.domain.battle.move.DefendMove
import org.slf4j.LoggerFactory

/**
 * Since abstract class cannot be instantiated
 * we can only use concrete objects implementing this class
 */
abstract class BattleStrategy(private val attackToDefendRatio: Double) {
  private val logger = LoggerFactory.getLogger(classOf[BattleStrategy])  
  
  def getMove(): PlayerMove = {
    if (new Random().nextInt(100) + 1 <= attackToDefendRatio * 100)
      AttackMove 
    else
      DefendMove
  }
}