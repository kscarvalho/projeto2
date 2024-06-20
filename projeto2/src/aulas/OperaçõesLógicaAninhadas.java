package aulas;

public class OperaçõesLógicaAninhadas {
	
	public static void main(String[] args) {
		
		int nota1 = 70;
		int nota2 = 70;
		int nota3 = 33;
		int nota4 = 10;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/*operações lógica aninhadas: São operações dentro de operações*/
		
		if (media >= 50) {
			if (media >= 70) {
				System.out.println(" Aluno está aprovado direto: " + media);
				}else {
				System.out.println(" Aluno está em recuperação: " + media);
				}
				}else {
				System.out.println(" Aluno reprovado direto: " + media);
			}
			
		}
	}

