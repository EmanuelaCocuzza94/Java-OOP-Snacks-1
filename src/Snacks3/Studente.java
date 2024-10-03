package Snacks3;

import java.util.Scanner;

public class Studente {
	/*traccia: Snack 1: Studente
	Scrivi una classe Studente con i seguenti attributi: nome, cognome, età.*/
	
	private String nome;
	private String cognome;
	private int age;
	
	Studente(){
		
	}
	
	//costruttore con 3 parametri
	Studente(String parametroNomeCheInseriscoQuandoVoglioCreareUnaIstanzaDiStudente, String cognomeCheInserisciComeParametro, int age){
		this.nome = parametroNomeCheInseriscoQuandoVoglioCreareUnaIstanzaDiStudente;
		this.cognome = cognomeCheInserisciComeParametro;
		this.age = age;
	}
	
	/*Implementa un costruttore che accetta tre parametri per inizializzare questi attributi. 
	Aggiungi un metodo che restituisca una stringa concatenata dei valori (es. Anselmo Bitta, 24 anni).*/
	
	public String getNome() {
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
	
	@Override
    public String toString() {
        return "Studente{" +
                "nome='" + this.getNome() + '\'' +
                ", cognome='" + this.getCognome() + '\'' +
                ", eta=" + this.getAge() + '}';
    }
	
}
