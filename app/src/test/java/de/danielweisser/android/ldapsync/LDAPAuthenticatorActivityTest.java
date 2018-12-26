package de.danielweisser.android.ldapsync;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import de.danielweisser.android.ldapsync.authenticator.LDAPAuthenticatorActivity;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
public class LDAPAuthenticatorActivityTest {

	@Test
	public void test() {
		String appName = new LDAPAuthenticatorActivity().getResources().getString(R.string.app_name);
		assertEquals("LDAP Sync", appName);
	}

}
