package com.mposluszny.dp.adapter.domain

import org.slf4j.LoggerFactory

class Aircraft extends IAircraft {
  private val logger = LoggerFactory.getLogger(classOf[Aircraft])
  private var _height: Int = 0
  private var _airborne: Boolean = false
  
  def airborne: Boolean = _airborne
  
  def height: Int = _height
  def height_(x: Int): Unit = { _height = x }
  
  def takeOff: Unit = {
    logger.info("Aircraft engine take off")
    _airborne = true
    _height = 200
  }
}