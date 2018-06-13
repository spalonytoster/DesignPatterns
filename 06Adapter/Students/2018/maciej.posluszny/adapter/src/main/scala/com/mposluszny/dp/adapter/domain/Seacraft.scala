package com.mposluszny.dp.adapter.domain

import org.slf4j.LoggerFactory

class Seacraft extends ISeacraft {
  private val logger = LoggerFactory.getLogger(classOf[Seacraft])
  private var _speed: Int = 0
  
  def speed: Int = _speed

  def increaseRevs(): Unit = {
    _speed += 10
    logger.info(s"""Seacraft engine increases revs to $speed knots""")
  }
}