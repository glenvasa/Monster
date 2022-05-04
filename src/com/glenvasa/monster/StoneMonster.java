/**
 * 
 */
package com.glenvasa.monster;

/**
 * @author glenv
 *
 */
public class StoneMonster implements Monster {

	private String name;

	StoneMonster(String name) {
		this.name = name;
	}

	@Override
	public void attack() {
		System.out.println("Attack with stones!");

	}

}
