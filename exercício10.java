package exerc�cios_de_comandos_condicionais;

import java.util.Scanner;

public  class  exerc�cio10 {

	public  static  void  main ( String [] args ) {
		
		
		try (Scanner leitor = new Scanner( System.in)) {
			{
			
			String sexo;
			String  Masculino = ( " Masculino " );
			
			float altura;
			
			
			System.out.println( " Descubra seu peso ideal! " );
			System.out.println( " Digite sua Altura (cm): " );
			altura = leitor.nextFloat ();
			
			System.out.println( " Seu sexo � Masculino ou Feminino: " );
			sexo = leitor.next();
			//System. out. println(s1. equals(s2));
			if (sexo. equalsIgnoreCase( Masculino ))
			
				System.out.println( " Seu peso ideal �: " + (( 72.7 * altura / 100 ) - 58 ));
		
			else
				
			System.out.println( " Seu peso ideal �: " + (( 62.1 * altura / 100 ) - 44.7 ));
			
}
			}
	}
}
		
		

	

	
	
	