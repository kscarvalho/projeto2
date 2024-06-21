package aulas;

import java.io.IOException;
import java.util.Scanner;

public class Teste3 {
	
	public static void main(String[] args) throws IOException {
		// 2. instanciando e criando um objeto Scanner
		    Scanner ler = new Scanner(System.in);

		    String nome;
		    char sexo;

		    System.out.printf("Informe um nome:\n");
		    nome = ler.nextLine(); // 3.5 entrada de dados (lendo uma String)

		    System.out.printf("\nInforme o sexo (M/F): ");
		// 3.7 entrada de dados (lendo um caractere)
		    sexo = (char)System.in.read();

		    System.out.printf("\nResultado:\n");
		    if ((sexo == 'M') || (sexo == 'm'))
		       System.out.printf("Seja bem vindo Sr. \"%s\".\n", nome);
		    else System.out.printf("Seja bem vinda Sra. \"%s\".\n", nome);
		  }

		}


