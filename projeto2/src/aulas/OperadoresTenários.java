package aulas;

public class OperadoresTen�rios {
	
	public static void main(String[] args) {
		
		int nota1 = 70;
		int nota2 = 70;
		int nota3 = 70;
		int nota4 = 70;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
			/*condi��o logica com IF e Else*/
		    /*if (media >= 70) {
				System.out.println(" Aluno Aprovado ");
			
			}else if (media >= 40 && media <= 69) {
				System.out.println(" Aluno em Recupera��o: " + media);
			
			}else { 
				System.out.println("Aluno Reprovado");
			}*/
		    
		    /*operadores ten�rios s�o para micro valida��es*/
		    
		    	String saidaResultado;
		    
		    saidaResultado = media >= 70? " Aluno Aprovado: " + media : (media >= 40 && media <= 69) ? " Aluno em Recupera��o: " + media : " Aluno Reprovado: " + media;
		    	System.out.println(saidaResultado);
				
		}
	
	}


