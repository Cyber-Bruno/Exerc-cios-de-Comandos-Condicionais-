package exerc�cios_de_comandos_condicionais;

import java.util.Scanner;

public class exerc�cio2 {

	public static void main(String[] args) {
		 
		
		Scanner leitor = new Scanner (System.in);
			
		int a, b, resultado;
		
		
			System.out.println("Escreva um n�mero inteiro: ");
			a = leitor.nextInt();
			
			System.out.println("Escreva outro n�mero inteiro: ");
			b = leitor.nextInt();
			
			resultado = a + b;
			
			System.out.println(" Soma: "+resultado);

			
			if( resultado > 10 )
				System.out.println(" O resultado � maior que 10!");

}
	}
