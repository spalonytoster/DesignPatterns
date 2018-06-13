package com.mposluszny.dp.adapter.domain

import org.junit._
import org.junit.Assert._
import org.slf4j.LoggerFactory

class SeabirdTest {
  
  private val logger = LoggerFactory.getLogger(classOf[SeabirdTest])
  
	@Test
	def noAdapterTest() = {
			logger.info("Experiment 1: test the aircraft engine")
			
      var aircraft: IAircraft = new Aircraft()
      aircraft.takeOff()
      
      if (aircraft.airborne) {
        logger.info("The aircraft engine is fine, flying at {} meters", aircraft.height)
      }
	}
	
	@Test
	def standardAdapterTest() = {
			logger.info("Experiment 2: Use the engine in the Seabird");
      var seabird: IAircraft = new Seabird()
      seabird.takeOff() // And automatically increases speed
      logger.info("The Seabird took off");
	}
  
	/** 
	 *  Two-way adapter: using seacraft instructions on an IAircraft object
   *  (where they are not in the IAircraft interface)
   */
  @Test
  def twoWayAdapterTest() = {
		  logger.info("Experiment 3: Increase the speed of the Seabird:");
    // Given
    var seabird: IAircraft = new Seabird()
    seabird.takeOff() // And automatically increases speed
    
    // When
    seabird.asInstanceOf[ISeacraft].increaseRevs()
    seabird.asInstanceOf[ISeacraft].increaseRevs()
    if (seabird.airborne) {
    	logger.info("Seabird flying at height {} meters and speed {} knots",
    	    seabird.asInstanceOf[ISeacraft].speed, seabird.height)
    	logger.info("Experiments successful; the Seabird flies!")
    }
    
    assertTrue(seabird.airborne)
  }
}