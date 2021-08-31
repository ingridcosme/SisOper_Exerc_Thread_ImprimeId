/*
 * Fazer uma aplica��o que rode 5 Threads que cada uma delas imprima no console 
 * o seu n�mero. O n�mero que deve ser impresso � a sa�da da opera��o 
 * int id = getId() da Thread.
 */

package controller;

public class ThreadId extends Thread {
	private int id;
	
	public ThreadId(int id) {
		this.id = id;
	}
	
	@Override
	public void run() {
		id = (int) getId();
		System.out.println("TID #" + id);
	}
}
