package exercícios_de_comandos_condicionais;
import java.util.Scanner;

public class exercício8 {

    public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

    String Senha = "AEDB";
    String digito;

    System.out.println("digite a senha:");
    digito=leitor.next();


    if(digito.equals(Senha))
    {
        System.out.println("Autorizado!");
    }
    else {
        System.out.println("Recusado!");
    }

    }

}