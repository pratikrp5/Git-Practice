package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
  SoftAssert sa=new SoftAssert();
	
	@Test(priority=1,groups="smoke") // create new user test@test.com
	public void createuser() {
		System.out.println("I am in home test");
		System.out.println("before assertion1");
		Assert.assertTrue(4>3,"verifying Element");
		System.out.println("After Assertion1");
		Assert.assertEquals("abc","abc");
	}
	
	@Test(priority=2,dependsOnMethods="createuser") // edit user test@test.com
	public void edituser() {
	System.out.println("before assertion2");
	sa.assertTrue(4>3,"verifying element");
	System.out.println("After Assertion2");
	sa.assertAll(); // similar to error collector in Junit to collect the error.
	}
	
	@Test(priority=3,dependsOnMethods="edituser")//// delete user test@test.com
	public void deleteuser() {
		System.out.println("I am in end test");
		System.out.println("before assertion3");
		sa.assertTrue(2>3,"verifying element1");
		System.out.println("After Assertion3");
		Assert.assertEquals("abc","abc1");
		System.out.println("After second Assertion");
		sa.assertAll();
		
	}
 }

