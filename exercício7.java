package exerc�cios_de_comandos_condicionais;

import java.util.Scanner;

import javax.swing.Spring;

public class exerc�cio7 {
	public static void main(String[] args) {
		
		 Scanner leitor = new Scanner (System.in);
			
			int idade, idade1;
			String nome, nome1;
			
		
		System.out.println("Digite seu nome: ");
	    nome = leitor.next();
	    
	    System.out.println("Digite sua idade: ");
	    idade = leitor.nextInt();
	    
	    System.out.println("Vamos para os dados da pr�xima pessoa\n");
	    
	    System.out.println("Digite seu nome: ");
	    nome1 = leitor.next();
	    
	    System.out.println("Digite sua idade: ");
	    idade1 = leitor.nextInt();
	    
	    if ( idade > idade1)
	    	System.out.println("Voc� � mais velho que "+nome1+" \nNome: "+nome+" \nIdade: "+idade);
	   
	    if ( idade1 > idade)
	    	System.out.println("Voc� � mais velho que "+nome+" \nNome: "+nome1+" \nIdade: "+idade1);
	    
	    
	    		
	    
	    
		
		
		
		
		
		
	}

}
