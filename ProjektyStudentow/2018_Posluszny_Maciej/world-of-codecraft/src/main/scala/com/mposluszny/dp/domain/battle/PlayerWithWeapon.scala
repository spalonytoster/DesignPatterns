package com.mposluszny.dp.domain.battle

import com.mposluszny.dp.domain.weapon.Weapon
import org.slf4j.LoggerFactory

/**
 * Decorated Player
 */
class PlayerWithWeapon(
    player: Player,
    weapon: Weapon) extends Player {
  
  private val _logger = LoggerFactory.getLogger(classOf[PlayerWithWeapon])
  
  def character               = player.character
  def strategy                = player.strategy
  
  def currentHp               = player.currentHp
  def pseudonym               = player.pseudonym
  def takeDamage(damage: Int) = player.takeDamage(damage)
  def defeated                = player.defeated
  def move                    = player.move
  def calculateDamage         = {
    val weaponDamage = weapon.use()
    _logger.info(player.pseudonym + "'s " + weapon.name + " adds " + weaponDamage + " damage to the attack!")
    player.calculateDamage + weaponDamage
  }
}