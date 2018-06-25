package com.parkgaram.dp.strategy;

public class StrategyDecide {
	
	// new로 생성하지 않는군..
	private Strategy strategy;
	
	public void StrategyDecide(  ) { // 기본생성자
		
	}
	
	public void StrategyDecide( Strategy strategy ) {
		this.strategy = strategy;
	}
	
	public void performStrategy( ) {
		strategy.performStrategy();
	}

}
