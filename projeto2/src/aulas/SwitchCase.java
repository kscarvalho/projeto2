package aulas;

public class SwitchCase {
	
	public static void main(String[] args) {
		

		int nota1 = 70;
		int nota2 = 70;
		int nota3 = 33;
		int nota4 = 10;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/* Switch Case: Operações Exatas*/
		int dia = 3;
		switch (dia) {
		case 1:
			System.out.println(" Domingo ");
			break;
		case 2:	
			System.out.println(" Segunda Feira ");
			break;
		case 3:	
			System.out.println(" Terça Feira ");
			break;	

		default: System.out.println(" Outro dia qualquer ");
			break;
		}
		
	}	
}
