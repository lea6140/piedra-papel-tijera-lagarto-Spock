package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {
	private Forma formaDelJugador;

	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
	public Mano(final Forma forma) {
		this.formaDelJugador=forma;
	}

	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
Resultado resultadoPartida=Resultado.PIERDE;
		
		if(this.formaDelJugador==otra.formaDelJugador){
			resultadoPartida = Resultado.EMPATA;
		}
		
		
		
		switch (this.formaDelJugador) 
        { 
            case PIEDRA: if (otra.formaDelJugador == Forma.TIJERA || otra.formaDelJugador == Forma.LAGARTO ) {
            	
            	resultadoPartida = Resultado.GANA;
            	
            }
                break; 

            case SPOCK: if (otra.formaDelJugador == Forma.PIEDRA || otra.formaDelJugador == Forma.TIJERA){
            	
            	resultadoPartida = Resultado.GANA;            	
            } 

                break; 

            case PAPEL: if (otra.formaDelJugador == Forma.SPOCK || otra.formaDelJugador == Forma.PIEDRA){
            	
            	resultadoPartida = Resultado.GANA;            	
            } 

                break;               

            case LAGARTO: if (otra.formaDelJugador == Forma.PAPEL || otra.formaDelJugador == Forma.SPOCK){
            	
            	resultadoPartida = Resultado.GANA;            	
            } 

                break; 
                
            case TIJERA: if (otra.formaDelJugador == Forma.LAGARTO || otra.formaDelJugador == Forma.PAPEL){
            	
            	resultadoPartida = Resultado.GANA;            	
            } 

                break;     
        } 	
		
		return  resultadoPartida;
			
	}

}
