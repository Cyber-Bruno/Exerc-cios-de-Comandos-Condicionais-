package exerc�cios_de_comandos_condicionais;

import java.util.Scanner;

public class exerc�cio4 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int a, b;
		
		System.out.println(" Os n�meros digitados v�o aparecer em ordem decrescente\n");
		
		System.out.println("Escreva um n�mero: ");
		a = leitor.nextInt();
		
		System.out.println("Escreva outro n�mero: ");
		b = leitor.nextInt();
		
		if ( a > b)
			System.out.println(a+", "+b);
		if ( b > a)
			System.out.println(b+", "+a);
		if ( a == b)
			System.out.println(" Porfavor n�o digite n�meros iguais ");
		
		
	}
	
}
