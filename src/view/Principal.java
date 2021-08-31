/*
 * Fazer uma aplica��o que rode 5 Threads que cada uma delas imprima no console 
 * o seu n�mero. O n�mero que deve ser impresso � a sa�da da opera��o 
 * int id = getId() da Thread.
 */

package view;

import controller.ThreadId;

public class Principal {

	public static void main(String[] args) {
		for(int id = 0 ; id < 5 ; id++) {
			Thread imprimeId = new ThreadId(id);
			imprimeId.start();
		}

	}

}
