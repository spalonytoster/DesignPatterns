package com.mposluszny.dp.plugabbleadapter.domain

import org.junit._
import org.junit.Assert._
import org.slf4j.LoggerFactory

class CardAdapterTest {

  private val logger = LoggerFactory.getLogger(classOf[CardAdapterTest])
  
  @Test
  def SDCardTest() = {
    // Given
    val data = "some data in sd card"
    val sdCard = new SDCard(data)
    
    // When
    val cardAdapter = new CardAdapter(sdCard)
    
    // Then
    assertEquals(cardAdapter.readStoredData(), data)
  }
  
  @Test
  def microSDCardTest() = {
		// Given
    val data = "some data in microsd card"
    val microSDCard = new MicroSDCard(data)
    
    // When
    val cardAdapter = new CardAdapter(microSDCard)
    
    // Then
    assertEquals(cardAdapter.readStoredData(), data)		  
  }
  
  @Test
  def switchCardsTest() = {
    val microSDData = "some data in microsd card"
    val microSDCard = new MicroSDCard(microSDData)
    val sdData = "some data in sd card"
    val sdCard = new SDCard(sdData)
    
    // When
    val cardAdapter = new CardAdapter(microSDCard)
    cardAdapter.memoryCard_(sdCard)
    
    // Then
    assertEquals(cardAdapter.readStoredData(), sdCard)
  }
}