package com.mposluszny.dp.domain.battle.strategy

import org.junit.Test
import com.mposluszny.dp.domain.battle.move.PlayerMove
import com.mposluszny.dp.domain.battle.move.AttackMove
import org.junit.Assert
import com.mposluszny.dp.domain.battle.move.DefendMove

class BattleStrategyTest {
	
	@Test
	def balancedStrategyTest() {
		// Given
		val strategy: BattleStrategy = BalancedStrategy
				
		// When
		val moves =
		  1.to(100)
		    .toList
		    .map((_) => strategy.getMove())
		
		// Then
		Assert.assertTrue(moves.exists(move => AttackMove == move))
		Assert.assertTrue(moves.exists(move => DefendMove == move))
	}
	
//	@Test
//	def offensiveStrategyTest() {
//		val allMovesAreAttack =
//  		1 to 100 forall ((_) => {
//  			AttackMove == OffensiveStrategy.getMove()
//  		})
//		
//		Assert.assertTrue(allMovesAreAttack)
//	}
//	
//	@Test
//	def defensiveStrategyTest() {
//		val allMovesAreDefend =
//  		1 to 100 forall ((_) => {
//  			DefendMove == DefensiveStrategy.getMove()
//  		})
//		
//		Assert.assertTrue(allMovesAreDefend)
//	}
}