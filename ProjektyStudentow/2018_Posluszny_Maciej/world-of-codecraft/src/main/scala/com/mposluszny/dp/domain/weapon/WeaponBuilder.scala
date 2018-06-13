package com.mposluszny.dp.domain.weapon

class WeaponBuilder(weapon: Weapon = new Weapon()) {
	
	def name = (name: String) => {
		weapon.name = name
		(this)
	}
	
	def description = (description: String) => {
		weapon.description = description
		(this)
	}
	
	def damage = (damage: Range) => {
		weapon.damage = damage
		(this)
	}
  
  def weaponType = (weaponType: WeaponType.Value) => {
    weapon.weaponType = weaponType
	  (this)
  }
  
  def build() = weapon
}