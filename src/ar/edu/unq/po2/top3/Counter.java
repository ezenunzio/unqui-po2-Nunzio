package ar.edu.unq.po2.top3;

import java.util.ArrayList;
import java.util.List;


public class Counter {

	private List<Integer> numeros = new ArrayList<Integer>(); 
	
	public List<Integer> getNumeros() {
		return numeros;
	}
	
	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}
	

	public int contarPares(List<Integer> arregloNumeros) {
		int contador = 0;
		for(int numero:arregloNumeros) {
			if(numero % 2 == 0)
				contador = contador + 1;
		}
		return contador;
	}
	
	public int contarImpares(List<Integer> arregloNumeros) {
		int contador = 0;
		for(int numero:arregloNumeros) {
			if(numero % 2 == 1)
				contador = contador + 1;
		}
		return contador;
	}
	
	public int contarMultiplos_De(List<Integer> arregloNumeros, Integer unNumero) {
		int contador = 0;
		for(int numero:arregloNumeros) {
			if(numero % unNumero == 0)
				contador = contador + 1;
		}
		return contador;
	}
	
	
	
	public void addInteger(int unEntero) {
	this.numeros.add(unEntero);
	}
}
