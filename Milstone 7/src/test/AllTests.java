package test;
/**
 * Matthew Foley
 * @author
 * June/July 2025
 */
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ArmorTest.class, PotionTest.class, ProductTest.class, WeaponTest.class })
public class AllTests {

}
