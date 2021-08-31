/*
 * Fazer uma aplicação que rode 5 Threads que cada uma delas imprima no console 
 * o seu número. O número que deve ser impresso é a saída da operação 
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
