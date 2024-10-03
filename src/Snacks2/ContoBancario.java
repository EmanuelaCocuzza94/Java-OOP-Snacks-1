package Snacks2;

import java.util.Scanner;

public class ContoBancario {
/*Crea una classe ContoBancario con attributi per numero di conto e saldo.*/ 
	
	private int conto;
	private int saldo;
	
	/*Implementa un costruttore che accetta il numero di conto e inizializza il saldo a zero.*/
	
	ContoBancario(int conto){
		
		/* Variante 1: 
		this.conto= conto;
		this.saldo = 0;*/
		
		this.setConto(conto);
		this.setSaldo(0);
		
	}
	
	public int getConto() {
		return this.conto;
	}
	
	public int getSaldo() {
		return this.saldo;
	}
	
	public void setConto(int inputConto) {
		this.conto = inputConto;
	}
	
	public void setSaldo(int inputSaldo) {
		this.saldo = inputSaldo;
	}
	
	/*Aggiungi metodi pubblici per depositare denaro sul conto, prelevare denaro dal conto e ottenere il saldo corrente.*/
	
	public void deposita(int valore) {
		if(valore > 0 ) {
			
			this.saldo = this.saldo + valore;
			
		}else {
			System.out.println("Errore! Hai inserito un valore negativo. Inserire un valore maggiore di 0");
		}
	}
	
	public void preleva (int valore) {
		if(valore > 0 ) {
			if(this.saldo != 0 && this.saldo >= valore) {
					
				this.saldo = this.saldo - valore;
			}else {
				System.out.println("Saldo insufficiente, impossibile Prelevare!");
			}
			
		}else {
			System.out.println("Errore! Hai inserito un valore negativo. Inserire un valore maggiore di 0");
		}
	}
	
}
