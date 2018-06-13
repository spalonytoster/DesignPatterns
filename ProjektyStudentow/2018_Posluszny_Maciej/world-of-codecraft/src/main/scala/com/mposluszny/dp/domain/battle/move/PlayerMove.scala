package com.mposluszny.dp.domain.battle.move

import com.mposluszny.dp.domain.battle.Player

trait PlayerMove {
  def execute(player1: Player, player2: Player)
}