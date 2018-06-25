package com.parkgaram.dp.strategy;

public class Application {

	public static void main(String[] args) {
		
//		GameCharacter character = new GameCharacter();
//		
//		character.setWeapon(new Sword());
//		character.attact();
//		
//		character.setWeapon(new Ax());
//		character.attact();
//		
//		character.setWeapon(new Knife());
//		character.attact();
		
		// 안됨
		//character.setWeapon(new Weapon());
		//character.attact();
		
		//////////////////////////////////////
		
		StrategyDecide realStrategy = new StrategyDecide(); // 아직 어떤 strategy 인지 없음
		// 기본생성자 없음
		
		realStrategy.StrategyDecide(new StrategyA());  // A로 결정
		
		realStrategy.performStrategy();
		

		realStrategy.StrategyDecide(new StrategyB());  // B로 바꿈
		realStrategy.performStrategy();
		
		
	}
	
}
