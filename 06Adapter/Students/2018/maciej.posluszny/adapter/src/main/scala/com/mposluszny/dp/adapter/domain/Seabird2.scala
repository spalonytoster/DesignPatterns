package com.mposluszny.dp.adapter.domain

import org.slf4j.LoggerFactory

class Seabird2 extends Aircraft with ISeacraft {
    
  private val logger = LoggerFactory.getLogger(classOf[Seabird2])
  override def airborne: Boolean = height > 50
  private var _speed: Int = 0
  
  def speed = _speed
  
  override def takeOff: Unit = {
    while (!airborne) {
      increaseRevs()
    }
  }
  
  override def increaseRevs() = {
    seacraftIncreaseRevs()
    if (speed > 40) {
      height_(height + 100)
    }
  }
  
   def seacraftIncreaseRevs(): Unit = {
    _speed += 10
    logger.info(s"""Seacraft engine increases revs to $speed knots""")
  }
}