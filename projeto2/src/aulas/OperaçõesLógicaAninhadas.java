package aulas;

public class Opera��esL�gicaAninhadas {
	
	public static void main(String[] args) {
		
		int nota1 = 70;
		int nota2 = 70;
		int nota3 = 33;
		int nota4 = 10;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/*opera��es l�gica aninhadas: S�o opera��es dentro de opera��es*/
		
		if (media >= 50) {
			if (media >= 70) {
				System.out.println(" Aluno est� aprovado direto: " + media);
				}else {
				System.out.println(" Aluno est� em recupera��o: " + media);
				}
				}else {
				System.out.println(" Aluno reprovado direto: " + media);
			}
			
		}
	}

