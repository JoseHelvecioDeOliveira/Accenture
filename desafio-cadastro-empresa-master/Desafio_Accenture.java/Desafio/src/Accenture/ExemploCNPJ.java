package Accenture;
import java.util.Scanner;
import Accenture.ValidaCNPJ;

public class ExemploCNPJ {

public static void main(String[] args) {
 Scanner ler = new Scanner(System.in);

 String CNPJ;

 System.out.printf("Informe um CNPJ: ");
 CNPJ = ler.next();

 System.out.printf("\nResultado: ");
 if (ValidaCNPJ.isCNPJ(CNPJ) == true)
    System.out.printf("%s\n", ValidaCNPJ.imprimeCNPJ(CNPJ));
 else System.out.printf("Erro, CNPJ inválido !!!\n");
}

}