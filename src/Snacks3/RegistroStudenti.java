package Snacks3;
/*Crea una classe RegistroStudenti che rappresenti un registro di studenti. Utilizza un array privato per memorizzare oggetti Studente. 
Implementa un costruttore senza parametri per inizializzare il registro vuoto e un metodo pubblico per aggiungere studenti al registro.
Aggiungi un metodo che stampi la lista degli studenti.*/

public class RegistroStudenti {
	private Studente[] listaStudenti;
	private int count;
	
	RegistroStudenti(int dimensioneLista) {
		 this.listaStudenti = new Studente[dimensioneLista]; //creato array vuoto di dimensione x */
		 this.count = 0;
	}
	
	public void addStudente (Studente studente) {
		if(this.count < this.listaStudenti.length) {
			this.listaStudenti[this.count] = studente;
			this.count++ ;
		}else {
			System.out.println("Array pieno!");
		}
	}
	
	 public void stampaStudenti() {
        System.out.println("Elenco degli studenti:");
        for (int i = 0; i < this.count; i++) {
            System.out.println(this.listaStudenti[i]);
        }
    }
}
