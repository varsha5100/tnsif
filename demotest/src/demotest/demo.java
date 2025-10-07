package demotest;
import org.junit.jupiter.api.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class demo {
	@DisplayName("junittesting")
	@RepeatedTest(2)
	@Test
	public void show() {
		System.out.println("this is show method");
	}
	@Ignore
	public void hi() {
		System.out.println("this is hi method");
	}
	@After
	public void hii() {
		System.out.println("this is hii method");
	}
	@Test
	public void hello() {
		System.out.println("this is hello method");
	}
}
