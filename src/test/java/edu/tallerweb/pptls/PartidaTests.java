package edu.tallerweb.pptls;

import static org.junit.Assert.*;

import org.junit.Test;

public class PartidaTests {

	@Test
	public void queSpockVaporizaPiedra() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Spock vaporiza piedra",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void empate() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Empatan",
				Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));

		
		
	}
	
	@Test
	public void queLagartoEnvenenaSpock() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Lagarto envenena Spock",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

		
		
	}
	
	@Test
	public void queSpockRompeTijera() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Spock rompe tijera",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

		
		
	}
	

}
