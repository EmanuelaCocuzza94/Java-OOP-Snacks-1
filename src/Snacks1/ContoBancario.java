package Snacks1;

import java.util.Scanner;

public class ContoBancario {
/*Crea una classe ContoBancario con attributi per numero di conto e saldo.*/ 
	
	private int conto;
	private int saldo;
	
	/*Implementa un costruttore che accetta il numero di conto e inizializza il saldo a zero.*/
	
	ContoBancario(){
		
	}
	
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
		this.saldo = this.saldo + valore;
	}
	
	public void preleva (int valore) {
		if(this.saldo != 0 && this.saldo >= valore) {
			
			this.saldo = this.saldo - valore;
		}else {
			System.out.println("Saldo insufficiente, impossibile Prelevare!");
		}
	}
	
	public static void main (String[] args) {
		int numeroConto = 1006584;
		ContoBancario conto1 = new ContoBancario(numeroConto);
		
		System.out.println("Numero conto: " + conto1.getConto() + " Saldo: " + conto1.getSaldo());
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Quanto vuoi depositare?");
		
		conto1.deposita(scan.nextInt());
		
		System.out.println("Numero conto: " + conto1.getConto() + " Saldo: " + conto1.getSaldo());
		
		System.out.println("Quanto vuoi prelevare?");
		
		conto1.preleva(scan.nextInt());
		
		System.out.println("Numero conto: " + conto1.getConto() + " Saldo: " + conto1.getSaldo());
		
	}
}
