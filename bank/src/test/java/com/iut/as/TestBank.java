package com.iut.as;

import com.iut.as.modele.Bank;
import org.junit.*;

public class TestBank {
	
	private Bank banque;
	
	@Before
	public void setUp() {
		this.banque = Bank.getBank();
	}
	
	@Test
	public void testRetraitAvecClientExistant() {
		
	}
	
	@Test
	public void testRetraitAvecClientInexistant() {
		
	}
	
	@Test
	public void testRetraitAvecCompteExistant() {
		
	}
	
	@Test
	public void testRetraitAvecCompteInexistant() {
		
	}
}
