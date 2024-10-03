package Snacks2;

import java.util.Scanner;

public class Main {
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
