package com.mposluszny.dp.domain.battle

import org.slf4j.LoggerFactory
import com.mposluszny.dp.domain.battle.move.DefendMove

class Battle(var players: (Player, Player)) {
  private val _logger = LoggerFactory.getLogger(classOf[Battle])
  
  private var _status = BattleStatus.NOT_STARTED
  def status = _status
  
  private var _winner: Player = null;
  
  def start() = {
    _status = BattleStatus.STARTED
    _logger.info("Duel between " + players._1.pseudonym + " and " + players._2.pseudonym + " started!")
    
    var turn = 1

    while (BattleStatus.FINISHED != _status) {
      _logger.info("Turn {} starts.", turn)
      playTurn(players)
      turn += 1
    }
    
    if (_winner != null) {
      _winner.character.levelUp()
      _logger.info(_winner.pseudonym + " won! He advanced to level " + _winner.character.level + "!")
    }
  }
  

  private def playTurn(players: (Player, Player)) = {
	  val move1 = players._1.move
    val move2 = players._2.move
    
    if (DefendMove == move1 && DefendMove == move2) {
      _logger.info("Both players defend. Nothing happens...")
    }
    else {
      move1.execute(players._1, players._2)
      if (!players._2.defeated) move2.execute(players._2, players._1)
    }
      
    (players._1.defeated, players._2.defeated) match {
      case (false,  true) => {
        _winner = players._1
        _status = BattleStatus.FINISHED
      }
      
      case (true, false)  => {
        _winner = players._2
        _status = BattleStatus.FINISHED
      }
      
      case (true,  true)  => {
        _logger.info("Both players ko'd at the same time! It's a tie!")
        _status = BattleStatus.FINISHED
      }
      
      case _ => () // no one goes down, the battle is on
    }
  }
}