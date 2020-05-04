package exercícios_de_comandos_condicionais;

import java.util.Scanner;

public class exercício6 {

	public static void main(String[] args) {
		
		 Scanner leitor = new Scanner (System.in);
			
			float a ;
			float b ;
			float c ;
			float media;
			
	    System.out.println("Informe a primeira nota: ");
		a = leitor.nextFloat();
		
		System.out.println("Informe a segunda nota: ");
		b = leitor.nextFloat();
		
		System.out.println("Informe a terceira nota: ");
		c = leitor.nextFloat();
		
		media = (float) ((a * 2.0 + b * 3.0 + c * 5.0)/10);
		
		if ( media > 7.0)
			System.out.println(" Aprovado!");
		if ( media == 7.0)
			System.out.println("Aprovado!");
		if ( media < 7.0)
			System.out.println("Reprovado!");
			
			
		
		
				
				
		
	  

	}
}
