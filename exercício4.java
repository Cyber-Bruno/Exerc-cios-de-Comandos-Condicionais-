package exercícios_de_comandos_condicionais;

import java.util.Scanner;

public class exercício4 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int a, b;
		
		System.out.println(" Os números digitados vão aparecer em ordem decrescente\n");
		
		System.out.println("Escreva um número: ");
		a = leitor.nextInt();
		
		System.out.println("Escreva outro número: ");
		b = leitor.nextInt();
		
		if ( a > b)
			System.out.println(a+", "+b);
		if ( b > a)
			System.out.println(b+", "+a);
		if ( a == b)
			System.out.println(" Porfavor não digite números iguais ");
		
		
	}
	
}
