package com.mposluszny.dp.domain.battle

import com.mposluszny.dp.domain.battle.move.PlayerMove
import com.mposluszny.dp.domain.character.Character
import com.mposluszny.dp.domain.battle.strategy.BattleStrategy

trait Player {
  def character: Character
  def strategy: BattleStrategy
  def currentHp: Int
  def pseudonym: String
  def takeDamage(damage: Int)
  def defeated: Boolean
  def move: PlayerMove
  def calculateDamage: Int
}