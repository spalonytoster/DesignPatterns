package com.mposluszny.dp.plugabbleadapter.domain

import org.slf4j.LoggerFactory

class MicroSDCard(private val _data: String) extends MemoryCard {
  
  private val logger = LoggerFactory.getLogger(classOf[MicroSDCard])
  
  def readData() = {
    logger.info("Reading data from MicroSD card")
    _data
  }
}