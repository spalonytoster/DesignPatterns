package com.mposluszny.dp.domain.weapon

object WeaponType extends Enumeration {
  type WeaponType = Value
  
  val Undefined = Value("Undefined")
  val Light     = Value("light")
  val Heavy     = Value("heavy")
}