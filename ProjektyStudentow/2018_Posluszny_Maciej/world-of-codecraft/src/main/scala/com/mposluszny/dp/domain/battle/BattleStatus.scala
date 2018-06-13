package com.mposluszny.dp.domain.battle

object BattleStatus extends Enumeration {
  type BattleStatus = Value
  
  val NOT_STARTED, STARTED, FINISHED = Value
}