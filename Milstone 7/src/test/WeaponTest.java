package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;

import store.Weapon;
/**
 * Matthew Foley
 * @author
 * June/July 2025
 */
public class WeaponTest {
	enum Type {temp, quant, price, name};
	
	@Parameter(0)
	public int a1;
	@Parameter(1)
	public int a2;
	@Parameter(2)
	public int a3;
	@Parameter (3)
	public String result;
	
	@Test
	public void test() {
		Weapon test = new Weapon(a1, a2, a3, result);
		Assert.assertNotNull(test);
	}

}
