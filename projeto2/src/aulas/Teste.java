package aulas;

import java.util.Scanner;

public class Teste {
	
	private static Scanner scan; 

	public static void main(String[] args){
		
		 
		 scan = new Scanner(System.in);
         
         System.out.printf("Qual é seu nome ?");
  
		 String nome = scan.next(), nome1 = scan.next();
         
         System.out.printf("Bem vindo ao Java, " + nome + nome1);
         
        	        
        	}
   }


