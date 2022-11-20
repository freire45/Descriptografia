package br.com.erickfreire.descriptografia;

import java.util.Scanner;

public class Descriptografia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int aux;
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int valor;
		
		System.out.println("Programa que descriptografa um valor: ");
		System.out.print("Digite um valor criptografado: ");
		valor = entrada.nextInt();
		
		while(valor < 1000 || valor > 9999) {
			System.out.println("O valor digitado está incorreto!");
			System.out.print("Digite um valor criptografado: ");
			valor = entrada.nextInt();
		}
		
		numero1 = valor / 1000;
		numero2 = (valor % 1000) / 100;
		numero3 = (valor % 100) / 10;
		numero4 = (valor % 10) / 1;
		
		aux = numero1;
		numero1 = numero3;
		numero3 = aux;
		
		aux = numero2;
		numero2 = numero4;
		numero4 = aux;
		
		numero1 = (numero1 + 10) - 7;
		numero2 = (numero2 + 10) - 7;
		numero3 = (numero3 + 10) - 7;
		numero4 = (numero4 + 10) - 7;
		
		System.out.printf("O valor descriptografado é: %d%d%d%d%n", numero1, numero2, numero3, numero4);

	}

}
