package com.parkgaram.dp.strategy;

public class GameCharacter {

	// 체력,마력,스테미너 등..

	private Weapon weapon;

	public int attact() {

		return weapon.doAttact();
	}

	public void setWeapon(Weapon weapon) { // 이부분이 중요하구나.. // 생성자네..
		this.weapon = weapon;
	}

}
