package exercícios_de_comandos_condicionais;
import java.util.Scanner;
public class exercício9 {

    public static void main(String[] args) {
       
    Scanner leitor = new Scanner(System.in);
   
    float V1;
    float por;

    System.out.println("Digite o valor do produto:");
    V1 = leitor.nextInt();

    if(V1 <= 20) {
    por = 45;
    System.out.println(V1*por/100+(V1));
    }
   
    else {
    por = 30;
    System.out.println(V1*por/100+(V1));
    }

}


    }
