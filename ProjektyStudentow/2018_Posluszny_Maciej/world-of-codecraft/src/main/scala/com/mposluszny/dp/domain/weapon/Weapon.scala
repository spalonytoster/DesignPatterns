package com.mposluszny.dp.domain.weapon

import scala.util.Random

class Weapon(
  var name: String = "Unnamed",
  var description: String = "Useless weapon", 
  var damage: Range = 0 to 0,
  var weaponType: WeaponType.Value = WeaponType.Undefined) {
  
  /**
   * Return the amount of damage given
   */
  def use(): Int = {
    val randomIndex = new Random().nextInt(damage.length)
    damage(randomIndex)
  }
}