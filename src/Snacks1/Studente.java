package Snacks1;

import java.util.Scanner;

public class Studente {
	/*traccia: Snack 1: Studente
	Scrivi una classe Studente con i seguenti attributi: nome, cognome, età.*/ 
	
	Studente(String nome, String cognome, int age){
		this.nome = nome;
		this.cognome = cognome;
		this.age = age;
	}
	
	private String nome;
	private String cognome;
	private int age;
	
	/*Implementa un costruttore che accetta tre parametri per inizializzare questi attributi. 
	Aggiungi un metodo che restituisca una stringa concatenata dei valori (es. Anselmo Bitta, 24 anni).*/
	
	private String getNome() {
		 return this.nome;
	}
	
	private String getCognome() {	
		return this.cognome;
	}

	private int getAge() {
		return this.age;
	}
	
	private String getFullName() {
		return this.getNome() + ' ' + this.getCognome();
	}
	
	public String stampaStudente() {
		
		return "Il mio nome è: " + this.getFullName() + " la mia età è:" + this.getAge();
	}
	
	
	public static void main (String[] args) {
		String nome, cognome;
		int age;
		
		/* prendo input utente */
		Scanner scan = new Scanner(System.in);

		System.out.println("Inserisci il tuo nome :");
		nome = scan.nextLine();

		System.out.println("Inserisci il tuo cognome :");
		cognome = scan.nextLine();

		System.out.println("Inserisci la tua età: ");
		age = scan.nextInt();
		
		scan.close();
		
		/* creo un oggetto = istanza di class e*/
		
		Studente studente = new Studente (nome, cognome, age);
		System.out.println(studente.stampaStudente());
	
	}
}
