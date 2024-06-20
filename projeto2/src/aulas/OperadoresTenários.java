package aulas;

public class OperadoresTenários {
	
	public static void main(String[] args) {
		
		int nota1 = 70;
		int nota2 = 70;
		int nota3 = 70;
		int nota4 = 70;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
			/*condição logica com IF e Else*/
		    /*if (media >= 70) {
				System.out.println(" Aluno Aprovado ");
			
			}else if (media >= 40 && media <= 69) {
				System.out.println(" Aluno em Recuperação: " + media);
			
			}else { 
				System.out.println("Aluno Reprovado");
			}*/
		    
		    /*operadores tenários são para micro validações*/
		    
		    	String saidaResultado;
		    
		    saidaResultado = media >= 70? " Aluno Aprovado: " + media : (media >= 40 && media <= 69) ? " Aluno em Recuperação: " + media : " Aluno Reprovado: " + media;
		    	System.out.println(saidaResultado);
				
		}
	
	}


