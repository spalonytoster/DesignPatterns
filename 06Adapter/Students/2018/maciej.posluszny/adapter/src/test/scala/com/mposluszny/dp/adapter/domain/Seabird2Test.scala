package com.mposluszny.dp.adapter.domain

import org.junit._
import org.junit.Assert._
import org.slf4j.LoggerFactory

class Seabird2Test {
  
  private val logger = LoggerFactory.getLogger(classOf[Seabird2Test])
  
	@Test
	def noAdapterTest() = {
			logger.info("Experiment 1: test the seacraft engine")
			
      var seacraft: ISeacraft = new Seacraft()
      seacraft.increaseRevs()
      
      if (seacraft.speed > 0) {
        logger.info("The seacraft engine is fine, speed at {} revs", seacraft.speed)
      }
	}
	
	@Test
	def standardAdapterTest() = {
			logger.info("Experiment 2: Use the engine in the Seabird2");
      var seabird: Aircraft = new Seabird2()
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
    var seabird: Aircraft = new Seabird2()
    seabird.takeOff() // And automatically increases speed
    
    // When`
    seabird.asInstanceOf[IAircraft].takeOff()
    if (seabird.airborne) {
    	logger.info("Seabird flying at height {} meters and speed {} knots",
    	    seabird.asInstanceOf[IAircraft].height, seabird.asInstanceOf[ISeacraft].speed)
    	logger.info("Experiments successful; the Seabird flies!")
    }
    
    assertTrue(seabird.airborne)
  }
}