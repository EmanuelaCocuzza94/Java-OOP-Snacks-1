package Snacks3;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		RegistroStudenti registro1 = new RegistroStudenti(25);	
		Studente studente1 = new Studente("Alberto", "Mineo", 30);
		Studente studente2 = new Studente("Emanuela", "Minchia", 30);
		
		
		registro1.addStudente(studente1);
		registro1.addStudente(studente2);
		registro1.stampaStudenti();
	}
}
