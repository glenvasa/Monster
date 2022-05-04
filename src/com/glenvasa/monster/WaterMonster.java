/**
 * 
 */
package com.glenvasa.monster;

/**
 * @author glenv
 *
 */
public class WaterMonster implements Monster {

	private String name;

	WaterMonster(String name) {
		this.name = name;
	}

	@Override
	public void attack() {
		System.out.println("Attack with water!");

	}

}
