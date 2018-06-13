package com.mposluszny.dp.adapter.domain

class Seabird extends Seacraft with IAircraft {
  private var _height = 0
    
  def airborne: Boolean = _height > 50
  def height: Int = _height
  
  def takeOff: Unit = {
    while (!airborne) {
      increaseRevs()
    }
  }
  
  override def increaseRevs() = {
    super.increaseRevs()
    if (speed > 40) {
      _height += 100
    }
  }

}