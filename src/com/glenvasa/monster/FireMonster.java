/**
 * 
 */
package com.glenvasa.monster;

/**
 * @author glenv
 *
 */
public class FireMonster implements Monster {

	private String name;

	FireMonster(String name) {
		this.name = name;
	}

	@Override
	public void attack() {
		System.out.println("Attack with fire!");

	}

}
