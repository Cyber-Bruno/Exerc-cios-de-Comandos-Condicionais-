package exercícios_de_comandos_condicionais;

import java.util.Scanner;

public class exercício5 {

	public static void main(String[] args) {
		
     Scanner leitor = new Scanner (System.in);
		
		int i;
		
		System.out.println("Digite um número: "); 
		i = leitor.nextInt();

		if(i % 2 == 0)
		System.out.println("É par!");

		else
		System.out.println("É impar!");

	}

}
