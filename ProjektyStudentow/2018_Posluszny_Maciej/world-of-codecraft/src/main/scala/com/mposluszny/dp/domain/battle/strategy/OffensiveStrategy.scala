package com.mposluszny.dp.domain.battle.strategy

import com.mposluszny.dp.domain.battle.move.PlayerMove

object OffensiveStrategy extends BattleStrategy(attackToDefendRatio = 0.7)