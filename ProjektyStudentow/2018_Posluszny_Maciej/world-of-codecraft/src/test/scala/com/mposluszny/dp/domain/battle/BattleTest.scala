package com.mposluszny.dp.domain.battle

import org.junit.Test
import com.mposluszny.dp.domain.character.Character
import com.mposluszny.dp.domain.character.characterclass.JavaDeveloper
import com.mposluszny.dp.domain.character.characterclass.JavaScriptDeveloper
import org.junit.Assert
import com.mposluszny.dp.domain.character.factory.JavaDeveloperFactory
import com.mposluszny.dp.domain.character.factory.JavaScriptDeveloperFactory
import com.mposluszny.dp.domain.battle.strategy.OffensiveStrategy
import com.mposluszny.dp.domain.battle.strategy.DefensiveStrategy
import com.mposluszny.dp.domain.battle.strategy.BalancedStrategy
import com.mposluszny.dp.domain.weapon.WeaponBuilder
import com.mposluszny.dp.domain.weapon.WeaponType

class BattleTest {
	
	@Test
	def battleTest1() = {
			// Given
			val character1 = JavaDeveloperFactory.getIntern("Joe")
					val player1 = new StandardPlayer(character1, BalancedStrategy)
					
					val character2 = JavaScriptDeveloperFactory.getIntern("Bob")
					val player2 = new StandardPlayer(character2, BalancedStrategy)
					
					val battle = new Battle((player1, player2))
					
					// When
					battle.start()
					
					// Then
					Assert.assertEquals(battle.status, BattleStatus.FINISHED)
	}
	
	@Test
	def battleTest2() = {
		// Given
		val character1 = JavaDeveloperFactory.getIntern("Joe")
		val weapon1 = new WeaponBuilder()
		  .name("Keyboard of Destruction")
		  .description("Contains a lot of disgusting stuff under its keys")
		  .weaponType(WeaponType.Heavy)
		  .damage(2 to 6)
		  .build()
		  
		val player1 = new PlayerWithWeapon(
		    new StandardPlayer(character1, BalancedStrategy),
		    weapon1)
		
		val character2 = JavaScriptDeveloperFactory.getIntern("Bob")
		val weapon2 = new WeaponBuilder()
		  .name("Hardened HDD")
		  .description("It is very hard. And very heavy.")
		  .weaponType(WeaponType.Heavy)
		  .damage(3 to 5)
		  .build()
		  
		val player2 = new PlayerWithWeapon(
		    new StandardPlayer(character2, BalancedStrategy),
		    weapon2)
	  
		val battle = new Battle((player1, player2))
		
		// When
		battle.start()
		
		// Then
		Assert.assertEquals(battle.status, BattleStatus.FINISHED)
	}
}