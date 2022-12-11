package test_GameshowHangman;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.security.auth.login.AccountException;

import org.junit.jupiter.api.Test;

class Test_GameShow {

	@Test
	void test_whenTheMethodCalledReturnsTrue() {
		
		Account ma =mock(Account.class);
		when(ma.getAccountName()).thenReturn("James.doe");
		ConcreteClass conclass = new ConcreteClass();
		
		String accountName = conclass.analyzeAccount(ma);
		
		assertEquals(accountName, "James.doe");
		
		
		
	
		
		
		
	}

}
