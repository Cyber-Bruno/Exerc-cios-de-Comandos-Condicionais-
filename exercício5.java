package exerc�cios_de_comandos_condicionais;

import java.util.Scanner;

public class exerc�cio5 {

	public static void main(String[] args) {
		
     Scanner leitor = new Scanner (System.in);
		
		int i;
		
		System.out.println("Digite um n�mero: "); 
		i = leitor.nextInt();

		if(i % 2 == 0)
		System.out.println("� par!");

		else
		System.out.println("� impar!");

	}

}
