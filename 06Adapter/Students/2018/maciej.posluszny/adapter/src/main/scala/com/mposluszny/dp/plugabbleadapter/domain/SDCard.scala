package com.mposluszny.dp.plugabbleadapter.domain

import org.slf4j.LoggerFactory

class SDCard(private var _data: String) extends MemoryCard {
  
  private val logger = LoggerFactory.getLogger(classOf[SDCard])
  
  def readData() = {
    logger.info("Reading data from SD card")
    _data
  }
}