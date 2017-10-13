package co.simplon.recall;

import static org.junit.Assert.*;

import org.junit.Test;

public class EssaiTest {

	@Test
	public void helloWorld() {
		assertEquals("Hello World", Essai.helloWorld(""));
		assertEquals("Hello Mercredi", Essai.helloWorld("Mercredi"));
		assertEquals("Hello Encore", Essai.helloWorld("Encore"));
	}

}
