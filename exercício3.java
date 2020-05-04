package exercícios_de_comandos_condicionais;

import java.util.Scanner;

public class exercício3 {

	public static void main(String[] args) {
		
	 Scanner leitor = new Scanner (System.in);
			
			int x;
			
			
				System.out.println("Escreva um número: ");
				x = leitor.nextInt();
				 
				if ( x > 0)
					System.out.println("Positivo");
				if ( x < 0)
					System.out.println("Negativo");
				if ( x == 0)
					System.out.println("Neutro");
			

	}

}
