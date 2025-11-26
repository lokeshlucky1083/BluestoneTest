package automation;

import org.testng.annotations.Test;

public class TestNG_priority_Enable_DependentON {
	
	@Test(priority =4)
	public void cat() {
		System.out.println("cat");
		
	}
	
	@Test(priority =3)
	public void Boy() {
		System.out.println("Boy");
		
	}
	
	@Test(priority = 2, enabled = false)
	public void Apple() {
		System.out.println("Apple");
		
	}
	
	@Test(priority =1)
	public void Dog() {
		System.out.println("Dog");
		
	}
	
	@Test(dependsOnMethods = "placingorder")
	public void OrderNotification() {
		System.out.println("OrderNotification");
	}
	
	@Test
	public void placingorder() {
		System.out.println("placingorder");
	}

}
