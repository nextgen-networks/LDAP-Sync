package de.danielweisser.android.ldapsync.client;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContactTest {
	
	private Contact c = new Contact();

	@Test
	public void testDn() {
		c.setDn("testDn");
		assertEquals("testDn", c.getDn());
	}

	@Test
	public void testGetFirstName() {
		c.setFirstName("testFirstName");
		assertEquals("testFirstName", c.getFirstName());
	}
}
